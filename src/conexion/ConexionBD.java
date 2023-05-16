package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionBD {

    String user = "root";
    String pass = "";
    String bd = "arepapp";
    String ip = "localhost";
    String puerto = "3306";

    String url = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?serverTimezone=UTC";

    Connection con;
    Statement stmt;

    public ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Imposible abrir el driver");
            return;
        }
        try {
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();
        } catch (SQLException se) {
            System.out.println("SQL Exception: " + se.getMessage());
            se.printStackTrace(System.out);
        }
    }
    public Connection estableceConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null, "La conexion se ha realizado con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos" + e.toString());
        }
        return con;
    }
    
    public void modificaDatos(String sql) {
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println("SQL Exception:  " + se.getMessage());
            se.printStackTrace(System.out);
        }
    }

    public ResultSet consultaDatos(String query) {
        try {
            ResultSet rsl = stmt.executeQuery(query);
            return rsl;
        } catch (SQLException se) {
            System.out.println("SQL Exception:  " + se.getMessage());
            se.printStackTrace(System.out);
            return null;
        }
    }

    

    
}

    

    

