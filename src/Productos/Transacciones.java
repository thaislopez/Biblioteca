package Productos;

import Personas.Cliente;
import Personas.Persona;
import Personas.Usuario;
import Productos.Libro;
import java.util.ArrayList;

/**
 * @author Dayanna Rodriguez
 */
public class Transacciones {

    private Persona cliente;
    private Libro libro;
    private Usuario usuario;
    private int cantidadLibros;
    private double montoTotal;
    private String fecha;
    private ArrayList<Libro> libros = new ArrayList<>();

    //Constructor por defecto
    public Transacciones() {
    }

    public Transacciones(int cantidadLibros, double montoTotal, String fecha) {
        this.cantidadLibros = cantidadLibros;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
    }

    //Setters
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Persona getCliente() {
        return cliente;
    }

    //Getters
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public double getMontoTotal() {
        this.montoTotal = this.montototal();
        return montoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public int cantidadlibro() {
        return this.libros.size();
    }

    private double montototal() {
        double total = 0;
        for (Libro l : this.libros) {
            total += l.getPrecio();
        }
        return total;
    }
}
