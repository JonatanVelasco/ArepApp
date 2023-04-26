/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaces;

import javax.swing.*;

public class armar_arepa extends javax.swing.JInternalFrame {

    int total_ingredientes = 0;

    public armar_arepa() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btg_maiz = new javax.swing.ButtonGroup();
        bg_panel = new javax.swing.JPanel();
        labe_ingredientes = new javax.swing.JLabel();
        box_pollo = new javax.swing.JCheckBox();
        box_bacon = new javax.swing.JCheckBox();
        box_carne = new javax.swing.JCheckBox();
        box_huevo = new javax.swing.JCheckBox();
        label_salsas = new javax.swing.JLabel();
        box_ajo = new javax.swing.JCheckBox();
        box_piña = new javax.swing.JCheckBox();
        box_rosada = new javax.swing.JCheckBox();
        box_sinsalsa = new javax.swing.JCheckBox();
        label_base = new javax.swing.JLabel();
        box_blanco = new javax.swing.JCheckBox();
        box_amarillo = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        label_titulo = new javax.swing.JLabel();
        bto_finalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio_maizblanco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        precio_maizamarillo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label_preciopollo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        label_preciobacon = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        label_preciocarne = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        label_preciohuevo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        label_titulo1 = new javax.swing.JLabel();
        label_ingredientes = new javax.swing.JLabel();
        label_totalbase = new javax.swing.JLabel();
        label_totalingredientes = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);

        bg_panel.setBackground(new java.awt.Color(153, 204, 255));
        bg_panel.setForeground(new java.awt.Color(204, 204, 204));

        labe_ingredientes.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        labe_ingredientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labe_ingredientes.setText("¡Agrega los ingredientes!");

        box_pollo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_pollo.setText("Pollo");
        box_pollo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        box_pollo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_polloItemStateChanged(evt);
            }
        });

        box_bacon.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_bacon.setText("Bacon");
        box_bacon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_baconItemStateChanged(evt);
            }
        });

        box_carne.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_carne.setText("Carne");
        box_carne.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_carneItemStateChanged(evt);
            }
        });

        box_huevo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_huevo.setText("Huevo");
        box_huevo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_huevoItemStateChanged(evt);
            }
        });

        label_salsas.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_salsas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_salsas.setText("¡Adiciona tus salsas favoritas!");

        box_ajo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_ajo.setText("Ajó");

        box_piña.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_piña.setText("Piña");

        box_rosada.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_rosada.setText("Rosada");

        box_sinsalsa.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_sinsalsa.setText("Sin salsa");
        box_sinsalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_sinsalsaActionPerformed(evt);
            }
        });

        label_base.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_base.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_base.setText("¡Elige el tipo de maíz para tu arepa!");

        btg_maiz.add(box_blanco);
        box_blanco.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_blanco.setText("Blanco");
        box_blanco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_blancoItemStateChanged(evt);
            }
        });

        btg_maiz.add(box_amarillo);
        box_amarillo.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        box_amarillo.setText("Amarillo");
        box_amarillo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                box_amarilloItemStateChanged(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        label_titulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("¡TOTAL A PAGAR!");

        bto_finalizar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bto_finalizar.setText("Finalizar");
        bto_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_finalizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setText("Base:");

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡PRECIOS!");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BASES");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setText("Maíz blanco");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arepa_blanca.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel5.setMinimumSize(new java.awt.Dimension(60, 60));

        precio_maizblanco.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        precio_maizblanco.setText("1000");

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setText("Maíz amarillo");

        precio_maizamarillo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        precio_maizamarillo.setText("1200");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arepa_amarilla.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INGREDIENTES");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevo-frito.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel12.setText("Pollo");

        label_preciopollo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        label_preciopollo.setText("2000");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bacon.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel15.setText("Bacon");

        label_preciobacon.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        label_preciobacon.setText("1800");

        jLabel18.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel18.setText("Carne");

        label_preciocarne.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        label_preciocarne.setText("2300");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pechuga-de-pollo.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel21.setText("Huevo");

        label_preciohuevo.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        label_preciohuevo.setText("1000");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carne.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel23.setText("$");

        jLabel24.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel24.setText("$");

        jLabel26.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel26.setText("$");

        jLabel27.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel27.setText("$");

        jLabel28.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel28.setText("$");

        label_titulo1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        label_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo1.setText("¡ARMA TU AREPA!");

        label_ingredientes.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        label_ingredientes.setText("Ingredientes:");

        label_totalbase.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        label_totalbase.setText("0");

        label_totalingredientes.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        label_totalingredientes.setText("0");

        jLabel29.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel29.setText("$");

        jLabel30.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel30.setText("$");

        jLabel31.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel31.setText("$");

        javax.swing.GroupLayout bg_panelLayout = new javax.swing.GroupLayout(bg_panel);
        bg_panel.setLayout(bg_panelLayout);
        bg_panelLayout.setHorizontalGroup(
            bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(precio_maizamarillo))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel15)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label_preciobacon))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precio_maizblanco))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label_preciohuevo))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_panelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label_preciopollo))
                            .addGroup(bg_panelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label_preciocarne)))))
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(box_amarillo))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labe_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(box_pollo)
                        .addGap(17, 17, 17)
                        .addComponent(box_bacon))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(box_carne)
                        .addGap(11, 11, 11)
                        .addComponent(box_huevo))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(box_rosada))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(box_piña))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_salsas, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_base, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(box_blanco))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(box_ajo))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(box_sinsalsa)))
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(label_ingredientes)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(label_totalbase))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(label_totalingredientes))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(bto_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bg_panelLayout.setVerticalGroup(
            bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_panelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(precio_maizblanco)
                                    .addComponent(jLabel4)))
                            .addGroup(bg_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel29)
                            .addComponent(precio_maizamarillo)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel10)
                        .addGap(25, 25, 25)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel26)
                            .addComponent(label_preciopollo)))
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(bg_panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel27)
                            .addComponent(label_preciobacon))
                        .addGap(30, 30, 30)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel28)
                            .addComponent(label_preciocarne))
                        .addGap(40, 40, 40)
                        .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(label_preciohuevo))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bg_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(box_amarillo)
                .addGap(26, 26, 26)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(labe_ingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_pollo)
                    .addComponent(box_bacon))
                .addGap(6, 6, 6)
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_carne)
                    .addComponent(box_huevo))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(box_rosada)
                .addGap(6, 6, 6)
                .addComponent(box_piña))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(label_salsas))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(label_base, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(label_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(box_blanco))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(box_ajo))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(box_sinsalsa))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_ingredientes)
                    .addComponent(jLabel31)))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel30))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(label_totalbase))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(label_totalingredientes))
            .addGroup(bg_panelLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(bto_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void box_sinsalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_sinsalsaActionPerformed
        if (box_sinsalsa.isSelected()) {
            box_ajo.setEnabled(false);
            box_piña.setEnabled(false);
            box_rosada.setEnabled(false);
            box_ajo.setSelected(false);
            box_piña.setSelected(false);
            box_rosada.setSelected(false);
        } else {
            box_ajo.setEnabled(true);
            box_piña.setEnabled(true);
            box_rosada.setEnabled(true);
        }
    }//GEN-LAST:event_box_sinsalsaActionPerformed

    private void bto_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_finalizarActionPerformed
        if (!box_carne.isSelected() && !box_bacon.isSelected() && !box_pollo.isSelected() && !box_huevo.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Debes agregar como mínimo un ingrediente.");
        }

        if (!box_amarillo.isSelected() && !box_blanco.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Debes elegir una base.");

        } else {

            if (box_amarillo.isSelected() || box_blanco.isSelected() && box_carne.isSelected() || box_bacon.isSelected() || box_pollo.isSelected() || box_huevo.isSelected()) {
                int totalf_ingredientes = Integer.parseInt(label_totalingredientes.getText());
                int total_base = Integer.parseInt(label_totalbase.getText());
                int total_general = totalf_ingredientes + total_base;
                JOptionPane.showConfirmDialog(rootPane, "El total a pagar es: $" + total_general + " ¿Deseas continuar?");
            }

        }

    }//GEN-LAST:event_bto_finalizarActionPerformed

    private void box_blancoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_blancoItemStateChanged
        if (box_blanco.isSelected()) {
            label_totalbase.setText(precio_maizblanco.getText());
        }

    }//GEN-LAST:event_box_blancoItemStateChanged

    private void box_amarilloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_amarilloItemStateChanged
        if (box_amarillo.isSelected()) {
            label_totalbase.setText(precio_maizamarillo.getText());
        }

    }//GEN-LAST:event_box_amarilloItemStateChanged

    private void box_polloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_polloItemStateChanged
        if (box_pollo.isSelected()) {
            total_ingredientes += Integer.parseInt(label_preciopollo.getText());
        } else {
            if (!box_pollo.isSelected()) {
                total_ingredientes -= Integer.parseInt(label_preciopollo.getText());
            }
        }
        label_totalingredientes.setText(Integer.toString(total_ingredientes));
    }//GEN-LAST:event_box_polloItemStateChanged

    private void box_carneItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_carneItemStateChanged
        if (box_carne.isSelected()) {
            total_ingredientes += Integer.parseInt(label_preciocarne.getText());
        } else {
            if (!box_carne.isSelected()) {
                total_ingredientes -= Integer.parseInt(label_preciocarne.getText());
            }
        }
        label_totalingredientes.setText(Integer.toString(total_ingredientes));
    }//GEN-LAST:event_box_carneItemStateChanged

    private void box_baconItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_baconItemStateChanged
        if (box_bacon.isSelected()) {
            total_ingredientes += Integer.parseInt(label_preciobacon.getText());
        } else {
            if (!box_bacon.isSelected()) {
                total_ingredientes -= Integer.parseInt(label_preciobacon.getText());
            }
        }
        label_totalingredientes.setText(Integer.toString(total_ingredientes));
    }//GEN-LAST:event_box_baconItemStateChanged

    private void box_huevoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_box_huevoItemStateChanged
        if (box_huevo.isSelected()) {
            total_ingredientes += Integer.parseInt(label_preciohuevo.getText());
        } else {
            if (!box_huevo.isSelected()) {
                total_ingredientes -= Integer.parseInt(label_preciohuevo.getText());
            }
        }
        label_totalingredientes.setText(Integer.toString(total_ingredientes));
    }//GEN-LAST:event_box_huevoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_panel;
    private javax.swing.JCheckBox box_ajo;
    private javax.swing.JCheckBox box_amarillo;
    private javax.swing.JCheckBox box_bacon;
    private javax.swing.JCheckBox box_blanco;
    private javax.swing.JCheckBox box_carne;
    private javax.swing.JCheckBox box_huevo;
    private javax.swing.JCheckBox box_piña;
    private javax.swing.JCheckBox box_pollo;
    private javax.swing.JCheckBox box_rosada;
    private javax.swing.JCheckBox box_sinsalsa;
    private javax.swing.ButtonGroup btg_maiz;
    private javax.swing.JButton bto_finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labe_ingredientes;
    private javax.swing.JLabel label_base;
    private javax.swing.JLabel label_ingredientes;
    private javax.swing.JLabel label_preciobacon;
    private javax.swing.JLabel label_preciocarne;
    private javax.swing.JLabel label_preciohuevo;
    private javax.swing.JLabel label_preciopollo;
    private javax.swing.JLabel label_salsas;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JLabel label_totalbase;
    private javax.swing.JLabel label_totalingredientes;
    private javax.swing.JLabel precio_maizamarillo;
    private javax.swing.JLabel precio_maizblanco;
    // End of variables declaration//GEN-END:variables

}
