package Controles;

import Conexion.LibrosImp;
import Productos.Libro;
import java.util.ArrayList;

public class ControlLibros {
    private final LibrosImp conexion = new LibrosImp();
    
    private final Libro LIBRO = new Libro();

    public ControlLibros() {
    }

    public Libro getLIBRO() {
        return LIBRO;
    }
    
    public Libro getLIBRO(String id) {
        Libro libro;
        libro = this.conexion.LeerDatos(id).get(0);
        return libro;
    }
    
    public ArrayList<String[]> getFilasTabla() {
        ArrayList<String[]> filas;
        String[] fila;
        
        filas = new ArrayList<>();
        for(Libro libro : conexion.LeerDatos()) {
            fila = new String[6];
            fila[0] = Integer.toString(libro.getId());
            fila[1] = libro.getDescripcion();
            fila[2] = libro.getEditorial();
            fila[3] = libro.getAutor();
            fila[4] = Integer.toString(libro.getInventario());
            fila[5] = Double.toString(libro.getPrecio());
            
            filas.add(fila);
        }
        
        return filas;
    }
    
    public ArrayList<String[]> getFilasTabla(String campo, String valor) {
        ArrayList<String[]> filas;
        String[] fila;
        
        filas = new ArrayList<>();
        for(Libro book : this.conexion.LeerDatos(campo, valor)) {
            fila = new String[6];
            fila[0] = Integer.toString(book.getId());
            fila[1] = book.getDescripcion();
            fila[2] = book.getEditorial();
            fila[3] = book.getAutor();
            fila[4] = Integer.toString(book.getInventario());
            fila[5] = Double.toString(book.getPrecio());
            
            filas.add(fila);
        }
        
        return filas;
    }
    
    public String[] obtenerDatosLibro(String id) {
        String[] lista = null;
        
        for(Libro libro : conexion.LeerDatos(id)) {
            lista = new String[8];
            lista[0] = Integer.toString(libro.getId());
            lista[1] = libro.getDescripcion();
            lista[2] = libro.getProveedor();
            lista[3] = Double.toString(libro.getPrecio());
            lista[4] = libro.getEditorial();
            lista[5] = libro.getAutor();
            lista[6] = Integer.toString(libro.getInventario());
            lista[7] = Integer.toString(libro.getAñoEdicion());
        }
        
        return lista;
    }
    
    public boolean ActualizarLibro(Libro libro) {
        return this.conexion.Actualizar(libro);
    }
    
    public boolean RegistrarLibro(Libro libro) {
        return this.conexion.Registrar(libro);
    }
    
    public boolean EliminarLibro(String id) {
        return this.conexion.Eliminar(id);
    }
}
