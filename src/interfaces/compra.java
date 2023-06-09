package interfaces;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.ArrayList;

public class compra extends JPanel {

    private Connection conn;
    private JLabel nombreLabel;
    private JLabel precioLabel;
    private JTextArea descripcionTextArea;
    private JLabel imagenLabel;
    private JSpinner cantidadSpinner;
    private JLabel cantidadLabel;
    private JButton agregarAlCarritoBtn;
    private static ArrayList<String> verCarritoProductos = new ArrayList<>();
    int total;
    private static ArrayList<String> productosSeleccionados = new ArrayList<String>();
    int cantidad;

    public compra(Connection conn, String nombre, int precio, String descripcion, byte[] imagenBytes) {
        this.conn = conn;

        // Crear spinner de cantidad
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 100, 1); // Valor inicial, mínimo, máximo, paso
        cantidadSpinner = new JSpinner(spinnerModel);

// Crear botón "AGREGAR AL CARRITO"
        agregarAlCarritoBtn = new JButton("AGREGAR AL CARRITO");

        agregarAlCarritoBtn.addActionListener(e -> {
            cantidad = (int) cantidadSpinner.getValue();
            String producto = nombreLabel.getText();
            int precioc = precioLabel.getText().indexOf('$') + 1;
            precioc = Integer.parseInt(precioLabel.getText().substring(precioc));
            String productoCarrito = producto + " x" + cantidad + " $" + precioc * cantidad;
            verCarritoProductos.add(productoCarrito);
            total += precioc * cantidad;

            JOptionPane.showMessageDialog(null, "Agregado al carrito: " + nombreLabel.getText() + " x" + cantidadSpinner.getValue());
        });

        // Crear componentes
        nombreLabel = new JLabel(nombre, JLabel.LEFT);
        precioLabel = new JLabel("Precio: $" + precio, JLabel.LEFT);

        JTextArea descripcionTextArea = new JTextArea(descripcion);
        descripcionTextArea.setBorder(BorderFactory.createEmptyBorder());
        descripcionTextArea.setEditable(false);
        descripcionTextArea.setLineWrap(true);
        descripcionTextArea.setWrapStyleWord(true);

        Image imagen = new ImageIcon(imagenBytes).getImage();
        imagen = imagen.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        imagenLabel = new JLabel(new ImageIcon(imagen));

        // Configurar layout
        setLayout(new GridBagLayout());

        //new
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;

// Agregar componentes al panel
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 3;
        add(imagenLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        add(nombreLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        add(precioLabel, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        c.gridheight = 1;
        add(new JScrollPane(descripcionTextArea), c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Cantidad:"), c);

        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        add(cantidadSpinner, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        agregarAlCarritoBtn.setPreferredSize(new Dimension(150, 30));
        add(agregarAlCarritoBtn, c);

    }

    public JButton getAgregarAlCarritoBtn() {
        return agregarAlCarritoBtn;
    }

    public JLabel getNombreLabel() {
        return nombreLabel;
    }

    public JLabel getPrecioLabel() {
        return precioLabel;
    }

    public JTextArea getDescripcionTextArea() {
        return descripcionTextArea;
    }

    public JLabel getImagenLabel() {
        return imagenLabel;
    }

    public static void crearVentanaCarrito() {

        JFrame carritoFrame = new JFrame("Carrito de compras");
        carritoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        carritoFrame.setSize(600, 180);
        carritoFrame.setResizable(false);

        // Panel para los productos
        JPanel productosPanel = new JPanel();
        productosPanel.setLayout(new BoxLayout(productosPanel, BoxLayout.PAGE_AXIS));

        // Agregar cada producto como una etiqueta con su precio y checkbox
        for (String productoCarrito : verCarritoProductos) {
            JLabel productoLabel = new JLabel(productoCarrito);
            JCheckBox productoCheckbox = new JCheckBox();
            productoCheckbox.addActionListener(e -> {
                if (productoCheckbox.isSelected()) {
                    productosSeleccionados.add(productoLabel.getText());
                } else {
                    productosSeleccionados.remove(productoLabel.getText());
                }
            });
            JPanel productoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            productoPanel.add(productoCheckbox);
            productoPanel.add(productoLabel);
            productosPanel.add(productoPanel);
        }

        JScrollPane scrollPane = new JScrollPane(productosPanel);
        carritoFrame.add(scrollPane);

        // Botón para eliminar los productos seleccionados
        JButton eliminarBtn = new JButton("Eliminar seleccionados");
        eliminarBtn.addActionListener(e -> {
            for (String productoSeleccionado : productosSeleccionados) {
                verCarritoProductos.remove(productoSeleccionado);
            }
            productosSeleccionados.clear();
            productosPanel.removeAll();

            // Agregar cada producto restante al panel de productos
            for (String productoCarrito : verCarritoProductos) {
                JLabel productoLabel = new JLabel(productoCarrito);
                JCheckBox productoCheckbox = new JCheckBox();
                productoCheckbox.addActionListener(a -> {
                    if (productoCheckbox.isSelected()) {
                        productosSeleccionados.add(productoLabel.getText());
                    } else {
                        productosSeleccionados.remove(productoLabel.getText());
                    }
                });

                JPanel productoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
                productoPanel.add(productoCheckbox);
                productoPanel.add(productoLabel);
                productosPanel.add(productoPanel);
            }
            carritoFrame.revalidate();
            carritoFrame.repaint();
        });

        // Botón para vaciar todo el carrito
        JButton vaciarCarritoBtn = new JButton("Vaciar carrito");
        vaciarCarritoBtn.addActionListener(e -> {
            verCarritoProductos.clear();
            productosSeleccionados.clear();
            productosPanel.removeAll();
            carritoFrame.revalidate();
            carritoFrame.repaint();
        });

        // Botón para vaciar todo el carrito
        JButton FinalizarPedido = new JButton("Finalizar pedido");
        FinalizarPedido.addActionListener(e -> {

            JLabel totalLabel = new JLabel();
            actualizarTotal(totalLabel, true, 0);
            int respuesta = JOptionPane.showConfirmDialog(null, "El total por su pedido es: " + totalLabel.getText() + "¿Desea ir a pagar?");
            if (respuesta == JOptionPane.YES_OPTION) {

                medio_pago ventanaPago = new medio_pago();
                Menu.escritorio.add(ventanaPago);
                ventanaPago.show();

            }

        });

        // Agregar los botones en la parte inferior del frame
        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botonesPanel.add(eliminarBtn);
        botonesPanel.add(vaciarCarritoBtn);
        botonesPanel.add(FinalizarPedido);
        carritoFrame.add(botonesPanel, BorderLayout.SOUTH);

        carritoFrame.setVisible(true);
    }

    private static void actualizarTotal(JLabel totalLabel, boolean eliminarProducto, int precioProductoEliminado) {
        int total = 0;
        for (String productoCarrito : verCarritoProductos) {
            int precioIndex = productoCarrito.lastIndexOf('$') + 1;
            int precio = Integer.parseInt(productoCarrito.substring(precioIndex));
            total += precio;
        }
        if (eliminarProducto) {
            total -= precioProductoEliminado;
        }
        totalLabel.setText("Total: $" + total);
    }

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arepapp?serverTimezone=UTC", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos");

            JDesktopPane desktopPane = new JDesktopPane();

            JInternalFrame frame = new JInternalFrame("MENÚ", true, true, true, true);
            frame.setSize(1100, 600);
            frame.setLocation(0, 0);
            frame.setVisible(true);

            JPanel panel = new JPanel(new GridLayout(0, 3, 3, 0)); // 3 columnas, espaciado horizontal y vertical

            JButton verCarritoBtn = new JButton("Ver Carrito"); // creamos el botón
            verCarritoBtn.setPreferredSize(new Dimension(20, 40));
            verCarritoBtn.addActionListener(e -> {
                crearVentanaCarrito();
            });

            frame.getContentPane().setBackground(Color.WHITE);

            while (rs.next()) {
                String nombre = rs.getString("nombreProducto");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                byte[] imagenBytes = rs.getBytes("imagen");

                compra compra = new compra(conn, nombre, precio, descripcion, imagenBytes);
                compra.setBackground(Color.WHITE);

                JButton agregarAlCarritoBtn = compra.getAgregarAlCarritoBtn();
                JLabel nombreLabel = compra.getNombreLabel();
                JLabel precioLabel = compra.getPrecioLabel();
                JTextArea descripcionTextArea = compra.getDescripcionTextArea();
                JLabel imagenLabel = compra.getImagenLabel();

                panel.setBackground(Color.WHITE);
                panel.add(compra);
            }

            frame.add(new JScrollPane(panel), BorderLayout.CENTER);
            frame.add(verCarritoBtn, BorderLayout.SOUTH);
            frame.pack();

            desktopPane.add(frame);

            JFrame mainFrame = new JFrame("Aplicación");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(1100, 600);
            mainFrame.setResizable(false);
            mainFrame.setContentPane(desktopPane);
            mainFrame.setVisible(true);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void mostrarVentanaCompra(Connection conn){
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos");

            JDesktopPane desktopPane = new JDesktopPane();

            JInternalFrame frame = new JInternalFrame("MENÚ", true, true, true, true);
            frame.setSize(1200, 700);
            frame.setLocation(0, 0);
            frame.setVisible(true);
            

            JPanel panel = new JPanel(new GridLayout(0, 3, 3, 0)); // 3 columnas, espaciado horizontal y vertical

            JButton verCarritoBtn = new JButton("Ver Carrito"); // creamos el botón
            verCarritoBtn.setPreferredSize(new Dimension(20, 40));
            verCarritoBtn.addActionListener(e -> {
                crearVentanaCarrito();
            });

            frame.getContentPane().setBackground(Color.WHITE);

            while (rs.next()) {
                String nombre = rs.getString("nombreProducto");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                byte[] imagenBytes = rs.getBytes("imagen");

                compra compra = new compra(conn, nombre, precio, descripcion, imagenBytes);
                compra.setBackground(Color.WHITE);

                JButton agregarAlCarritoBtn = compra.getAgregarAlCarritoBtn();
                JLabel nombreLabel = compra.getNombreLabel();
                JLabel precioLabel = compra.getPrecioLabel();
                JTextArea descripcionTextArea = compra.getDescripcionTextArea();
                JLabel imagenLabel = compra.getImagenLabel();

                panel.setBackground(Color.WHITE);
                panel.add(compra);
            }

            frame.add(new JScrollPane(panel), BorderLayout.CENTER);
            frame.add(verCarritoBtn, BorderLayout.SOUTH);
            frame.pack();

            desktopPane.add(frame);

            JFrame mainFrame = new JFrame("AREPAPP");
            mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            mainFrame.setSize(1200, 700);
            mainFrame.setResizable(false);
            mainFrame.setContentPane(desktopPane);
            mainFrame.setVisible(true);
            mainFrame.setLocationRelativeTo(null);
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
