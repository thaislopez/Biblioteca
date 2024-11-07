package Vista;

import Conexion.UsuariosImp;
import Controles.ControlUsuarios;
import Personas.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dennis Méndez Delgado
 */
public class GestionUsuarios extends javax.swing.JDialog {
    
    private enum Criterios {
        NOMBRE,
        CEDULA
    }
    
    public GestionUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.cargarTabla();
        this.cargarComboBox();
    }
    
    private void cargarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
        ArrayList<Usuario> lista;
        UsuariosImp control = new UsuariosImp();
        String[] fila = new String[5];
        
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Cédula");
        tabla.addColumn("Adm");
        
        lista =  control.LeerDatos();
        
        for (Usuario us : lista) {
            fila[0] = Integer.toString(us.getid());
            fila[1] = us.getnombre();
            fila[2] = us.getApellido();
            fila[3] = Integer.toString(us.getcedula());
            fila[4] = Boolean.toString(us.esAdministrador());
            tabla.addRow(fila);
        }
        
        this.tablaEmpleados.setModel(tabla);
    }
    
    private void cargarComboBox() {
        this.cbCriterio.removeAllItems();
        this.cbCriterio.addItem(Criterios.NOMBRE.toString());
        this.cbCriterio.addItem(Criterios.CEDULA.toString());
    }
    
    private void buscar() {
        ControlUsuarios cu = new ControlUsuarios();
        DefaultTableModel table = new DefaultTableModel();
        ArrayList<String[]> lista;
        String campo;
        String buscar;
        
        campo = this.cbCriterio.getSelectedItem().toString();
        buscar = this.txtBuscador.getText();
        
        if(buscar.equals("")) {
            this.cargarTabla();
            return;
        }
        
        table.addColumn("ID");
        table.addColumn("Nombre");
        table.addColumn("Apellido");
        table.addColumn("Cédula");
        table.addColumn("Adm");
        
        lista = cu.getFilasTabla(campo, buscar);
        
        for(String[] fila : lista) {
            table.addRow(fila);
        }
        
        this.tablaEmpleados.setModel(table);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        scrollPaneEmpleados = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnAgregarEmpleado = new javax.swing.JButton();
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

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollPaneEmpleados.setViewportView(tablaEmpleados);

        btnAgregarEmpleado.setText("Agregar empleado");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar registro");
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
                            .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        ModificarUsuario ventana;
        UsuariosImp conexiones;
        Usuario usuario;
        String id;
        int fila;
        
        fila = this.tablaEmpleados.getSelectedRow();
        if(fila < 0) return;
        id = this.tablaEmpleados.getValueAt(fila, 0).toString();
        
        conexiones = new UsuariosImp();
        
        
        usuario = conexiones.LeerUsuario(id);
        if(usuario == null) return;
        
        ventana = new ModificarUsuario(null,true);
        ventana.setId(usuario.getid());
        ventana.setNombre(usuario.getnombre());
        ventana.setApellido(usuario.getApellido());
        ventana.setEdad(usuario.getedad());
        ventana.setCedula(usuario.getcedula());
        ventana.setCorreo(usuario.getcorreo());
        ventana.setPassword(usuario.getContrasenna());
        ventana.setAdministrador(usuario.esAdministrador());
        
        if(!ventana.mostrarVentana()) return;
        usuario.setid(ventana.getId());
        usuario.setnombre(ventana.getNombre());
        usuario.setApellido(ventana.getApellido());
        usuario.setedad(ventana.getEdad());
        usuario.setcedula(ventana.getCedula());
        usuario.setcorreo(ventana.getCorreo());
        usuario.setusuario(ventana.getLogin());
        usuario.setcontraseña(ventana.getPassword());
        usuario.setAdministrador(ventana.isAdministrador());
        
        conexiones.ActualizarUsuario(usuario);
        this.cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(null,true);
        UsuariosImp conexion;
        Usuario usuario;
        
        if(!ventana.mostrarVentana()) return;
        
        usuario = new Usuario();
        usuario.setnombre(ventana.getNombre());
        usuario.setApellido(ventana.getApellido());
        usuario.setedad(ventana.getEdad());
        usuario.setcorreo(ventana.getCorreo());
        usuario.setcedula(ventana.getCedula());
        usuario.setusuario(ventana.getLogin());
        usuario.setcontraseña(ventana.getPassword());
        usuario.setAdministrador(ventana.isAdministrador());
        
        conexion = new UsuariosImp();
        conexion.RegistrarUsuario(usuario);
        
        this.cargarTabla();
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila;
        String id;
        String nombre;
        String mensaje;
        
        fila = this.tablaEmpleados.getSelectedRow();
        if(fila < 0) return;
        
        id = this.tablaEmpleados.getValueAt(fila, 0).toString();
        nombre = this.tablaEmpleados.getValueAt(fila, 1).toString() + " " + this.tablaEmpleados.getValueAt(fila, 2).toString();
        mensaje = "¿Desea eliminar el registro seleccionado?\n\nID: " + id + "\nNombre: " + nombre;
        
        if(JOptionPane.showConfirmDialog(null, mensaje,"Eliminar registro", JOptionPane.YES_NO_OPTION)!= 1) {
            UsuariosImp conexion = new UsuariosImp();
            
            if(conexion.EliminarUsuario(id)) JOptionPane.showMessageDialog(null, "Registro eliminado");
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
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionUsuarios dialog = new GestionUsuarios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbCriterio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPaneEmpleados;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
