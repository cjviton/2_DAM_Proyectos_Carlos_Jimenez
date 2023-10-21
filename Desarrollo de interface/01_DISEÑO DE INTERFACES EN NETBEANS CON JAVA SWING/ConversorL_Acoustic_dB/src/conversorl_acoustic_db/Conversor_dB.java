
package conversorl_acoustic_db;


public class Conversor_dB extends javax.swing.JFrame {

    
    public Conversor_dB() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNuevo = new javax.swing.JPanel();
        jComboSelecAltavoz = new javax.swing.JComboBox<>();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelAbrir = new javax.swing.JPanel();
        jFileChooserArchivoAbrir = new javax.swing.JFileChooser();
        jPanelGuardar = new javax.swing.JPanel();
        jFileChooser2ArchivoGuardar = new javax.swing.JFileChooser();
        jPanelSerieK = new javax.swing.JPanel();
        jLabelLogoSerieK = new javax.swing.JLabel();
        jLabelTextSerieK = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1NumAltK = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField1DbK1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1DbK = new javax.swing.JTextField();
        jTextField1NumAlt1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanelSerieL = new javax.swing.JPanel();
        jTextField2NumAltL1 = new javax.swing.JTextField();
        jTextField2DbL1 = new javax.swing.JTextField();
        jLabelLogoSerieL = new javax.swing.JLabel();
        jLabelTexSerieL = new javax.swing.JLabel();
        jTextField2NumAltL2 = new javax.swing.JTextField();
        jTextField2DbL2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jComboSelecAltavoz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELEC", "SERIE K", "SERIE L" }));
        jComboSelecAltavoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSelecAltavozActionPerformed(evt);
            }
        });

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\l-acoustics-logo.png")); // NOI18N
        jLabelLogo.setText("jLabel1");

        jLabel1.setText("LE DAMOS LA BIENVENIDA A L´ACOUSTIC");

        jLabel2.setText(" DESDE AQUÍ, PODRÁ CALCULAR EL NÚMERO DE RECINTOS NECESARIOS PARA QUE SU EVENTO EN DIRECTO");

        jLabel3.setText("SEA UN EXITO Y TODOS LOS ESPECTADORES PUEDAN DISFRUTAR DE EL POR IGUAL.");

        jLabel4.setText("ELIJA EL MODELO DE ALTAVOS L´ACOUSTIC QUE QUIERE USAR Y LE INDICAREMOS ");

        jLabel5.setText("EL NÚMERO DE ALTAVOCES NECESARIO, PARA QUE SU PÚBLICO NO TENGA PROBLEMAS DE AUDICIÓN.");

        jLabel6.setText("O SI LO PREFIERE, PUEDE INDICARNOS LA POTENCIA SONORA EN dB, A LA QUE QUIERE LLEGAR A SU PÚBLICO");

        jLabel7.setText("Y DEPENDIENDO DEL MODELO DE CAJAS DE QUE DISPONGA, LE MARCAREMOS EL NUMERO DE RECINTOS ACÚSTICOS");

        jLabel8.setText("NECESRIO PARA CUBRIR SUS ESPECTATIBAS SONORAS. ");

        javax.swing.GroupLayout jPanelNuevoLayout = new javax.swing.GroupLayout(jPanelNuevo);
        jPanelNuevo.setLayout(jPanelNuevoLayout);
        jPanelNuevoLayout.setHorizontalGroup(
            jPanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNuevoLayout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addGroup(jPanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNuevoLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNuevoLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(jPanelNuevoLayout.createSequentialGroup()
                .addGroup(jPanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNuevoLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel8))
                    .addGroup(jPanelNuevoLayout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNuevoLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNuevoLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelNuevoLayout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jComboSelecAltavoz, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelNuevoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelNuevoLayout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNuevoLayout.setVerticalGroup(
            jPanelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboSelecAltavoz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jFileChooserArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserArchivoAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAbrirLayout = new javax.swing.GroupLayout(jPanelAbrir);
        jPanelAbrir.setLayout(jPanelAbrirLayout);
        jPanelAbrirLayout.setHorizontalGroup(
            jPanelAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbrirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooserArchivoAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanelAbrirLayout.setVerticalGroup(
            jPanelAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbrirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooserArchivoAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelGuardarLayout = new javax.swing.GroupLayout(jPanelGuardar);
        jPanelGuardar.setLayout(jPanelGuardarLayout);
        jPanelGuardarLayout.setHorizontalGroup(
            jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser2ArchivoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanelGuardarLayout.setVerticalGroup(
            jPanelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser2ArchivoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jLabelLogoSerieK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoSerieK.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\l-acoustics-logo.png")); // NOI18N
        jLabelLogoSerieK.setText("jLabel9");

        jLabelTextSerieK.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelTextSerieK.setForeground(new java.awt.Color(0, 255, 0));
        jLabelTextSerieK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextSerieK.setText("SERIE K");

        jLabel9.setText("NÚMERO DE ALTAVOCES ");

        jTextField1NumAltK.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField1NumAltK.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1NumAltK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1NumAltK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1NumAltKActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DECIBELIOS");

        jTextField1DbK1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField1DbK1.setForeground(new java.awt.Color(102, 255, 0));
        jTextField1DbK1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1DbK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1DbK1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\Altavoz2.jpg")); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel12.setText("NÚMERO DE ALTAVOCES ");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DECIBELIOS");

        jTextField1DbK.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField1DbK.setForeground(new java.awt.Color(102, 255, 0));
        jTextField1DbK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1DbK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1DbKActionPerformed(evt);
            }
        });

        jTextField1NumAlt1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField1NumAlt1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1NumAlt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\Altavoz2.jpg")); // NOI18N
        jLabel14.setText("jLabel11");

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\concierto.jpg")); // NOI18N
        jLabel22.setText("jLabel22");

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSerieKLayout = new javax.swing.GroupLayout(jPanelSerieK);
        jPanelSerieK.setLayout(jPanelSerieKLayout);
        jPanelSerieKLayout.setHorizontalGroup(
            jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieKLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabelLogoSerieK, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTextSerieK, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jPanelSerieKLayout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelSerieKLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelSerieKLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel12))
                            .addGroup(jPanelSerieKLayout.createSequentialGroup()
                                .addComponent(jTextField1NumAltK, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jTextField1DbK, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jTextField1DbK1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField1NumAlt1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanelSerieKLayout.setVerticalGroup(
            jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSerieKLayout.createSequentialGroup()
                .addGroup(jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSerieKLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelLogoSerieK, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSerieKLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabelTextSerieK)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1DbK, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1NumAltK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieKLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1DbK1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSerieKLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14))
                            .addComponent(jTextField1NumAlt1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(11, 11, 11))
        );

        jTextField2NumAltL1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField2NumAltL1.setForeground(new java.awt.Color(102, 255, 0));
        jTextField2NumAltL1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2NumAltL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2NumAltL1ActionPerformed(evt);
            }
        });

        jTextField2DbL1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField2DbL1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField2DbL1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelLogoSerieL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoSerieL.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\l-acoustics-logo.png")); // NOI18N
        jLabelLogoSerieL.setText("jLabelLogoSerieL");

        jLabelTexSerieL.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelTexSerieL.setForeground(new java.awt.Color(51, 255, 0));
        jLabelTexSerieL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTexSerieL.setText("SERIE L");

        jTextField2NumAltL2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField2NumAltL2.setForeground(new java.awt.Color(102, 255, 0));
        jTextField2NumAltL2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2DbL2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField2DbL2.setForeground(new java.awt.Color(0, 0, 255));
        jTextField2DbL2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2DbL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2DbL2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\Altavoz2.jpg")); // NOI18N
        jLabel15.setText("jLabel11");

        jLabel16.setText("NÚMERO DE ALTAVOCES ");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DECIBELIOS");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\Altavoz2.jpg")); // NOI18N
        jLabel18.setText("jLabel11");

        jLabel19.setText("NÚMERO DE ALTAVOCES ");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("DECIBELIOS");

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Desktop\\2º DAM\\2_Desarrollo de Interface 6\\PRACTICAS\\PRÁCTICA 1\\concierto.jpg")); // NOI18N
        jLabel21.setText("jLabel21");

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSerieLLayout = new javax.swing.GroupLayout(jPanelSerieL);
        jPanelSerieL.setLayout(jPanelSerieLLayout);
        jPanelSerieLLayout.setHorizontalGroup(
            jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieLLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabelLogoSerieL, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSerieLLayout.createSequentialGroup()
                        .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieLLayout.createSequentialGroup()
                                .addComponent(jTextField2DbL2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieLLayout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)))
                        .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2NumAltL2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addComponent(jLabelTexSerieL, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanelSerieLLayout.createSequentialGroup()
                .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSerieLLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSerieLLayout.createSequentialGroup()
                                .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2NumAltL1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2DbL1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelSerieLLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSerieLLayout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jButton3)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanelSerieLLayout.setVerticalGroup(
            jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSerieLLayout.createSequentialGroup()
                .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSerieLLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelTexSerieL))
                    .addGroup(jPanelSerieLLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabelLogoSerieL, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieLLayout.createSequentialGroup()
                            .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2NumAltL1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieLLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(17, 17, 17))))
                        .addComponent(jTextField2DbL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieLLayout.createSequentialGroup()
                            .addGroup(jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(121, 121, 121))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSerieLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2NumAltL2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2DbL2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSerieLLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Tools");
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanelSerieK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelSerieL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelSerieK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelSerieL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ventana principal bienvenisa o panel file nuevo
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jPanelNuevo.setVisible(false);
        jPanelAbrir.setVisible(false);
        jPanelGuardar.setVisible(false);
        jPanelNuevo.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    // ventana file abrir
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jPanelNuevo.setVisible(false);
        jPanelAbrir.setVisible(false);
        jPanelGuardar.setVisible(false);
        jPanelAbrir.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    //ventana file guardar
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jPanelNuevo.setVisible(false);
        jPanelAbrir.setVisible(false);
        jPanelGuardar.setVisible(false);
        jPanelGuardar.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //panel de visivilidad de arranque del programa
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jPanelNuevo.setVisible(true);
        jPanelAbrir.setVisible(false);
        jPanelGuardar.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void jFileChooserArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserArchivoAbrirActionPerformed
    }//GEN-LAST:event_jFileChooserArchivoAbrirActionPerformed

    private void jTextField1DbKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1DbKActionPerformed

 
    }//GEN-LAST:event_jTextField1DbKActionPerformed

    
    //código de textfiel de calculo de db en altavoces serie L
    private void jTextField2DbL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2DbL2ActionPerformed
        String numDbL = jTextField2DbL2.getText();//declaro la variable numAltK para capturar el número de altavoces
        String resultado = "";//reaultado para colocar el jTextFiel
        try{
            switch (numDbL) {

                case "70":
                    resultado = "2";
                    break;

                case "80":
                    resultado = "4";
                    break;

                case "90":
                    resultado = "6";
                    break;

                case "100":
                    resultado = "8";
                    break;
            }

            jTextField2NumAltL2.setText(resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());        
        }
    }//GEN-LAST:event_jTextField2DbL2ActionPerformed
    //selección del desplegable panel pricipal
    private void jComboSelecAltavozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSelecAltavozActionPerformed
        String seleccion = (String) jComboSelecAltavoz.getSelectedItem(); //Asigno a la variable 
        //seleccion lo que elijo panel desplegable
        try{
            switch (seleccion) {
                case "SERIE K":
                    jPanelNuevo.setVisible(false);
                    jPanelAbrir.setVisible(false);
                    jPanelGuardar.setVisible(false);
                    jPanelSerieK.setVisible(false);
                    jPanelSerieL.setVisible(false);
                    jPanelSerieK.setVisible(true);
                    break;

                case "SERIE L":
                    jPanelNuevo.setVisible(false);
                    jPanelAbrir.setVisible(false);
                    jPanelGuardar.setVisible(false);
                    jPanelSerieK.setVisible(false);
                    jPanelSerieL.setVisible(false);
                    jPanelSerieL.setVisible(true);
                    break;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }

    }//GEN-LAST:event_jComboSelecAltavozActionPerformed
    ////código de textfiel de calculo del número de altavoces serie K
    private void jTextField1NumAltKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1NumAltKActionPerformed
        String numAltK = jTextField1NumAltK.getText();//declaro la variable numAltK para capturar el número de altavoces
        String resultado = "";//reaultado para colocar el jTextFiel
        try{
            switch (numAltK) {

                case "2":
                    resultado = "90";
                    break;

                case "4":
                    resultado = "100";
                    break;

                case "6":
                    resultado = "110";
                    break;

                case "8":
                    resultado = "120";
                    break;
            }

            jTextField1DbK.setText(resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }

    }//GEN-LAST:event_jTextField1NumAltKActionPerformed
    //código de textfiel de calculo de db en altavoces serie k
    private void jTextField1DbK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1DbK1ActionPerformed
        String Dbk = jTextField1DbK1.getText();//variable para capturar el numero de decibelios
        String resultado = "";//reaultado para colocar el jTextFiel
        try{
            switch (Dbk) {

                case "90":
                    resultado = "2";
                    break;

                case "100":
                    resultado = "4";
                    break;

                case "110":
                    resultado = "6";
                    break;

                case "120":
                    resultado = "8";
                    break;
            }

            jTextField1NumAlt1.setText(resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
    }//GEN-LAST:event_jTextField1DbK1ActionPerformed
    //código de textfiel de calculo del número de altavoces serie L
    private void jTextField2NumAltL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2NumAltL1ActionPerformed
    String numAltL = jTextField2NumAltL1.getText();//declaro la variable numAltK para capturar el número de altavoces
        String resultado = "";//reaultado para colocar el jTextFiel
        try{
            switch (numAltL) {

                case "2":
                    resultado = "70";
                    break;

                case "4":
                    resultado = "80";
                    break;

                case "6":
                    resultado = "90";
                    break;

                case "8":
                    resultado = "100";
                    break;
            }

            jTextField2DbL1.setText(resultado); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        
        }
    }//GEN-LAST:event_jTextField2NumAltL1ActionPerformed
    //jButton para back a principal en pantalla nuevo
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanelNuevo.setVisible(true);
        jPanelAbrir.setVisible(false);
        jPanelGuardar.setVisible(false); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanelNuevo.setVisible(true);
        jPanelAbrir.setVisible(false);
        jPanelGuardar.setVisible(false); 
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor_dB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor_dB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor_dB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor_dB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor_dB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboSelecAltavoz;
    private javax.swing.JFileChooser jFileChooser2ArchivoGuardar;
    private javax.swing.JFileChooser jFileChooserArchivoAbrir;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogoSerieK;
    private javax.swing.JLabel jLabelLogoSerieL;
    private javax.swing.JLabel jLabelTexSerieL;
    private javax.swing.JLabel jLabelTextSerieK;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanelAbrir;
    private javax.swing.JPanel jPanelGuardar;
    private javax.swing.JPanel jPanelNuevo;
    private javax.swing.JPanel jPanelSerieK;
    private javax.swing.JPanel jPanelSerieL;
    private javax.swing.JTextField jTextField1DbK;
    private javax.swing.JTextField jTextField1DbK1;
    private javax.swing.JTextField jTextField1NumAlt1;
    private javax.swing.JTextField jTextField1NumAltK;
    private javax.swing.JTextField jTextField2DbL1;
    private javax.swing.JTextField jTextField2DbL2;
    private javax.swing.JTextField jTextField2NumAltL1;
    private javax.swing.JTextField jTextField2NumAltL2;
    // End of variables declaration//GEN-END:variables
}
