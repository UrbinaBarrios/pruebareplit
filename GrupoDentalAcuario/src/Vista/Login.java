package Vista;

import Controlador.Controladora;

public class Login extends javax.swing.JFrame {
    Controladora control= new Controladora();
    public Login() {
        initComponents();
        control.iniciaVentana (this,"src/Iconos/logo acuario dental 2.png");
        control.colocarImagen(FONDO, "/Iconos/fondo.jpg");
        control.colocarImagen(fotito, "/Iconos/Grupo Dental Acuario.png");
        control.ponerField(user);
        control.ponerField(password);
    }
    
    public Login(Controladora control){
        this.control= control;
        control.iniciaVentana (this,"src/Iconos/logo acuario dental 2.png");
        control.colocarImagen(FONDO, "/Iconos/fondo.jpg");
        control.ponerField(user);
        control.ponerField(password);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        error = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnAdmin = new javax.swing.JButton();
        btnEspec = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fotito = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(109, 104, 117));
        setPreferredSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(3, 4, 94));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(3, 4, 94));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido de Vuelta!");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 5, -1, -1));

        jPanel5.setBackground(new java.awt.Color(3, 4, 94));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 150));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(3, 4, 94));
        jPanel7.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(3, 4, 94));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 30, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(0, 51, 153));
        user.setText("Dirección de Correo Electrónico:");
        user.setBorder(null);
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 2, 260, 30));

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, 30));

        jPanel6.setBackground(new java.awt.Color(3, 4, 94));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 30, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 153));
        password.setText("Contraseña");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        jPanel6.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2, 260, 30));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 300, 30));

        jLabel2.setForeground(new java.awt.Color(239, 246, 224));
        jLabel2.setText("Contraseña");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 24));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -15, 310, 130));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, 110, -1, 120));

        jPanel9.setBackground(new java.awt.Color(3, 4, 94));
        jPanel9.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error.setBackground(new java.awt.Color(3, 4, 94));
        error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error.setForeground(new java.awt.Color(153, 0, 0));
        error.setBorder(null);
        error.setFocusable(false);
        error.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel9.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel5.setForeground(new java.awt.Color(239, 246, 224));
        jLabel5.setText("¿No posee una cuenta aún? Registrarse");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jPanel10.setBackground(new java.awt.Color(3, 4, 94));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 119, 182), 30, true));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 119, 182));
        jButton1.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(239, 246, 224));
        jButton1.setText("Iniciar Sesión");
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 0, 270, 30));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 90));

        jPanel8.setBackground(new java.awt.Color(3, 4, 94));
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 20));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(239, 246, 224));
        jLabel4.setText("¿Ha Olvidado su Contraseña?");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(3, 4, 94));
        jCheckBox1.setForeground(new java.awt.Color(239, 246, 224));
        jCheckBox1.setText("Recordarme");
        jCheckBox1.setBorder(null);
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.setFocusable(false);
        jCheckBox1.setInheritsPopupMenu(true);
        jCheckBox1.setName(""); // NOI18N
        jCheckBox1.setRequestFocusEnabled(false);
        jCheckBox1.setRolloverEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel8.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 20));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        btnAdmin.setText("Administrador");
        btnAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminMouseClicked(evt);
            }
        });
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 140, -1));

        btnEspec.setText("Especialista");
        btnEspec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEspecMouseClicked(evt);
            }
        });
        jPanel1.add(btnEspec, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 670));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(fotito, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 300, 300));
        jPanel2.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 670));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 570, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        PrincipalAdministrador admin= new PrincipalAdministrador(control);
        control.validarUsuario(user,password,this,admin,error);
        control.activaVentana(admin, this);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrincipalAdministrador admin= new PrincipalAdministrador(control);
        control.validarUsuario(user,password,this,admin,error);
        control.activaVentana(admin, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminMouseClicked
        PrincipalAdministrador admin= new PrincipalAdministrador(control);
        control.activaVentana(admin,this);
    }//GEN-LAST:event_btnAdminMouseClicked

    private void btnEspecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEspecMouseClicked
        PrincipalEspecialista esp= new PrincipalEspecialista(control);
        control.activaVentana(esp,this);
    }//GEN-LAST:event_btnEspecMouseClicked

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
        if(user.getText().equals("Dirección de Correo Electrónico:")){
           user.setText(null);
           user.requestFocus();
           control.quitarField(user);
        }
    }//GEN-LAST:event_userFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
        if (user.getText().length()==0){
            control.ponerField(user);
            user.setText("Dirección de Correo Electrónico:");
        }
    }//GEN-LAST:event_userFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getText().equals("Contraseña")){
           password.setText(null);
           password.requestFocus();
           control.quitarField(password);
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().length()==0){
            control.ponerField(password);
            password.setText("Contraseña");
        }
    }//GEN-LAST:event_passwordFocusLost
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEspec;
    private javax.swing.JTextField error;
    private javax.swing.JLabel fotito;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
