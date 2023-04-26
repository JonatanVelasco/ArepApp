package interfaces;

import conexion.ConexionBD;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Arepapp {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Celular;
    private String Usuario;
    private String Pass;
    private int Codigo_rol;

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public int getCodigo_rol() {
        return Codigo_rol;
    }

    public void setCodigo_rol(int Codigo_rol) {
        this.Codigo_rol = Codigo_rol;
    }

    public void GuardarUsuario(JTextField paramCedula, JTextField paramNombre, JTextField paramApelldio, JTextField paramDireccion, JTextField paramCelular, JTextField paramUsuario, JTextField paramPass, JTextField paramCodigo_rol) {

        setCedula(paramCedula.getText());
        setNombre(paramNombre.getText());
        setApellido(paramApelldio.getText());
        setDireccion(paramDireccion.getText());
        setCelular(paramCelular.getText());
        setUsuario(paramUsuario.getText());
        setPass(paramPass.getText());
        setCodigo_rol(Integer.parseInt(paramCodigo_rol.getText()));

        ConexionBD conexion = new ConexionBD();

        String consulta = "INSERT INTO usuarios (cedula ,nombre,apellido,direccion,celular,usuario,pass,codigo_rol) VALUES (?,?,?,?,?,?,?,?);";

        try {
            CallableStatement cs = conexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, getCedula());
            cs.setString(2, getNombre());
            cs.setString(3, getApellido());
            cs.setString(4, getDireccion());
            cs.setString(5, getCelular());
            cs.setString(6, getUsuario());
            cs.setString(7, getPass());
            cs.setInt(8, getCodigo_rol());

            cs.execute();
            JOptionPane.showMessageDialog(null, "Usuario Agregado");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al guardar el producto ERROR: " + e);
        }

    }

    public void MostrarUsuario() {

        ConexionBD conexion = new ConexionBD();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = " ";

        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Celular");
        modelo.addColumn("Usuario");
        modelo.addColumn("Pass");
        modelo.addColumn("Codigo rol");

        sql = "SELECT * FROM usuarios;";

        Object[] datos = new Object[8];

        Statement st;
        try {
            st = conexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                modelo.addRow(datos);

            }
            GestionUsuarios.tabla.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros Error: " + e.toString());
        }

    }

    public void ModificarUsuarios(JTextField paramCedula, JTextField paramNombre, JTextField paramApelldio, JTextField paramDireccion, JTextField paramCelular, JTextField paramUsuario, JTextField paramPass, JTextField paramCodigo_rol) {

        setCedula(paramCedula.getText());
        setNombre(paramNombre.getText());
        setApellido(paramApelldio.getText());
        setDireccion(paramDireccion.getText());
        setCelular(paramCelular.getText());
        setUsuario(paramUsuario.getText());
        setPass(paramPass.getText());
        setCodigo_rol(Integer.parseInt(paramCodigo_rol.getText()));

        ConexionBD objectoConexion = new ConexionBD();

        String Consulta = "UPDATE `usuarios` SET cedula=?,`nombre`=?,`apellido`=?,`direccion`=?,`celular`=?,`usuario`=?,`pass`=?, `codigo_rol`=?  WHERE cedula=? ";
        try {

            CallableStatement cs = objectoConexion.estableceConexion().prepareCall(Consulta);

            cs.setString(1, getCedula());
            cs.setString(2, getNombre());
            cs.setString(3, getApellido());
            cs.setString(4, getDireccion());
            cs.setString(5, getCelular());
            cs.setString(6, getUsuario());
            cs.setString(7, getPass());
            cs.setInt(8, getCodigo_rol());
            cs.setString(9, getCedula());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Modificacion Exitosa");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Modifico, error" + e.toString());
        }

    }

    public void EliminarUsuario(JTextField paramCedula) {

        ConexionBD objectoConexion = new ConexionBD();

        String Consulta = "DELETE FROM `usuarios` WHERE cedula=? ";

        try {

            CallableStatement cs = objectoConexion.estableceConexion().prepareCall(Consulta);
            cs.setString(1, paramCedula.getText());
            cs.execute();

            JOptionPane.showMessageDialog(null, "se Elimino Correctamente el Usuario");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Eliminacion " + e.toString());
        }
    }

    public void CargarDatos(JTable paramtabla, JTextField paramCedula, JTextField paramNombre, JTextField paramApelldio, JTextField paramDireccion, JTextField paramCelular, JTextField paramUsuario, JTextField paramPass, JTextField paramCodigo_rol) {

        try {

            int fila = paramtabla.getSelectedRow();

            if (fila >= 0) {

                paramCedula.setText(paramtabla.getValueAt(fila, 0).toString());
                paramNombre.setText(paramtabla.getValueAt(fila, 1).toString());
                paramApelldio.setText(paramtabla.getValueAt(fila, 2).toString());
                paramDireccion.setText(paramtabla.getValueAt(fila, 3).toString());
                paramCelular.setText(paramtabla.getValueAt(fila, 4).toString());
                paramUsuario.setText(paramtabla.getValueAt(fila, 5).toString());
                paramPass.setText(paramtabla.getValueAt(fila, 6).toString());
                paramCodigo_rol.setText(paramtabla.getValueAt(fila, 7).toString());

            } else {

                JOptionPane.showMessageDialog(null, "no se selecciono los registros, error ");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de seleccion, error " + e.toString());
        }

    }

}
