package Vista;

import Controlador.Controladora;


public class PrincipalEspecialista extends javax.swing.JFrame {
    Controladora control;
    
    public PrincipalEspecialista(Controladora control) {
        initComponents();
        control.colocarImagen(FONDO, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO1, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO2, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO3, "/Iconos/fondo.jpg");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        pestanasLoginEspecialista = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        FONDO4 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        FONDO5 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        FONDO6 = new javax.swing.JLabel();
        FONDO1 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jPanel53 = new javax.swing.JPanel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        FONDO3 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        FONDO2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Especialista");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(3, 4, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel8.setBackground(new java.awt.Color(26, 27, 105));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tratamientos");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarIcon.png"))); // NOI18N
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 45, 45));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 55));

        jPanel9.setBackground(new java.awt.Color(26, 27, 105));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pacientes");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultarIcon.png"))); // NOI18N
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 45, 45));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 200, 55));

        jPanel10.setBackground(new java.awt.Color(26, 27, 105));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ganancias");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gananciasIcon.png"))); // NOI18N
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 45, 45));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 55));

        jPanel16.setBackground(new java.awt.Color(26, 27, 105));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Salir");
        jPanel16.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 200, 55));

        jPanel29.setBackground(new java.awt.Color(26, 27, 105));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Iniciar sesión");
        jPanel29.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 385, 200, 55));

        jButton12.setBackground(new java.awt.Color(109, 104, 117));
        jButton12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Volver al inicio");
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 160, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 760));

        pestanasLoginEspecialista.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(239, 246, 224));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox14.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox14.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por Codigo" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 200, -1));

        jTable2.setBackground(new java.awt.Color(109, 104, 117));
        jTable2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Codigo", "Nombre", "Tratamientos", "Total $", "Total Bs"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 780, 220));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupaIcon.png"))); // NOI18N
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 35, 35));

        jComboBox15.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox15.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox15.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 180, -1));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Una vez seleccionada la cita deseada, indique los tratamientos realizados y el monto estimado:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jFormattedTextField3.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField3.setText("$");
        jFormattedTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 120, -1));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Monto en Bolivares:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, -1, -1));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Tratamiento:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jFormattedTextField4.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField4.setText("$");
        jFormattedTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 120, -1));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Monto en Divisas:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, -1, -1));

        jButton5.setBackground(new java.awt.Color(109, 104, 117));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Continuar");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 120, 30));

        jButton6.setBackground(new java.awt.Color(109, 104, 117));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Actualizar");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 120, 30));

        jTextField4.setBackground(new java.awt.Color(109, 104, 117));
        jTextField4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Buscar Por Nombre");
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, -1));

        jFormattedTextField5.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField5.setText("Buscar Por Fecha");
        jFormattedTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel3.add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 200, -1));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Numeracion Dental (de ser necesario):");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setText("awawawaw");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 300, -1));

        jFormattedTextField7.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField7.setText("Al cambio en Bs");
        jFormattedTextField7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel3.add(jFormattedTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 120, -1));

        jFormattedTextField6.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField6.setText("Al cambio en $");
        jFormattedTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel3.add(jFormattedTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 120, -1));

        jPanel25.setBackground(new java.awt.Color(144, 224, 239));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(3, 4, 94));
        jLabel36.setText("Lista de Tratamientos:");
        jPanel25.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(3, 4, 94));
        jLabel32.setText("Rango de Precios expresado en $.");
        jPanel25.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));
        jPanel25.add(FONDO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 900, 730));

        jPanel3.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 100));

        FONDO.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 730));

        pestanasLoginEspecialista.addTab("Registrar Tratamientos", jPanel3);

        jPanel4.setBackground(new java.awt.Color(239, 246, 224));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(109, 104, 117));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Nombre", "Tratamientos", "Total"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(0, 119, 182));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 800, 310));

        jButton1.setBackground(new java.awt.Color(109, 104, 117));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 660, 120, 30));

        jButton2.setBackground(new java.awt.Color(109, 104, 117));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 120, 30));

        jPanel6.setBackground(new java.awt.Color(239, 246, 224));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coloque Fecha Inicial:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD" }));
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 30));

        jComboBox2.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));
        jPanel6.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 30));

        jComboBox3.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA" }));
        jPanel6.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 30, -1, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 340, 80));

        jPanel7.setBackground(new java.awt.Color(239, 246, 224));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coloque Fecha Final:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox4.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD" }));
        jPanel7.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 30, 60, 30));

        jComboBox5.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));
        jPanel7.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 30));

        jComboBox6.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA" }));
        jPanel7.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 30, -1, 30));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 350, 80));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupaIcon.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 35, 35));

        jPanel26.setBackground(new java.awt.Color(144, 224, 239));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(3, 4, 94));
        jLabel37.setText("Consultar Pacientes:");
        jPanel26.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        jPanel26.add(FONDO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 900, 730));

        jPanel4.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 100));

        jPanel51.setBackground(new java.awt.Color(239, 246, 224));
        jPanel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel51.setToolTipText("");
        jPanel51.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField11.setBackground(new java.awt.Color(109, 104, 117));
        jTextField11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText("Buscar Paciente");
        jTextField11.setBorder(null);
        jPanel51.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, -1));

        jPanel4.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 390, 40));

        pestanasLoginEspecialista.addTab("Ver Pacientes", jPanel4);

        jPanel5.setBackground(new java.awt.Color(239, 246, 224));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(3, 4, 94));
        jLabel8.setText("GANANCIAS PAGADAS:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(3, 4, 94));
        jLabel9.setText("GANANCIAS POR COBRAR:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha Inicial:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha Final:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jButton3.setBackground(new java.awt.Color(109, 104, 117));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 660, 120, 30));

        jButton4.setBackground(new java.awt.Color(109, 104, 117));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Continuar");
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, 120, 30));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Hasta: la actualidad.");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 160, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(144, 224, 239));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("500");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 240, 90));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(144, 224, 239));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("500");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 240, 90));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(3, 4, 94));
        jLabel29.setText("GANANCIAS NETAS:");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(3, 4, 94));
        jLabel30.setText("GANANCIAS DE FECHA A FECHA:");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(144, 224, 239));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jTextField7.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("500");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField7)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 240, 90));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBackground(new java.awt.Color(144, 224, 239));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("500");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField9)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 240, 90));

        jComboBox13.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox13.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        jPanel5.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 120, 40));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Indique el mes deseado para conocer la siguiente informacion:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Desde: inicio de empleo.");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 160, -1));

        jPanel27.setBackground(new java.awt.Color(144, 224, 239));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(3, 4, 94));
        jLabel38.setText("Ganancias");
        jPanel27.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));
        jPanel27.add(FONDO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 900, 730));

        jPanel5.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 100));
        jPanel5.add(FONDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 730));

        jPanel52.setBackground(new java.awt.Color(239, 246, 224));
        jPanel52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel52.setToolTipText("");
        jPanel52.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFormattedTextField9.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField9.setText("wa");
        jFormattedTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel52.add(jFormattedTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3, 80, 20));

        jPanel5.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 110, 25));

        jPanel53.setBackground(new java.awt.Color(239, 246, 224));
        jPanel53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel53.setToolTipText("");
        jPanel53.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFormattedTextField10.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField10.setText("wa");
        jFormattedTextField10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel53.add(jFormattedTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 3, 80, 20));

        jPanel5.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 110, 25));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pestanasLoginEspecialista.addTab("Consultar ganancias", jPanel17);

        jPanel23.setBackground(new java.awt.Color(239, 246, 224));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(109, 104, 117));
        jTable3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tratamientos", "Precio Minimo", "Precio Maximo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel23.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 780, 380));

        jButton7.setBackground(new java.awt.Color(109, 104, 117));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Continuar");
        jPanel23.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 120, 30));
        jPanel23.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 35, 35));

        jPanel24.setBackground(new java.awt.Color(144, 224, 239));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(3, 4, 94));
        jLabel35.setText("Lista de Tratamientos:");
        jPanel24.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(3, 4, 94));
        jLabel31.setText("Rango de Precios expresado en $.");
        jPanel24.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));
        jPanel24.add(FONDO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 900, 730));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 900, 100));

        jPanel50.setBackground(new java.awt.Color(239, 246, 224));
        jPanel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel50.setToolTipText("");
        jPanel50.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField10.setBackground(new java.awt.Color(109, 104, 117));
        jTextField10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setText("Buscar Tratamiento");
        jTextField10.setBorder(null);
        jPanel50.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, -1));

        jPanel23.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, 390, 40));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupaIcon.png"))); // NOI18N
        jPanel23.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 35, 35));
        jPanel23.add(FONDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 730));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pestanasLoginEspecialista.addTab("Lista de precios", jPanel22);

        jPanel1.add(pestanasLoginEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 900, 760));

        jPanel12.setBackground(new java.awt.Color(0, 119, 182));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("¡Bienvenido!");
        jPanel12.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 103, -1, -1));

        jTextField2.setBackground(new java.awt.Color(0, 119, 182));
        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Nombre Usuario");
        jTextField2.setBorder(null);
        jPanel12.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Número del Colegiado:");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 320, 200, 30));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Especialidad:");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 30));

        jTextField5.setBackground(new java.awt.Color(0, 119, 182));
        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("aja");
        jTextField5.setBorder(null);
        jPanel12.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoutIcon.png"))); // NOI18N
        jPanel12.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 700, 50, 45));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sede:");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 405, -1, -1));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Sabana Grande");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 445, -1, -1));

        jTextField6.setBackground(new java.awt.Color(0, 119, 182));
        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("aja");
        jTextField6.setBorder(null);
        jPanel12.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, -1));
        jPanel12.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 700, 50, 45));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel FONDO1;
    private javax.swing.JLabel FONDO2;
    private javax.swing.JLabel FONDO3;
    private javax.swing.JLabel FONDO4;
    private javax.swing.JLabel FONDO5;
    private javax.swing.JLabel FONDO6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTabbedPane pestanasLoginEspecialista;
    // End of variables declaration//GEN-END:variables
}
