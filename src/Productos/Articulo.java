package Productos;

public class Articulo {
    private int id;
    private String descripcion;
    private String proveedor;
    private int inventario;
    private double precio;
    
    public Articulo() {
    }

    public Articulo(int id, String descripcion, String proveedor, int inventario, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.inventario = inventario;
        this.precio = precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getInventario() {
        return inventario;
    }

    public double getPrecio() {
        return precio;
    }
        
}
