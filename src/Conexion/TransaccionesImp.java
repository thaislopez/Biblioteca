package Conexion;

//import Modelo.Transacciones;
import Personas.Usuario;
//import Personas.LIBROS;
import Productos.Libro;
import Productos.Transacciones;
import java.sql.PreparedStatement;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Dennis Méndez Delgado
 */
public class TransaccionesImp extends Conexion {

    private PreparedStatement ps;
    private ResultSet rs;
    private final String TABLA = "libros";

    public ArrayList<Libro> LeerDatos() {
        ArrayList<Libro> listado;
        Libro libro;
        String sentencia;

        sentencia = "SELECT * FROM " + TABLA;
        listado = new ArrayList<>();
        try {

            this.conectar();
            ps = this.conexion.prepareStatement(sentencia);
            rs = ps.executeQuery();
            while (rs.next()) {
                libro = new Libro();
                libro.setId(rs.getInt("ID"));
                libro.setDescripcion(rs.getString("DESCRIPCION"));
                libro.setProveedor(rs.getString("PROVEEDOR"));
                libro.setPrecio(rs.getInt("PRECIO"));
                libro.setEditorial(rs.getString("EDITORIAL"));
                libro.setAutor(rs.getString("AUTOR"));
                libro.setInventario(rs.getInt("CANTIDAD"));
                libro.setAñoEdicion(rs.getInt("AÑO_EDICION"));
                listado.add(libro);
            }
        } catch (SQLException ex) {
            System.out.println("Error LeerDatos: " + ex.getMessage());
        } finally {
            this.desconectar();
        }
        return listado;
    }

//    public ArrayList<LIBROS> LeerLibros() {
//        ArrayList<LIBROS> contenido;
//        LIBROS libro;
//        String sentencia;
//
//        sentencia = "SELECT * FROM " + TABLA;
//        contenido = new ArrayList<>();
//
//        try {
//            PreparedStatement ps;
//            ResultSet rs;
//
//            this.conectar();
//            ps = this.conexion.prepareStatement(sentencia);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                libro = new LIBROS();
//                libro.setID(rs.getInt("ID"));
//                libro.setLibro(rs.getString("NOMLIBRO"));
//                libro.setprecio(rs.getInt("PRECIO"));
//
//                contenido.add(libro);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            return null;
//        } finally {
//            this.desconectar();
//        }
//
//        return contenido;
//    }
//    
//    @Override
//    public ArrayList<Usuario> LeerDatos() {
//        ArrayList<Usuario> contenido;
//        Usuario usuario;
//        String sentencia;
//        
//        sentencia = "SELECT * FROM " + TABLA;
//        contenido = new ArrayList<>();
//        
//        try {
//            PreparedStatement ps;
//            ResultSet rs;
//            
//            this.conectar();
//            ps = this.conexion.prepareStatement(sentencia);
//            rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                usuario = new Usuario();
//                usuario.setid(rs.getInt("ID"));
//                usuario.setnombre(rs.getString("NOMBRE"));
//                usuario.setApellido(rs.getString("APELLIDO"));
//                usuario.setcedula(rs.getInt("CEDULA"));
//                usuario.setcorreo(rs.getString("CORREO"));
//                usuario.setedad(rs.getInt("EDAD"));
//                usuario.setusuario(rs.getString("USUARIO"));
//                usuario.setcontraseña(rs.getString("CONTRASENNA"));
//                usuario.setAdministrador(rs.getBoolean("ADMINISTRADOR"));
//                
//                contenido.add(usuario);
//            }
//        } catch(Exception e) {
//            System.out.println(e.getMessage());
//            return null;
//        } finally {
//            this.desconectar();
//        }
//        
//        return contenido;
//    }
//    
    
    public boolean RegistrarTransaccion(Transacciones tr,String fecha) {
        PreparedStatement ps;
        String query;
        
        query = "INSERT INTO Transacciones" 
                + " ("
                + " nombre_cliente, cedula_cliente, nombre_libro, cantidad_libros, monto_total, fecha)" 
                + " VALUES (?,?,?,?,?,?)";
//        System.out.println(query);
        
        try {
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setString(1, tr.getCliente().getnombre());
            ps.setInt(2, tr.getCliente().getcedula());
            ps.setString(3, tr.getLibros().get(0).getDescripcion());
            ps.setInt(4,tr.cantidadlibro());
            ps.setDouble(5,tr.getMontoTotal());
            ps.setString(6, fecha);
            ps.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            this.desconectar();
        }
        
        //Insert into Usuarios (columnas, , ) values(?,?)
    }

    public boolean accesoAdmin(String contrasenna) {
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

            if (rs.next()) {
                System.out.println(rs.getString("contrasenna"));
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean loginIngresar(String usuario, String contrasenna) {
        boolean acceso = false;
        String sentencia;

        sentencia = "SELECT ID FROM " + TABLA
                + " WHERE"
                + " USUARIO = '" + usuario + "'"
                + " AND"
                + " CONTRASENNA = '" + contrasenna + "'";

//        System.out.println(sentencia);
        try {
            PreparedStatement ps;
            ResultSet rs;

            this.conectar();
            ps = this.conexion.prepareStatement(sentencia);
            rs = ps.executeQuery();

            if (rs.next()) {
                acceso = true;
            }
//            rs.close();
//            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.desconectar();
        }

        return acceso;
    }

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

            if (rs.next()) {
                id = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.desconectar();
        }

        return id;

    }

    public boolean pruebaconexion() {
        this.conectar();
        if (this.conexion != null) {
            return true;
        } else {
            return false;
        }
    }
}
