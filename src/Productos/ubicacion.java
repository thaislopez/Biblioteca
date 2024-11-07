package Productos;

public class ubicacion {
    
    private int numEstante;
    private int numFila;
    
    public ubicacion(){

    }
    public ubicacion (int numEstante, int numFila){
        this.numEstante = numEstante;
        this.numFila = numFila;
    }
    
    public void setnumEstante(int numEstante){
        this.numEstante = numEstante;
    }
    public void setnumFila(int numFila){
        this.numFila = numFila;
    }
    
}



