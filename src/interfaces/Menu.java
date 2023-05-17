package interfaces;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import conexion.ConexionBD;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public static Connection conn;
    conexion.ConexionBD con = new ConexionBD();
    public static String userName = "";
    public static String cedula = "";
    public static String rol = "";

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        checkUser();
        pack();

        this.setSize(new Dimension(1200, 695));

        this.setMinimumSize(new Dimension(1200, 695));
    }

    public static void checkUser() {
        if (userName.equals("")) {
            gestionAdmin.setVisible(false);
            misPedidos.setVisible(false);
            comprar.setVisible(false);
            entregas.setVisible(false);
        } else {

            switch (rol) {

                case "500" -> {
                    //ADMIN
                    gestionAdmin.setVisible(true);
                    misPedidos.setVisible(true);
                    comprar.setVisible(true);
                    entregas.setVisible(true);
                }
                case "501" -> {
                    //VENDEDOR
                    comprar.setVisible(true);
                    misPedidos.setVisible(true);
                }
                case "502" -> //DOMICILIARIO 
                    entregas.setVisible(true);
                case "503" -> {
                    //CLIENTE
                    comprar.setVisible(true);
                    misPedidos.setVisible(true);
                }

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        bton_arepapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBarra = new javax.swing.JMenuBar();
        gestionAdmin = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        comprar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        misPedidos = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        entregas = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bton_arepapp.setBackground(new java.awt.Color(204, 102, 0));
        bton_arepapp.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        bton_arepapp.setText("AREPAPP");
        bton_arepapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_arepappActionPerformed(evt);
            }
        });
        escritorio.add(bton_arepapp);
        bton_arepapp.setBounds(240, 240, 280, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arepas-caseras.jpg"))); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 670);

        gestionAdmin.setText("Gestión administrador");

        jMenuItem2.setText("Nuestros productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        gestionAdmin.add(jMenuItem2);

        jMenuItem4.setText(" Gestión de usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        gestionAdmin.add(jMenuItem4);

        jMenuItem5.setText("Gestion roles");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        gestionAdmin.add(jMenuItem5);

        jMenuItem1.setText("Gestión de insumos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        gestionAdmin.add(jMenuItem1);

        jMenuItem10.setText("Reportes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        gestionAdmin.add(jMenuItem10);

        jBarra.add(gestionAdmin);

        comprar.setText("Comprar");

        jMenuItem3.setText("Arma tu arepa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        comprar.add(jMenuItem3);

        jMenuItem6.setText("Menú");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        comprar.add(jMenuItem6);

        jBarra.add(comprar);

        misPedidos.setText("Mis pedidos");

        jMenuItem7.setText("Historial de pedidos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        misPedidos.add(jMenuItem7);

        jMenuItem8.setText("Pedido activo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        misPedidos.add(jMenuItem8);

        jBarra.add(misPedidos);

        entregas.setText("Entregas");

        jMenuItem9.setText("Mis entregas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        entregas.add(jMenuItem9);

        jBarra.add(entregas);

        setJMenuBar(jBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CrearProducto Cp = new CrearProducto();
        escritorio.add(Cp);
        Cp.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        compra c = new compra(null, "Nombre del producto", 10, "Descripción del producto", new byte[0]);
        c.mostrarVentanaCompra(con.estableceConexion());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        historial_pedidos mp = new historial_pedidos();
        escritorio.add(mp);
        mp.show();

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        pedido_activo pa = new pedido_activo();
        escritorio.add(pa);
        pa.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Entregas entregas1 = new Entregas();
        escritorio.add(entregas1);
        entregas1.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void bton_arepappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_arepappActionPerformed
        Login login = new Login();
        escritorio.add(login);
        login.show();
        bton_arepapp.setVisible(false);
    }//GEN-LAST:event_bton_arepappActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Gestion_roles Gestion = new Gestion_roles();
        escritorio.add(Gestion);
        Gestion.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        GestionUsuarios gu = new GestionUsuarios();
        escritorio.add(gu);
        gu.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GestionProductos productos = new GestionProductos();
        escritorio.add(productos);
        productos.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CargarInsumos ci = new CargarInsumos();
        escritorio.add(ci);
        ci.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Report re = new Report();
        escritorio.add(re);
       re.show();    }//GEN-LAST:event_jMenuItem10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bton_arepapp;
    public static javax.swing.JMenu comprar;
    public static javax.swing.JMenu entregas;
    public static javax.swing.JDesktopPane escritorio;
    public static javax.swing.JMenu gestionAdmin;
    private javax.swing.JMenuBar jBarra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    public static javax.swing.JMenu misPedidos;
    // End of variables declaration//GEN-END:variables
}
