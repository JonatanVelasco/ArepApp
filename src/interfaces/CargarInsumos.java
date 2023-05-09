package interfaces;


import conexion.ConexionBD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class CargarInsumos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    ConexionBD cone;
    String tabla;

    public CargarInsumos() {
        initComponents();
        cone = new ConexionBD();
        String[] columnNames = {"Nombre", "Precio", "Estado"};
        modelo = new DefaultTableModel(null, columnNames);

        txt_nombre.setEnabled(false);
        txt_precio.setEnabled(false);
        cbo_estado.setEnabled(false);
        cbo_categoria.setEnabled(false);
        bto_agregar.setVisible(false);
        bto_atras.setVisible(false);
        bto_modificar.setVisible(false);

        l_categoria.setVisible(false);
        cbo_categoria.setVisible(false);
        bto_guardarCambios.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbo_icategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_insumos = new javax.swing.JTable();
        bto_nuevo = new javax.swing.JButton();
        bto_modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbo_estado = new javax.swing.JComboBox<>();
        l_categoria = new javax.swing.JLabel();
        cbo_categoria = new javax.swing.JComboBox<>();
        bto_agregar = new javax.swing.JButton();
        bto_atras = new javax.swing.JButton();
        bto_guardarCambios = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cbo_icategoria.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbo_icategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Bases", "Ingredientes", "Salsas" }));
        cbo_icategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_icategoriaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CATEGORÍA");

        tabla_insumos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        tabla_insumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "PRECIO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_insumos);

        bto_nuevo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_nuevo.setText("Nuevo");
        bto_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_nuevoActionPerformed(evt);
            }
        });

        bto_modificar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_modificar.setText("Modificar");
        bto_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_modificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");

        txt_precio.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setText("Estado:");

        cbo_estado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Disponible", "Agotado" }));

        l_categoria.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        l_categoria.setText("Categoría:");

        cbo_categoria.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbo_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Bases", "Ingredientes", "Salsas" }));

        bto_agregar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_agregar.setText("Agregar");
        bto_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_agregarActionPerformed(evt);
            }
        });

        bto_atras.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_atras.setText("Atrás");
        bto_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_atrasActionPerformed(evt);
            }
        });

        bto_guardarCambios.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_guardarCambios.setText("Guardar cambios");
        bto_guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_guardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_icategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(l_categoria))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bto_modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bto_guardarCambios))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bto_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bto_agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bto_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(cbo_icategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cbo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l_categoria)
                                    .addComponent(cbo_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bto_agregar)
                                .addComponent(bto_atras))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(bto_nuevo)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bto_modificar)
                    .addComponent(bto_guardarCambios))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_icategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_icategoriaActionPerformed

        switch (cbo_icategoria.getSelectedIndex()) {
            case 1 ->
                tabla = "bases";
            case 2 ->
                tabla = "ingredientes";
            case 3 ->
                tabla = "salsas";
        }

        try {
            DefaultTableModel modelo = (DefaultTableModel) tabla_insumos.getModel();
            modelo.setRowCount(0);

            ResultSet rs1 = cone.consultaDatos(" SELECT * FROM " + tabla);
            String[] datos = new String[3];
            while (rs1.next()) {
                datos[0] = rs1.getString("nombre");
                datos[1] = rs1.getString("precio");
                datos[2] = rs1.getString("estado");
                modelo.addRow(datos);
            }
            tabla_insumos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CargarInsumos.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabla_insumos.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = tabla_insumos.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    txt_nombre.setText(tabla_insumos.getValueAt(filaSeleccionada, 0).toString());
                    txt_precio.setText(tabla_insumos.getValueAt(filaSeleccionada, 1).toString());
                    cbo_estado.setSelectedItem(tabla_insumos.getValueAt(filaSeleccionada, 2).toString());
                    cbo_categoria.setSelectedItem(cbo_icategoria.getSelectedItem().toString());
                    bto_modificar.setVisible(true);
                }
            }
        });

        bto_modificar.setVisible(false);

    }//GEN-LAST:event_cbo_icategoriaActionPerformed

    private void bto_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_nuevoActionPerformed
        txt_nombre.setEnabled(true);
        txt_precio.setEnabled(true);
        cbo_estado.setEnabled(true);
        cbo_categoria.setEnabled(true);

        txt_nombre.setText("");
        txt_precio.setText("");
        cbo_estado.setSelectedIndex(0);
        cbo_categoria.setSelectedIndex(0);

        bto_nuevo.setVisible(false);
        bto_modificar.setVisible(false);
        bto_agregar.setVisible(true);
        bto_atras.setVisible(true);
        l_categoria.setVisible(true);
        cbo_categoria.setVisible(true);
    }//GEN-LAST:event_bto_nuevoActionPerformed

    private void bto_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_atrasActionPerformed
        bto_agregar.setVisible(false);
        bto_atras.setVisible(false);
        bto_nuevo.setVisible(true);
        bto_modificar.setVisible(false);

        txt_nombre.setEnabled(false);
        txt_precio.setEnabled(false);
        cbo_estado.setEnabled(false);

        l_categoria.setVisible(false);
        cbo_categoria.setVisible(false);
    }//GEN-LAST:event_bto_atrasActionPerformed

    private void bto_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_modificarActionPerformed
        txt_nombre.setEnabled(true);
        txt_precio.setEnabled(true);
        cbo_estado.setEnabled(true);
        cbo_categoria.setEnabled(true);
        bto_agregar.setVisible(false);
        bto_atras.setVisible(false);

        l_categoria.setVisible(true);
        cbo_categoria.setVisible(true);
        bto_nuevo.setVisible(false);
        bto_guardarCambios.setVisible(true);
        bto_modificar.setVisible(false);
    }//GEN-LAST:event_bto_modificarActionPerformed

    private void bto_guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_guardarCambiosActionPerformed

        txt_nombre.setEnabled(false);
        txt_nombre.setText("");

        txt_precio.setEnabled(false);
        txt_precio.setText("");

        cbo_estado.setSelectedIndex(0);
        cbo_estado.setEnabled(false);
        
        cbo_categoria.setSelectedIndex(0);
        cbo_categoria.setEnabled(false);

        cbo_icategoria.setSelectedIndex(0);

        DefaultTableModel modelo = (DefaultTableModel) tabla_insumos.getModel();
        modelo.setRowCount(0);
        
        bto_guardarCambios.setVisible(false);
        bto_nuevo.setVisible(true);

    }//GEN-LAST:event_bto_guardarCambiosActionPerformed

    private void bto_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_agregarActionPerformed
        
        String tabla = null;
        String estado = null;
        
        switch (cbo_categoria.getSelectedIndex()) {
            case 1:
                tabla = "bases";
                break;
                case 2:
                tabla = "ingredientes";
                case 3:
                tabla = "salsas";
                break;
        }
        
        switch (cbo_estado.getSelectedIndex()) {
            case 1:
                estado = "Disponible";
                break;
                case 2:
                estado = "Agotado";
                break;
        }
        
        
        cone.modificaDatos("INSERT INTO nombre, precio, estado" + tabla + " VALUES ('"+txt_nombre.getText()+"', '"+txt_precio.getText()+"', '"+estado+"')");
    }//GEN-LAST:event_bto_agregarActionPerformed

    public void consultar(String tabla) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_agregar;
    private javax.swing.JButton bto_atras;
    private javax.swing.JButton bto_guardarCambios;
    private javax.swing.JButton bto_modificar;
    private javax.swing.JButton bto_nuevo;
    private javax.swing.JComboBox<String> cbo_categoria;
    private javax.swing.JComboBox<String> cbo_estado;
    private javax.swing.JComboBox<String> cbo_icategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_categoria;
    private javax.swing.JTable tabla_insumos;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
