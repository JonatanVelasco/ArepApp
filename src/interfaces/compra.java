package interfaces;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.border.Border;

public class compra extends JPanel {

    private Connection conn;
    private JButton agregarAlCarritoBtn;
    private JLabel nombreLabel;
    private JLabel precioLabel;
    private JTextArea descripcionTextArea;
    private JLabel imagenLabel;
    private JSpinner cantidadSpinner;
    private JLabel cantidadLabel;
    int cantidad;

    public compra(Connection conn, String nombre, int precio, String descripcion, byte[] imagenBytes) {
        this.conn = conn;

        // Crear componentes
        agregarAlCarritoBtn = new JButton("COMPRAR");

        nombreLabel = new JLabel(nombre, JLabel.LEFT);
        precioLabel = new JLabel("Precio: $" + precio, JLabel.LEFT);

        JTextArea descripcionTextArea = new JTextArea(descripcion);
        descripcionTextArea.setBorder(BorderFactory.createEmptyBorder());
        descripcionTextArea.setEditable(false);
        descripcionTextArea.setLineWrap(true);
        descripcionTextArea.setWrapStyleWord(true);

        Image imagen = new ImageIcon(imagenBytes).getImage();
        imagen = imagen.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        imagenLabel = new JLabel(new ImageIcon(imagen));

        // Configurar layout
        setLayout(new GridBagLayout());
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
        c.gridwidth = 2;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        agregarAlCarritoBtn.setPreferredSize(new Dimension(100, 20));
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

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/arepapp", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM productos");

            JFrame frame = new JFrame("MENÚ");

            frame.getContentPane().setBackground(Color.WHITE);

            JPanel panel = new JPanel(new GridLayout(0, 3, 3, 0)); // 3 columnas, espaciado horizontal y vertical

            while (rs.next()) {
                String nombre = rs.getString("nombreProducto");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                byte[] imagenBytes = rs.getBytes("imagen");

                compra compra = new compra(conn, nombre, precio, descripcion, imagenBytes);
                compra.setBorder(BorderFactory.createLineBorder(Color.black, 1));
                compra.setBackground(Color.WHITE);

                JButton agregarAlCarritoBtn = compra.getAgregarAlCarritoBtn();
                JLabel nombreLabel = compra.getNombreLabel();
                JLabel precioLabel = compra.getPrecioLabel();
                JTextArea descripcionTextArea = compra.getDescripcionTextArea();
                JLabel imagenLabel = compra.getImagenLabel();
 
                // Agregar acción al botón "Agregar al carrito"
                agregarAlCarritoBtn.addActionListener(e -> {

                    JOptionPane.showMessageDialog(frame, nombreLabel.getText() + " agregado al carrito");
                });
                panel.setBackground(Color.WHITE);
                panel.add(compra);

            }

            JButton verCarritoBtn = new JButton("IR A PAGAR");
            verCarritoBtn.addActionListener(e -> {
                // Mostrar productos en el carrito
                // ...
                JOptionPane.showMessageDialog(frame, "Carrito de compras");
            });

            frame.add(new JScrollPane(panel), BorderLayout.CENTER); // Agregar panel con scroll
            frame.add(verCarritoBtn, BorderLayout.SOUTH);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100, 600);
            frame.setResizable(false);
            frame.setBackground(Color.white);
            frame.setVisible(true);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
