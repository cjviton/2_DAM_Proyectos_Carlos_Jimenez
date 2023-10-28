package conversorl_acoustic_codigolibre;


public class ConversorL_Acoustic_CodigoLibre extends javax.swing.JFrame {       //1 extent a la libreria de java swing 
    
    
    public ConversorL_Acoustic_CodigoLibre(){                                   //2 método construcctor
       initComponents();
    }
 
    private void initComponents() {                                             //3 Creamos método initcomponents
    
        //INICIALIZO COMPONENTES----------------------------------------------------------------------------------------------------------------------------------
        
        //Primera linea de diseño en pantalla
        jLabel1Logo = new javax.swing.JLabel();                                 //8 creo una nueva instancia JLabel1Logo de la clase javax.swing.JLabel1
        jLabel2SerieK = new javax.swing.JLabel();
        
        //Segunda linea de diseño en pantalla
        jLabelNumAlt1 = new javax.swing.JLabel();
        jLabelDb1 = new javax.swing.JLabel();
        jLabelDb2 = new javax.swing.JLabel();
        jLabelNumAlt2 = new javax.swing.JLabel();
        
        //Tercera linea de diseño de la pantalla
        jTextFieldDb1 = new javax.swing.JTextField();
        jTextFieldNumAlta1 = new javax.swing.JTextField();
        jTextFieldNumAlt2 = new javax.swing.JTextField();
        jTextFieldDb2 = new javax.swing.JTextField();
        
        //Cuarta linea de diseño de la pantalla
        jLabelImgConci = new javax.swing.JLabel();

        
        
        
        //TEXTO EN LOS COMPONENTES---------------------------------------------------------------------------------------------------------------------------------
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//7 termina el proceso de run del programa cuando cierro la ventana
        setPreferredSize(new java.awt.Dimension(800, 600));

        //Primera linea de diseño en pantalla
        jLabel1Logo.setText("jLabel1Logo");                                 //9 texto de la instancia JLabel1 en este caso la etiqueta va a conetener una imagen. Le marco la ruta                                                                                
        jLabel1Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Documents\\2ºDAM Proyectos Carlos Jimenez\\Desarrollo de interface\\P2_DISEÑO DE INTERFACE EN NETBEANS CON JAVA SWING\\ConversorL_Acoustic_CodigoLibre\\graficos\\l-acoustics-logo3.png")); // NOI18N
               
        jLabel2SerieK.setFont(new java.awt.Font("Segoe UI", 0, 48));
        jLabel2SerieK.setForeground(new java.awt.Color(102, 255, 51));
        jLabel2SerieK.setText("SERIE K");
        
        //Segunda linea de diseño en pantalla
        jLabelNumAlt1.setText("NÚMERO DE ALTAVOCES");
        jLabelDb1.setText("DECIBELIOS");
        jLabelDb2.setText("DECIBELIOS");
        jLabelNumAlt2.setText("NÚMERO DE ALTAVOCES");
        
        //Tercera linea de diseño de la pantalla
        jTextFieldDb1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNumAlta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldNumAlt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldDb2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        
        //Cuarta linea de diseño de la pantalla
        jLabelImgConci.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Documents\\2ºDAM Proyectos Carlos Jimenez\\Desarrollo de interface\\P2_DISEÑO DE INTERFACE EN NETBEANS CON JAVA SWING\\ConversorL_Acoustic_CodigoLibre\\graficos\\concierto.jpg")); // NOI18N
        jLabelImgConci.setText("jLabel1");

        
        //ESCUCHADORES----------------------------------------------------------------------------------------------------------------------------------------------  
        //LLamada al método para convertir a decibelios
        jTextFieldNumAlt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumAlta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNumAlta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumAlta1ActionPerformed(evt);
            }
        });

        //LLamada al método para convertir a número de altavoces
        jTextFieldDb1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDb2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDb2ActionPerformed(evt);
            }
        });
        
        
        
        
        
        
        
        //MAQUETACIÓN GRÁFICA  de JFrame ---------------------------------------------------------------------------------------------------------------------
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelImgConci, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNumAlt1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNumAlta1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDb1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDb1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2SerieK, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDb2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDb2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumAlt2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNumAlt2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))))))
        );
        
        
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2SerieK))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumAlt1)
                    .addComponent(jLabelDb2)
                    .addComponent(jLabelNumAlt2)
                    .addComponent(jLabelDb1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumAlt2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDb2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDb1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumAlta1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelImgConci, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        
        
        pack();                                                                 //Empaqueta elementos de interface de usuario
    }
    
    
    //MÉTODOS DE LO ESCUCHADORES-------------------------------------------------------------------------------------------------------------------------------------
    //metodo para convertir el número de altavoces en decibelios
    private void jTextFieldNumAlta1ActionPerformed(java.awt.event.ActionEvent evt) {   
        String numAltK = jTextFieldNumAlta1.getText();//declaro la variable numAltK para capturar el número de altavoces
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

            jTextFieldDb1.setText(resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
    }
    
    
    
    //método para convertir decibelios en número de altavoces
    private void jTextFieldDb2ActionPerformed(java.awt.event.ActionEvent evt) {
        String Dbk = jTextFieldDb2.getText();//variable para capturar el numero de decibelios
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

            jTextFieldNumAlt2.setText(resultado);
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
        
        
    }                                             

    
    
    
    public static void main(String[] args) {
        
        try {                                                                   //5 Dentro de Main pego try catch para tner una programación defensiba
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {                   //6 Nimbus se refiere al estilo de la ventana. Lo podmeos cambiar por otro
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConversorL_Acoustic_CodigoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorL_Acoustic_CodigoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorL_Acoustic_CodigoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorL_Acoustic_CodigoLibre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    java.awt.EventQueue.invokeLater(new Runnable() {                            //4 clase para que muestre la ventana
            public void run() {
                new ConversorL_Acoustic_CodigoLibre().setVisible(true);
            }
        });    
    }
    
    
    //Declaració de variables-----------------------------------------------------------------------------------------------------------------------------------------
    private javax.swing.JLabel jLabel1Logo;                                     //10 Declaro la variable jLabel1
    private javax.swing.JLabel jLabel2SerieK;
    private javax.swing.JLabel jLabelDb1;
    private javax.swing.JLabel jLabelDb2;
    private javax.swing.JLabel jLabelNumAlt1;
    private javax.swing.JLabel jLabelNumAlt2;
    private javax.swing.JLabel jLabelImgConci;
    private javax.swing.JTextField jTextFieldDb1;
    private javax.swing.JTextField jTextFieldDb2;
    private javax.swing.JTextField jTextFieldNumAlt2;
    private javax.swing.JTextField jTextFieldNumAlta1;
    
    
    /* En cada paso que añada etiquetas  tengo que crear el constructor, la variable, y añadir el addCoponent
    y si es de texto el setText.
    */
    
}
