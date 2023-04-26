package interfaces;

import conexion.ConexionBD;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Productos {

    private int codigo;
    private String nombreProducto;
    private double precio;
    private byte imagen;
    private String descripcion;
    private ImageIcon format = null;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void InsertarProducto(JTextField paramNombreProducto, JTextField paramPrecio, String ruta, JTextArea paramDescripcion) {

        setNombreProducto(paramNombreProducto.getText());
        setPrecio(Double.parseDouble(paramPrecio.getText()));
        setDescripcion(paramDescripcion.getText());

        ConexionBD conexion = new ConexionBD();

        String consulta = "insert into productos (nombreProducto, precio, imagen, descripcion) values (?,?,?,?);";
        FileInputStream fi = null;

        try {
            File file = new File(ruta);
            fi = new FileInputStream(file);

            CallableStatement cs = conexion.estableceConexion().prepareCall(consulta);

            cs.setString(1, getNombreProducto());
            cs.setDouble(2, getPrecio());
            cs.setBinaryStream(3, fi);
            cs.setString(4, getDescripcion());

            cs.execute();
            JOptionPane.showMessageDialog(null, "Producto agregado");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al guardar el producto ERROR: " + e);
        }
    }

    public void MostrarProductos() {

        ConexionBD objetoConexion = new ConexionBD();

        DefaultTableModel modelo = new DefaultTableModel();

        String sql = "";

        //Creamos la tabla
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Imagen");
        modelo.addColumn("Descripcion");

        GestionProductos.tablaProductos.setModel(modelo);
        GestionProductos.tablaProductos.setRowHeight(100);

        //Mostramos informacion
        sql = "select * from productos;";
        Object[] datos = new Object[6];
        Statement st;
        GestionProductos.tablaProductos.setDefaultRenderer(Object.class, new TablaImagen());

        try {
            st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            //Recoremos la tabla de la bd
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                Blob blob = rs.getBlob(4);

                //Convertir de binario a imagen
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {
                }

                ImageIcon icono = new ImageIcon(img);
                datos[3] = new JLabel(icono);
                datos[4] = rs.getString(5);

                //Crea las filas
                modelo.addRow(datos);
            }

            GestionProductos.tablaProductos.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros Error: " + e.toString());
        }

    }

    public void SeleccionarFila(JTable paramTablaProductos, JTextField paramCodigo, JTextField paramNombre, JTextField paramPrecio, JLabel paramImagen, JTextArea paramDescripcion) {
        ConexionBD conexion = new ConexionBD();
        int fila = paramTablaProductos.getSelectedRow();
        String tc = String.valueOf(paramTablaProductos.getModel().getValueAt(fila, 0).toString());
        String query = "select * from productos where codigo =" + tc + "";
        Statement st;
        try {
            st = conexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nombreProducto = rs.getString("nombreProducto");
                String precio = rs.getString("precio");
                byte[] imagen = rs.getBytes("imagen");
                format = new ImageIcon(imagen);

                //Ajustamos el tamaño de la imagen al JLabel.
                Icon image = new ImageIcon(format.getImage().getScaledInstance(paramImagen.getWidth(), paramImagen.getHeight(), Image.SCALE_DEFAULT));
                paramImagen.setIcon(format);
                paramImagen.setIcon(image);
                String descripcion = rs.getString("descripcion");

                paramCodigo.setText("" + codigo);
                paramNombre.setText(nombreProducto);
                paramPrecio.setText(precio);
                paramDescripcion.setText(descripcion);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al selecionar la fila Error:" + e.toString());
        }

    }

    public void ModificarProducto(JTextField paramCodigo, JTextField paramNombreProducto, JTextField paramPrecio, String ruta, JTextArea paramDescripcion) throws SQLException, FileNotFoundException {

        setCodigo(Integer.parseInt(paramCodigo.getText()));
        setNombreProducto(paramNombreProducto.getText());
        setPrecio(Double.parseDouble(paramPrecio.getText()));
        setDescripcion(paramDescripcion.getText());

        ConexionBD conexion = new ConexionBD();

        String consulta = "UPDATE productos SET productos.codigo = ?, productos.nombreProducto = ?, productos.precio = ?, productos.imagen = ?, productos.descripcion = ? WHERE productos.codigo = ?;";
        FileInputStream fi = null;
        try {
            File file = new File(ruta);
            fi = new FileInputStream(file);

            CallableStatement cs = conexion.estableceConexion().prepareCall(consulta);

            cs.setInt(1, getCodigo());
            cs.setString(2, getNombreProducto());
            cs.setDouble(3, getPrecio());
            cs.setBinaryStream(4, fi);
            cs.setString(5, getDescripcion());
            cs.setInt(6, getCodigo());

            cs.execute();

            JOptionPane.showMessageDialog(null, "Producto modificado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el Producto Error: " + e);
        }

    }

//    public void ModificarImagen(JTextField paramCodigo, String ruta) {
//
//        setCodigo(Integer.parseInt(paramCodigo.getText()));
//
//        Conexion conexion = new Conexion();
//
//        String consulta = "update productos set productos.imagen = ? where productos.codigo = ?;";
//        FileInputStream fi = null;
//
//        try {
//            File file = File(ruta);
//            fi = new FileInputStream(file);
//
//            CallableStatement cs = conexion.estableceConexion().prepareCall(consulta);
//
//            cs.setBinaryStream(1, fi);
//            cs.setInt(2, getCodigo());
//
//            cs.execute();
//
//            JOptionPane.showMessageDialog(null, "Imagen modificada correctamente");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al modificar la imagen Error: " + e);
//        }
//    }
    public void Eliminarproducto(JTextField paramCodigo) {

        setCodigo(Integer.parseInt(paramCodigo.getText()));

        ConexionBD conexion = new ConexionBD();

        String consulta = "DELETE FROM productos WHERE productos.codigo = ?;";

        try {

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto?");

            if (respuesta == 0) {
                CallableStatement cs = conexion.estableceConexion().prepareCall(consulta);

                cs.setInt(1, getCodigo());
                cs.execute();

                JOptionPane.showMessageDialog(null, "Producto Eliminado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el Producto Error: " + e);
        }
    }

    public void Buscador(JTextField paramBuscar) {

        
        ConexionBD conexion = new ConexionBD();
        PreparedStatement pst;
        try {

            String query = "select * from productos where concat(nombreProducto, codigo) like '%" + paramBuscar.getText() + "%';";
            String[] columnNames = {"Codigo", "Nombre Producto", "Precio", "Imagen", "Descripcion"};
            DefaultTableModel modelo = new DefaultTableModel(null, columnNames);
            
            GestionProductos.tablaProductos.setDefaultRenderer(Object.class, new TablaImagen());
            
            pst = conexion.estableceConexion().prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            Object[] datos = new Object[5];

            //Recoremos la tabla de la bd
            while (rs.next()) {

                datos[0] = rs.getString("codigo");
                datos[1] = rs.getString("nombreProducto");
                datos[2] = rs.getString("precio");
                Blob blob = rs.getBlob("imagen");

                //Convertir de binario a imagen
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {
                }

                ImageIcon icono = new ImageIcon(img);
                datos[3] = new JLabel(icono);
                datos[4] = rs.getString("descripcion");

                //Crea las filas
                modelo.addRow(datos);
            }

            GestionProductos.tablaProductos.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros Error: " + e.toString());
        }

    }

    private File File(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
