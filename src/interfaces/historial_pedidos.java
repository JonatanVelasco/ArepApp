package interfaces;

import conexion.ConexionBD;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class historial_pedidos extends javax.swing.JInternalFrame {

    ConexionBD cone;

    DefaultTableModel modelo;

    public historial_pedidos() {
        initComponents();
        cone = new ConexionBD();
        verHistorial();

    }

    public void verHistorial() {
        try {

            ResultSet rs1 = cone.consultaDatos(
                    "SELECT productos.nombreProducto, productos.precio, pedidos.estado, pedidos.total, detalle_pedidos.cantidad "
                    + "FROM detalle_pedidos "
                    + "JOIN pedidos "
                    + "ON detalle_pedidos.codigo_pedido = pedidos.codigo "
                    + "JOIN productos "
                    + "ON detalle_pedidos.codigo_producto = productos.codigo WHERE pedidos.cedula_usuario = 1136035931 AND pedidos.estado = 'Finalizado'");
            
            String[] columnNames = {"Producto", "Precio unidad", "Cantidad", "Total pagado"};
            modelo = new DefaultTableModel(null, columnNames);
            String[] datos = new String[4];
            while (rs1.next()) {
                datos[0] = rs1.getString("nombreProducto");
                datos[1] = rs1.getString("precio");
                datos[2] = rs1.getString("cantidad");
                datos[3] = rs1.getString("total");
                modelo.addRow(datos);
            }
            tb_historial.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(historial_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

        tb_historial.setShowGrid(false);
        tb_historial.setBackground(Color.white);
        tb_historial.setBorder(BorderFactory.createLineBorder(Color.white));

        JTableHeader header = tb_historial.getTableHeader();
        header.setBackground(Color.white);
        tb_historial.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_historial = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HISTORIAL DE PEDIDOS");

        tb_historial.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_historial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tb_historial.setGridColor(new java.awt.Color(255, 255, 255));
        tb_historial.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tb_historial.getTableHeader().setResizingAllowed(false);
        tb_historial.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tb_historial);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb_historial;
    // End of variables declaration//GEN-END:variables
}
