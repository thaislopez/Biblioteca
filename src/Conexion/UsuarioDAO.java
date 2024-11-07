package Conexion;

import Personas.Usuario;
import java.util.ArrayList;

/**
 *
 * @author dennm
 */
public interface UsuarioDAO {
    
    public ArrayList<Usuario> LeerDatos();
    public ArrayList<Usuario> LeerDatos(String campoCriterio, String valor);
    
    public Usuario LeerUsuario(String id);
    public boolean ActualizarUsuario(Usuario usuario);
    public boolean RegistrarUsuario(Usuario usuario);
    public boolean EliminarUsuario(String id);
    
    public boolean loginIngresar(String usuario, String contrasenna);
    public boolean accesoAdmin(String contrasenna);
    public int getSiguienteID();
    
    public int getID(int cedula);
}
