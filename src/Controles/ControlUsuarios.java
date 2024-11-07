package Controles;

import Conexion.UsuariosImp;
import Personas.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ControlUsuarios {
    
    public ArrayList<String[]> getFilasTabla(String campo, String valor) {
        UsuariosImp conexion;
        String[] fila;
        ArrayList<String[]> listado;
        ArrayList<Usuario> listaUsuarios;
        
        listado = new ArrayList<>();
        conexion = new UsuariosImp();
        
        listaUsuarios = conexion.LeerDatos(campo, valor);
        for(Usuario usuario : listaUsuarios) {
            fila = new String[5];
            fila[0] = Integer.toString(usuario.getid());
            fila[1] = usuario.getnombre();
            fila[2] = usuario.getApellido();
            fila[3] = Integer.toString(usuario.getcedula());
            fila[4] = Boolean.toString(usuario.esAdministrador());
            
            listado.add(fila);
        }
        
        return listado;
    }
}
