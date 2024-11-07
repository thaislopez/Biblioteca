package Productos;

public class Libro extends Articulo {
    private String editorial;
    private String autor;
    private int añoEdicion;
    
    public Libro() {
    }

    public Libro(String editorial, String autor, int añoEdicion) {
        this.editorial = editorial;
        this.autor = autor;
        this.añoEdicion = añoEdicion;
    }

    public Libro(String editorial, String autor, int añoEdicion, int id, String descripcion, String proveedor, int inventario, double precio) {
        super(id, descripcion, proveedor, inventario, precio);
        this.editorial = editorial;
        this.autor = autor;
        this.añoEdicion = añoEdicion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }    
}
