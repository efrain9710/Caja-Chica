/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Datos;
import Clases.Opcion;
import Clases.Utilidades;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Victor Pino
 */
public class frmConsultas extends javax.swing.JFrame {

    /**
     * Creates new form frmConsultas
     */
    public frmConsultas() {
        initComponents();
    }

    private void habilitarCampos() {

        if (rbtTodo.isSelected()) {
            /* Bloqueamos los radio button */
            rbtFecha.setEnabled(false);
            rbtFactura.setEnabled(false);
            rbtEmpleado.setEnabled(false);
            rbtServicio.setEnabled(false);
            rbtProveedor.setEnabled(false);

            /* Bloqueamos los campos */
            cmbNumero.setEnabled(false);
            dchFechaInicial.setEnabled(false);
            dchFechaFinal.setEnabled(false);
            cmbEmpleado.setEnabled(false);
            cmbServicio.setEnabled(false);
            cmbProveedor.setEnabled(false);

        } else {
            rbtFecha.setEnabled(true);
            rbtFactura.setEnabled(true);
            rbtEmpleado.setEnabled(true);
            rbtServicio.setEnabled(true);
            rbtProveedor.setEnabled(true);

            if (rbtFecha.isSelected()) {

                dchFechaInicial.setEnabled(true);
                dchFechaFinal.setEnabled(true);
                cmbNumero.setEnabled(false);
                cmbEmpleado.setEnabled(false);
                cmbServicio.setEnabled(false);
                cmbProveedor.setEnabled(false);
            }

            if (rbtFactura.isSelected()) {

                cmbNumero.setEnabled(true);
                dchFechaInicial.setEnabled(false);
                dchFechaFinal.setEnabled(false);
                cmbEmpleado.setEnabled(false);
                cmbServicio.setEnabled(false);
                cmbProveedor.setEnabled(false);

            }

            if (rbtEmpleado.isSelected()) {

                cmbNumero.setEnabled(false);
                dchFechaInicial.setEnabled(false);
                dchFechaFinal.setEnabled(false);
                cmbEmpleado.setEnabled(true);
                cmbServicio.setEnabled(false);
                cmbProveedor.setEnabled(false);

            }

            if (rbtServicio.isSelected()) {

                cmbNumero.setEnabled(false);
                dchFechaInicial.setEnabled(false);
                dchFechaFinal.setEnabled(false);
                cmbEmpleado.setEnabled(true);
                cmbServicio.setEnabled(true);
                cmbProveedor.setEnabled(false);

            }

            if (rbtProveedor.isSelected()) {

                cmbNumero.setEnabled(false);
                dchFechaInicial.setEnabled(false);
                dchFechaFinal.setEnabled(false);
                cmbEmpleado.setEnabled(false);
                cmbServicio.setEnabled(false);
                cmbProveedor.setEnabled(true);

            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        rbtSeleccion = new javax.swing.JRadioButton();
        rbtTodo = new javax.swing.JRadioButton();
        rbtFecha = new javax.swing.JRadioButton();
        rbtFactura = new javax.swing.JRadioButton();
        rbtEmpleado = new javax.swing.JRadioButton();
        rbtServicio = new javax.swing.JRadioButton();
        rbtProveedor = new javax.swing.JRadioButton();
        dchFechaInicial = new com.toedter.calendar.JDateChooser();
        dchFechaFinal = new com.toedter.calendar.JDateChooser();
        cmbNumero = new org.edisoncor.gui.comboBox.ComboBoxRound();
        cmbEmpleado = new org.edisoncor.gui.comboBox.ComboBoxRound();
        cmbServicio = new org.edisoncor.gui.comboBox.ComboBoxRound();
        cmbProveedor = new org.edisoncor.gui.comboBox.ComboBoxRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        btnGenerar = new javax.swing.JButton();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        rbtSeleccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        rbtSeleccion.setText("Seleccion");
        rbtSeleccion.setBorder(null);
        rbtSeleccion.setContentAreaFilled(false);
        rbtSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSeleccionActionPerformed(evt);
            }
        });

        rbtTodo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtTodo.setForeground(new java.awt.Color(255, 255, 255));
        rbtTodo.setText("Todas");
        rbtTodo.setBorder(null);
        rbtTodo.setContentAreaFilled(false);
        rbtTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTodoActionPerformed(evt);
            }
        });

        rbtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtFecha.setForeground(new java.awt.Color(255, 255, 255));
        rbtFecha.setText("Fecha");
        rbtFecha.setBorder(null);
        rbtFecha.setContentAreaFilled(false);
        rbtFecha.setEnabled(false);
        rbtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFechaActionPerformed(evt);
            }
        });

        rbtFactura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtFactura.setForeground(new java.awt.Color(255, 255, 255));
        rbtFactura.setText("Número");
        rbtFactura.setBorder(null);
        rbtFactura.setContentAreaFilled(false);
        rbtFactura.setEnabled(false);
        rbtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFacturaActionPerformed(evt);
            }
        });

        rbtEmpleado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        rbtEmpleado.setText("Empleado");
        rbtEmpleado.setBorder(null);
        rbtEmpleado.setContentAreaFilled(false);
        rbtEmpleado.setEnabled(false);
        rbtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEmpleadoActionPerformed(evt);
            }
        });

        rbtServicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtServicio.setForeground(new java.awt.Color(255, 255, 255));
        rbtServicio.setText("Servicio");
        rbtServicio.setBorder(null);
        rbtServicio.setContentAreaFilled(false);
        rbtServicio.setEnabled(false);
        rbtServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtServicioActionPerformed(evt);
            }
        });

        rbtProveedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbtProveedor.setForeground(new java.awt.Color(255, 255, 255));
        rbtProveedor.setText("Proveedor");
        rbtProveedor.setBorder(null);
        rbtProveedor.setContentAreaFilled(false);
        rbtProveedor.setEnabled(false);
        rbtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtProveedorActionPerformed(evt);
            }
        });

        dchFechaInicial.setEnabled(false);

        dchFechaFinal.setEnabled(false);

        labelMetric1.setText("Fecha Inicial:");

        labelMetric2.setText("Fecha Final:");

        labelMetric4.setText("Número:");

        labelMetric5.setText("Empleado:");

        labelMetric6.setText("Proveedor:");

        labelMetric7.setText("Servicio:");

        btnGenerar.setText("Generar Reporte");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        labelMetric3.setText("Consulta de Facturas");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 247, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(rbtFecha)
                        .addGap(18, 18, 18)
                        .addComponent(rbtFactura)
                        .addGap(18, 18, 18)
                        .addComponent(rbtEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(rbtServicio)))
                .addGap(7, 7, 7)
                .addComponent(rbtProveedor)
                .addGap(233, 233, 233))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMetric6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dchFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dchFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(cmbNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(rbtTodo)
                        .addGap(18, 18, 18)
                        .addComponent(rbtSeleccion))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(btnGenerar)
                        .addGap(53, 53, 53)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbEmpleado, cmbNumero, cmbProveedor, cmbServicio, dchFechaFinal, dchFechaInicial});

        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtTodo)
                    .addComponent(rbtSeleccion))
                .addGap(28, 28, 28)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtFactura)
                    .addComponent(rbtEmpleado)
                    .addComponent(rbtFecha)
                    .addComponent(rbtProveedor)
                    .addComponent(rbtServicio))
                .addGap(33, 33, 33)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dchFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dchFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar)
                    .addComponent(btnCancelar))
                .addGap(69, 69, 69))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbEmpleado, cmbNumero, cmbProveedor, cmbServicio, dchFechaFinal, dchFechaInicial});

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

    private void rbtSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSeleccionActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtSeleccionActionPerformed

    private void rbtTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTodoActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtTodoActionPerformed

    private void rbtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFechaActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtFechaActionPerformed

    private void rbtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFacturaActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtFacturaActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        try {

            String sql = " SELECT factura.id_factura AS factura,"
                    + "factura.fecha_fac AS fecha, "
                    + "CONCAT( proveedor.rif_cedula, '-', proveedor.nom_prove) AS proveedor, "
                    + "CONCAT( personal.nom_per, ' ', personal.ape_per) AS empleado, "
                    + "servicio.nom_servi AS servicio, "
                    + "status.nom_sta AS status, "
                    + "factura.descri_fac AS descripcion, "
                    + "factura.monto AS monto "
                    + "FROM factura "
                    + "INNER JOIN proveedor ON factura.id_proveedor = proveedor.id_proveedor "
                    + "INNER JOIN personal ON factura.id_personal = personal.id_personal "
                    + "INNER JOIN servicio ON factura.id_servicio = servicio.id_servicio "
                    + "INNER JOIN status ON factura.id_status = status.id_status ";

            String filtro = "";

            if (rbtTodo.isSelected()) {
                filtro = "";
            } else {

                if (rbtFecha.isSelected()) {

                    if (dchFechaInicial.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha inicial");
                        dchFechaInicial.requestFocusInWindow();
                        return;
                    }

                    if (dchFechaFinal.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha final");
                        dchFechaFinal.requestFocusInWindow();
                        return;
                    }

                    filtro = "WHERE factura.fecha_fac >= '"
                            + Utilidades.formateDate(dchFechaInicial.getDate())
                            + "' AND factura.fecha_fac <= '"
                            + Utilidades.formateDate(dchFechaFinal.getDate()) + "'";
                }

                if (rbtFactura.isSelected()) {

                    if (cmbNumero.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una factura ");
                        cmbNumero.requestFocusInWindow();
                        return;
                    }

                    filtro = "WHERE factura.id_factura >= "
                            + ((Opcion) cmbNumero.getSelectedItem()).getValor();

                }

                if (rbtEmpleado.isSelected()) {

                    if (cmbEmpleado.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un Empleado");
                        cmbEmpleado.requestFocusInWindow();
                        return;
                    }

                    filtro = "WHERE factura.id_personal = '" + ((Opcion) cmbEmpleado.getSelectedItem()).getValor() + "'";
                }

                if (rbtServicio.isSelected()) {

                    if (cmbServicio.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un servicio");
                        cmbServicio.requestFocusInWindow();
                        return;
                    }

                    filtro = "WHERE factura.id_servicio = '" + ((Opcion) cmbServicio.getSelectedItem()).getValor() + "'";
                }

                if (rbtProveedor.isSelected()) {

                    if (cmbProveedor.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un Proveedor");
                        cmbProveedor.requestFocusInWindow();
                        return;
                    }

                    filtro = "WHERE factura.id_proveedor = '" + ((Opcion) cmbProveedor.getSelectedItem()).getValor() + "'";
                }

            }

            /* Adicionamos el filtro a la consulta */
            sql = sql + filtro;

            /* Instanciamos un objeto de la Clase Datos */
            Datos datos = new Datos();

            /* Con el sql obtenido de la consulta y el filtro se lo pasamos a 
             la funcion getFactura para obtener los datos de la factura */
            JRResultSetDataSource data = new JRResultSetDataSource(datos.getFacturas(sql));

            /* Obtenemos la direccion del reporte*/
            String template = frmFactura.class.getProtectionDomain().getCodeSource().getLocation().getPath();

            File aux = new File(template);

            /* Aqui comprobamos si el reporte se mando a ejecutar desde un IDE
             o desde un JAR, si es desde un IDE guardamos la direccion del 
             reporte con System.getProperty("user.dir") + "/src/Reportes/rptFactura.jrxml"; 
             y si no es le pasamos la direccion donde se encuentra el jar */
            if (aux.isDirectory()) {
                template = System.getProperty("user.dir") + "/src/Reportes/rptConsulta.jrxml";
            } else {
                template = aux.getParent() + "/rptConsulta.jrxml";
            }

            /* Le pasamos la direccion del reporte que en este caso es un 
             archivo jrxml, para que lo compile */
            JasperReport jasperReport = JasperCompileManager.compileReport(template);

            /* Una ves compilado se lo pasamos al objeto Jasperprint para que
             arme las consultas y los datos que contendran el reporte, la funcion
             fillReport recibe como parametro:
             - El jasperReport
             - Los parametros 
             - Un objeto que contenga la conexion de la base de datos o un objeto
             ResultSet con lo datos. 
            
             En este caso le pasamos un JRResultSetDataSource con los datos*/
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, data);

            /* Lo hacemos visible en pantalla */
            JasperViewer.viewReport(print);

            JOptionPane.showMessageDialog(null, "Reporte Generado");
        } catch (Exception ex) {
            Logger.getLogger(frmConsultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void rbtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmpleadoActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtEmpleadoActionPerformed

    private void rbtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtProveedorActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtProveedorActionPerformed

    private void rbtServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtServicioActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_rbtServicioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            /* Evento cuando el formulario se abra */

            cmbNumero.setEnabled(false);
            dchFechaInicial.setEnabled(false);
            dchFechaFinal.setEnabled(false);
            cmbEmpleado.setEnabled(false);
            cmbServicio.setEnabled(false);
            cmbProveedor.setEnabled(false);

            /* Instanciamos un objeto de la Clase Datos, para poder acceder a los
             metodos */
            Datos datos = new Datos();

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de las Facturas  */
            Opcion op = new Opcion("0", "Seleccione una Factura ");

            /* Añadimos el primer elemento al combo box */
            cmbNumero.addItem(op);

            /* Llamos a la funcion getFacturas la cual nos devuelve todas las
             facturas que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todas las facturas */
            ResultSet rsFac = datos.getFacturas();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rsFac.next()) {
                op = new Opcion(
                        rsFac.getString("id_factura"),
                        rsFac.getString("id_factura"));
                cmbNumero.addItem(op);
            }

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de los Empleados  */
            Opcion op2 = new Opcion("0", "Seleccione un Empleado ");

            /* Añadimos el primer elemento al combo box */
            cmbEmpleado.addItem(op2);

            /* Llamos a la funcion getPersonal la cual nos devuelve todo el
             Personal que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todos los Empleados */
            ResultSet rsPer = datos.getPersonal();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rsPer.next()) {
                op2 = new Opcion(
                        rsPer.getString("id_personal"),
                        rsPer.getString("nom_per")
                        + " " + rsPer.getString("ape_per"));
                cmbEmpleado.addItem(op2);
            }

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de los servicios  */
            Opcion op3 = new Opcion("0", "Seleccione un servicio");

            /* Añadimos el primer elemento al combo box */
            cmbServicio.addItem(op3);

            /* Llamos a la funcion getServicios la cual nos devuelve todos los
             Servicios que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todos los Servicios */
            ResultSet rsSer = datos.getServicios();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rsSer.next()) {
                op3 = new Opcion(
                        rsSer.getString("id_servicio"),
                        rsSer.getString("nom_servi"));
                cmbServicio.addItem(op3);
            }

            /* Instaciamos un objeto de la clase Opcion para cargar el combo box
             de los proveedores  */
            Opcion op4 = new Opcion("0", "Seleccione un proveedor");

            /* Añadimos el primer elemento al combo box */
            cmbProveedor.addItem(op4);

            /* Llamos a la funcion getProveedor la cual nos devuelve todos los
             proveedores que hay, esos datos los guardamos en un ResultSet para luego
             llenar el combo box con todos los Proveedores */
            ResultSet rs = datos.getProveedor();

            /* Hacemos un while que mientras hallan registros en rs, sobreescrira
             al objeto de la clase opcion con los datos del objeto rs, y los añada
             al combo box */
            while (rs.next()) {
                op4 = new Opcion(
                        rs.getString("id_proveedor"),
                        rs.getString("rif_cedula")
                        + "-" + rs.getString("nom_prove"));
                cmbProveedor.addItem(op4);
            }

        } catch (SQLException ex) {
            Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbEmpleado;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbNumero;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbProveedor;
    private org.edisoncor.gui.comboBox.ComboBoxRound cmbServicio;
    private com.toedter.calendar.JDateChooser dchFechaFinal;
    private com.toedter.calendar.JDateChooser dchFechaInicial;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.panel.Panel panel1;
    private javax.swing.JRadioButton rbtEmpleado;
    private javax.swing.JRadioButton rbtFactura;
    private javax.swing.JRadioButton rbtFecha;
    private javax.swing.JRadioButton rbtProveedor;
    private javax.swing.JRadioButton rbtSeleccion;
    private javax.swing.JRadioButton rbtServicio;
    private javax.swing.JRadioButton rbtTodo;
    // End of variables declaration//GEN-END:variables
}
