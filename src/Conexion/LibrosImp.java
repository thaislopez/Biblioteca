package Conexion;

import java.sql.*;
import Productos.Libro;
import java.util.ArrayList;

/**
 *
 * @author Dennis Méndez Delgado
 */
public class LibrosImp extends Conexion implements LibrosDAO {

    private final String TABLA = "LIBROS";

    private PreparedStatement ps;
    private ResultSet resultSet;

    @Override
    public ArrayList<Libro> LeerDatos() {
        ArrayList<Libro> listado;
        Libro libro;
        String sentencia;

        sentencia = "SELECT * FROM " + TABLA;

        listado = new ArrayList<>();

        try {
            this.conectar();
            ps = this.conexion.prepareStatement(sentencia);
            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                libro = new Libro();
                libro.setId(resultSet.getInt("ID"));
                libro.setDescripcion(resultSet.getString("DESCRIPCION"));
                libro.setProveedor(resultSet.getString("PROVEEDOR"));
                libro.setPrecio(resultSet.getInt("PRECIO"));
                libro.setEditorial(resultSet.getString("EDITORIAL"));
                libro.setAutor(resultSet.getString("AUTOR"));
                libro.setInventario(resultSet.getInt("CANTIDAD"));
                libro.setAñoEdicion(resultSet.getInt("AÑO_EDICION"));

                listado.add(libro);
            }
        } catch (SQLException ex) {
            System.out.println("Error LeerDatos: " + ex.getMessage());
        } finally {
            this.desconectar();
        }

        return listado;
    }
    
    @Override
    public ArrayList<Libro> LeerDatos(String campoCriterio, String valor) {
        ArrayList<Libro> listado;
        Libro libro;
        String sentencia;
        
        sentencia = "SELECT * FROM " + TABLA + " WHERE " + campoCriterio + " LIKE ?";
        listado = new ArrayList<>();
        
        try {
            this.conectar();
            this.ps = this.conexion.prepareStatement(sentencia);
            this.ps.setString(1, "%" + valor + "%");
            this.resultSet = this.ps.executeQuery();
            
            while(this.resultSet.next()) {
                libro = new Libro();
                
                libro.setId(resultSet.getInt("ID"));
                libro.setDescripcion(resultSet.getString("DESCRIPCION"));
                libro.setProveedor(resultSet.getString("PROVEEDOR"));
                libro.setPrecio(resultSet.getInt("PRECIO"));
                libro.setEditorial(resultSet.getString("EDITORIAL"));
                libro.setAutor(resultSet.getString("AUTOR"));
                libro.setInventario(resultSet.getInt("CANTIDAD"));
                libro.setAñoEdicion(resultSet.getInt("AÑO_EDICION"));
                
                listado.add(libro);
            }
        }catch(SQLException sqlException) {
            System.out.println("Error LeerDatos(Parametrizado): " + sqlException.getMessage());
        }finally {
            this.desconectar();
        }
        
        return listado;
    }
    
    @Override
    public ArrayList<Libro> LeerDatos(String id) {
        ArrayList<Libro> listado;
        Libro libro;
        String sentencia;
        
        sentencia = "SELECT * FROM " + TABLA + " WHERE  ID = ?";
        listado = new ArrayList<>();
        
        try {
            this.conectar();
            this.ps = this.conexion.prepareStatement(sentencia);
            this.ps.setString(1, id);
            this.resultSet = this.ps.executeQuery();
            
            while(this.resultSet.next()) {
                libro = new Libro();
                
                libro.setId(resultSet.getInt("ID"));
                libro.setDescripcion(resultSet.getString("DESCRIPCION"));
                libro.setProveedor(resultSet.getString("PROVEEDOR"));
                libro.setPrecio(resultSet.getInt("PRECIO"));
                libro.setEditorial(resultSet.getString("EDITORIAL"));
                libro.setAutor(resultSet.getString("AUTOR"));
                libro.setInventario(resultSet.getInt("CANTIDAD"));
                libro.setAñoEdicion(resultSet.getInt("AÑO_EDICION"));
                
                listado.add(libro);
            }
        }catch(SQLException sqlException) {
            System.out.println("Error LeerDatos(Parametrizado): " + sqlException.getMessage());
        }finally {
            this.desconectar();
        }
        
        return listado;
    }
    
    @Override
    public boolean Actualizar(Libro libro) {
        boolean fueRegistrado = false;
        String sentenciaSql;
        
        sentenciaSql = "UPDATE " + TABLA + " SET "
                + "DESCRIPCION = ?, "
                + "PROVEEDOR = ?, "
                + "EDITORIAL = ?, "
                + "AUTOR = ?, "
                + "PRECIO = ?, "
                + "CANTIDAD = ?, "
                + "AÑO_EDICION = ? "
                + "WHERE ID = ?";
        
        try {
            this.conectar();
            this.ps = this.conexion.prepareStatement(sentenciaSql);
            this.ps.setString(1, libro.getDescripcion());
            this.ps.setString(2, libro.getProveedor());
            this.ps.setString(3, libro.getEditorial());
            this.ps.setString(4, libro.getAutor());
            this.ps.setDouble(5, libro.getPrecio());
            this.ps.setInt(6, libro.getInventario());
            this.ps.setInt(7, libro.getAñoEdicion());
            this.ps.setInt(8, libro.getId());
            
            if(this.ps.executeUpdate() > 0) fueRegistrado = true;
        }catch(SQLException sqlEx) {
            System.out.println("Error Actualizar: " + sqlEx.getMessage());
        }finally {
            this.desconectar();
        }
        
        return fueRegistrado;
        
    }
    
    @Override
    public boolean Registrar(Libro libro) {
        boolean fueRegistrado = false;
        String sentenciaSql;
        
        sentenciaSql = "INSERT INTO " + TABLA
                + " (DESCRIPCION, PROVEEDOR, EDITORIAL, AUTOR, PRECIO, CANTIDAD, AÑO_EDICION)"
                + " VALUES"
                + " (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            this.conectar();
            this.ps = this.conexion.prepareStatement(sentenciaSql);
            this.ps.setString(1, libro.getDescripcion());
            this.ps.setString(2, libro.getProveedor());
            this.ps.setString(3, libro.getEditorial());
            this.ps.setString(4, libro.getAutor());
            this.ps.setDouble(5, libro.getPrecio());
            this.ps.setInt(6, libro.getInventario());
            this.ps.setInt(7, libro.getAñoEdicion());
            
            if(this.ps.executeUpdate() > 0) fueRegistrado = true;
        }catch(SQLException sqlEx) {
            System.out.println("Error Registrar: " + sqlEx.getMessage());
        }finally {
            this.desconectar();
        }
        
        return fueRegistrado;
    }
    
    @Override
    public boolean Eliminar(String id) {
        boolean registroEliminado = false;
        String sentencia;
        
        sentencia = "DELETE FROM " + TABLA + " WHERE ID = ?";
        
        try {
            this.conectar();
            this.ps = this.conexion.prepareStatement(sentencia);
            this.ps.setString(1, id);
            
            if(this.ps.executeUpdate() > 0) registroEliminado = true;
        }catch(SQLException sqlEx) {
            System.out.println("Error en Eliminar: " + sqlEx.getMessage());
        }finally {
            this.desconectar();
        }
        
        return registroEliminado;
    }
}
