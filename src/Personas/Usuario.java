package Personas;

/**
 *
 * @author Mauricio
 */
public class Usuario extends Persona {

    private int id;
    private String usuario;
    private String contrasenna;
    private boolean administrador;

    public Usuario() {

    }

    public Usuario(int id, String usuario, String contrasenna) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    public Usuario(int id, String usuario, String contrasenna, String nombre, String apellido, int cedula, String correo, int edad, boolean admin) {
        super(nombre, apellido, cedula, correo, edad, -1);
        this.id = id;
        this.usuario = usuario;
        this.contrasenna = contrasenna;
        this.administrador = admin;
    }
    

//    public Usuario(int id, String contrasenna, String usuario) {
//        this.id = id;
//        this.contrasenna = contrasenna;
//        this.usuario = usuario;

//    }

    // **** setters ****
    public void setid(int id) {
        this.id = id;
    }

    public void setcontraseña(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    // **** getters **** 
    public int getid() {
        return id;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public String getusuario() {
        return usuario;
    }
    
    public boolean esAdministrador() {
        return administrador;
    }
    
    // override
    //     @Override
//    public String toString(){
//        return this.();
//    }


} // fin de usuario 1

