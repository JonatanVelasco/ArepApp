package interfaces;

import conexion.ConexionBD;
import java.awt.Dimension;
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
        this.setSize(new Dimension(892, 415));

        this.setMinimumSize(new Dimension(892, 415));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bto_añadir = new javax.swing.JButton();
        btomodificar = new javax.swing.JButton();
        txt_newrol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idmodificar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txt_texto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel8.setBackground(new java.awt.Color(153, 204, 255));
        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GESTION DE ROLES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 6, 880, 140);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        bto_añadir.setText("Añadir");
        bto_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_añadirActionPerformed(evt);
            }
        });
        jPanel2.add(bto_añadir);
        bto_añadir.setBounds(80, 140, 72, 23);

        btomodificar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btomodificar.setText("Modificar");
        btomodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btomodificarActionPerformed(evt);
            }
        });
        jPanel2.add(btomodificar);
        btomodificar.setBounds(700, 120, 87, 27);

        txt_newrol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_newrolKeyTyped(evt);
            }
        });
        jPanel2.add(txt_newrol);
        txt_newrol.setBounds(520, 120, 150, 22);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("digite el codigo del usuario que desea modificar su rol ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(510, 10, 353, 20);

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
        jPanel2.add(txt_idmodificar);
        txt_idmodificar.setBounds(520, 40, 170, 30);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("introduzca el nuevo rol");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(520, 90, 150, 20);

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

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(170, 30, 340, 140);

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
        jPanel2.add(txt_texto);
        txt_texto.setBounds(70, 50, 80, 22);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cargo");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 50, 40, 24);

        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_codigo);
        txt_codigo.setBounds(70, 90, 80, 22);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 90, 44, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 140, 890, 240);

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
