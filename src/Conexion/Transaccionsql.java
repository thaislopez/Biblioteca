package Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Dayanna Rodriguez
 */

public class Transaccionsql extends Conexion {
    
    public ArrayList <String[]> getFilas() {
        
        ArrayList <String[]> retorno = new ArrayList <>();
                
        try {
 
           String[] filas;
            
            //Para preparar la consulta
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "SELECT nombre_cliente, cedula_cliente, nombre_libro, cantidad_libros, monto_total, fecha FROM transacciones";
            this.conectar();
            ps = this.conexion.prepareStatement(sql);
            rs = ps.executeQuery();

            //Recorre los resultados
            while (rs.next()) {

                filas = new String [6];
                
                filas[0] = rs.getString("nombre_cliente");
                filas[1] = rs.getString("cedula_cliente");
                filas[2] = rs.getString("nombre_libro");
                filas[3] = rs.getString("cantidad_libros");
                filas[4] = rs.getString("monto_total");
                filas[5] = rs.getString("fecha");

                retorno.add(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        } finally {
            this.desconectar();
        }
        return retorno;
    }
    
}
