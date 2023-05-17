package interfaces;

import conexion.ConexionBD;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle.Control;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionUsuarios extends javax.swing.JInternalFrame {

    private Control control;
    ConexionBD cone;
    DefaultTableModel modelo;

    public GestionUsuarios() {
        initComponents();
        cone = new ConexionBD();
        String[] columnNames = {"cedula", "nombre", "apellido", "direccion", "celular", "usuario", "pass", "codigo_rol"};
        modelo = new DefaultTableModel(null, columnNames);
        updateTable("");
        this.setSize(new Dimension(1190, 567));

        this.setMinimumSize(new Dimension(1190, 567));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btmodificar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtcelular = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        cbxrol = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(null);

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
        jPanel7.setLayout(null);

        btmodificar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar png.png"))); // NOI18N
        btmodificar.setText("Modificar");
        btmodificar.setBorder(null);
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });
        jPanel7.add(btmodificar);
        btmodificar.setBounds(559, 292, 140, 50);

        bteliminar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/elimanr png.png"))); // NOI18N
        bteliminar.setText("Eliminar ");
        bteliminar.setBorder(null);
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        jPanel7.add(bteliminar);
        bteliminar.setBounds(717, 292, 140, 50);

        btguardar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarpng.png"))); // NOI18N
        btguardar.setText("Guardar");
        btguardar.setBorder(null);
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });
        jPanel7.add(btguardar);
        btguardar.setBounds(340, 190, 160, 50);

        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        jPanel7.add(txtcelular);
        txtcelular.setBounds(90, 220, 165, 30);

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        jPanel7.add(txtdireccion);
        txtdireccion.setBounds(90, 170, 165, 30);

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        jPanel7.add(txtapellido);
        txtapellido.setBounds(90, 120, 165, 30);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel7.add(txtnombre);
        txtnombre.setBounds(90, 70, 165, 30);

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        jPanel7.add(txtcedula);
        txtcedula.setBounds(90, 20, 165, 30);
        jPanel7.add(txtusuario);
        txtusuario.setBounds(350, 20, 170, 30);
        jPanel7.add(txtpass);
        txtpass.setBounds(350, 80, 170, 30);

        cbxrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigos de rol", "500", "501", "502", "503", " " }));
        jPanel7.add(cbxrol);
        cbxrol.setBounds(350, 120, 170, 30);

        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla1);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(530, 50, 625, 230);

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel7.add(search);
        search.setBounds(600, 10, 172, 30);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscador");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(530, 10, 64, 30);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Celular");
        jPanel7.add(jLabel1);
        jLabel1.setBounds(10, 220, 80, 30);

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nombre");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(10, 70, 80, 30);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Direccion");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(10, 170, 80, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cedula");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(10, 20, 80, 30);

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Apellido");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(10, 120, 80, 30);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        jPanel7.add(jLabel3);
        jLabel3.setBounds(260, 20, 90, 30);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Pass");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(260, 80, 90, 30);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(260, 120, 90, 30);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(0, 160, 1550, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
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

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }

    public void updateTable(String find) {
        String[] columnNames = {"cedula", "nombre", "apellido", "direccion", "celular", "usuario", "pass", "codigo_rol"};
        modelo = new DefaultTableModel(null, columnNames);
        String[] datos = new String[8];

        ResultSet rs1 = cone.consultaDatos("SELECT * FROM usuarios"
                + " WHERE CONCAT(cedula, nombre, apellido, direccion, celular, usuario, pass, codigo_rol) LIKE '%" + find + "%'");
        try {
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
            limpiarCampos();

        } catch (SQLException ex) {
            Logger.getLogger(GestionUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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

    }

    public void limpiarCampos() {
        txtcedula.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txtcelular.setText("");
        txtusuario.setText("");
        txtpass.setText("");


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

        if (txtcedula.getText().trim().isEmpty() || txtnombre.getText().trim().isEmpty()
                || txtapellido.getText().trim().isEmpty() || txtdireccion.getText().trim().isEmpty()
                || txtcelular.getText().trim().isEmpty() || txtusuario.getText().trim().isEmpty()
                || txtpass.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Rellene todos los campos");
        } else {

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
            updateTable("");
            JOptionPane.showMessageDialog(rootPane, "Se a guardado con exito");
        }
    }//GEN-LAST:event_btguardarActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        if (txtcedula.getText().trim().isEmpty() || txtnombre.getText().trim().isEmpty()
                || txtapellido.getText().trim().isEmpty() || txtdireccion.getText().trim().isEmpty()
                || txtcelular.getText().trim().isEmpty() || txtusuario.getText().trim().isEmpty()
                || txtpass.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Rellene todos los campos");
        } else {
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

            cone.modificaDatos("UPDATE usuarios SET nombre ='" + txtnombre.getText() + "', apellido='" + txtapellido.getText() + "', celular='" + txtcelular.getText() + "', usuario='" + txtusuario.getText() + "', pass='" + txtpass.getText() + "', codigo_rol='" + Tipo_rol1 + "' WHERE cedula=" + txtcedula.getText());
            updateTable("");
            JOptionPane.showMessageDialog(rootPane, "Se a modificado con exito");

        }
    }//GEN-LAST:event_btmodificarActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        updateTable(search.getText());
    }//GEN-LAST:event_searchKeyReleased

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        if (txtcedula.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Debes Seleccionar un producto para modificarlo");
        } else {
            cone.modificaDatos("DELETE FROM usuarios WHERE cedula=" + txtcedula.getText());
            updateTable("");
            JOptionPane.showMessageDialog(rootPane, "Se a eliminado correctamente");

        }
    }//GEN-LAST:event_bteliminarActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField search;
    public static javax.swing.JTable tabla1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
