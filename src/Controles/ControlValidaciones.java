package Controles;

import Validaciones.Patron;


public class ControlValidaciones extends Patron{
    
    public boolean esNombre(String nombre) {
        String modelo;
        
        modelo = "^[A-Za-záéíóú]+[ ]?[A-Za-záéíóú]+$";
        return this.coinciden(modelo, nombre);
    }
    
    public boolean esCorreo(String email) {
        String modelo;
        
        modelo = "[\\w.-]+@[\\w.-]+\\.[A-Za-z]{3}";
        return this.coinciden(modelo, email);
    }
    
    public boolean esEdad(String edad) {
        String modelo;
        
        modelo = "^[(^0)\\d][0-9]{1}";
        return this.coinciden(modelo,edad);
    }
    
    public boolean esCedula(String cedula) {
        String modeloNacional;
        String modeloExtranjero;
        
        modeloNacional = "[1-9]{1}[0-9]{4}[0-9]{4}";
        modeloExtranjero = "[1][0-9]{3}[0-9]{6}[0-9]{3}";
        
        return (this.coinciden(modeloNacional, cedula) || this.coinciden(modeloExtranjero, cedula));
        
//        Formato extranjeros: Artículo 1, inciso 17. Acuerdo 223 del 28/03/2017.
//        Normativa costarricense de información Jurídica. Procuraduría general de la Republica.
//        http://www.pgrweb.go.cr/scij/Busqueda/Normativa/Normas/nrm_articulo.aspx?param1=NRA&nValor1=1&nValor2=84100&nValor3=108349&nValor5=2&strTipM=FA
    }
    
    public boolean esNumerico(String numero) {
        String modelo;
        
        modelo = "\\d+";
        return this.coinciden(modelo, numero);
    }
    
    public boolean esAnioValido(String numero) {
        String modelo;
        
        modelo = "^[12][089][0-9]{2}$";
//        modelo = "1800-2100";
        return this.coinciden(modelo, numero);
    }
    
    public boolean esPrecio(String precio) {
        String modelo;
        
        modelo = "[\\d]+[.,]?([\\d]+)?";
        return this.coinciden(modelo, precio);
    }
}
