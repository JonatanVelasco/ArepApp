package interfaces;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import conexion.ConexionBD;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;

public class GestionUsuarios extends javax.swing.JInternalFrame {

    ConexionBD cone;
    DefaultTableModel modelo;

    public GestionUsuarios() {
        initComponents();

        cone = new ConexionBD();
        String[] columnNames = {"cedula", "nombre", "apellido", "direccion", "celular", "usuario", "pass", "codigo_rol"};
        modelo = new DefaultTableModel(null, columnNames);
        consultar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        txtpass = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        cbxrol = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(null);
        jPanel3.add(txtpass);
        txtpass.setBounds(420, 240, 170, 30);
        jPanel3.add(txtusuario);
        txtusuario.setBounds(420, 180, 170, 30);

        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        jPanel3.add(txtcelular);
        txtcelular.setBounds(130, 380, 165, 30);

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel3.add(txtapellido);
        txtapellido.setBounds(130, 280, 165, 30);

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        jPanel3.add(txtcedula);
        txtcedula.setBounds(130, 180, 165, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Direccion");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 160, 100, 30);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Celular");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 210, 100, 30);

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 60, 100, 30);

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Apellido");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 110, 100, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cedula");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 10, 100, 30);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(20, 170, 100, 260);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pass");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 70, 90, 30);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 10, 90, 30);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 130, 90, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(320, 170, 90, 170);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel3.add(txtnombre);
        txtnombre.setBounds(130, 230, 165, 30);

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        jPanel3.add(txtdireccion);
        txtdireccion.setBounds(130, 330, 165, 30);

        cbxrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigos de rol", "500", "501", "502", "503", " " }));
        jPanel3.add(cbxrol);
        cbxrol.setBounds(420, 300, 170, 30);

        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(600, 220, 750, 230);
        jPanel3.add(txtbuscar);
        txtbuscar.setBounds(600, 180, 170, 30);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setForeground(new java.awt.Color(153, 204, 255));
        jPanel5.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Datos del Usuarios");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(0, 20, 1380, 130);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(0, 0, 1550, 160);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btmodificar.setText("Modificar");
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        bteliminar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bteliminar.setText("Eliminar ");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btguardar.setText("Guardar");
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        btbuscar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(599, 599, 599)
                        .addComponent(btmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(653, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(661, 661, 661))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel3.add(jPanel7);
        jPanel7.setBounds(0, 160, 1550, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked

    }//GEN-LAST:event_tabla1MouseClicked

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed

        String Tipo_rol1 = null;
        switch (cbxrol.getSelectedIndex()) {
            case 1:
                Tipo_rol1 = "500";
            case 2:
                Tipo_rol1 = "501";
            case 3:
                Tipo_rol1 = "502";
            case 4:
                Tipo_rol1 = "503";
                break;

            default:
                throw new AssertionError();
        }

        cone.modificaDatos("DELETE usuarios SET cedula='" + txtcedula.getText() + "', nombre ='" + txtnombre.getText() + "', apellido='" + txtapellido.getText() + "', celular='" + txtcelular.getText() + "', usuario='" + txtusuario.getText() + "', pass='" + txtpass.getText() + "', codigo_rol='" + Tipo_rol1 + "'()");

    }//GEN-LAST:event_bteliminarActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }

    public void consultar() {
        try {
            ResultSet rs1 = cone.consultaDatos("SELECT * FROM usuarios");
            String[] columnNames = {"cedula", "nombre", "apellido", "direccion", "celular", "usuario", "pass", "codigo_rol"};
            modelo = new DefaultTableModel(null, columnNames);
            String[] datos = new String[8];
            while (rs1.next()) {
                datos[0] = rs1.getString("cedula");
                datos[1] = rs1.getString("nombre");
                datos[2] = rs1.getString("apellido");
                datos[3] = rs1.getString("direccion");
                datos[4] = rs1.getString("celular");
                datos[5] = rs1.getString("usuario");
                datos[6] = rs1.getString("pass");
                datos[7] = rs1.getString("codigo_rol");

                modelo.addRow(datos);
            }
            tabla1.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuarios.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        tabla1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = tabla1.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    txtcedula.setText(tabla1.getValueAt(filaSeleccionada, 0).toString());
                    txtnombre.setText(tabla1.getValueAt(filaSeleccionada, 1).toString());
                    txtapellido.setText(tabla1.getValueAt(filaSeleccionada, 2).toString());
                    txtdireccion.setText(tabla1.getValueAt(filaSeleccionada, 3).toString());
                    txtcelular.setText(tabla1.getValueAt(filaSeleccionada, 4).toString());
                    txtusuario.setText(tabla1.getValueAt(filaSeleccionada, 5).toString());
                    txtpass.setText(tabla1.getValueAt(filaSeleccionada, 6).toString());
                    cbxrol.setSelectedItem(tabla1.getValueAt(filaSeleccionada, 7).toString());

                }
            }
        });

    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtcelularKeyTyped

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed

        String Tipo_rol = null;
        switch (cbxrol.getSelectedIndex()) {
            case 1:
                Tipo_rol = "500";
            case 2:
                Tipo_rol = "501";
            case 3:
                Tipo_rol = "502";
            case 4:
                Tipo_rol = "503";
                break;

            default:
                throw new AssertionError();
        }

        cone.modificaDatos("INSERT INTO usuarios (cedula, nombre, apellido, direccion, celular, usuario, pass, codigo_rol) VALUES ('" + txtcedula.getText() + "','" + txtnombre.getText() + "','" + txtapellido.getText() + "','" + txtdireccion.getText() + "','" + txtcelular.getText() + "','" + txtusuario.getText() + "','" + txtpass.getText() + "','" + Tipo_rol + "')");

    }//GEN-LAST:event_btguardarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed

        String Tipo_rol1 = null;
        switch (cbxrol.getSelectedIndex()) {
            case 1:
                Tipo_rol1 = "500";
            case 2:
                Tipo_rol1 = "501";
            case 3:
                Tipo_rol1 = "502";
            case 4:
                Tipo_rol1 = "503";
                break;

            default:
                throw new AssertionError();
        }

        cone.modificaDatos("UPDATE usuarios SET cedula='" + txtcedula.getText() + "', nombre ='" + txtnombre.getText() + "', apellido='" + txtapellido.getText() + "', celular='" + txtcelular.getText() + "', usuario='" + txtusuario.getText() + "', pass='" + txtpass.getText() + "', codigo_rol='" + Tipo_rol1 + "'");
    }//GEN-LAST:event_btmodificarActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed

     
           

    }//GEN-LAST:event_btbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btmodificar;
    private javax.swing.JComboBox<String> cbxrol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabla1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void filtro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
