/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
//import Personas.LIBROS;

import Conexion.ClienteImp;
import Conexion.LibrosImp;
import Conexion.TransaccionesImp;
import Controles.ControlLibros;
//import Modelo.Transacciones;
import Personas.Cliente;
import Personas.Persona;
import Productos.Libro;
import Productos.Transacciones;
import com.mysql.jdbc.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author earleyb
 */
/**
 * 
 * Objetos globales
 */
public class GestionTransacciones extends javax.swing.JFrame {
     String id;
     String libro;
     String precio;
     Transacciones factura = new Transacciones();
     LibrosImp conexioneslibro=new LibrosImp();
ControlLibros control=new ControlLibros();
Persona cliente =new Cliente();
ArrayList<Libro> libros =new ArrayList<>();
    /**
     * Creates new form Transacciones
     * ejecuta metodo actualizar tabla
     */
    public GestionTransacciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.ActualizarTabla();
    }
/**
 * setters de:
 * @param id
 * @param libro
 * @param precio
 */
    public void setId(String id) {
        this.id = id;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    /**
     * Metodo Actualizar tabla
     * añade contenido a la tabla
     */
    private void ActualizarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
//        TransaccionesImp control = new TransaccionesImp();
        ArrayList <String[]> datos;
        String[] fila = new String[3];
        tabla.addColumn("ID");
        tabla.addColumn("LIBRO");
        tabla.addColumn("PRECIO");

        datos=control.getFilasTabla();

        for (int f = 0; f < datos.size(); f++) {

            fila[0] = datos.get(f)[0];
            fila[1] = datos.get(f)[1];
            fila[2] = datos.get(f)[5];

            tabla.addRow(fila);
        }
        this.TablaLibros.setModel(tabla);
    }
/**
 * metodo carrito
 * funcion para el boton carrito
 */
    public void carrito() {
        Libro libro = new Libro();
        String identificador;

        int fila = this.TablaLibros.getSelectedRow();
        if (fila < 0) {
            return;
        }

        identificador = this.TablaLibros.getValueAt(fila, 0).toString();
        libro = conexioneslibro.LeerDatos(identificador).get(0);
        factura.getLibros().add(libro);
        
        JOptionPane.showMessageDialog(null, "Se añadió al carrito");

//        System.out.println(factura.getLibros().get(0).getAutor());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        Añadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLibros = new javax.swing.JTable();
        Salir = new javax.swing.JButton();
        Factura = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ElegirCliente = new javax.swing.JButton();
        nomcliente = new javax.swing.JLabel();
        numcedula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titulo.setText("Transacciones");

        Añadir.setActionCommand("Añadir");
        Añadir.setLabel("Añadir al Carrito");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        TablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Libro", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaLibros);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Factura.setText("Facturar");
        Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecciones el libro a buscar");

        ElegirCliente.setText("Elegir cliente");
        ElegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Salir))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ElegirCliente)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(nomcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(numcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ElegirCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomcliente)
                    .addComponent(numcedula))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Añadir)
                    .addComponent(Factura)
                    .addComponent(Salir))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        Añadir.getAccessibleContext().setAccessibleName("Añadir");
        Añadir.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        // TODO add your handling code here:
        carrito();
    }//GEN-LAST:event_AñadirActionPerformed
/**
 * Boton elegir cliente
 * guarda datos cliente y cedula
 */
    private void ElegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirClienteActionPerformed
        // TODO add your handling code here:
        ArrayList<Persona> personas;
        ClienteImp conexioncliente=new ClienteImp();
        ListaClientes listaC= new ListaClientes(null, true);
        if(listaC.mostrarVentana()==false) return;
        
        String id=listaC.getId();        
        personas=conexioncliente.LeerDatos(id);
        this.cliente=personas.get(0);
        factura.setCliente(conexioncliente.LeerDatos(id).get(0));
        
        nomcliente.setText(factura.getCliente().getnombre()+" "+factura.getCliente().getApellido());
        numcedula.setText(Integer.toString(factura.getCliente().getcedula()));
//        System.out.println(this.cliente.getcedula());
    }//GEN-LAST:event_ElegirClienteActionPerformed
/**
 * factura
 * crea objeto facturar 
 */
    private void FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaActionPerformed
        // TODO add your handling code here: 
                Facturar ventanfactura=new Facturar();
//                ventanfactura.setCliente(ventanfactura.getCliente());
//                ventanfactura.setLibros(libros);
                   if(factura.getCliente()==null || factura.getLibros().isEmpty()) {
                               JOptionPane.showMessageDialog(null, "Para continuar es necesario elegir un cliente y un libro");
                       return;
                   }
                ventanfactura.setTr(this.factura);

                ventanfactura.setVisible(true);

//        String fila=nomcliente.getText();
//        
//        if(fila=="") return;
//        int filas=this.TablaLibros.getSelectedRow();
//        if(filas<0) return;
//        String nombrelibro=this.libro;
//        String precio=this.precio;
//        this.dispose();
        
    }//GEN-LAST:event_FacturaActionPerformed
/**
 * boton salir
 *  
 */
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTransacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JButton ElegirCliente;
    private javax.swing.JButton Factura;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaLibros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomcliente;
    private javax.swing.JLabel numcedula;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
