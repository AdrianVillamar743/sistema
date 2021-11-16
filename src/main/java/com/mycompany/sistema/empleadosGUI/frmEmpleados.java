/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistema.empleadosGUI;
import com.mycompany.sistema.empleadosBL.empleadosBL;
import com.mycompany.sistema.empleadosDAL.conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adrian
 */
public class frmEmpleados extends javax.swing.JFrame {
    DefaultTableModel modelo;
    
    /**
     * Creates new form frmEmpleados
     */
    public frmEmpleados() {
        initComponents();
        String [] titulos={"ID","Nombre","Correo"};
        modelo=new DefaultTableModel(null,titulos);
        tbl_empleados.setModel(modelo);
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CORREO"
            }
        ));
        tbl_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_empleados);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Correo");

        jLabel3.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btn_agregar)
                        .addGap(96, 96, 96)
                        .addComponent(btn_editar)
                        .addGap(100, 100, 100)
                        .addComponent(btn_borrar)
                        .addGap(98, 98, 98)
                        .addComponent(btn_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(42, 42, 42))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(16, 16, 16)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(txt_nombre)
                            .addComponent(txt_correo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_editar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_cancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
     conexion objconexion=new conexion();
     empleadosBL Oempleado= recuperarDatosGUI();
     objconexion.ejecutarSentenciaSQL("insert into empleado (nombre,correo) values ('"+Oempleado.getNombre()+"','"+Oempleado.getCorreo()+"')");
    
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btn_agregarActionPerformed

    
    
    public void mostrarDatos(){
          while (modelo.getRowCount()>0){
        modelo.removeRow(0);
   }
        conexion objconexion=new conexion();
        try {
            ResultSet resultado= objconexion.consultarRegistros("select *from empleado");
           while (resultado.next()){
           Object[] oid={    resultado.getString("id"),resultado.getString("nombre"),resultado.getString("correo")};
           modelo.addRow(oid);
           }
                 
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    
    public empleadosBL recuperarDatosGUI(){
        empleadosBL oEmpleado= new empleadosBL();
        int ID= (txt_id.getText().isEmpty()?0:Integer.parseInt(txt_id.getText())) ;   
        oEmpleado.setId(ID);
        oEmpleado.setNombre(txt_nombre.getText());
        oEmpleado.setCorreo(txt_correo.getText());
        return oEmpleado;
    }
    
    
    
    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void tbl_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadosMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount()==1){
            JTable receptor=(JTable)evt.getSource();
         txt_id.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
         txt_nombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
         txt_correo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
        }
                btn_agregar.setEnabled(false);
        btn_editar.setEnabled(true);
        btn_borrar.setEnabled(true);
    }//GEN-LAST:event_tbl_empleadosMouseClicked

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
          conexion objconexion=new conexion();
     empleadosBL Oempleado= recuperarDatosGUI();
     objconexion.ejecutarSentenciaSQL("delete from empleado where id="+Oempleado.getId());
    
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btn_borrarActionPerformed

    
    
    public void limpiar(){
        txt_id.setText("");
        txt_nombre.setText("");
        txt_correo.setText("");
        btn_agregar.setEnabled(true);
        btn_editar.setEnabled(false);
        btn_borrar.setEnabled(false);

    }
    
    
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
            conexion objconexion=new conexion();
     empleadosBL Oempleado= recuperarDatosGUI();
     objconexion.ejecutarSentenciaSQL("UPDATE empleado SET nombre='"+Oempleado.getNombre()+"' ,correo='"+Oempleado.getCorreo()+"' where id='"+Oempleado.getId()+"'");
        this.mostrarDatos();
        this.limpiar();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
       if (JOptionPane.showConfirmDialog(rootPane, "Desea cancelar la operación actual?",
        "Cancelar", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
          this.limpiar();
 
    }
    }//GEN-LAST:event_btn_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
