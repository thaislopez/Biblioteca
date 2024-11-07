/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Personas.Cliente;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class ControlDatos extends Conexion{
    
    public ArrayList <Cliente> llenarDatos(){
        
        Cliente cliente;
        ResultSet rs;
        PreparedStatement ps = null;
        
        ArrayList<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        
        try {
            this.conectar();
             ps = this.conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                cliente = new Cliente();
                
                cliente.setcedula(rs.getInt("cedula"));
                cliente.setnombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setcorreo(rs.getString("correo"));
                cliente.setedad(rs.getInt("edad"));
                lista.add(cliente);
            }
            rs.close();
            ps.close();
            this.desconectar();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR DE CONEXION" + e.getMessage());
        }
        return lista;
    }
}


