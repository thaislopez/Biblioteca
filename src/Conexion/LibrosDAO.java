package Conexion;

import Productos.Libro;
import java.util.ArrayList;

/**
 *
 * @author Dennis Méndez Delgado
 */
public interface LibrosDAO {

    public ArrayList<Libro> LeerDatos();
    
    public ArrayList<Libro> LeerDatos(String campoCriterio, String valor);

//    public ArrayList<Usuario> LeerDatos(); //REPLICADO
//
//    public ArrayList<Usuario> LeerDatos(String campoCriterio, String valor); //REPLICADO
//
    public ArrayList<Libro> LeerDatos(String id);
//
    public boolean Actualizar(Libro libro);
//
    public boolean Registrar(Libro libro);
//
    public boolean Eliminar(String id);
//
//    public boolean loginIngresar(String usuario, String contrasenna);
//
//    public boolean accesoAdmin(String contrasenna);
//
//    public int getSiguienteID();
//
//    public int getID(int cedula);

}
