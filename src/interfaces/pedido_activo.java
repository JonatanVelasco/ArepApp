package interfaces;

import conexion.ConexionBD;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class pedido_activo extends javax.swing.JInternalFrame {

    ConexionBD cone;

    public pedido_activo() {
        initComponents();
        cone = new ConexionBD();
        VerActivo();
    }

    public void VerActivo() {

        String estado = "";

        try {
            ResultSet rs = cone.consultaDatos(
                    "SELECT pedidos.*, detalle_pedidos.cantidad, productos.nombreProducto, productos.descripcion, productos.imagen"
                    + " FROM detalle_pedidos "
                    + "JOIN pedidos "
                    + "ON codigo_pedido = pedidos.codigo "
                    + "JOIN productos "
                    + "ON detalle_pedidos.codigo_producto = productos.codigo "
                    + "WHERE pedidos.cedula_usuario = 1136035931 AND (pedidos.estado = 'Enviado' OR pedidos.estado ='Entregado')");

            while (rs.next()) {
                estado = rs.getString("estado");

                if (estado.equals("Enviado") || estado.equals("Entregado")) {

                    btom_comprar.setVisible(false);
                    bton_historialn.setVisible(false);
                    bton_historials.setVisible(true);
                    label_notienes.setVisible(false);

                    byte[] imagenBytes = rs.getBytes("imagen");
                    ImageIcon imagen_producto = new ImageIcon(imagenBytes);
                    Image image_escalada = imagen_producto.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                    label_imagen.setIcon(new ImageIcon(image_escalada));

                    txt_descripcion.setText(rs.getString("descripcion"));
                    label_totalPagar.setText("$" + rs.getString("total"));
                    label_estado.setText(rs.getString("estado"));
                    txt_observaciones.setText(rs.getString("observacion_pedido"));
                    label_cantidad.setText(rs.getString("cantidad"));
                    label_nombreProducto.setText(rs.getString("nombreProducto"));

                    txt_descripcion.setEditable(false);
                    txt_observaciones.setEditable(false);

                    bton_confirmar.setVisible(false);
                    bton_calificar.setVisible(false);

                    if (estado.equals("Entregado")) {

                        bton_confirmar.setVisible(true);
                        bton_calificar.setVisible(true);
                    }
                }
            }

            if (estado.equals("")) {
                jLabel1.setVisible(false);
                jLabel3.setVisible(false);
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jLabel9.setVisible(false);
                jScrollPane1.setVisible(false);
                jScrollPane2.setVisible(false);
                label_cantidad.setVisible(false);
                label_estado.setVisible(false);
                label_imagen.setVisible(false);
                label_nombreProducto.setVisible(false);
                label_totalPagar.setVisible(false);
                txt_descripcion.setVisible(false);
                txt_observaciones.setVisible(false);
                bton_historialn.setVisible(true);
                btom_comprar.setVisible(true);
                bton_historials.setVisible(false);
                bton_confirmar.setVisible(false);
                bton_calificar.setVisible(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(pedido_activo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_activo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_nombreProducto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label_totalPagar = new javax.swing.JLabel();
        label_imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        label_estado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        label_cantidad = new javax.swing.JLabel();
        bton_historialn = new javax.swing.JButton();
        label_notienes = new javax.swing.JLabel();
        btom_comprar = new javax.swing.JButton();
        bton_historials = new javax.swing.JButton();
        bton_confirmar = new javax.swing.JButton();
        bton_calificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado de pedidos activos");

        panel_activo.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setText("Producto:");

        label_nombreProducto.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_nombreProducto.setText("Nombre del producto");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setText("Total a pagar:");

        label_totalPagar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_totalPagar.setText("Valor a pagar");

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setText("Observaciones:");

        txt_observaciones.setColumns(20);
        txt_observaciones.setRows(5);
        jScrollPane2.setViewportView(txt_observaciones);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setText("Descripción:");

        label_estado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_estado.setText("Estado");

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel9.setText("Cantidad:");

        label_cantidad.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_cantidad.setText("#");

        bton_historialn.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bton_historialn.setText("Historial de pedidos");
        bton_historialn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_historialnActionPerformed(evt);
            }
        });

        label_notienes.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_notienes.setText("¡NO TIENES PEDIDOS EN CURSO!");

        btom_comprar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        btom_comprar.setText("Ir a comprar");

        bton_historials.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bton_historials.setText("Historial de pedidos");
        bton_historials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_historialsActionPerformed(evt);
            }
        });

        bton_confirmar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bton_confirmar.setText("Confirmar entrega");
        bton_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_confirmarActionPerformed(evt);
            }
        });

        bton_calificar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bton_calificar.setText("Calificar pedido");
        bton_calificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_calificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_activoLayout = new javax.swing.GroupLayout(panel_activo);
        panel_activo.setLayout(panel_activoLayout);
        panel_activoLayout.setHorizontalGroup(
            panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_activoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_activoLayout.createSequentialGroup()
                        .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_activoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(6, 6, 6)
                                .addComponent(label_estado))
                            .addGroup(panel_activoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(11, 11, 11)
                                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_nombreProducto)
                                    .addGroup(panel_activoLayout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(label_notienes))))
                            .addGroup(panel_activoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)
                                .addComponent(label_cantidad)
                                .addGap(112, 112, 112)
                                .addComponent(btom_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_activoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(7, 7, 7)
                                .addComponent(label_totalPagar)
                                .addGap(8, 8, 8)
                                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bton_historialn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_activoLayout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(jLabel7)))))
                        .addGap(4, 4, 4)
                        .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_activoLayout.createSequentialGroup()
                        .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_activoLayout.createSequentialGroup()
                        .addComponent(bton_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(bton_calificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(bton_historials))))
        );
        panel_activoLayout.setVerticalGroup(
            panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_activoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_activoLayout.createSequentialGroup()
                        .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(label_estado))
                        .addGap(10, 10, 10)
                        .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(label_nombreProducto)
                            .addComponent(label_notienes))
                        .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btom_comprar)
                            .addGroup(panel_activoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(label_cantidad))))
                        .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bton_historialn)
                            .addGroup(panel_activoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(label_totalPagar)
                                    .addComponent(jLabel7)))))
                    .addComponent(label_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_activoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(panel_activoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bton_confirmar)
                    .addComponent(bton_calificar)
                    .addGroup(panel_activoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bton_historials))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bton_historialnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_historialnActionPerformed
        historial_pedidos hp = new historial_pedidos();
        Menu.escritorio.add(hp);
        hp.toFront();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bton_historialnActionPerformed

    private void bton_calificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_calificarActionPerformed

    }//GEN-LAST:event_bton_calificarActionPerformed

    private void bton_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_confirmarActionPerformed
        cone.modificaDatos("UPDATE pedidos SET estado = 'Finalizado' WHERE pedidos.cedula_usuario = 1136035931 AND pedidos.estado='Entregado';");
        JOptionPane.showMessageDialog(null, "Has confirmado la entrega de tu pedido.");
    }//GEN-LAST:event_bton_confirmarActionPerformed

    private void bton_historialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_historialsActionPerformed
        historial_pedidos hp = new historial_pedidos();
        Menu.escritorio.add(hp);
        hp.toFront();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bton_historialsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btom_comprar;
    private javax.swing.JButton bton_calificar;
    private javax.swing.JButton bton_confirmar;
    private javax.swing.JButton bton_historialn;
    private javax.swing.JButton bton_historials;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_cantidad;
    private javax.swing.JLabel label_estado;
    private javax.swing.JLabel label_imagen;
    private javax.swing.JLabel label_nombreProducto;
    private javax.swing.JLabel label_notienes;
    private javax.swing.JLabel label_totalPagar;
    private javax.swing.JPanel panel_activo;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextArea txt_observaciones;
    // End of variables declaration//GEN-END:variables
}
