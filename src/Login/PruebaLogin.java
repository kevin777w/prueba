
package Login;

import ConexionSQL.ConexionBD;
import PagInicio.MenuInicio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PruebaLogin extends javax.swing.JFrame {
    
    ConexionBD cn = new ConexionBD();
    Connection con=cn.getConection();
    
    
    
    public PruebaLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void ValidarAcceso(){
        int resultado = 0;
        
        try {
            String Usuario=txtUsuario.getText();
            String pass=String.valueOf(txtPass.getPassword());
            String sql="SELECT * FROM usuario WHERE nom_usuario='"+Usuario+"' and PASSWORD='"+pass+"'";
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next()){
                resultado=1;
                
        JOptionPane.showMessageDialog(null,"Bienvenido "+txtUsuario.getText());    
        MenuInicio MI = new MenuInicio();
        MI.setVisible(true);
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

        Login = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRecuperar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblUsuario.setText("Usuario:");
        Login.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(153, 153, 153));
        lblContraseña.setText("Contraseña:");
        Login.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 204, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        Login.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 260, 30));

        txtPass.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(102, 204, 255));
        Login.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 260, 30));

        btnEntrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        Login.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 90, 40));

        jButton3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Salir");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Login.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, -1));

        jRecuperar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRecuperar.setForeground(new java.awt.Color(255, 0, 51));
        jRecuperar.setText("¿Olvidaste tu contraseña?");
        jRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRecuperarMouseClicked(evt);
            }
        });
        Login.add(jRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Login.fw.png"))); // NOI18N
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
      
      
    
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
    
    ValidarAcceso();
    
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jRecuperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRecuperarMouseClicked
        LoginRecupera RC = new LoginRecupera();
        RC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRecuperarMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jRecuperar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
