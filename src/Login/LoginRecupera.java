/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import ConexionSQL.ConexionBD;
import PagInicio.MenuInicio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan_
 */
public class LoginRecupera extends javax.swing.JFrame {

   ConexionBD cn = new ConexionBD();
   Connection con=cn.getConection();
    
    public LoginRecupera() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void RecuperarPass(){
        int resultado = 0;
        
        try {
            String Mascota=txtMascota.getText();
            String Escuela=txtSecundaria.getText();
            String clave="123456789";
            
            String sql="SELECT * FROM usuario WHERE nom_amigo='"+Mascota+"' and escuela='"+Escuela+"'";
            
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next()){
            resultado=1;
             
        
       JOptionPane.showMessageDialog(null,"Gracias, tu contraseña es: "+ clave);
       PruebaLogin PL= new PruebaLogin();
       PL.setVisible(true);
       
      this.dispose();
        
             
   
             }else{
             JOptionPane.showMessageDialog(null,"Usuario/Contraseña Incorrecta");
                        
            }
            
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null,"Error de conección");
        }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel2 = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtSecundaria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagInicio/img/Recuperacion.fw.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("¿Cuál es el nombre de tu mejor amigo de la infancia?");
        panelImage1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtMascota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelImage1.add(txtMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 410, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("¿Cuál es el nombre de tu escuela secundaria?");
        panelImage1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        panelImage1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 160, 30));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Recupear contraseña");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        panelImage1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 30));

        txtSecundaria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecundariaActionPerformed(evt);
            }
        });
        panelImage1.add(txtSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 410, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        
       PruebaLogin PL= new PruebaLogin();
       PL.setVisible(true);
       
      this.dispose();
       
              
       
       
     
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecundariaActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    RecuperarPass();

    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(LoginRecupera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRecupera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRecupera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRecupera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRecupera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtSecundaria;
    // End of variables declaration//GEN-END:variables
}
