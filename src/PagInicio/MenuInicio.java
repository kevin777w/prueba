
package PagInicio;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class MenuInicio extends javax.swing.JFrame {

   
   public static final String URL = "jdbc:mysql://localhost:3306/optica 3";
   public static final String USERNAME = "root";
   public static final String PASSWORD ="";
   PreparedStatement ps;
   ResultSet rs;
   
  
 public static Connection getConection(){
    Connection con = null;
        
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
                
                
            } catch (Exception e) {
                System.out.println(e);
                
               
        }
        return con;
        }  
   
   
    public MenuInicio() {
        initComponents();
        txtOpto.setVisible(false);
         this.setLocationRelativeTo(null);
 
     
    }

    
   
    
private void LimpiarCajas(){

txtOpto.setText("");
txtNombre.setText("");
txtFecha.setText("");
txtEdad.setText("");
txtGradu.setText("");
txtLente.setText("");
txtArma.setText("");
txtSalud.setText("");
txtObser.setText("");
       
   }
private void LimpiarCajaCon(){
    
            txtCEdad.setText("");
            txtCGradu.setText("");
            txtCLente.setText("");
            txtCArma.setText("");
            txtCSalud.setText("");
            txtCObser.setText("");
            txtCID.setText("");
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPanelInicio = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        txtOpto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGradu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSalud = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtObser = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtArma = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jLabel10 = new javax.swing.JLabel();
        txtBClave = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btbBusID = new javax.swing.JButton();
        btbBusNom = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCGradu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCLente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCArma = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCSalud = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCObser = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnCSelec = new javax.swing.JButton();
        btnCGuardar = new javax.swing.JButton();
        txtCEdad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane1.setForeground(new java.awt.Color(102, 204, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        JPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagInicio/img/FONDOnew.fw_2.png"))); // NOI18N

        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(871, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(502, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        JPanelInicio.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 610));

        jTabbedPane1.addTab("Pagina de Inicio", JPanelInicio);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagInicio/img/gris.jpg"))); // NOI18N

        txtOpto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtOpto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtOpto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtOpto.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Nombre del paciente:");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de registro:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Edad de paciente:");

        txtEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Graduación:");

        txtGradu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGradu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtGradu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Lente:");

        txtLente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtLente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtLente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Problemas de salud:");

        txtSalud.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSalud.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSalud.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Observaciones:");

        txtObser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtObser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtObser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtFecha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(153, 153, 153));
        jTextField11.setText("2018-05-22");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Armazon:");

        txtArma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtArma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtArma.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage2Layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtArma)
                                .addGroup(panelImage2Layout.createSequentialGroup()
                                    .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtObser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtGradu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage2Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(txtOpto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage2Layout.createSequentialGroup()
                                .addGap(429, 429, 429)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(396, 475, Short.MAX_VALUE))
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(txtOpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(34, 34, 34)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGradu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage2Layout.createSequentialGroup()
                        .addComponent(txtArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtObser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(" Nuevo Expediente", jPanel2);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PagInicio/img/gris.jpg"))); // NOI18N
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Busqueda por ID:");
        panelImage3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, -1, -1));

        txtBClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBClaveActionPerformed(evt);
            }
        });
        panelImage3.add(txtBClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 30, 80, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Busqueda por Nombre:");
        panelImage3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        txtBNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panelImage3.add(txtBNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 72, 200, -1));

        Tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tabla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Optometrista", "Nombre", "Fecha", "Edad", "Graduacion", "Lente", "Armazon", "Salud", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tabla);

        panelImage3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 1000, 201));

        btbBusID.setText("Buscar");
        btbBusID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btbBusID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btbBusID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbBusIDMouseClicked(evt);
            }
        });
        panelImage3.add(btbBusID, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 31, 60, 23));

        btbBusNom.setText("Buscar");
        btbBusNom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btbBusNom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btbBusNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbBusNomMouseClicked(evt);
            }
        });
        panelImage3.add(btbBusNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 73, 60, 23));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID:");
        panelImage3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 20, -1));

        txtCID.setEnabled(false);
        panelImage3.add(txtCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 140, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Graduacion:");
        panelImage3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        txtCGradu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCGraduActionPerformed(evt);
            }
        });
        panelImage3.add(txtCGradu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 420, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Lente:");
        panelImage3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));
        panelImage3.add(txtCLente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 420, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Armazon:");
        panelImage3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));
        panelImage3.add(txtCArma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 420, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Salud:");
        panelImage3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));
        panelImage3.add(txtCSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 420, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Observaciones:");
        panelImage3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));
        panelImage3.add(txtCObser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 420, -1));

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        panelImage3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 130, 40));

        btnCSelec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCSelec.setText("Seleccionar");
        btnCSelec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCSelec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCSelecMouseClicked(evt);
            }
        });
        panelImage3.add(btnCSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 130, 40));

        btnCGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCGuardar.setText("Guardar cambios");
        btnCGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCGuardarMouseClicked(evt);
            }
        });
        panelImage3.add(btnCGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 130, 40));
        panelImage3.add(txtCEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 140, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Edad:");
        panelImage3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 47, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consultar/Modificar ", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void txtBClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBClaveActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        Connection con = null;
        
        String opto = "Hugo Gómez Castellanos";
        
        
        try {
        
        
        con = getConection();
        ps = con.prepareStatement("INSERT into expedientes(nom_optometrista,nom_paciente,fecha,edad,graduacion,lente,armazon,prob_salud,observaciones)VALUES(?,?,?,?,?,?,?,?,?)");
            
            
            
             
             ps.setString(1, opto);
             ps.setString(2, txtNombre.getText());
             ps.setDate(3, Date.valueOf(txtFecha.getText()));
             ps.setString(4, txtEdad.getText());
             ps.setString(5, txtGradu.getText());
             ps.setString(6, txtLente.getText());
             ps.setString(7, txtArma.getText());
             ps.setString(8, txtSalud.getText());
             ps.setString(9, txtObser.getText());
             
             int res = ps.executeUpdate();
             if(res>=0){
             JOptionPane.showMessageDialog(null,"El registro fue guardado correctamente"); 
             
             LimpiarCajas();
             }else{
                
             }
             
             con.close();
             
             
             
          
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null,"Error al llenar algun campo"); 
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int i = JOptionPane.showConfirmDialog(null, "Estas seguro de querer salir","Close Message",
        JOptionPane.YES_NO_OPTION);
                
        if(i==0){
        System.exit(0); 
         
        }else{
            
        }
        
       
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btbBusIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbBusIDMouseClicked
       try {
            
            DefaultTableModel modelo = (DefaultTableModel)Tabla.getModel();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/optica 3","root","");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM expedientes WHERE id_expediente="+txtBClave.getText());

            rs.first();
            
            txtBClave.setText("");
            
            do{
                String[] fila= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)};
                modelo.addRow(fila);

            }while(rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(MenuInicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se encontraron registros");

        }
    }//GEN-LAST:event_btbBusIDMouseClicked

    private void btbBusNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbBusNomMouseClicked
         try {

            DefaultTableModel modelo = (DefaultTableModel)Tabla.getModel();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/optica 3","root","");

            Statement stmt = con.createStatement();

            ResultSet Rs = stmt.executeQuery("SELECT * FROM expedientes WHERE nom_paciente LIKE '"+txtBNombre.getText()+"%'");

            Rs.first();
             txtBNombre.setText("");

            do{
                String[] fila= {Rs.getString(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5),Rs.getString(6),Rs.getString(7),Rs.getString(8),Rs.getString(9),Rs.getString(10)};
                modelo.addRow(fila);

            }while(Rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(MenuInicio.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "No se encontraron registros");
        }
    }//GEN-LAST:event_btbBusNomMouseClicked

    private void txtCGraduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCGraduActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCGraduActionPerformed

    private void btnCSelecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCSelecMouseClicked
        int fila = Tabla.getSelectedRow();
        if(fila>=0){
            
            
            txtCID.setText(Tabla.getValueAt(fila, 0).toString());
            txtCEdad.setText(Tabla.getValueAt(fila, 4).toString());
            txtCGradu.setText(Tabla.getValueAt(fila, 5).toString());
            txtCLente.setText(Tabla.getValueAt(fila, 6).toString());
            txtCArma.setText(Tabla.getValueAt(fila, 7).toString());
            txtCSalud.setText(Tabla.getValueAt(fila, 8).toString());
            txtCObser.setText(Tabla.getValueAt(fila, 9).toString());

        }
        else{
            JOptionPane.showMessageDialog(null,"Registro no seleccionado");

        }
    }//GEN-LAST:event_btnCSelecMouseClicked

    private void btnCGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCGuardarMouseClicked
            Connection con = null;
        
       
        try {
            
        con = getConection();
        ps = con.prepareStatement("UPDATE expedientes SET edad=?,graduacion=?,lente=?,armazon=?,prob_salud=?,observaciones=? WHERE id_expediente=?");
            
            
            
         
             ps.setString(1, txtCEdad.getText());
             ps.setString(2, txtCGradu.getText());
             ps.setString(3, txtCLente.getText());
             ps.setString(4, txtCArma.getText());
             ps.setString(5, txtCSalud.getText());
             ps.setString(6, txtCObser.getText());
             ps.setString(7, txtCID.getText());
             
             int res = ps.executeUpdate();
             if(res>0){
             JOptionPane.showMessageDialog(null,"Registro actualizado");
             LimpiarCajaCon();
         
             }else{
             JOptionPane.showMessageDialog(null,"No hay datos para actualizar");   
             }
             
             con.close();
             
             
             
          
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null,"Error de conexión");
        }   
    }//GEN-LAST:event_btnCGuardarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
         Connection con = null;
        
       
        try {
            
        con = getConection();
        ps = con.prepareStatement("DELETE FROM expedientes WHERE id_expediente=? ");
           
                             
             ps.setInt(1, Integer.parseInt(txtCID.getText()));
             
             int res = ps.executeUpdate();
             if(res>=0){
             JOptionPane.showMessageDialog(null,"Registro eliminado");
             LimpiarCajaCon();
         
             }else{
               
             }
             
             con.close();
             
             
             
          
        } catch (Exception ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null,"No hay ID que eliminar");
        }   
    }//GEN-LAST:event_btnEliminarMouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelInicio;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btbBusID;
    private javax.swing.JButton btbBusNom;
    private javax.swing.JButton btnCGuardar;
    private javax.swing.JButton btnCSelec;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField11;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private javax.swing.JTextField txtArma;
    private javax.swing.JTextField txtBClave;
    private javax.swing.JTextField txtBNombre;
    private javax.swing.JTextField txtCArma;
    private javax.swing.JTextField txtCEdad;
    private javax.swing.JTextField txtCGradu;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCLente;
    private javax.swing.JTextField txtCObser;
    private javax.swing.JTextField txtCSalud;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGradu;
    private javax.swing.JTextField txtLente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObser;
    private javax.swing.JTextField txtOpto;
    private javax.swing.JTextField txtSalud;
    // End of variables declaration//GEN-END:variables
}
