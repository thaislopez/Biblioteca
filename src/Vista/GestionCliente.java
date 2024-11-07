
package Vista;

import Conexion.ClienteImp;
import Conexion.ControlDatos;
import Conexion.UsuariosImp;
import Personas.Cliente;
import Personas.Persona;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionCliente extends javax.swing.JDialog {
       int id;
    public GestionCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        btActuTabla.setVisible(false);
        this.btModificar.setVisible(false);
        llenarTabla();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        btAgregar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jTextCedula = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        btActuTabla = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        jTextBuscardor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jScrollPane2.setViewportView(jTableClientes);

        btAgregar.setText("Agregar");
        btAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 255)));
        btAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAgregarMouseClicked(evt);
            }
        });
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 255)));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 255)));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btSalir.setText("SALIR");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        jTextCedula.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCedulaActionPerformed(evt);
            }
        });

        jTextNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextApellido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextEdad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelCedula.setText("Cedula:");

        jLabelNombre.setText("Nombre:");

        jLabelApellido.setText("Apellido:");

        jLabelEdad.setText("Edad:");

        jLabelCorreo.setText("Correo Electronico:");

        jTextCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoActionPerformed(evt);
            }
        });

        btActuTabla.setText("Actu Tabla");
        btActuTabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 255)));
        btActuTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btActuTablaMouseClicked(evt);
            }
        });
        btActuTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActuTablaActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(102, 0, 255)));
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        jTextBuscardor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextBuscardor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextBuscardorKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTA DE CLIENTES");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Buscador:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelEdad)
                                    .addComponent(jLabelCedula))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(801, 801, 801))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextBuscardor)
                                .addGap(819, 819, 819))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                        .addComponent(jTextApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextCedula, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btActuTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btModificar)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAgregar)
                    .addComponent(btEditar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEliminar)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBuscardor)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btActuTabla)
                    .addComponent(btModificar))
                .addGap(371, 371, 371))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        ClienteImp btE = new ClienteImp();
        Cliente edt = new Cliente();
        ArrayList <Persona> lista;
        ClienteImp conexiones;
        Cliente cliente;
        String ID;
        int fila;
        
        fila = this.jTableClientes.getSelectedRow();
        if (fila < 0)return;
        ID = this.jTableClientes.getValueAt(fila, 0).toString();
        this.id = Integer.parseInt(ID);
        MostarOcultar(true);
        btActuTabla.setVisible(false);
        this.btModificar.setVisible(true);
        conexiones = new ClienteImp();
        lista = conexiones.LeerDatos(ID);
        jTextCedula.setText(Integer.toString(lista.get(0).getcedula()));
        jTextNombre.setText(lista.get(0).getnombre());
        jTextApellido.setText(lista.get(0).getApellido());
        jTextCorreo.setText(lista.get(0).getcorreo());
        jTextEdad.setText(Integer.toString(lista.get(0).getedad()));
        
        
        
//        if(cliente == null)return;
        
        //edt = new ClienteImp();
//        edt.setcedula(cliente.getcedula());
//        edt.setnombre(cliente.getnombre());
//        edt.setApellido(cliente.getApellido());
//        edt.setcorreo(cliente.getcorreo());
//        edt.setedad(cliente.getedad());
//        
//        if(!btE.RegistrarUsuario(cliente))return;
//        cliente.setcedula(Integer.parseInt(jTextCedula.getText()));
//        cliente.setnombre(jTextNombre.getText());
//        cliente.setApellido(jTextApellido.getText());
//        cliente.setcorreo(jTextCorreo.getText());
//        //cliente.setedad(Integer.parseInt(jTextEdad.getText()));
//        conexiones.ModificarUsuario(cliente);
//        this.llenarTabla();
        
        
        
        
  
    }//GEN-LAST:event_btEditarActionPerformed

    private void btAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarMouseClicked
        // TODO add your handling code here:     
        /*
     * Acciones a realizar al presionar el boton AGREGAR
         */
        /**
         * jLabel
         */
        jLabelCedula.setVisible(true);
        jLabelNombre.setVisible(true);
        jLabelApellido.setVisible(true);
        jLabelCorreo.setVisible(true);
        jLabelEdad.setVisible(true);

        /**
         * jText
         */
        jTextCedula.setVisible(true);
        jTextNombre.setVisible(true);
        jTextApellido.setVisible(true);
        jTextEdad.setVisible(true);
        jTextCorreo.setVisible(true);

        btActuTabla.setVisible(true);
    }//GEN-LAST:event_btAgregarMouseClicked

    private void jTextCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCedulaActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:

        /*
         * Se gana el foco en el form
         */
        ClienteImp cliente = new ClienteImp();


    }//GEN-LAST:event_formFocusGained

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_jPanel1FocusGained

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        /*
         * ACCIONES AL ABRIRSE LA VENTANA
         */
        /**
         * jLabel
         */
        jLabelCedula.setVisible(false);
        jLabelNombre.setVisible(false);
        jLabelApellido.setVisible(false);
        jLabelCorreo.setVisible(false);
        jLabelEdad.setVisible(false);

        /**
         * jText
         */
        jTextCedula.setVisible(false);
        jTextNombre.setVisible(false);
        jTextApellido.setVisible(false);
        jTextEdad.setVisible(false);
        jTextCorreo.setVisible(false);

        DefaultTableModel jTableClientes = new DefaultTableModel();

    }//GEN-LAST:event_formWindowOpened

    private void jTextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
//        llenarTabla();
    }//GEN-LAST:event_formWindowActivated

    private void btActuTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActuTablaActionPerformed
        // TODO add your handling code here:
        //validar
        //crear nuevo registro la bd con los clientes nuevos  
        ClienteImp btac = new ClienteImp();
        Cliente mod = new Cliente();
        if (!validar()){
            JOptionPane.showMessageDialog(null,"Error en formato en cedula o edad");
            return;
        }
        mod.setcedula(Integer.parseInt(jTextCedula.getText()));
        mod.setnombre(jTextNombre.getText());
        mod.setApellido(jTextApellido.getText());
        mod.setcorreo(jTextCorreo.getText());
        mod.setedad(Integer.parseInt(jTextEdad.getText()));
       
        if (btac.RegistrarUsuario(mod)) {
            llenarTabla();
            JOptionPane.showMessageDialog(null, "Cliente Registrado");

        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar Cliente");
        }
        MostarOcultar(false);
        limpiar();
    }//GEN-LAST:event_btActuTablaActionPerformed

    private void btActuTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btActuTablaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btActuTablaMouseClicked

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int fila;
        String id;
        String nombre;
        String mensaje;
        
        fila = this.jTableClientes.getSelectedRow();
        if(fila < 0)return;
        
        id = this.jTableClientes.getValueAt(fila, 0).toString();
        nombre = this.jTableClientes.getValueAt(fila, 2).toString() + " " + this.jTableClientes.getValueAt(fila, 3).toString();
        mensaje = "¿DESEA ELIMINAR AL CLIENTE?\n ID: " + id + "\nNombre: " + nombre;
        
        if(JOptionPane.showConfirmDialog(null, mensaje, "Eliminacion de registro",JOptionPane.YES_NO_OPTION)!=1){
            ClienteImp conexion = new ClienteImp();
            
            if(conexion.EliminarCliente(id)) JOptionPane.showMessageDialog(null,"Registro eliminado totalmente");
            this.llenarTabla();
        }
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        ClienteImp conexion = new ClienteImp();
        Cliente mod = new Cliente();
        if (!validar()){
            JOptionPane.showMessageDialog(null,"Error en formato en cedula o edad");
            return;
        }
        mod.setid(this.id);
        mod.setcedula(Integer.parseInt(jTextCedula.getText()));
        mod.setnombre(jTextNombre.getText());
        mod.setApellido(jTextApellido.getText());
        mod.setcorreo(jTextCorreo.getText());
        mod.setedad(Integer.parseInt(jTextEdad.getText()));
       
        if (conexion.ModificarUsuario(mod)){
            JOptionPane.showMessageDialog(null, "Modificacion realizada");
            this.limpiar();
            this.MostarOcultar(false);
            this.llenarTabla();
        }
        
    }//GEN-LAST:event_btModificarActionPerformed

    private void jTextBuscardorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscardorKeyReleased
        buscar();
    }//GEN-LAST:event_jTextBuscardorKeyReleased

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionCliente dialog = new GestionCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btActuTabla;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextBuscardor;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        DefaultTableModel tabla = new DefaultTableModel();
        ClienteImp control = new ClienteImp();
        ArrayList<Persona> datos;
        String[] fila = new String[6];
        tabla.addColumn("ID");
        tabla.addColumn("CEDULA");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDO");
        tabla.addColumn("CORREO");
        tabla.addColumn("EDAD");
        datos = control.LeerDatos();
        for (int f = 0; f < datos.size(); f++) {
            fila[0] = Integer.toString(datos.get(f).getid());
            fila[1] = Integer.toString(datos.get(f).getcedula());
            fila[2] = datos.get(f).getnombre();
            fila[3] = datos.get(f).getApellido();
            fila[4] = datos.get(f).getcorreo();
            fila[5] = Integer.toString(datos.get(f).getedad());
            tabla.addRow(fila);
        }// fin del for
        this.jTableClientes.setModel(tabla);
    }

    public void MostarOcultar(boolean Mostrar) {
        boolean valor = Mostrar;
        
        jLabelCedula.setVisible(valor);
        jLabelNombre.setVisible(valor);
        jLabelApellido.setVisible(valor);
        jLabelCorreo.setVisible(valor);
        jLabelEdad.setVisible(valor);

        /**
         * jText
         */
        jTextCedula.setVisible(valor);
        jTextNombre.setVisible(valor);
        jTextApellido.setVisible(valor);
        jTextEdad.setVisible(valor);
        jTextCorreo.setVisible(valor);
        btActuTabla.setVisible(valor);
        this.btModificar.setVisible(valor);
    }

    public void limpiar() {
        jTextCedula.setText("");
        jTextCedula.setText("");
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextEdad.setText("");
        jTextCorreo.setText("");
    }

    public void buscar(){
        ClienteImp bu  = new ClienteImp();
        DefaultTableModel tabla = new DefaultTableModel();
        ArrayList<Persona> lista;
        //String campo;
        String buscar;
        String[] fila;
        //campo = criterio
        buscar = this.jTextBuscardor.getText();
        if(buscar.equals("")){
            this.llenarTabla();
            return;
        }
        tabla.addColumn("ID");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDO");
        tabla.addColumn("CEDULA");
        tabla.addColumn("CORREO");
        tabla.addColumn("EDAD");
        lista = bu.BuscarUsuario(buscar);
        for(Persona p: lista){
            fila = new String[6];
            fila[0] = Integer.toString(p.getid());
            fila[1] = p.getnombre();
            fila[2] = p.getApellido();
            fila[3] = Integer.toString(p.getcedula());
            fila[4] = p.getcorreo();
            fila[5] = Integer.toString(p.getedad());
            tabla.addRow(fila);
            
        }
        this.jTableClientes.setModel(tabla);
    }
    
    public boolean validar(){
        if(!esnumerico(this.jTextCedula.getText())|| !esnumerico(this.jTextEdad.getText())){
            return false;
        }else{
            return true;
        }
        
    }
    public boolean esnumerico(String numero){
       try{
           Integer.parseInt(numero);
           return true;
       }catch(NumberFormatException e){
           return false;
       }
    }
      
}
