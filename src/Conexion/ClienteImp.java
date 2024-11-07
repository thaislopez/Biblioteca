package Conexion;

import Personas.Cliente;
import Personas.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class ClienteImp extends Conexion {

    private final String TABLA = "clientes";

    public ArrayList<Persona> LeerDatos() {
        ArrayList<Persona> contenido;
        Cliente cliente;
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
                cliente = new Cliente();
                cliente.setid(rs.getInt("ID"));
                cliente.setnombre(rs.getString("NOMBRE"));
                cliente.setApellido(rs.getString("APELLIDO"));
                cliente.setcedula(rs.getInt("CEDULA"));
                cliente.setcorreo(rs.getString("CORREO"));
                cliente.setedad(rs.getInt("EDAD"));

                contenido.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            this.desconectar();
        }

        return contenido;
    }

    public ArrayList<Persona> LeerDatos(String id) {
        ArrayList<Persona> contenido;
        Cliente cliente;
        String sentencia;

        sentencia = "SELECT * FROM " + TABLA + " WHERE ID = ?";
        contenido = new ArrayList<>();

        try {
            PreparedStatement ps;
            ResultSet rs;

            this.conectar();
            ps = this.conexion.prepareStatement(sentencia);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setid(rs.getInt("ID"));
                cliente.setnombre(rs.getString("NOMBRE"));
                cliente.setApellido(rs.getString("APELLIDO"));
                cliente.setcedula(rs.getInt("CEDULA"));
                cliente.setcorreo(rs.getString("CORREO"));
                cliente.setedad(rs.getInt("EDAD"));

                contenido.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            this.desconectar();
        }

        return contenido;
    }

    //MODIFICAR PARA UTILIZARSE EN TABLA DE CLIENTES
    //@Override
    public boolean RegistrarUsuario(Cliente cliente) {
        PreparedStatement ps;
        String query;

        query = "INSERT INTO " + TABLA
                + " ("
                + "id, nombre, apellido, cedula, correo, edad)"
                + " VALUES (?,?,?,?,?,?)";
//        System.out.println(query);

        try {
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setInt(1, cliente.getid());
            ps.setString(2, cliente.getnombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getcedula());
            ps.setString(5, cliente.getcorreo());
            ps.setInt(6, cliente.getedad());

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            this.desconectar();
        }

        //Insert into Usuarios (columnas, , ) values(?,?)
    }

    public boolean ModificarUsuario(Cliente cliente) {
        boolean registrado;
        PreparedStatement ps;
        String query;
        registrado = false;

        query = "UPDATE " + TABLA + " SET "
                + "nombre = ?, "
                + "apellido = ?, "
                + "cedula = ?, "
                + "correo = ?, "
                + "edad = ? "
                + " WHERE id = ?";
        //System.out.println(query);

        try {
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setString(1, cliente.getnombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getcedula());
            ps.setString(4, cliente.getcorreo());
            ps.setInt(5, cliente.getedad());
            ps.setInt(6, cliente.getid());

            if (ps.executeUpdate() == 1) {
                registrado = true;
            }
        } catch (SQLException e) {
            System.out.println("Error para actualizar al cliente: " + e.getMessage());
        } finally {
            this.desconectar();
        }
        return registrado;
    }

    public ArrayList<Persona> BuscarUsuario(String valor) {
        ArrayList<Persona> contenido;
        Cliente cliente;
        String query;

        query = "SELECT * FROM " + TABLA + " WHERE NOMBRE LIKE ? OR CEDULA LIKE ?";
        contenido = new ArrayList<>();

        try {
            PreparedStatement ps;
            ResultSet rs;

            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setString(1, "%" + valor + "%");
            ps.setString(2, "%" + valor + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setid(rs.getInt("ID"));
                cliente.setnombre(rs.getString("NOMBRE"));
                cliente.setApellido(rs.getString("APELLIDO"));
                cliente.setcedula(rs.getInt("CEDULA"));
                cliente.setcorreo(rs.getString("CORREO"));
                cliente.setedad(rs.getInt("EDAD"));

                contenido.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            this.desconectar();
        }

        return contenido;
    }

    public boolean EliminarCliente(String id) {
        boolean eliminado;
        String query;

        query = "DELETE FROM " + TABLA + " WHERE ID = ? ";
        eliminado = false;

        try {
            PreparedStatement ps;
            this.conectar();
            ps = this.conexion.prepareStatement(query);
            ps.setInt(1, Integer.parseInt(id));
            if (ps.executeUpdate() > 0) {
                eliminado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            this.desconectar();
        }

        return eliminado;

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

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            this.desconectar();
        }

        return id;

    }

}
