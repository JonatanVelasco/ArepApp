package interfaces;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CrearProducto extends JInternalFrame {

    private JPanel panelIngredientes;
    private JPanel panelBases;
    private JPanel panelSalsas;
    private ButtonGroup grupoBases;
    private BigDecimal total;
    private JLabel labelTotal;

    public CrearProducto() {
        super("", true, true, true, true);
        setSize(400, 300);
        setLocation(50, 50);

        panelIngredientes = new JPanel(new GridLayout(0, 2));
        panelIngredientes.setBorder(BorderFactory.createTitledBorder("Ingredientes"));
        panelIngredientes.setLayout(new BoxLayout(panelIngredientes, BoxLayout.Y_AXIS));
        cargarElementosDesdeDB("ingredientes", panelIngredientes);

        panelBases = new JPanel(new GridLayout(0, 2));
        panelBases.setBorder(BorderFactory.createTitledBorder("Bases"));
        panelBases.setLayout(new BoxLayout(panelBases, BoxLayout.Y_AXIS));
        cargarElementosDesdeDB("bases", panelBases);

        panelSalsas = new JPanel(new GridLayout(0, 2));
        panelSalsas.setBorder(BorderFactory.createTitledBorder("Salsas"));
        panelSalsas.setLayout(new BoxLayout(panelSalsas, BoxLayout.Y_AXIS));

        JCheckBox checkBoxNinguna = new JCheckBox("Ninguna");
        checkBoxNinguna.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {

                Component[] components = panelSalsas.getComponents();
                for (Component component : components) {
                    if (component instanceof JCheckBox) {
                        JCheckBox checkBox = (JCheckBox) component;
                        if (!checkBox.equals(checkBoxNinguna)) {
                            checkBox.setSelected(false);
                            checkBox.setEnabled(false);
                        }
                    }
                }
            } else {

                Component[] components = panelSalsas.getComponents();
                for (Component component : components) {
                    if (component instanceof JCheckBox) {
                        JCheckBox checkBox = (JCheckBox) component;
                        if (!checkBox.equals(checkBoxNinguna)) {
                            checkBox.setEnabled(true);
                        }
                    }
                }
            }
        });
        panelSalsas.add(checkBoxNinguna);

        cargarElementosDesdeDB("salsas", panelSalsas);

        JPanel panelPrincipal = new JPanel(new GridLayout(1, 3));
        panelPrincipal.add(panelIngredientes);
        panelPrincipal.add(panelBases);
        panelPrincipal.add(panelSalsas);

        setContentPane(panelPrincipal);
        setVisible(true);

        JButton btnCalcular = new JButton("Calcular Total");

        JLabel lblTotal = new JLabel("Total: $0");

        btnCalcular.addActionListener(e -> {
            int total = 0;
            Component[] components = panelIngredientes.getComponents();
            for (Component component : components) {
                if (component instanceof JCheckBox) {
                    JCheckBox checkBox = (JCheckBox) component;
                    if (checkBox.isSelected()) {
                        String text = checkBox.getText();
                        int precio = Integer.parseInt(text.substring(text.indexOf("$") + 1, text.length() - 1));
                        total += precio;
                    }
                }
            }
            components = panelBases.getComponents();
            for (Component component : components) {
                if (component instanceof JCheckBox) {
                    JCheckBox checkBox = (JCheckBox) component;
                    if (checkBox.isSelected()) {
                        String text = checkBox.getText();
                        int precio = Integer.parseInt(text.substring(text.indexOf("$") + 1, text.length() - 1));
                        total += precio;
                    }
                }
            }

            lblTotal.setText("Total: $" + total);
        });

        JButton btnFinalizarPedido = new JButton("Finalizar Pedido");
        btnFinalizarPedido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Agregar los componentes al panel principal
        JPanel panelBotones = new JPanel(new GridLayout(1, 2));
        panelBotones.add(btnCalcular);
        panelBotones.add(lblTotal);
        panelPrincipal.add(panelBotones);
        panelBotones.add(btnFinalizarPedido);

        setContentPane(panelPrincipal);
        setVisible(true);

    }

    private void cargarElementosDesdeDB(String tabla, JPanel panel) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arepapp", "root", ""); PreparedStatement stmt = conn.prepareStatement("SELECT * FROM " + tabla + " WHERE estado = 'Disponible'"); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int precio = rs.getInt("precio");

                JCheckBox checkBox = new JCheckBox(nombre + " ($" + precio + ")");
                checkBox.setActionCommand(tabla + "." + nombre);

                if (tabla.equals("bases")) {
                    if (grupoBases == null) {
                        grupoBases = new ButtonGroup();
                    }
                    grupoBases.add(checkBox);
                }

                panel.add(checkBox);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("ARMA TU AREPA");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(800, 600);
//            frame.setLocationRelativeTo(null);
//
//            JDesktopPane desktopPane = new JDesktopPane();
//            frame.add(desktopPane, BorderLayout.CENTER);
//
//            CrearProductoTest internalFrame = new CrearProductoTest();
//            internalFrame.setVisible(true);
//            desktopPane.add(internalFrame);
//
//            frame.setVisible(true);
//        });
//    }
}
