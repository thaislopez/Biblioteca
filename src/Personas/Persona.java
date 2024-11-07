package Personas;


public abstract class Persona {

    private String nombre;
    private String apellido;
    private int cedula;
    private String correo;
    private int edad;
    private int id;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int cedula, String correo, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.edad = edad;
        this.id = id;
    }


    //***** SETTER *****
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setcedula(int cedula) {
        this.cedula = cedula;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public void setid(int id) {
        this.id = id;
    }

    // ***** GETTERS *****
    public String getnombre() {
        return nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }

    public String getcorreo() {
        return correo;
    }

    public int getcedula() {
        return cedula;
    }

    public int getedad() {
        return edad;
    }
    
    public int getid() {
        return id;
    }

} // fin de super clase

