package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dennis Méndez Delgado
 */

public abstract class Conexion {
    private final String DATABASE = "BIBLIOTECA";
    protected Connection conexion;
    
    public void conectar() {
        conexion = this.getConexion();
    }
    
    protected void desconectar() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch(SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    private Connection getConexion() {
        Connection c = null;
        
        String url = "jdbc:mysql://localhost:3306/" + DATABASE + "?&useSSL=false";
        String password = "-----"; //Colocar contraseña MySQL de cada uno.
        String user = "root";
        
        try {
            c = (Connection) DriverManager.getConnection(url, user, password);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return c;
    }
}