package Conexion;

import Personas.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dennis Méndez Delgado
 */
public class UsuariosImp extends Conexion implements UsuarioDAO {
    private final String TABLA = "usuarios"; 
    
    @Override
    public ArrayList<Usuario> LeerDatos() {
        ArrayList<Usuario> contenido;
        Usuario usuario;
        String sentencia;
        
        sentencia = "SELECT * FROM " + TABLA;
        contenido = new ArrayList<>();
        
        try {
            PreparedStatement ps;
            ResultSet rs;
            
            this.conectar();
            ps = this.conexion.prepareStatement(sentencia);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setid(rs.getInt("ID"));
                usuario.setnombre(rs.getString("NOMBRE"));
                usuario.setApellido(rs.getString("APELLIDO"));
                usuario.setcedula(rs.getInt("CEDULA"));
                usuario.setcorreo(rs.getString("CORREO"));
                usuario.setedad(rs.getInt("EDAD"));
                usuario.setusuario(rs.getString("USUARIO"));
                usuario.setcontraseña(rs.getString("CONTRASENNA"));
                usuario.setAdministrador(rs.getBoolean("ADMINISTRADOR"));
                
                contenido.add(usuario);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            this.desconectar();
        }
        
        return contenido;
    }
    
    @Override
    public ArrayList<Usuario> LeerDatos(String campoCriterio, String valor) {
        ArrayList<Usuario> listado = new ArrayList<>();
        Usuario usuario;
        String query;
        
        query = "SELECT * FROM " + TABLA + " WHERE " + campoCriterio + " LIKE ?";
        
        try {
            PreparedStatement ps;
            ResultSet rs;
            
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setString(1, "%" + valor + "%");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                usuario = new Usuario();
                usuario.setid(rs.getInt("ID"));
                usuario.setnombre(rs.getString("NOMBRE"));
                usuario.setApellido(rs.getString("APELLIDO"));
                usuario.setcedula(rs.getInt("CEDULA"));
                usuario.setcorreo(rs.getString("CORREO"));
                usuario.setedad(rs.getInt("EDAD"));
                usuario.setusuario(rs.getString("USUARIO"));
                usuario.setcontraseña(rs.getString("CONTRASENNA"));
                usuario.setAdministrador(rs.getBoolean("ADMINISTRADOR"));
                
                listado.add(usuario);
            }
        }catch(SQLException sqlEx) {
            System.out.println("Error en leerDatos(parametrizado): " + sqlEx.getMessage());
        }finally {
            this.desconectar();
        }
        
        return listado;
    }
    
    @Override
    public Usuario LeerUsuario(String id) {
        String query;
        
        query = "SELECT * FROM " + TABLA + " WHERE ID = " + id;
        
        try {
            Usuario usuario = new Usuario();
            PreparedStatement ps;
            ResultSet rs;
            
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                usuario.setid(rs.getInt("ID"));
                usuario.setnombre(rs.getString("NOMBRE"));
                usuario.setApellido(rs.getString("APELLIDO"));
                usuario.setcedula(rs.getInt("CEDULA"));
                usuario.setcorreo(rs.getString("CORREO"));
                usuario.setedad(rs.getInt("EDAD"));
                usuario.setusuario(rs.getString("USUARIO"));
                usuario.setcontraseña(rs.getString("CONTRASENNA"));
                usuario.setAdministrador(rs.getBoolean("ADMINISTRADOR"));
            }
            
            return usuario;
            
        } catch(SQLException ex) {
            System.out.println("Error LeerUsuario: " + ex.getMessage());
            return null;
        } finally {
            this.desconectar();
        }
    }
    
    @Override
    public boolean ActualizarUsuario(Usuario usuario) {
        boolean registrado;
        String query;
        registrado = false;
        
        query = 
                "UPDATE " + TABLA + " SET"
                + " NOMBRE = ?,"
                + " APELLIDO = ?,"
                + " CEDULA = ?,"
                + " CORREO = ?,"
                + " EDAD = ?,"
                + " USUARIO = ?,"
                + " CONTRASENNA = ?,"
                + " ADMINISTRADOR = ?"
                + " WHERE ID = " + usuario.getid();
        try {
            PreparedStatement ps;
            
            this.conectar();
            
            ps = this.conexion.prepareStatement(query);
            ps.setString(1, usuario.getnombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getcedula());
            ps.setString(4, usuario.getcorreo());
            ps.setInt(5, usuario.getedad());
            ps.setString(6, usuario.getusuario());
            ps.setString(7, usuario.getContrasenna());
            ps.setBoolean(8, usuario.esAdministrador());
            
            if(ps.executeUpdate() == 1) registrado = true;
        }catch(SQLException e) {
            System.out.println("Error ActualizarUsuario: " + e.getMessage());
        }finally {
            this.desconectar();
        }
        
        return registrado;
    }
    
    @Override
    public boolean RegistrarUsuario(Usuario usuario) {
        PreparedStatement ps;
        String query;
        
        query = "INSERT INTO " + TABLA
                + " ("
                + " nombre, apellido, cedula, correo, edad, id, usuario, contrasenna, administrador)" 
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setString(1, usuario.getnombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getcedula());
            ps.setString(4,usuario.getcorreo());
            ps.setInt(5,usuario.getedad());
            ps.setInt(6, usuario.getid());
            ps.setString(7, usuario.getusuario());
            ps.setString(8, usuario.getContrasenna());
            ps.setBoolean(9, usuario.esAdministrador());
            ps.executeUpdate();
            return true;
            
        } catch (Exception e) {
            return false;
        } finally {
            this.desconectar();
        }
    }
    
    @Override
    public boolean EliminarUsuario(String id) {
        boolean borrado;
        String query;
        
        query = "DELETE FROM " + TABLA + " WHERE ID = ?";
        borrado = false;
        
        try {
            PreparedStatement ps;
            
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setString(1, id);
            if(ps.executeUpdate() > 0) borrado = true;
        }catch(SQLException sqlEx) {
            System.out.println(sqlEx.getMessage());
        }finally {
            this.desconectar();
        }
        
        return borrado;
    }
    
    @Override
    public boolean accesoAdmin(String contrasenna) {
        boolean logroAcceso = false;
        try {
            String query;
            
            query = "SELECT * FROM " + TABLA
                    + " WHERE CONTRASENNA = " + contrasenna
                    + " AND ADMINISTRADOR = 1;";
            
            PreparedStatement st;
            ResultSet rs;
            
            this.conectar();
            st = this.conexion.prepareStatement(query);
            rs = st.executeQuery();
            
            
            if(rs.next()) logroAcceso = true;
        } catch(SQLException e) {
            System.out.println("Error AccesoAdmin: " + e.getMessage());
        } finally {
            this.desconectar();
        }
        
        return logroAcceso;
    }
    
    @Override
    public boolean loginIngresar(String usuario, String contrasenna) {
        boolean acceso = false;
        String sentencia;
        
        sentencia = "SELECT ID FROM " + TABLA 
                + " WHERE"
                + " USUARIO = '" + usuario + "'"
                + " AND"
                + " CONTRASENNA = '" + contrasenna + "'";
        
        try {
            PreparedStatement ps;
            ResultSet rs;
            
            this.conectar();
            ps = this.conexion.prepareStatement(sentencia);
            rs = ps.executeQuery();
            
            if(rs.next()) acceso = true;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            this.desconectar();
        }
        
        return acceso;
    }
    
    @Override
    public int getID(int cedula) {
        int id = -1;
        String query;
        
        query = "SELECT ID FROM " + TABLA + " WHERE CEDULA = " + Integer.toString(cedula);
        
        try {
            PreparedStatement ps;
            ResultSet rs;
            
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            rs = ps.executeQuery();
            
            if (rs.next()) id = rs.getInt(1);
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            this.desconectar();
        }
        
        return id;
            
    }
    
    @Override
    public int getSiguienteID() {
        String query;
        int number = -1;
        
        query = "SELECT MAX(ID) FROM " + TABLA;
        
        try {
            PreparedStatement ps;
            ResultSet rs;
            
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            rs = ps.executeQuery();
            
            if(rs.next()) number = rs.getInt(1) + 1;
            return number;
            
        }catch(SQLException ex) {
            return number;
        }finally {
            this.desconectar();
        }
    }
}
