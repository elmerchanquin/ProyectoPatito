
package proyectopatito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ModificarRegistros extends javax.swing.JFrame {

    DefaultTableModel modeloPatito;
    
    public ModificarRegistros() {
        initComponents();
        setLocationRelativeTo(null);
        coincidencia("");
    }
    
    public void coincidencia(String filtro){
        
        try{
            String [] titulos = {"CODIGO", "NOMBRE", "DIRECCION", "TELEFONO", "NIT", "SERVICIO"};
            String [] registros = new String [6];

            modeloPatito = new DefaultTableModel(null, titulos);
            
            Conectar conectar = new Conectar();
            Connection conexionPatito = conectar.conexion();

            String sql = "";
            sql = "SELECT clientes.codigo, clientes.nombre, clientes.direccion, clientes.telefono, clientes.NIT, servicios.nombre as sev FROM clientes "
            + "JOIN servicios ON servicios.codigo = clientes.servicio where clientes.nombre LIKE '%"+filtro+"%'";
            
            PreparedStatement statementPatito = conexionPatito.prepareStatement(sql);
            ResultSet resultsetPatito = statementPatito.executeQuery(sql);
            
             while (resultsetPatito.next()){
                registros [0] = resultsetPatito.getString("codigo");
                registros [1] = resultsetPatito.getString("nombre");
                registros [2] = resultsetPatito.getString("direccion");
                registros [3] = resultsetPatito.getString("telefono");
                registros [4] = resultsetPatito.getString("NIT");
                registros [5] = resultsetPatito.getString("sev");
            
                 modeloPatito.addRow(registros);    
            }
            TablaPatito.setModel(modeloPatito);
        }catch (SQLException e){
     System.out.println(e.getMessage());
    }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SERVICIOS = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etiFiltro = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPatito = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNIT = new javax.swing.JTextField();
        txtServicio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        opcUno = new javax.swing.JRadioButton();
        opcDos = new javax.swing.JRadioButton();
        opcTres = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MODIFICACIÓN DE REGISTROS DE CLIENTES PATITO");

        etiFiltro.setText("FLITRO DE AYUDA PARA LOCALIZAR EL REGISTRO");

        txtFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE DEL CLIENTE"));
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroKeyReleased(evt);
            }
        });

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel3.setText("EN EL CUADRO DE ABAJO SE MUESTRAN LAS COINCIDENCIAS DE LA BUSQUEDA");

        btnSalir.setText("SALIR AL MENU PRINCIPAL");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        TablaPatito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaPatito.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TablaPatito);

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("DIRECCIÓN"));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("TELÉFONO"));

        txtNIT.setBorder(javax.swing.BorderFactory.createTitledBorder("NIT"));

        txtServicio.setEditable(false);
        txtServicio.setAutoscrolls(false);
        txtServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("SERVICIO ACTUAL"));

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CÓDIGO DEL CLIENTE"));

        btnActualizar.setText("ACTUALIZAR ESTE REGISTRO");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel10.setText("SELECCIONE EL SERVICIO NUEVO");

        SERVICIOS.add(opcUno);
        opcUno.setText("Cable");

        SERVICIOS.add(opcDos);
        opcDos.setText("Internet");

        SERVICIOS.add(opcTres);
        opcTres.setText("Cable e Internet");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFiltro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiFiltro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(88, 88, 88)))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(57, 57, 57)
                        .addComponent(btnSalir))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnConsultar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtNIT, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtServicio))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(opcUno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(opcDos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(opcTres))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(etiFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultar)))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(opcUno)
                            .addComponent(opcDos)
                            .addComponent(opcTres))
                        .addGap(18, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizar)
                            .addComponent(btnSalir)))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed

    }//GEN-LAST:event_txtFiltroActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
        coincidencia(txtFiltro.getText());
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    try{
           Conectar conectar = new Conectar();
           Connection conexionPatito = conectar.conexion();
           String sql="";
            sql = "SELECT clientes.codigo, clientes.nombre, clientes.direccion, clientes.telefono, clientes.NIT, servicios.nombre as sev FROM clientes "
            + "JOIN servicios ON servicios.codigo = clientes.servicio where clientes.codigo=?";
           PreparedStatement statementPatito = conexionPatito.prepareStatement(sql);
           statementPatito.setString(1, txtCodigo.getText());
           ResultSet resultsetPatito = statementPatito.executeQuery();
           if (resultsetPatito.next()){
               txtNombre.setText(resultsetPatito.getString("nombre"));
               txtDireccion.setText(resultsetPatito.getString("direccion"));
               txtTelefono.setText(resultsetPatito.getString("telefono"));
               txtNIT.setText(resultsetPatito.getString("NIT"));
               txtServicio.setText(resultsetPatito.getString("sev"));
               
           }else{
               JOptionPane.showMessageDialog(null,"No exite la persona");
           } 
           conexionPatito.close();
                          
    }catch (SQLException e){
        System.out.println(e.getMessage());
        }                      

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuPrincipalPatito menu = new MenuPrincipalPatito();
        menu.setVisible(true);        
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        
    int paraServicio=0;
        if (opcUno.isSelected()){
        paraServicio = 1;
    }else if(opcDos.isSelected()){
        paraServicio = 2;   
    }else if(opcTres.isSelected()){
       paraServicio = 3;
    }
        try{
           Conectar conectar = new Conectar();
           Connection conexionPatito = conectar.conexion();
           String sql="";
           sql = "update clientes SET  nombre=?, direccion=?, telefono=?, NIT=?, servicio=? where codigo=?";
          
           PreparedStatement statementPatito = conexionPatito.prepareStatement(sql);
           statementPatito.setString(1, txtNombre.getText());
           statementPatito.setString(2, txtDireccion.getText());
           statementPatito.setString(3, txtTelefono.getText());
           statementPatito.setString(4, txtNIT.getText());
           statementPatito.setInt(5, paraServicio);
           statementPatito.setString(6, txtCodigo.getText());
                     
           int respuesta = statementPatito.executeUpdate();
           
           if (respuesta>0){
               JOptionPane.showMessageDialog(null,"Registro ACTUALIZADO");
           }else{
                JOptionPane.showMessageDialog(null,"NO se pudo actualizar el registro");
           }
       
            conexionPatito.close();
       }catch (SQLException e){
        System.out.println(e.getMessage());
        } 
        
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtNIT.setText("");
        txtServicio.setText("");
        SERVICIOS.clearSelection();
        txtFiltro.setText("");

    }//GEN-LAST:event_btnActualizarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup SERVICIOS;
    private javax.swing.JTable TablaPatito;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiFiltro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opcDos;
    private javax.swing.JRadioButton opcTres;
    private javax.swing.JRadioButton opcUno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNIT;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
