package Vista;

import Conexion.Transaccionsql;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author dayanna.rodriguez
 */
public class RegistroTransacciones extends javax.swing.JDialog {

    private TableRowSorter TRSFiltro;

    public RegistroTransacciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoBuscarpor = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        TextoRegistro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        panelBuscarPor = new javax.swing.JPanel();
        texto1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        texto2 = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        texto3 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        texto4 = new javax.swing.JLabel();
        txtCantidadLibros = new javax.swing.JTextField();

        TextoBuscarpor.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        TextoBuscarpor.setForeground(new java.awt.Color(0, 102, 102));
        TextoBuscarpor.setText("Buscar por:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        TextoRegistro.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        TextoRegistro.setForeground(new java.awt.Color(0, 102, 102));
        TextoRegistro.setText("Registro transacciones");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre cliente", "Cédula cliente", "Nombre libro", "Cantidad libros", "Monto total", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        btnSalir.setBackground(new java.awt.Color(153, 0, 51));
        btnSalir.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(0, 102, 102));
        btnMostrar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        panelBuscarPor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bookman Old Style", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        texto1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        texto1.setForeground(new java.awt.Color(0, 102, 102));
        texto1.setText("Nombre cliente:");

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        texto2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        texto2.setForeground(new java.awt.Color(0, 102, 102));
        texto2.setText("Cédula cliente:");

        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });

        texto3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        texto3.setForeground(new java.awt.Color(0, 102, 102));
        texto3.setText("Nombre libro:");

        txtNombreLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreLibroKeyTyped(evt);
            }
        });

        texto4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        texto4.setForeground(new java.awt.Color(0, 102, 102));
        texto4.setText("Cantidad libros:");

        txtCantidadLibros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadLibrosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarPorLayout = new javax.swing.GroupLayout(panelBuscarPor);
        panelBuscarPor.setLayout(panelBuscarPorLayout);
        panelBuscarPorLayout.setHorizontalGroup(
            panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCliente)
                    .addComponent(texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCedulaCliente))
                .addGap(35, 35, 35)
                .addGroup(panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texto3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(txtNombreLibro))
                .addGroup(panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarPorLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(txtCantidadLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBuscarPorLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(texto4)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelBuscarPorLayout.setVerticalGroup(
            panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarPorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(texto2)
                        .addComponent(texto3)
                        .addComponent(texto4))
                    .addComponent(texto1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarPorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCantidadLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarPorLayout.createSequentialGroup()
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBuscarPor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextoRegistro)
                .addGap(204, 204, 204))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoRegistro)
                .addGap(18, 18, 18)
                .addComponent(panelBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Accion al dar click en boton Salir:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        llenarJTable();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        // TODO add your handling code here:
        txtNombreCliente.addKeyListener(new KeyAdapter() {

            public void keyReleased (final KeyEvent e) {
                String cadena = (txtNombreCliente.getText());
                txtNombreCliente.setText(cadena);
                Filtro1();
            }
        });
        
        TRSFiltro = new TableRowSorter(jTable.getModel());
        jTable.setRowSorter(TRSFiltro);
        
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
        // TODO add your handling code here:
        txtCedulaCliente.addKeyListener(new KeyAdapter() {

            public void keyReleased (final KeyEvent e) {
                String cadena = (txtCedulaCliente.getText());
                txtCedulaCliente.setText(cadena);
                Filtro2();
            }
        });
        
        TRSFiltro = new TableRowSorter(jTable.getModel());
        jTable.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void txtNombreLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreLibroKeyTyped
        // TODO add your handling code here:
        txtNombreLibro.addKeyListener(new KeyAdapter() {

            public void keyReleased (final KeyEvent e) {
                String cadena = (txtNombreLibro.getText());
                txtNombreLibro.setText(cadena);
                Filtro3();
            }
        });
        
        TRSFiltro = new TableRowSorter(jTable.getModel());
        jTable.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txtNombreLibroKeyTyped

    private void txtCantidadLibrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadLibrosKeyTyped
        // TODO add your handling code here:
        txtCantidadLibros.addKeyListener(new KeyAdapter() {

            public void keyReleased (final KeyEvent e) {
                String cadena = (txtCantidadLibros.getText());
                txtCantidadLibros.setText(cadena);
                Filtro4();
            }
        });
        
        TRSFiltro = new TableRowSorter(jTable.getModel());
        jTable.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txtCantidadLibrosKeyTyped

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroTransacciones dialog = new RegistroTransacciones(new javax.swing.JFrame(), true);
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

    public void llenarJTable() {

        DefaultTableModel modelo = new DefaultTableModel();

        Transaccionsql con = new Transaccionsql();

        modelo.addColumn("Nombre cliente");
        modelo.addColumn("Cédula cliente");
        modelo.addColumn("Nombre libro");
        modelo.addColumn("Cantidad libros");
        modelo.addColumn("Monto total");
        modelo.addColumn("Fecha");

        for (String[] fila : con.getFilas()) {

            modelo.addRow(fila);
        }

        jTable.setModel(modelo);
    }

    public void Filtro1() {
        int ColumnTable = 0; //Tabla nombre cliente
        TRSFiltro.setRowFilter(RowFilter.regexFilter(txtNombreCliente.getText(), ColumnTable));
    }
    
    public void Filtro2() {
        int ColumnTable = 1; //Tabla cedula cliente
        TRSFiltro.setRowFilter(RowFilter.regexFilter(txtCedulaCliente.getText(), ColumnTable));
    }
    
    public void Filtro3() {
        int ColumnTable = 2; //Tabla nombre libro
        TRSFiltro.setRowFilter(RowFilter.regexFilter(txtNombreLibro.getText(), ColumnTable));
    }
    
    public void Filtro4() {
        int ColumnTable = 3; //Tabla cantidad libros
        TRSFiltro.setRowFilter(RowFilter.regexFilter(txtCantidadLibros.getText(), ColumnTable));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel TextoBuscarpor;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel panelBuscarPor;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JTextField txtCantidadLibros;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
