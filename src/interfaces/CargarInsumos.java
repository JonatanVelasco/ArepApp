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
    String estado;
    String UpdateTable;

    public CargarInsumos() {
        initComponents();
        cone = new ConexionBD();
        String[] columnNames = {"Id", "Nombre", "Precio", "Estado"};
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

        jPanel2 = new javax.swing.JPanel();
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
        jLabel5 = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CREA TU AREPA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        cbo_icategoria.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbo_icategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Bases", "Ingredientes", "Salsas" }));
        cbo_icategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_icategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_icategoria);
        cbo_icategoria.setBounds(25, 210, 140, 30);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CATEGORÍA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 170, 130, 30);

        tabla_insumos.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        tabla_insumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_insumos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 160, 450, 270);

        bto_nuevo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_nuevo.setText("Nuevo");
        bto_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(bto_nuevo);
        bto_nuevo.setBounds(670, 400, 90, 30);

        bto_modificar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_modificar.setText("Modificar");
        bto_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(bto_modificar);
        bto_modificar.setBounds(670, 440, 120, 27);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(680, 200, 90, 30);

        txt_nombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_nombre);
        txt_nombre.setBounds(769, 200, 160, 26);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(680, 250, 90, 30);

        txt_precio.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txt_precio);
        txt_precio.setBounds(768, 250, 160, 26);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estado:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(680, 300, 90, 30);

        cbo_estado.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Disponible", "Agotado" }));
        jPanel1.add(cbo_estado);
        cbo_estado.setBounds(768, 300, 160, 26);

        l_categoria.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        l_categoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_categoria.setText("Categoría:");
        jPanel1.add(l_categoria);
        l_categoria.setBounds(680, 350, 90, 30);

        cbo_categoria.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        cbo_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Bases", "Ingredientes", "Salsas" }));
        jPanel1.add(cbo_categoria);
        cbo_categoria.setBounds(768, 350, 160, 26);

        bto_agregar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_agregar.setText("Agregar");
        bto_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(bto_agregar);
        bto_agregar.setBounds(770, 400, 80, 30);

        bto_atras.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_atras.setText("Atrás");
        bto_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(bto_atras);
        bto_atras.setBounds(860, 400, 90, 30);

        bto_guardarCambios.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_guardarCambios.setText("Guardar cambios");
        bto_guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_guardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(bto_guardarCambios);
        bto_guardarCambios.setBounds(814, 440, 140, 27);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(680, 160, 90, 30);

        label_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        label_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_id.setText(" ");
        jPanel1.add(label_id);
        label_id.setBounds(770, 160, 160, 30);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GESTIÓN DE INSUMOS");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 4, 1020, 100);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1030, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addGap(16, 16, 16))
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
            String[] datos = new String[4];
            while (rs1.next()) {
                datos[0] = rs1.getString("id");
                datos[1] = rs1.getString("nombre");
                datos[2] = rs1.getString("precio");
                datos[3] = rs1.getString("estado");
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
                    label_id.setText(tabla_insumos.getValueAt(filaSeleccionada, 0).toString());
                    txt_nombre.setText(tabla_insumos.getValueAt(filaSeleccionada, 1).toString());
                    txt_precio.setText(tabla_insumos.getValueAt(filaSeleccionada, 2).toString());
                    cbo_estado.setSelectedItem(tabla_insumos.getValueAt(filaSeleccionada, 3).toString());
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

        switch (cbo_estado.getSelectedIndex()) {
            case 1:
                estado = "Disponible";
                break;
            case 2:
                estado = "Agotado";
                break;
        }
   
        switch (cbo_categoria.getSelectedIndex()) {
            case 1:
                UpdateTable = "bases";
                break;
            case 2:
                UpdateTable = "ingredientes";
                break;
            case 3:
                UpdateTable = "salsas";
                break;
        }

        int precio = Integer.parseInt(txt_precio.getText());

        cone.modificaDatos("UPDATE " + UpdateTable + " SET nombre = '" + txt_nombre.getText() + "', precio = '" + precio + "', estado = '" + estado + "' WHERE id = " + label_id.getText());

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

        cone.modificaDatos("INSERT INTO " + tabla + " (nombre, precio, estado) VALUES ('" + txt_nombre.getText() + "', '" + txt_precio.getText() + "', '" + estado + "')");
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_categoria;
    private javax.swing.JLabel label_id;
    private javax.swing.JTable tabla_insumos;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
