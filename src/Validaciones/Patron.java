package Validaciones;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Patron {
    
    /**
     * Determina si una palabra cumple con un modelo o patrón específico.
     * @param modelo es la expresión regular.
     * @param texto es el texto que será sometido a comparación contra la expresión regular.
     * @return True si la palabra se ajusta al patrón. False si la palabra no se ajusta al patrón.
     */
    public boolean coinciden(String modelo, String texto) {
        Pattern patron = Pattern.compile(modelo);
        Matcher m = patron.matcher(texto);
        boolean coincidencia = false;
        
        if (m.matches()) coincidencia = true;
        
        return coincidencia;
    }
}