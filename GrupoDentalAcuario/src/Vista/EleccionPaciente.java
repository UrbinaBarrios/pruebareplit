package Vista;

import Controlador.Controladora;


public class EleccionPaciente extends javax.swing.JFrame {
    Controladora control;
    public EleccionPaciente(Controladora control) {
        initComponents();
        control.colocarImagen(FONDO, "/Iconos/fondo.jpg");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rbPacienteRegistrado = new javax.swing.JRadioButton();
        rbPacienteNoRegistrado = new javax.swing.JRadioButton();
        jbContinuar = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Status Paciente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 119, 182));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 90));

        jPanel2.setBackground(new java.awt.Color(239, 246, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(239, 246, 224));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione una opción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbPacienteRegistrado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbPacienteRegistrado.setForeground(new java.awt.Color(0, 0, 0));
        rbPacienteRegistrado.setText("Si, el paciente ya se encuentra registrado.");
        rbPacienteRegistrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPacienteRegistradoActionPerformed(evt);
            }
        });
        jPanel3.add(rbPacienteRegistrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, -1));

        rbPacienteNoRegistrado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rbPacienteNoRegistrado.setForeground(new java.awt.Color(0, 0, 0));
        rbPacienteNoRegistrado.setText("No, el paciente no se encuentra registrado.");
        jPanel3.add(rbPacienteNoRegistrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 140));

        jbContinuar.setBackground(new java.awt.Color(109, 104, 117));
        jbContinuar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jbContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jbContinuar.setText("Continuar");
        jPanel2.add(jbContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 228, 110, -1));
        jPanel2.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 410, 280));

        getAccessibleContext().setAccessibleName("Estado Registro de Paciente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbPacienteRegistradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPacienteRegistradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPacienteRegistradoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbContinuar;
    private javax.swing.JRadioButton rbPacienteNoRegistrado;
    private javax.swing.JRadioButton rbPacienteRegistrado;
    // End of variables declaration//GEN-END:variables
}
