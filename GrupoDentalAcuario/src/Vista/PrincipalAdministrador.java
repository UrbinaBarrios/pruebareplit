
package Vista;

import Controlador.Controladora;
import javax.swing.JLabel;


public class PrincipalAdministrador extends javax.swing.JFrame {
    Controladora control;
    private JLabel FONDO;
    
    public PrincipalAdministrador(Controladora control) {
        initComponents();
        this.control=control;
        control.ponerField(nombreEspecialista);
        control.ponerField(apellidoEspecialista);
        control.ponerField(cedulaEspecialista);
        control.ponerField(telefonoEspecialista);
        control.ponerField(correoEspecialista);
        control.ponerField(especialidadEspecialista);
        control.ponerField(codigoEspecialista);
        control.ponerField(direccionEspecialista);
        control.ponerField(nombreEspecialista1);
        control.ponerField(apellidoPaciente1);
        control.ponerField(cedulaEspecialista1);
        control.ponerField(telefonoEspecialista1);
        control.ponerField(correoEspecialista1);
        control.ponerField(especialidadEspecialista1);
        control.ponerField(codigoEspecialista1);
        control.ponerField(direccionEspecialista1);
        
  
        control.colocarImagen(FONDO1, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO2, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO3, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO4, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO5, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO6, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO7, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO8, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO9, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO10, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO11, "/Iconos/fondo.jpg");
        control.colocarImagen(FONDO12, "/Iconos/fondo.jpg");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pestañasPrincipales = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEspecialistas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGeneral = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCitas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        FONDO4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        iconoAñadir = new javax.swing.JLabel();
        btnModificarEliminar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        iconoModificar = new javax.swing.JLabel();
        btnVerLista = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        iconoVerLista = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        pestañasEspecialistas = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        nombreEspecialista = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        apellidoEspecialista = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        cedulaEspecialista = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        direccionEspecialista = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        telefonoEspecialista = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        correoEspecialista = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        especialidadEspecialista = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        codigoEspecialista = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        FONDO9 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        nombreEspecialista1 = new javax.swing.JTextField();
        jPanel67 = new javax.swing.JPanel();
        correoEspecialista1 = new javax.swing.JTextField();
        apellidoEspecialista1 = new javax.swing.JPanel();
        apellidoPaciente1 = new javax.swing.JTextField();
        JPanel1000 = new javax.swing.JPanel();
        especialidadEspecialista1 = new javax.swing.JTextField();
        jPanel70 = new javax.swing.JPanel();
        cedulaEspecialista1 = new javax.swing.JTextField();
        jPanel71 = new javax.swing.JPanel();
        codigoEspecialista1 = new javax.swing.JTextField();
        jPanel72 = new javax.swing.JPanel();
        direccionEspecialista1 = new javax.swing.JTextField();
        jPanel73 = new javax.swing.JPanel();
        telefonoEspecialista1 = new javax.swing.JTextField();
        jPanel74 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jPanel75 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jComboBox16 = new javax.swing.JComboBox<>();
        FONDO10 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FONDO11 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        btnAñadir1 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        iconoAñadir1 = new javax.swing.JLabel();
        btnModificar1 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        iconoModificar1 = new javax.swing.JLabel();
        btnVerLista1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        iconoVerLista1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        btnModificar3 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        iconoModificar3 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        Citas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        FONDO8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        Ganancia = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        FONDO2 = new javax.swing.JLabel();
        Culminar = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        FONDO1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        FONDO7 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel48 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel33 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jComboBox23 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jComboBox24 = new javax.swing.JComboBox<>();
        jComboBox25 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jComboBox27 = new javax.swing.JComboBox<>();
        jPanel50 = new javax.swing.JPanel();
        jComboBox29 = new javax.swing.JComboBox<>();
        FONDO6 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jComboBox28 = new javax.swing.JComboBox<>();
        jPanel35 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel38 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel47 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboBox20 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel52 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FONDO5 = new javax.swing.JLabel();
        FONDO12 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jButton8 = new javax.swing.JButton();
        FONDO3 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jComboBox30 = new javax.swing.JComboBox<>();
        jPanel76 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        btnAñadir2 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        iconoAñadir2 = new javax.swing.JLabel();
        btnModificar2 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        iconoModificar2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(239, 246, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(0, 119, 182));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField19.setBackground(new java.awt.Color(0, 119, 182));
        jTextField19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(255, 255, 255));
        jTextField19.setText("Sabana Grande");
        jTextField19.setBorder(null);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 369, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sede:");
        jPanel14.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 335, -1, -1));

        jTextField20.setBackground(new java.awt.Color(0, 119, 182));
        jTextField20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(255, 255, 255));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("Administrador");
        jTextField20.setBorder(null);
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel14.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 280, -1, -1));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cargo:");
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 245, -1, -1));

        jTextField21.setBackground(new java.awt.Color(0, 119, 182));
        jTextField21.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 255, 255));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("Nombre Administrador");
        jTextField21.setBorder(null);
        jPanel14.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 141, 180, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("¡Bienvenido!");
        jPanel14.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 103, -1, -1));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 200, 770));

        jPanel2.setBackground(new java.awt.Color(3, 4, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        btnEspecialistas.setBackground(new java.awt.Color(26, 27, 105));
        btnEspecialistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEspecialistasMouseClicked(evt);
            }
        });
        btnEspecialistas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnEspecialistas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 45, 45));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Especialistas");
        btnEspecialistas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 20));

        jPanel2.add(btnEspecialistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, 70));

        btnGeneral.setBackground(new java.awt.Color(26, 27, 105));
        btnGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGeneralMouseClicked(evt);
            }
        });
        btnGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("General");
        btnGeneral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        btnGeneral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 45, 45));

        jPanel2.add(btnGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 70));

        btnSalir.setBackground(new java.awt.Color(26, 27, 105));
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Salir");
        btnSalir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 270, 70));

        btnCitas.setBackground(new java.awt.Color(26, 27, 105));
        btnCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCitasMouseClicked(evt);
            }
        });
        btnCitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnCitas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 45, 45));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Citas");
        btnCitas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(btnCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 270, 70));

        btnIniciarSesion.setBackground(new java.awt.Color(26, 27, 105));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
        });
        btnIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Volver a iniciar sesión");
        btnIniciarSesion.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel2.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 770));

        jPanel30.setBackground(new java.awt.Color(144, 224, 239));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 840, 100));
        jPanel1.add(FONDO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 0, 840, 740));

        pestañasPrincipales.addTab("Inicio", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(3, 4, 94));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ESPECIALISTAS");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 46));

        btnAñadir.setBackground(new java.awt.Color(26, 27, 105));
        btnAñadir.setPreferredSize(new java.awt.Dimension(210, 65));
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMouseClicked(evt);
            }
        });
        btnAñadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Añadir");
        btnAñadir.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        btnAñadir.add(iconoAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 54, 60));

        jPanel5.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 330, 55));

        btnModificarEliminar.setBackground(new java.awt.Color(26, 27, 105));
        btnModificarEliminar.setPreferredSize(new java.awt.Dimension(210, 65));
        btnModificarEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarEliminarMouseClicked(evt);
            }
        });
        btnModificarEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Modificar/Eliminar");
        btnModificarEliminar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 204, -1));
        btnModificarEliminar.add(iconoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 54, 60));

        jPanel5.add(btnModificarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 330, 55));

        btnVerLista.setBackground(new java.awt.Color(26, 27, 105));
        btnVerLista.setForeground(new java.awt.Color(255, 255, 255));
        btnVerLista.setPreferredSize(new java.awt.Dimension(210, 65));
        btnVerLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerListaMouseClicked(evt);
            }
        });
        btnVerLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ver lista");
        btnVerLista.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        btnVerLista.add(iconoVerLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 56, 60));

        jPanel5.add(btnVerLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 330, 55));

        btnInicio.setBackground(new java.awt.Color(109, 104, 117));
        btnInicio.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Volver al inicio");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        jPanel5.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 160, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 340, 720));

        pestañasEspecialistas.setPreferredSize(new java.awt.Dimension(980, 750));

        jPanel6.setBackground(new java.awt.Color(239, 246, 224));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(940, 700));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(144, 224, 239));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(3, 4, 94));
        jLabel13.setText("Indique los datos del especialista");
        jPanel16.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 640, 65));

        jPanel6.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1064, 100));

        jPanel7.setBackground(new java.awt.Color(239, 246, 224));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel7.setToolTipText("");
        jPanel7.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        nombreEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nombreEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        nombreEspecialista.setText("Nombre:");
        nombreEspecialista.setBorder(null);
        nombreEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreEspecialistaFocusLost(evt);
            }
        });
        nombreEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEspecialistaActionPerformed(evt);
            }
        });
        jPanel7.add(nombreEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 360, 40));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 380, 40));

        jPanel17.setBackground(new java.awt.Color(239, 246, 224));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel17.setToolTipText("");
        jPanel17.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apellidoEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        apellidoEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        apellidoEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        apellidoEspecialista.setText("Apellido:");
        apellidoEspecialista.setBorder(null);
        apellidoEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoEspecialistaFocusLost(evt);
            }
        });
        apellidoEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoEspecialistaActionPerformed(evt);
            }
        });
        jPanel17.add(apellidoEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 40));

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 380, 40));

        jPanel18.setBackground(new java.awt.Color(239, 246, 224));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel18.setToolTipText("");
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        cedulaEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cedulaEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        cedulaEspecialista.setText("Cedula/Rif:");
        cedulaEspecialista.setBorder(null);
        cedulaEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaEspecialistaFocusLost(evt);
            }
        });
        cedulaEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaEspecialistaActionPerformed(evt);
            }
        });
        jPanel18.add(cedulaEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 270, 40));

        jPanel6.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 290, 40));

        jPanel19.setBackground(new java.awt.Color(239, 246, 224));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel19.setToolTipText("");
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        direccionEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        direccionEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        direccionEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        direccionEspecialista.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        direccionEspecialista.setText("Dirección:");
        direccionEspecialista.setBorder(null);
        direccionEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionEspecialistaFocusLost(evt);
            }
        });
        direccionEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionEspecialistaActionPerformed(evt);
            }
        });
        jPanel19.add(direccionEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 60));

        jPanel6.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 390, 60));

        jPanel20.setBackground(new java.awt.Color(239, 246, 224));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel20.setToolTipText("");
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefonoEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        telefonoEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        telefonoEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        telefonoEspecialista.setText("Teléfono:");
        telefonoEspecialista.setBorder(null);
        telefonoEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoEspecialistaFocusLost(evt);
            }
        });
        telefonoEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoEspecialistaActionPerformed(evt);
            }
        });
        jPanel20.add(telefonoEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel6.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 400, 40));

        jComboBox1.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox1.setFont(new java.awt.Font("Optima", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "E", "P" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, 40));

        jPanel11.setBackground(new java.awt.Color(109, 104, 117));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 10, true));
        jPanel11.setForeground(new java.awt.Color(109, 104, 117));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Edad:");

        jComboBox2.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 150, 50));

        jPanel21.setBackground(new java.awt.Color(109, 104, 117));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 10, true));
        jPanel21.setForeground(new java.awt.Color(109, 104, 117));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sexo:");

        jComboBox3.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 180, 50));

        jPanel23.setBackground(new java.awt.Color(239, 246, 224));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel23.setToolTipText("");
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        correoEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        correoEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        correoEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        correoEspecialista.setText("Correo:");
        correoEspecialista.setBorder(null);
        correoEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoEspecialistaFocusLost(evt);
            }
        });
        correoEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoEspecialistaActionPerformed(evt);
            }
        });
        jPanel23.add(correoEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel6.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 400, 40));

        jPanel24.setBackground(new java.awt.Color(239, 246, 224));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel24.setToolTipText("");
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        especialidadEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        especialidadEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        especialidadEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        especialidadEspecialista.setText("Especialidad:");
        especialidadEspecialista.setBorder(null);
        especialidadEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                especialidadEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                especialidadEspecialistaFocusLost(evt);
            }
        });
        especialidadEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadEspecialistaActionPerformed(evt);
            }
        });
        jPanel24.add(especialidadEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel6.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 400, 40));

        jPanel25.setBackground(new java.awt.Color(239, 246, 224));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel25.setToolTipText("");
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoEspecialista.setBackground(new java.awt.Color(109, 104, 117));
        codigoEspecialista.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        codigoEspecialista.setForeground(new java.awt.Color(255, 255, 255));
        codigoEspecialista.setText("Código:");
        codigoEspecialista.setBorder(null);
        codigoEspecialista.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codigoEspecialistaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoEspecialistaFocusLost(evt);
            }
        });
        codigoEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEspecialistaActionPerformed(evt);
            }
        });
        jPanel25.add(codigoEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel6.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 400, 40));

        jButton1.setBackground(new java.awt.Color(109, 104, 117));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reiniciar");
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 120, 30));

        jButton3.setBackground(new java.awt.Color(109, 104, 117));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 630, 120, 30));
        jPanel6.add(FONDO9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        pestañasEspecialistas.addTab("Añadir", jPanel6);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jPanel26.setBackground(new java.awt.Color(239, 246, 224));
        jPanel26.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.setPreferredSize(new java.awt.Dimension(940, 700));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(144, 224, 239));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(3, 4, 94));
        jLabel28.setText("Seleccione el Especialista");
        jLabel28.setPreferredSize(new java.awt.Dimension(356, 32));
        jPanel27.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 560, 65));

        jComboBox7.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jPanel27.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 380, 30));

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 990, 100));

        jButton2.setBackground(new java.awt.Color(109, 104, 117));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jPanel26.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 120, 30));

        jPanel22.setBackground(new java.awt.Color(239, 246, 224));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel22.setToolTipText("");
        jPanel22.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEspecialista1.setBackground(new java.awt.Color(109, 104, 117));
        nombreEspecialista1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nombreEspecialista1.setForeground(new java.awt.Color(255, 255, 255));
        nombreEspecialista1.setText("Nombre:");
        nombreEspecialista1.setBorder(null);
        nombreEspecialista1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreEspecialista1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreEspecialista1FocusLost(evt);
            }
        });
        nombreEspecialista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEspecialista1ActionPerformed(evt);
            }
        });
        jPanel22.add(nombreEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 360, 40));

        jPanel26.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 380, 40));

        jPanel67.setBackground(new java.awt.Color(239, 246, 224));
        jPanel67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel67.setToolTipText("");
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        correoEspecialista1.setBackground(new java.awt.Color(109, 104, 117));
        correoEspecialista1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        correoEspecialista1.setForeground(new java.awt.Color(255, 255, 255));
        correoEspecialista1.setText("Correo:");
        correoEspecialista1.setBorder(null);
        correoEspecialista1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoEspecialista1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoEspecialista1FocusLost(evt);
            }
        });
        correoEspecialista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoEspecialista1ActionPerformed(evt);
            }
        });
        jPanel67.add(correoEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel26.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 400, 40));

        apellidoEspecialista1.setBackground(new java.awt.Color(239, 246, 224));
        apellidoEspecialista1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        apellidoEspecialista1.setToolTipText("");
        apellidoEspecialista1.setPreferredSize(new java.awt.Dimension(410, 33));
        apellidoEspecialista1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apellidoPaciente1.setBackground(new java.awt.Color(109, 104, 117));
        apellidoPaciente1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        apellidoPaciente1.setForeground(new java.awt.Color(255, 255, 255));
        apellidoPaciente1.setText("Apellido:");
        apellidoPaciente1.setBorder(null);
        apellidoPaciente1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoPaciente1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoPaciente1FocusLost(evt);
            }
        });
        apellidoPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoPaciente1ActionPerformed(evt);
            }
        });
        apellidoEspecialista1.add(apellidoPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 40));

        jPanel26.add(apellidoEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 380, 40));

        JPanel1000.setBackground(new java.awt.Color(239, 246, 224));
        JPanel1000.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        JPanel1000.setToolTipText("");
        JPanel1000.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        especialidadEspecialista1.setBackground(new java.awt.Color(109, 104, 117));
        especialidadEspecialista1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        especialidadEspecialista1.setForeground(new java.awt.Color(255, 255, 255));
        especialidadEspecialista1.setText("Especialidad:");
        especialidadEspecialista1.setBorder(null);
        especialidadEspecialista1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                especialidadEspecialista1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                especialidadEspecialista1FocusLost(evt);
            }
        });
        especialidadEspecialista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadEspecialista1ActionPerformed(evt);
            }
        });
        JPanel1000.add(especialidadEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel26.add(JPanel1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 400, 40));

        jPanel70.setBackground(new java.awt.Color(239, 246, 224));
        jPanel70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel70.setToolTipText("");
        jPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEspecialista1.setBackground(new java.awt.Color(109, 104, 117));
        cedulaEspecialista1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cedulaEspecialista1.setForeground(new java.awt.Color(255, 255, 255));
        cedulaEspecialista1.setText("Cedula/Rif:");
        cedulaEspecialista1.setBorder(null);
        cedulaEspecialista1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaEspecialista1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaEspecialista1FocusLost(evt);
            }
        });
        cedulaEspecialista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaEspecialista1ActionPerformed(evt);
            }
        });
        jPanel70.add(cedulaEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 270, 40));

        jPanel26.add(jPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 290, 40));

        jPanel71.setBackground(new java.awt.Color(239, 246, 224));
        jPanel71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel71.setToolTipText("");
        jPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoEspecialista1.setBackground(new java.awt.Color(109, 104, 117));
        codigoEspecialista1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        codigoEspecialista1.setForeground(new java.awt.Color(255, 255, 255));
        codigoEspecialista1.setText("Código:");
        codigoEspecialista1.setBorder(null);
        codigoEspecialista1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codigoEspecialista1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoEspecialista1FocusLost(evt);
            }
        });
        codigoEspecialista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEspecialista1ActionPerformed(evt);
            }
        });
        jPanel71.add(codigoEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel26.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 400, 40));

        jPanel72.setBackground(new java.awt.Color(239, 246, 224));
        jPanel72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel72.setToolTipText("");
        jPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        direccionEspecialista1.setBackground(new java.awt.Color(109, 104, 117));
        direccionEspecialista1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        direccionEspecialista1.setForeground(new java.awt.Color(255, 255, 255));
        direccionEspecialista1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        direccionEspecialista1.setText("Dirección:");
        direccionEspecialista1.setBorder(null);
        direccionEspecialista1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionEspecialista1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionEspecialista1FocusLost(evt);
            }
        });
        direccionEspecialista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionEspecialista1ActionPerformed(evt);
            }
        });
        jPanel72.add(direccionEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 60));

        jPanel26.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 390, 60));

        jPanel73.setBackground(new java.awt.Color(239, 246, 224));
        jPanel73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel73.setToolTipText("");
        jPanel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefonoEspecialista1.setBackground(new java.awt.Color(109, 104, 117));
        telefonoEspecialista1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        telefonoEspecialista1.setForeground(new java.awt.Color(255, 255, 255));
        telefonoEspecialista1.setText("Teléfono:");
        telefonoEspecialista1.setBorder(null);
        telefonoEspecialista1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoEspecialista1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoEspecialista1FocusLost(evt);
            }
        });
        telefonoEspecialista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoEspecialista1ActionPerformed(evt);
            }
        });
        jPanel73.add(telefonoEspecialista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1, 380, 40));

        jPanel26.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 400, 40));

        jPanel74.setBackground(new java.awt.Color(109, 104, 117));
        jPanel74.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 10, true));
        jPanel74.setForeground(new java.awt.Color(109, 104, 117));

        jLabel46.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Edad:");

        jComboBox14.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox14.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116" }));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel74Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel46)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 150, 50));

        jPanel75.setBackground(new java.awt.Color(109, 104, 117));
        jPanel75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 10, true));
        jPanel75.setForeground(new java.awt.Color(109, 104, 117));

        jLabel47.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Sexo:");

        jComboBox15.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox15.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 180, 50));

        jButton11.setBackground(new java.awt.Color(109, 104, 117));
        jButton11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Guardar");
        jPanel26.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 630, 120, 30));

        jComboBox16.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox16.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "E", "P" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });
        jPanel26.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, 40));
        jPanel26.add(FONDO10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 980, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pestañasEspecialistas.addTab("Modificar/Eliminar", jPanel15);

        jPanel39.setBackground(new java.awt.Color(239, 246, 224));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(144, 224, 239));
        jPanel40.setPreferredSize(new java.awt.Dimension(545, 142));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(3, 4, 94));
        jLabel19.setText("Lista de especialistas");
        jLabel19.setPreferredSize(new java.awt.Dimension(356, 32));
        jPanel40.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 550, 100));

        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 100));

        jTable1.setBackground(new java.awt.Color(109, 104, 117));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Especialidad", "Citas pendientes", "Ganancias totales"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel39.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 900, 450));
        jPanel39.add(FONDO11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        pestañasEspecialistas.addTab("Ver lista", jPanel39);

        jPanel4.add(pestañasEspecialistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 970, 720));

        pestañasPrincipales.addTab("Gestionar especialistas", jPanel4);

        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel64.setBackground(new java.awt.Color(3, 4, 94));
        jPanel64.setPreferredSize(new java.awt.Dimension(330, 750));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("GESTIÓN GENERAL");
        jPanel64.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 46));

        btnAñadir1.setBackground(new java.awt.Color(26, 27, 105));
        btnAñadir1.setPreferredSize(new java.awt.Dimension(215, 55));
        btnAñadir1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Pacientes");
        btnAñadir1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        btnAñadir1.add(iconoAñadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 54, 53));

        jPanel64.add(btnAñadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 330, 55));

        btnModificar1.setBackground(new java.awt.Color(26, 27, 105));
        btnModificar1.setPreferredSize(new java.awt.Dimension(215, 55));
        btnModificar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Tratamientos");
        btnModificar1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, -1));
        btnModificar1.add(iconoModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 54, 53));

        jPanel64.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 330, 55));

        btnVerLista1.setBackground(new java.awt.Color(26, 27, 105));
        btnVerLista1.setForeground(new java.awt.Color(255, 255, 255));
        btnVerLista1.setPreferredSize(new java.awt.Dimension(215, 55));
        btnVerLista1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Culminar cita");
        btnVerLista1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        btnVerLista1.add(iconoVerLista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 56, 53));

        jPanel64.add(btnVerLista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 330, 55));

        jButton9.setBackground(new java.awt.Color(109, 104, 117));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Volver al inicio");
        jPanel64.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 160, 30));

        btnModificar3.setBackground(new java.awt.Color(26, 27, 105));
        btnModificar3.setPreferredSize(new java.awt.Dimension(215, 55));
        btnModificar3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Ganancias");
        btnModificar3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, -1));
        btnModificar3.add(iconoModificar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 54, 53));

        jPanel64.add(btnModificar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 330, 55));

        jPanel41.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane5.setForeground(new java.awt.Color(3, 4, 94));

        Citas.setBackground(new java.awt.Color(239, 246, 224));
        Citas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPacientes.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tablaPacientes.setForeground(new java.awt.Color(3, 4, 94));
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaPacientes);

        Citas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 840, 430));
        Citas.add(FONDO8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        jPanel13.setBackground(new java.awt.Color(144, 224, 239));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(3, 4, 94));
        jLabel49.setText("Lista de Pacientes");
        jPanel13.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        Citas.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 100));

        jButton17.setBackground(new java.awt.Color(109, 104, 117));
        jButton17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Continuar");
        Citas.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 630, 120, 30));

        jTabbedPane5.addTab("Ver Pacientes", Citas);

        Ganancia.setBackground(new java.awt.Color(239, 246, 224));
        Ganancia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(144, 224, 239));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Ganancia.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 100));
        Ganancia.add(FONDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        jTabbedPane5.addTab("Ver Ganancia", Ganancia);

        Culminar.setBackground(new java.awt.Color(239, 246, 224));
        Culminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(144, 224, 239));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Culminar.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 100));
        Culminar.add(FONDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        jTabbedPane5.addTab("Culminar Cita", Culminar);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(239, 246, 224));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setBackground(new java.awt.Color(109, 104, 117));
        jTable3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
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

        jPanel31.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 820, 330));

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(3, 4, 94));
        jLabel31.setText("Rango de Precios expresdo en $.");
        jPanel31.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        jPanel31.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 35, 35));

        jFormattedTextField10.setBackground(new java.awt.Color(109, 104, 117));
        jFormattedTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField10.setText("Buscar Tratamiento");
        jFormattedTextField10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jFormattedTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField10ActionPerformed(evt);
            }
        });
        jPanel31.add(jFormattedTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 260, -1));

        jButton14.setBackground(new java.awt.Color(109, 104, 117));
        jButton14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Actualizar");
        jPanel31.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 140, 30));

        jButton15.setBackground(new java.awt.Color(109, 104, 117));
        jButton15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Agregar");
        jPanel31.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 140, 30));

        jButton16.setBackground(new java.awt.Color(109, 104, 117));
        jButton16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Modificar");
        jPanel31.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 140, 30));

        jPanel10.setBackground(new java.awt.Color(144, 224, 239));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(3, 4, 94));
        jLabel30.setText("Lista de Tratamientos:");
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel31.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 100));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupaIcon.png"))); // NOI18N
        jPanel31.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 35, 35));
        jPanel31.add(FONDO7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        jPanel12.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 720));

        jTabbedPane5.addTab("Tratamientos", jPanel12);

        jPanel41.add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 980, 720));

        pestañasPrincipales.addTab("General", jPanel41);

        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel48.setBackground(new java.awt.Color(239, 246, 224));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(239, 246, 224));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel51.setBackground(new java.awt.Color(144, 224, 239));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(3, 4, 94));
        jLabel26.setText("Registrar cita");
        jPanel51.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 350, -1));

        jPanel33.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 100));

        jLabel54.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel54.setText("Fecha:");
        jPanel33.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jComboBox21.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox21.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD" }));
        jPanel33.add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 80, 40));

        jComboBox22.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox22.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));
        jPanel33.add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 70, 40));

        jComboBox23.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox23.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA" }));
        jPanel33.add(jComboBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 40));

        jLabel55.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel55.setText("Hora:");
        jPanel33.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jComboBox24.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox24.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HORA" }));
        jPanel33.add(jComboBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 90, 40));

        jComboBox25.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox25.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN" }));
        jComboBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox25ActionPerformed(evt);
            }
        });
        jPanel33.add(jComboBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 90, 40));

        jButton13.setBackground(new java.awt.Color(109, 104, 117));
        jButton13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Guardar cita");
        jPanel33.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 590, 120, 30));

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(109, 104, 117));
        jLabel27.setText("Datos de la cita:");
        jPanel33.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 244, -1));

        jPanel43.setBackground(new java.awt.Color(239, 246, 224));
        jPanel43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel43.setToolTipText("");
        jPanel43.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox27.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox27.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox27.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Especialista" }));
        jPanel43.add(jComboBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, -1));

        jPanel33.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 390, 40));

        jPanel50.setBackground(new java.awt.Color(239, 246, 224));
        jPanel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel50.setToolTipText("");
        jPanel50.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox29.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox29.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox29.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox29.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Paciente" }));
        jPanel50.add(jComboBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, -1));

        jPanel33.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 390, 40));

        FONDO6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel33.add(FONDO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 690));

        jTabbedPane4.addTab("Paciente registrado", jPanel33);

        jPanel32.setBackground(new java.awt.Color(239, 246, 224));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(239, 246, 224));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel34.setToolTipText("");
        jPanel34.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox28.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox28.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox28.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especialista" }));
        jComboBox28.setBorder(null);
        jPanel34.add(jComboBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, -1));

        jPanel32.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 390, 40));

        jPanel35.setBackground(new java.awt.Color(239, 246, 224));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel35.setToolTipText("");
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField11.setBackground(new java.awt.Color(109, 104, 117));
        jTextField11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setText("Correo:");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel35.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, -1));

        jPanel32.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 390, 40));

        jPanel36.setBackground(new java.awt.Color(239, 246, 224));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel36.setToolTipText("");
        jPanel36.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField12.setBackground(new java.awt.Color(109, 104, 117));
        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setText("Apellido:");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel36.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 20));

        jPanel32.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 390, 40));

        jComboBox4.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V", "E", "P" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel32.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, 40));

        jPanel38.setBackground(new java.awt.Color(239, 246, 224));
        jPanel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel38.setToolTipText("");
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField14.setBackground(new java.awt.Color(109, 104, 117));
        jTextField14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setText("Cedula/Rif:");
        jTextField14.setBorder(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel38.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, -1));

        jPanel32.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 280, 40));

        jPanel44.setBackground(new java.awt.Color(239, 246, 224));
        jPanel44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel44.setToolTipText("");
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField16.setBackground(new java.awt.Color(109, 104, 117));
        jTextField16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(255, 255, 255));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField16.setText("Dirección:");
        jTextField16.setBorder(null);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel44.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 40));

        jPanel32.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 390, 60));

        jPanel45.setBackground(new java.awt.Color(239, 246, 224));
        jPanel45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel45.setToolTipText("");
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField17.setBackground(new java.awt.Color(109, 104, 117));
        jTextField17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(255, 255, 255));
        jTextField17.setText("Teléfono:");
        jTextField17.setBorder(null);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel45.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, -1));

        jPanel32.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 390, 40));

        jPanel46.setBackground(new java.awt.Color(109, 104, 117));
        jPanel46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 10, true));
        jPanel46.setForeground(new java.awt.Color(109, 104, 117));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Edad:");

        jComboBox5.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116" }));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel46Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 160, 50));

        jPanel47.setBackground(new java.awt.Color(109, 104, 117));
        jPanel47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 10, true));
        jPanel47.setForeground(new java.awt.Color(109, 104, 117));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Sexo:");

        jComboBox6.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, -1, 50));

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Datos de la cita:");
        jPanel32.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 244, -1));

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Datos personales:");
        jPanel32.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 244, -1));

        jComboBox13.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox13.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD" }));
        jPanel32.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 80, 40));

        jComboBox17.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox17.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));
        jPanel32.add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 70, 40));

        jComboBox18.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox18.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA" }));
        jPanel32.add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 90, 40));

        jComboBox19.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox19.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox19.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HORA" }));
        jPanel32.add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 100, 40));

        jComboBox20.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox20.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN" }));
        jComboBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox20ActionPerformed(evt);
            }
        });
        jPanel32.add(jComboBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 90, 40));

        jButton4.setBackground(new java.awt.Color(109, 104, 117));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Guardar cita");
        jPanel32.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 120, 30));

        jPanel52.setBackground(new java.awt.Color(144, 224, 239));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(3, 4, 94));
        jLabel57.setText("Registrar cita");
        jPanel52.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 350, -1));

        jPanel32.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 100));

        jPanel37.setBackground(new java.awt.Color(239, 246, 224));
        jPanel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel37.setToolTipText("");
        jPanel37.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField13.setBackground(new java.awt.Color(109, 104, 117));
        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setText("Nombre:");
        jTextField13.setBorder(null);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel37.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, -1));

        jPanel32.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 390, 40));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("Hora:");
        jPanel32.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setText("Fecha:");
        jPanel32.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        FONDO5.setText("jLabel57");
        jPanel32.add(FONDO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 690));

        jTabbedPane4.addTab("Paciente nuevo", jPanel32);

        jPanel48.add(jTabbedPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 690));
        jPanel48.add(FONDO12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        jTabbedPane3.addTab("Agregar", jPanel48);

        jPanel49.setBackground(new java.awt.Color(239, 246, 224));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel33.setText("¿Desea modificar algún dato del paciente asociado a esta cita?");
        jPanel49.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setBackground(new java.awt.Color(239, 246, 224));
        jFormattedTextField1.setBorder(null);
        jFormattedTextField1.setForeground(new java.awt.Color(3, 4, 94));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setText("CODIGO");
        jFormattedTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel49.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 20));

        jButton6.setBackground(new java.awt.Color(109, 104, 117));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Continuar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel49.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 140, 30));

        jButton7.setBackground(new java.awt.Color(109, 104, 117));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Actualizar");
        jPanel49.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 140, 30));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel35.setText("Fecha:");
        jPanel49.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel36.setText("Hora:");
        jPanel49.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jComboBox8.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox8.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD" }));
        jPanel49.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 60, 40));

        jComboBox9.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox9.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM" }));
        jPanel49.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 60, 40));

        jComboBox10.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA" }));
        jPanel49.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, 40));

        jComboBox11.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox11.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HORA" }));
        jPanel49.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, 40));

        jComboBox12.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox12.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MIN" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        jPanel49.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, 40));

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel37.setText("Usted se encuentra modificando la cita de código");
        jPanel49.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(239, 246, 224));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCheckBox1.setText("Si, deseo modificar datos del paciente asociado a la cita.");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel49.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel38.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel38.setText("Paciente:");
        jPanel49.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jFormattedTextField3.setEditable(false);
        jFormattedTextField3.setBackground(new java.awt.Color(239, 246, 224));
        jFormattedTextField3.setBorder(null);
        jFormattedTextField3.setForeground(new java.awt.Color(3, 4, 94));
        jFormattedTextField3.setText("NOMBRE PACIENTE");
        jFormattedTextField3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel49.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 250, -1));

        jButton8.setBackground(new java.awt.Color(109, 104, 117));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Modificar otra Cita");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel49.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 160, 30));

        FONDO3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jPanel49.add(FONDO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        jPanel53.setBackground(new java.awt.Color(144, 224, 239));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(3, 4, 94));
        jLabel58.setText("Registrar cita");
        jPanel53.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 350, -1));

        jPanel49.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 100));

        jPanel54.setBackground(new java.awt.Color(239, 246, 224));
        jPanel54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109, 104, 117), 30, true));
        jPanel54.setToolTipText("");
        jPanel54.setPreferredSize(new java.awt.Dimension(410, 33));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox30.setBackground(new java.awt.Color(109, 104, 117));
        jComboBox30.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox30.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox30.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambiar Especialista" }));
        jPanel54.add(jComboBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, -1));

        jPanel49.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 390, 40));

        jTabbedPane3.addTab("Modificar", jPanel49);

        jPanel42.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 980, 720));

        jPanel76.setBackground(new java.awt.Color(3, 4, 94));
        jPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("CITAS");
        jPanel76.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 46));

        btnAñadir2.setBackground(new java.awt.Color(26, 27, 105));
        btnAñadir2.setPreferredSize(new java.awt.Dimension(215, 55));
        btnAñadir2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Agregar");
        btnAñadir2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        btnAñadir2.add(iconoAñadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 54, 53));

        jPanel76.add(btnAñadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 330, 55));

        btnModificar2.setBackground(new java.awt.Color(26, 27, 105));
        btnModificar2.setPreferredSize(new java.awt.Dimension(215, 55));
        btnModificar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Modificar/Eliminar");
        btnModificar2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 160, -1));
        btnModificar2.add(iconoModificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, 54, 53));

        jPanel76.add(btnModificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 330, 55));

        jButton12.setBackground(new java.awt.Color(109, 104, 117));
        jButton12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Volver al inicio");
        jPanel76.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 160, 30));

        jPanel42.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 750));

        pestañasPrincipales.addTab("Gestionar citas", jPanel42);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pestañasPrincipales, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(pestañasPrincipales, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void codigoEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEspecialistaActionPerformed

    private void especialidadEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadEspecialistaActionPerformed

    private void correoEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoEspecialistaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void telefonoEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoEspecialistaActionPerformed

    private void direccionEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionEspecialistaActionPerformed

    private void cedulaEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaEspecialistaActionPerformed

    private void apellidoEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoEspecialistaActionPerformed

    private void nombreEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEspecialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEspecialistaActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void nombreEspecialista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEspecialista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEspecialista1ActionPerformed

    private void correoEspecialista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoEspecialista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoEspecialista1ActionPerformed

    private void apellidoPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoPaciente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoPaciente1ActionPerformed

    private void especialidadEspecialista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadEspecialista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadEspecialista1ActionPerformed

    private void cedulaEspecialista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaEspecialista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaEspecialista1ActionPerformed

    private void codigoEspecialista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEspecialista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEspecialista1ActionPerformed

    private void direccionEspecialista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionEspecialista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionEspecialista1ActionPerformed

    private void telefonoEspecialista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoEspecialista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoEspecialista1ActionPerformed

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jComboBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox20ActionPerformed

    private void jComboBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox25ActionPerformed

    private void jFormattedTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField10ActionPerformed

    private void btnEspecialistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEspecialistasMouseClicked
        control.cambiarPestaña(pestañasPrincipales,1);
    }//GEN-LAST:event_btnEspecialistasMouseClicked

    private void btnGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGeneralMouseClicked
        control.cambiarPestaña(pestañasPrincipales,2);       
    }//GEN-LAST:event_btnGeneralMouseClicked

    private void btnCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCitasMouseClicked
        control.cambiarPestaña(pestañasPrincipales,3);        
    }//GEN-LAST:event_btnCitasMouseClicked

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        /*Login login = new Login(control);
        control.volverAInicio(this,login ); */       // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        control.cambiarPestaña(pestañasPrincipales,0);     
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        control.cambiarPestaña(pestañasEspecialistas,0);       // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirMouseClicked

    private void btnModificarEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEliminarMouseClicked
        control.cambiarPestaña(pestañasEspecialistas,1); // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarEliminarMouseClicked

    private void btnVerListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerListaMouseClicked
        control.cambiarPestaña(pestañasEspecialistas,2);         // TODO add your handling code here:
    }//GEN-LAST:event_btnVerListaMouseClicked

    private void nombreEspecialista1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreEspecialista1FocusGained
        if(nombreEspecialista1.getText().equals("Nombre:")){
           nombreEspecialista1.setText(null);
           nombreEspecialista1.requestFocus();
           control.quitarField(nombreEspecialista1);
        }
    }//GEN-LAST:event_nombreEspecialista1FocusGained

    private void nombreEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreEspecialistaFocusGained
        if(nombreEspecialista.getText().equals("Nombre:")){
           nombreEspecialista.setText(null);
           nombreEspecialista.requestFocus();
           control.quitarField(nombreEspecialista);
        }
    }//GEN-LAST:event_nombreEspecialistaFocusGained

    private void nombreEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreEspecialistaFocusLost
        if (nombreEspecialista.getText().length()==0){
            control.ponerField(nombreEspecialista);
            nombreEspecialista.setText("Nombre:");
        }
    }//GEN-LAST:event_nombreEspecialistaFocusLost

    private void correoEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoEspecialistaFocusLost
        if (correoEspecialista.getText().length()==0){
            control.ponerField(correoEspecialista);
            correoEspecialista.setText("Correo:");
        }
    }//GEN-LAST:event_correoEspecialistaFocusLost

    private void correoEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoEspecialistaFocusGained
        if(correoEspecialista.getText().equals("Correo:")){
           correoEspecialista.setText(null);
           correoEspecialista.requestFocus();
           control.quitarField(correoEspecialista);
        }
    }//GEN-LAST:event_correoEspecialistaFocusGained

    private void nombreEspecialista1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreEspecialista1FocusLost
        if (nombreEspecialista1.getText().length()==0){
            control.ponerField(nombreEspecialista1);
            nombreEspecialista1.setText("Nombre:");
        }
    }//GEN-LAST:event_nombreEspecialista1FocusLost

    private void correoEspecialista1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoEspecialista1FocusGained
        if(correoEspecialista1.getText().equals("Correo:")){
           correoEspecialista1.setText(null);
           correoEspecialista1.requestFocus();
           control.quitarField(correoEspecialista1);
        }
    }//GEN-LAST:event_correoEspecialista1FocusGained

    private void correoEspecialista1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoEspecialista1FocusLost
        if (correoEspecialista1.getText().length()==0){
            control.ponerField(correoEspecialista1);
            correoEspecialista1.setText("Correo:");
        }
    }//GEN-LAST:event_correoEspecialista1FocusLost

    private void apellidoEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoEspecialistaFocusGained
        if(apellidoEspecialista.getText().equals("Apellido:")){
           apellidoEspecialista.setText(null);
           apellidoEspecialista.requestFocus();
           control.quitarField(apellidoEspecialista);
        }
    }//GEN-LAST:event_apellidoEspecialistaFocusGained

    private void apellidoPaciente1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoPaciente1FocusGained
        if(apellidoPaciente1.getText().equals("Apellido:")){
           apellidoPaciente1.setText(null);
           apellidoPaciente1.requestFocus();
           control.quitarField(apellidoPaciente1);
        }
    }//GEN-LAST:event_apellidoPaciente1FocusGained

    private void apellidoPaciente1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoPaciente1FocusLost
        if (apellidoPaciente1.getText().length()==0){
            control.ponerField(apellidoPaciente1);
            apellidoPaciente1.setText("Apellido:");
        }
    }//GEN-LAST:event_apellidoPaciente1FocusLost

    private void apellidoEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoEspecialistaFocusLost
        if (apellidoEspecialista.getText().length()==0){
            control.ponerField(apellidoEspecialista);
            apellidoEspecialista.setText("Apellido:");
        }
    }//GEN-LAST:event_apellidoEspecialistaFocusLost

    private void cedulaEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaEspecialistaFocusGained
        if(cedulaEspecialista.getText().equals("Cedula/Rif:")){
           cedulaEspecialista.setText(null);
           cedulaEspecialista.requestFocus();
           control.quitarField(cedulaEspecialista);
        }
    }//GEN-LAST:event_cedulaEspecialistaFocusGained

    private void cedulaEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaEspecialistaFocusLost
        if (cedulaEspecialista.getText().length()==0){
            control.ponerField(cedulaEspecialista);
            cedulaEspecialista.setText("Cedula/Rif:");
        }
    }//GEN-LAST:event_cedulaEspecialistaFocusLost

    private void direccionEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionEspecialistaFocusGained
        if(direccionEspecialista.getText().equals("Dirección:")){
           direccionEspecialista.setText(null);
           direccionEspecialista.requestFocus();
           control.quitarField(direccionEspecialista);
        }
    }//GEN-LAST:event_direccionEspecialistaFocusGained

    private void direccionEspecialista1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionEspecialista1FocusLost
        if (direccionEspecialista1.getText().length()==0){
            control.ponerField(direccionEspecialista1);
            direccionEspecialista1.setText("Dirección:");
        }
    }//GEN-LAST:event_direccionEspecialista1FocusLost

    private void especialidadEspecialista1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_especialidadEspecialista1FocusGained
        if(especialidadEspecialista1.getText().equals("Especialidad:")){
           especialidadEspecialista1.setText(null);
           especialidadEspecialista1.requestFocus();
           control.quitarField(especialidadEspecialista1);
        }
    }//GEN-LAST:event_especialidadEspecialista1FocusGained

    private void especialidadEspecialista1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_especialidadEspecialista1FocusLost
        if (especialidadEspecialista1.getText().length()==0){
            control.ponerField(especialidadEspecialista1);
            especialidadEspecialista1.setText("Especialidad:");
        }
    }//GEN-LAST:event_especialidadEspecialista1FocusLost

    private void especialidadEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_especialidadEspecialistaFocusGained
        if(especialidadEspecialista.getText().equals("Especialidad:")){
           especialidadEspecialista.setText(null);
           especialidadEspecialista.requestFocus();
           control.quitarField(especialidadEspecialista);
        }
    }//GEN-LAST:event_especialidadEspecialistaFocusGained

    private void direccionEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionEspecialistaFocusLost
        if (direccionEspecialista.getText().length()==0){
            control.ponerField(direccionEspecialista);
            direccionEspecialista.setText("Dirección:");
        }
    }//GEN-LAST:event_direccionEspecialistaFocusLost

    private void especialidadEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_especialidadEspecialistaFocusLost
        if (especialidadEspecialista.getText().length()==0){
            control.ponerField(especialidadEspecialista);
            especialidadEspecialista.setText("Especialidad:");
        }
    }//GEN-LAST:event_especialidadEspecialistaFocusLost

    private void codigoEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoEspecialistaFocusGained
        if(codigoEspecialista.getText().equals("Código:")){
           codigoEspecialista.setText(null);
           codigoEspecialista.requestFocus();
           control.quitarField(codigoEspecialista);
        }
    }//GEN-LAST:event_codigoEspecialistaFocusGained

    private void codigoEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoEspecialistaFocusLost
        if (codigoEspecialista.getText().length()==0){
            control.ponerField(codigoEspecialista);
            codigoEspecialista.setText("Código:");
        }
    }//GEN-LAST:event_codigoEspecialistaFocusLost

    private void telefonoEspecialistaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoEspecialistaFocusGained
        if(telefonoEspecialista.getText().equals("Teléfono:")){
           telefonoEspecialista.setText(null);
           telefonoEspecialista.requestFocus();
           control.quitarField(telefonoEspecialista);
        }
    }//GEN-LAST:event_telefonoEspecialistaFocusGained

    private void telefonoEspecialistaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoEspecialistaFocusLost
        if (telefonoEspecialista.getText().length()==0){
            control.ponerField(telefonoEspecialista);
            telefonoEspecialista.setText("Teléfono:");
        }
    }//GEN-LAST:event_telefonoEspecialistaFocusLost

    private void telefonoEspecialista1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoEspecialista1FocusGained
        if(telefonoEspecialista1.getText().equals("Teléfono:")){
           telefonoEspecialista1.setText(null);
           telefonoEspecialista1.requestFocus();
           control.quitarField(telefonoEspecialista1);
        }
    }//GEN-LAST:event_telefonoEspecialista1FocusGained

    private void telefonoEspecialista1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoEspecialista1FocusLost
        if (telefonoEspecialista1.getText().length()==0){
            control.ponerField(telefonoEspecialista1);
            telefonoEspecialista1.setText("Teléfono:");
        }
    }//GEN-LAST:event_telefonoEspecialista1FocusLost

    private void codigoEspecialista1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoEspecialista1FocusGained
        if(codigoEspecialista1.getText().equals("Código:")){
           codigoEspecialista1.setText(null);
           codigoEspecialista1.requestFocus();
           control.quitarField(codigoEspecialista1);
        }
    }//GEN-LAST:event_codigoEspecialista1FocusGained

    private void codigoEspecialista1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoEspecialista1FocusLost
        if (codigoEspecialista1.getText().length()==0){
            control.ponerField(codigoEspecialista1);
            codigoEspecialista1.setText("Código:");
        }
    }//GEN-LAST:event_codigoEspecialista1FocusLost

    private void cedulaEspecialista1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaEspecialista1FocusGained
        if(cedulaEspecialista1.getText().equals("Cedula/Rif:")){
           cedulaEspecialista1.setText(null);
           cedulaEspecialista1.requestFocus();
           control.quitarField(cedulaEspecialista1);
        }
    }//GEN-LAST:event_cedulaEspecialista1FocusGained

    private void cedulaEspecialista1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaEspecialista1FocusLost
        if (cedulaEspecialista1.getText().length()==0){
            control.ponerField(cedulaEspecialista1);
            cedulaEspecialista1.setText("Cedula/Rif:");
        }
    }//GEN-LAST:event_cedulaEspecialista1FocusLost

    private void direccionEspecialista1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionEspecialista1FocusGained
        if(direccionEspecialista1.getText().equals("Dirección:")){
           direccionEspecialista1.setText(null);
           direccionEspecialista1.requestFocus();
           control.quitarField(direccionEspecialista1);
        }
    }//GEN-LAST:event_direccionEspecialista1FocusGained

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Citas;
    private javax.swing.JPanel Culminar;
    private javax.swing.JLabel FONDO1;
    private javax.swing.JLabel FONDO10;
    private javax.swing.JLabel FONDO11;
    private javax.swing.JLabel FONDO12;
    private javax.swing.JLabel FONDO2;
    private javax.swing.JLabel FONDO3;
    private javax.swing.JLabel FONDO4;
    private javax.swing.JLabel FONDO5;
    private javax.swing.JLabel FONDO6;
    private javax.swing.JLabel FONDO7;
    private javax.swing.JLabel FONDO8;
    private javax.swing.JLabel FONDO9;
    private javax.swing.JPanel Ganancia;
    private javax.swing.JPanel JPanel1000;
    private javax.swing.JTextField apellidoEspecialista;
    private javax.swing.JPanel apellidoEspecialista1;
    private javax.swing.JTextField apellidoPaciente1;
    private javax.swing.JPanel btnAñadir;
    private javax.swing.JPanel btnAñadir1;
    private javax.swing.JPanel btnAñadir2;
    private javax.swing.JPanel btnCitas;
    private javax.swing.JPanel btnEspecialistas;
    private javax.swing.JPanel btnGeneral;
    private javax.swing.JPanel btnIniciarSesion;
    private javax.swing.JButton btnInicio;
    private javax.swing.JPanel btnModificar1;
    private javax.swing.JPanel btnModificar2;
    private javax.swing.JPanel btnModificar3;
    private javax.swing.JPanel btnModificarEliminar;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnVerLista;
    private javax.swing.JPanel btnVerLista1;
    private javax.swing.JTextField cedulaEspecialista;
    private javax.swing.JTextField cedulaEspecialista1;
    private javax.swing.JTextField codigoEspecialista;
    private javax.swing.JTextField codigoEspecialista1;
    private javax.swing.JTextField correoEspecialista;
    private javax.swing.JTextField correoEspecialista1;
    private javax.swing.JTextField direccionEspecialista;
    private javax.swing.JTextField direccionEspecialista1;
    private javax.swing.JTextField especialidadEspecialista;
    private javax.swing.JTextField especialidadEspecialista1;
    private javax.swing.JLabel iconoAñadir;
    private javax.swing.JLabel iconoAñadir1;
    private javax.swing.JLabel iconoAñadir2;
    private javax.swing.JLabel iconoModificar;
    private javax.swing.JLabel iconoModificar1;
    private javax.swing.JLabel iconoModificar2;
    private javax.swing.JLabel iconoModificar3;
    private javax.swing.JLabel iconoVerLista;
    private javax.swing.JLabel iconoVerLista1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField3;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField nombreEspecialista;
    private javax.swing.JTextField nombreEspecialista1;
    private javax.swing.JTabbedPane pestañasEspecialistas;
    private javax.swing.JTabbedPane pestañasPrincipales;
    private javax.swing.JTable tablaPacientes;
    private javax.swing.JTextField telefonoEspecialista;
    private javax.swing.JTextField telefonoEspecialista1;
    // End of variables declaration//GEN-END:variables
}
