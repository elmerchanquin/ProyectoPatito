
package proyectopatito;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class BorrarRegistros extends javax.swing.JFrame {

    DefaultTableModel modeloPatito;
    
    public BorrarRegistros() {
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
            sql = "select * from clientes where nombre LIKE '%"+filtro+"%'";
            
            PreparedStatement statementPatito = conexionPatito.prepareStatement(sql);
            ResultSet resultsetPatito = statementPatito.executeQuery(sql);
             
             while (resultsetPatito.next()){
                registros [0] = resultsetPatito.getString("codigo");
                registros [1] = resultsetPatito.getString("nombre");
                registros [2] = resultsetPatito.getString("direccion");
                registros [3] = resultsetPatito.getString("telefono");
                registros [4] = resultsetPatito.getString("NIT");
                registros [5] = resultsetPatito.getString("servicio");
                 
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

        jPanel1 = new javax.swing.JPanel();
        etiFiltro = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPatito = new javax.swing.JTable();
        etiCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ELIMINACIÓN DE REGISTROS DE CLIENTES CABLENET PATITO");

        etiFiltro.setText("FLITRO DE AYUDA PARA LOCALIZAR EL REGISTRO");

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

        btnBorrar.setText("BORRAR ESTE REGISTRO");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
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

        etiCodigo.setText("INGRESE EL CODIGO DEL CLIENTE QUE DESEA BORRAR");

        jLabel1.setText("EN EL ESPACIO DE ABAJO POR FAVOR TECLEE EL NOMBRE DEL CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiFiltro)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(etiFiltro)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnSalir))
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuPrincipalPatito menu = new MenuPrincipalPatito();
        menu.setVisible(true);
        dispose();    
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
         
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void txtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyReleased
    coincidencia(txtFiltro.getText());
    }//GEN-LAST:event_txtFiltroKeyReleased

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
    try{
           Conectar conectar = new Conectar();
           Connection conexionPatito = conectar.conexion();
           String sql="";
           sql = "delete from clientes where codigo=?";
           
           PreparedStatement statementPatito = conexionPatito.prepareStatement(sql);        
           statementPatito.setInt(1, Integer.parseInt(txtCodigo.getText()));
           
           int opcion = statementPatito.executeUpdate();
           if (opcion > 0){
               JOptionPane.showMessageDialog(null,"El registro del cliente SE BORRO de la Base de Datos");
           }else{
                JOptionPane.showMessageDialog(null,"Registro NO BORRADO - por favor revise");
           }
           
           conexionPatito.close();               
           }catch (SQLException e){
        System.out.println(e.getMessage());
        }                      
        
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(BorrarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPatito;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiCodigo;
    private javax.swing.JLabel etiFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables


}
