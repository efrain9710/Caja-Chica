package Formularios;

import Clases.Datos;
import Clases.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Pino
 */

public class frmProyectoUpDele extends javax.swing.JFrame {

    /* Definimos los titulos que llevara la tabla*/
     public String titulos[] = {"ID Proyecto", "Nombre", "Gerente"};
    
    public frmProyectoUpDele() {
        initComponents();
    }

     Datos datos = new Datos();
    
    /* Definimos una tabla modelo y sobreeescribimos el metodo isCellEditable
    para que las columnas y filas de la tabla no se puedan editar*/
    DefaultTableModel tablaModelo = new DefaultTableModel(null, titulos) {
        @Override
        public boolean isCellEditable(int row, int col) {
            return false;
        }

    };
    
    /* Funcion para llenar la tabla cuando abre el formulario */
    public void llenarTabla() {

        try {

            /* Alineamos la columna ID del Proyecto a la derecha */
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.RIGHT);
            tablaProyectos.getColumnModel().getColumn(1).setCellRenderer(tcr);
            
            /* Llamos a la funcion getProyectos la cual nos devuelve todos 
            los proyectos registrados en la base de datos. 
            - Los datos recibidos lo guardamos en el objeto ResulSet para luego
            llenar la tabla con los registros.
            */
            ResultSet rs = datos.getProyectos();

            /* Instaciamos un obejto vector tipo string, el cual nos servira
            para guardar las filas de la tabla. */
            String registro[] = new String[4];

            /* Hacemos un while que mientras en rs hallan datos el ira agregando
            filas a la tabla. */
            while (rs.next()) {

                registro[0] = rs.getString("id_proyecto");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("nombre");
                tablaModelo.addRow(registro);

            }

            tablaProyectos.setModel(tablaModelo);
        } catch (SQLException ex) {
            Logger.getLogger(frmProyectoUpDele.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

     /* Funcion para llenar la tabla cuando se busque un proyecto en especifico
    por el nombre */
    public void llenarTabla(String nombre) {

        try {
            /* Limpiamos la tabla */
            tablaModelo.setRowCount(0);
            
             /* Llamos a la funcion getProyectosNom la cual nos devuelve todos 
            los proyectos relaciones con el nombre a buscar en la base de datos. 
            
            - Los datos recibidos lo guardamos en el objeto ResulSet para luego
            llenar la tabla con los registros.
            
            */
            ResultSet rs = datos.getProductoNom(nombre);

            String registro[] = new String[4];

            /* Hacemos un while que mientras en rs hallan datos el ira agregando
            filas a la tabla. */
            while (rs.next()) {

                registro[0] = rs.getString("id_proyecto");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("nombre");
                tablaModelo.addRow(registro);

            }

            tablaProyectos.setModel(tablaModelo);
        } catch (SQLException ex) {
            Logger.getLogger(frmProyectoUpDele.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        txtIdProyecto = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        txtNombre = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        btnModificar = new org.edisoncor.gui.button.ButtonAction();
        bntCancelar = new org.edisoncor.gui.button.ButtonAction();
        btnEliminar = new org.edisoncor.gui.button.ButtonAction();
        jButton1 = new javax.swing.JButton();
        txtBuscar = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Proyecto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelMetric1.setText("Gestion de Proyectos");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProyectos);

        labelMetric2.setText("ID Proyecto:");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtIdProyecto.setEnabled(false);
        txtIdProyecto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        labelMetric3.setText("Nombre:");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtBuscar.setEnabled(false);
        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        labelMetric4.setText("Buscar:");
        labelMetric4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(359, 359, 359))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                        .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39))))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton1)))
                        .addGap(103, 103, 103)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

        /* Instanciamos el objetos Datos */
        Datos datos = new Datos();

        /* Llamamos al metodo getProyecto para validar si el proyecto esta registrado */
        if(datos.getProyecto(txtNombre.getText())){
            JOptionPane.showMessageDialog(rootPane, "El nombre del proyecto ya"
                + " existe, por favor introduzca uno diferente");
            txtNombre.setText("");
            txtNombre.requestFocusInWindow();
            return;
        }

    }//GEN-LAST:event_txtNombreKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        /* Instanciamos el objetos Datos */
        Datos datos = new Datos();

        /* Validaciones */
        if(txtIdProyecto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el id del proyecto");
            txtIdProyecto.setText("");
            txtIdProyecto.requestFocusInWindow();
            return;
        }

        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre del proyecto");
            txtNombre.setText("");
            txtNombre.requestFocusInWindow();
            return;
        }
        
        /* Llamamos a la funcion modificarProyecto la cual recibe como parametro
        un Integer que es el ID del proyecto y un String que seria el nombre
        del proyecto */

         if(datos.modificarProyecto(Integer.parseInt(txtIdProyecto.getText()), 
                 txtNombre.getText())){
            JOptionPane.showMessageDialog(rootPane, "El Proyecto ha sido "
                + "modificado correctamente ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se ha podido modificar el"
                + "Proyecto, por favor intentelo mas tarde ");

        }
       
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
         /* Instanciamos el objetos Datos */
        Datos datos = new Datos();

        /* Validaciones */
        if(txtIdProyecto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el id del proyecto");
            txtIdProyecto.setText("");
            txtIdProyecto.requestFocusInWindow();
            return;
        }

        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el nombre del proyecto");
            txtNombre.setText("");
            txtNombre.requestFocusInWindow();
            return;
        }
        
        /* Llamamos a la funcion ElinarProyecto la cual recibe como parametro
        un Integer que es el ID del proyecto  */

         if(datos.eliminarProyecto(Integer.parseInt(txtIdProyecto.getText()))){
            JOptionPane.showMessageDialog(rootPane, "El Proyecto ha sido "
                + "eliminado correctamente ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se ha podido eliminar el"
                + "Proyecto, por favor intentelo mas tarde ");

        }
         
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /* Cuando el formulario se abra llenamos la tabla */
          llenarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
        /* Cuando el usuario digite en el campo txt Buscar y tabulee
        llenamos la tabla con la busqueda */
        llenarTabla(txtNombre.getText());
        
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        /* Variable que contendra el ID de la fila seleccionada */
        int s = 0;
        
        /* Limpiamos los txt, idProyecto y Nombre */
        txtIdProyecto.setText("");
        txtNombre.setText("");
        
        /* Guardamos el ID de dla fila selecciona en la variable s*/
         s = tablaProyectos.getSelectedRow();
         
         /* Validamos que hallan seleccionado */
         if (s < 0) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un proyecto");
                return;
            }
         
         /* Llenamos el campo IDProyecto con el ID de la fila seleccionada 
         
         - Como la funcion getValueAt recibe como parametro, el numero de la fila
         y el numero de la columna y devuelve como parametro un Objeto y el campo
         txt recibe es un String, hay que hacer la conversion de objeto a String.
         Para eso utilizamos el metodo de la clase Utilidades objetoToString
         que me transforma un objeto a String.
         
         */
         txtIdProyecto.setText(Utilidades.objectToString(tablaProyectos.getValueAt(s, 0)));
         
         /* Llenamos el campo nombre con el nombre de la fila seleccionada 
         
         - Como la funcion getValueAt recibe como parametro, el numero de la fila
         y el numero de la columna y devuelve como parametro un Objeto y el campo
         txt recibe es un String, hay que hacer la conversion de objeto a String.
         Para eso utilizamos el metodo de la clase Utilidades objetoToString
         que me transforma un objeto a String.
         */
         txtNombre.setText(Utilidades.objectToString(tablaProyectos.getValueAt(s, 1)));
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_bntCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmProyectoUpDele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProyectoUpDele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProyectoUpDele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProyectoUpDele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProyectoUpDele().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAction bntCancelar;
    private org.edisoncor.gui.button.ButtonAction btnEliminar;
    private org.edisoncor.gui.button.ButtonAction btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JTable tablaProyectos;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtBuscar;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtIdProyecto;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txtNombre;
    // End of variables declaration//GEN-END:variables
}
