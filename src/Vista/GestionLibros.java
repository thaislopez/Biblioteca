package Vista;

import Controles.ControlLibros;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dennis Méndez Delgado
 */
public class GestionLibros extends javax.swing.JDialog {
    
    ControlLibros controlador = new ControlLibros();
    
    private enum Criterios {
        ID,
        DESCRIPCION,
        PROVEEDOR,
        PRECIO,
        EDITORIAL,
        AUTOR,
        CANTIDAD
    }
    
    public GestionLibros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.cargarTabla();
        this.cargarComboBox();
    }
    
    private void cargarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn(Criterios.ID);
        tabla.addColumn(Criterios.DESCRIPCION);
        tabla.addColumn(Criterios.EDITORIAL);
        tabla.addColumn(Criterios.AUTOR);
        tabla.addColumn(Criterios.CANTIDAD);
        tabla.addColumn(Criterios.PRECIO);
        
        for (String[] fs : controlador.getFilasTabla()) {
            tabla.addRow(fs);
        }
        
        this.tablaLibros.setModel(tabla);
    }
    
    private void cargarComboBox() {
        this.cbCriterio.removeAllItems();
        this.cbCriterio.addItem(Criterios.DESCRIPCION.toString());
        this.cbCriterio.addItem(Criterios.AUTOR.toString());
        this.cbCriterio.addItem(Criterios.EDITORIAL.toString());
    }
    
    private void buscar() {
        DefaultTableModel table = new DefaultTableModel();
        String campo;
        String buscar;
        
        campo = this.cbCriterio.getSelectedItem().toString();
        buscar = this.txtBuscador.getText();
        
        if(buscar.equals("")) {
            this.cargarTabla();
            return;
        }
        
        table.addColumn(Criterios.ID);
        table.addColumn(Criterios.DESCRIPCION);
        table.addColumn(Criterios.EDITORIAL);
        table.addColumn(Criterios.AUTOR);
        table.addColumn(Criterios.CANTIDAD);
        table.addColumn(Criterios.PRECIO);
        
        for(String[] fila : controlador.getFilasTabla(campo, buscar)) {
            table.addRow(fila);
        }
        
        this.tablaLibros.setModel(table);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        scrollPaneEmpleados = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbCriterio = new javax.swing.JComboBox<>();
        txtBuscador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPaneEmpleados.setViewportView(tablaLibros);

        btnAgregar.setText("Agregar libro");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar libro");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar libro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cbCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ModificarLibro ventana;
        String id;
        int fila;
        
        fila = this.tablaLibros.getSelectedRow();
        if(fila < 0) return;
        id = this.tablaLibros.getValueAt(fila, 0).toString();
        
        ventana = new ModificarLibro(null,true);
        ventana.setId(this.controlador.getLIBRO(id).getId());
        ventana.setDescripcion(this.controlador.getLIBRO(id).getDescripcion());
        ventana.setProveedor(this.controlador.getLIBRO(id).getProveedor());
        ventana.setPrecio(this.controlador.getLIBRO(id).getPrecio());
        ventana.setEditorial(this.controlador.getLIBRO(id).getEditorial());
        ventana.setAutor(this.controlador.getLIBRO(id).getAutor());
        ventana.setInventario(this.controlador.getLIBRO(id).getInventario());
        ventana.setAnioEdicion(this.controlador.getLIBRO(id).getAñoEdicion());
        
//        ibro.setId(resultSet.getInt("ID"));
//                libro.setDescripcion(resultSet.getString("DESCRIPCION"));
//                libro.setProveedor(resultSet.getString("PROVEEDOR"));
//                libro.setPrecio(resultSet.getInt("PRECIO"));
//                libro.setEditorial(resultSet.getString("EDITORIAL"));
//                libro.setAutor(resultSet.getString("AUTOR"));
//                libro.setInventario(resultSet.getInt("CANTIDAD"));
//                libro.setAñoEdicion(resultSet.getInt("AÑO_EDICION"));
        
        if(!ventana.mostrarVentana()) return;
        
        this.controlador.getLIBRO().setId(ventana.getId());
        this.controlador.getLIBRO().setDescripcion(ventana.getDescripcion());
        this.controlador.getLIBRO().setProveedor(ventana.getProveedor());
        this.controlador.getLIBRO().setPrecio(ventana.getPrecio());
        this.controlador.getLIBRO().setEditorial(ventana.getEditorial());
        this.controlador.getLIBRO().setAutor(ventana.getAutor());
        this.controlador.getLIBRO().setInventario(ventana.getInventario());
        this.controlador.getLIBRO().setAñoEdicion(ventana.getAnioEdicion());
        
//        usuario.setid(ventana.getId());
//        usuario.setnombre(ventana.getNombre());
//        usuario.setApellido(ventana.getApellido());
//        usuario.setedad(ventana.getEdad());
//        usuario.setcedula(ventana.getCedula());
//        usuario.setcorreo(ventana.getCorreo());
//        usuario.setusuario(ventana.getLogin());
//        usuario.setcontraseña(ventana.getPassword());
//        usuario.setAdministrador(ventana.isAdministrador());
        
        this.controlador.ActualizarLibro(this.controlador.getLIBRO());
        this.cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ModificarLibro ventana = new ModificarLibro(null,true);
        if(!ventana.mostrarVentana()) return;
        
        this.controlador.getLIBRO().setDescripcion(ventana.getDescripcion());
        this.controlador.getLIBRO().setAutor(ventana.getAutor());
        this.controlador.getLIBRO().setEditorial(ventana.getEditorial());
        this.controlador.getLIBRO().setProveedor(ventana.getProveedor());
        this.controlador.getLIBRO().setAñoEdicion(ventana.getAnioEdicion());
        this.controlador.getLIBRO().setInventario(ventana.getInventario());
        this.controlador.getLIBRO().setPrecio(ventana.getPrecio());
        
        this.controlador.RegistrarLibro(controlador.getLIBRO());
        
        this.cargarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila;
        String id;
        String nombre;
        String editorial;
        String mensaje;
        
        fila = this.tablaLibros.getSelectedRow();
        if(fila < 0) return;
        
        id = this.tablaLibros.getValueAt(fila, 0).toString();
        nombre = this.tablaLibros.getValueAt(fila, 1).toString();
        editorial = this.tablaLibros.getValueAt(fila, 2).toString();
        mensaje = "¿Desea eliminar el registro seleccionado?\n\nID: " + id + "\nDescripción: " + nombre + "\nEditorial: " + editorial;
        
        if(JOptionPane.showConfirmDialog(null, mensaje,"Eliminar registro", JOptionPane.YES_NO_OPTION)!= 1) {
            
            if(this.controlador.EliminarLibro(id)) JOptionPane.showMessageDialog(null, "Registro eliminado");
            this.cargarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyReleased
        this.buscar();
    }//GEN-LAST:event_txtBuscadorKeyReleased

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
            java.util.logging.Logger.getLogger(GestionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionLibros dialog = new GestionLibros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbCriterio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPaneEmpleados;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
