package Personas;

public class Administrador extends Usuario {

    private int id;
    private String usuario;
    private int contraseña;

    public Administrador() {

    }

    public Administrador(int id, int contraseña, String usuario) {
        this.id = id;
        this.contraseña = contraseña;
        this.usuario = usuario;

    }

    // **** setters ****
    public void setid(int id) {
        this.id = id;
    }

    public void setcontraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

    // **** getters **** 
    public int getid() {
        return id;
    }

    public int getcontraseña() {
        return contraseña;
    }

    public String getusuario() {
        return usuario;
    }
    // override
    //     @Override
//    public String toString(){
//        return this.();
//    }

}
