package interfaces;

import conexion.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Gestion_roles extends javax.swing.JInternalFrame {
 ConexionBD cone;
    DefaultTableModel modelo;
    public Gestion_roles() {
        initComponents();
     cone = new ConexionBD();
        String[] columnNames = {"codigo","nombre"};
        modelo = new DefaultTableModel(null, columnNames);
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_texto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idmodificar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_newrol = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bto_añadir = new javax.swing.JButton();
        btomodificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setText("Cargo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 205, 48, 24);

        txt_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_textoActionPerformed(evt);
            }
        });
        txt_texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_textoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_texto);
        txt_texto.setBounds(63, 207, 80, 22);

        tabla.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(161, 205, 340, 140);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 247, 44, 20);

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_codigo);
        txt_codigo.setBounds(63, 247, 80, 22);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setText("digite el codigo del usuario que desea modificar su rol ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(6, 356, 353, 20);

        txt_idmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idmodificarActionPerformed(evt);
            }
        });
        txt_idmodificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idmodificarKeyTyped(evt);
            }
        });
        getContentPane().add(txt_idmodificar);
        txt_idmodificar.setBounds(6, 382, 150, 22);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setText("introduzca el nuevo rol");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(6, 416, 150, 20);

        txt_newrol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_newrolKeyTyped(evt);
            }
        });
        getContentPane().add(txt_newrol);
        txt_newrol.setBounds(6, 442, 150, 22);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel8.setBackground(new java.awt.Color(153, 204, 255));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GESTION DE ROLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 6, 678, 193);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bto_añadir.setText("Añadir");
        bto_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_añadirActionPerformed(evt);
            }
        });

        btomodificar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btomodificar.setText("Modificar");
        btomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btomodificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(bto_añadir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btomodificar)))
                .addContainerGap(545, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(bto_añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(btomodificar)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 200, 680, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_textoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_textoKeyTyped
char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();    }//GEN-LAST:event_txt_textoKeyTyped

    private void bto_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_añadirActionPerformed
cone.modificaDatos("INSERT INTO roles VALUES('"  + txt_codigo.getText()+"','"+txt_texto.getText()+"')");
 consultar();
    }//GEN-LAST:event_bto_añadirActionPerformed

    private void txt_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_textoActionPerformed

    private void btomodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btomodificarActionPerformed
        cone.modificaDatos("UPDATE roles SET nombre='" + txt_newrol.getText() + "' WHERE codigo=" + txt_idmodificar.getText());
        consultar();
    }//GEN-LAST:event_btomodificarActionPerformed

    private void txt_idmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idmodificarActionPerformed

    private void txt_idmodificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idmodificarKeyTyped
 char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();    }//GEN-LAST:event_txt_idmodificarKeyTyped

    private void txt_newrolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newrolKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A') | c > 'Z')
            evt.consume();    }//GEN-LAST:event_txt_newrolKeyTyped

    private void txt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyTyped
 char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();    }//GEN-LAST:event_txt_codigoKeyTyped
 public void consultar() {
        try {
            ResultSet rs1 = cone.consultaDatos("SELECT * FROM roles");
            String[] columnNames = {"codigo", "nombre"};
            modelo = new DefaultTableModel(null, columnNames);
            String[] datos = new String[2];
            while (rs1.next()) {
                datos[0] = rs1.getString("codigo");
                datos[1] = rs1.getString("nombre");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Gestion_roles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_añadir;
    private javax.swing.JButton btomodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_idmodificar;
    private javax.swing.JTextField txt_newrol;
    private javax.swing.JTextField txt_texto;
    // End of variables declaration//GEN-END:variables
}
