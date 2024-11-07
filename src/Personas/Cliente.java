package Personas;

import java.util.Date;


public class Cliente extends Persona {
    private int numeroSocio;
    private Date fechaAsociacion;

    public Cliente() {
    }

    public Cliente(int numeroSocio, Date fechaAsociacion, String nombre, String apellido, int cedula, String correo, int edad, int id) {
        super(nombre, apellido, cedula, correo, edad, id);
        this.numeroSocio = numeroSocio;
        this.fechaAsociacion = fechaAsociacion;
    }

    public Cliente(int numeroSocio, Date fechaAsociacion) {
        this.numeroSocio = numeroSocio;
        this.fechaAsociacion = fechaAsociacion;
    }


    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public void setFechaAsociacion(Date fechaAsociacion) {
        this.fechaAsociacion = fechaAsociacion;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public Date getFechaAsociacion() {
        return fechaAsociacion;
    }
}
