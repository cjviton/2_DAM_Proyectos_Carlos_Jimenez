package conversorl_acoustic_codigolibre;


public class ConversorL_Acoustic_CodigoLibre extends javax.swing.JFrame {       //1 extent a la libreria de java swing 
    
    
    public ConversorL_Acoustic_CodigoLibre(){                                   //2 método construcctor
       initComponents();
    }
 
    private void initComponents() {                                             //3 Creamos método initcomponents
    
        //INICIALIZO COMPONENTES
        jPanel1 = new javax.swing.JPanel();                                     //8 creo una nueva instancia JPanel1 de javax.swing.Jpanel
        jLabel1 = new javax.swing.JLabel();                                     //9 creo una nueva instancia JLabel1 de javax.swing.JLabel1
        
        
        
        
        //TEXTO EN LOS COMPONENTES
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 450));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Documents\\2ºDAM Proyectos Carlos Jimenez\\Desarrollo de interface\\P2_DISEÑO DE INTERFACE EN NETBEANS CON JAVA SWING\\ConversorL_Acoustic_CodigoLibre\\graficos\\l-acoustics-logo3.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 300));
        
        
        
        //ESCUCHADORES
        
        
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//7 termina el proceso de run del programa cuando cierro la ventana
        
        
        //MAQUETACIÓN GRÁFICA  dentro de JPanel             
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); //12 Genero toda Maquetación gráfica del JPanel
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(545, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        
        
        //MAQUETACIÓN GRÁFICA  de JPanel
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(500, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        
        
        pack();                                                                 // 13 Empaqueta elementos de interface de usuario
    }
    
    
    //MÉTODOS DE LO ESCUCHADORES
    
    
    
    
    
    
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
    
    
    //Declaració de variables
    private javax.swing.JLabel jLabel1;                                         //10Declaro la variable jLabel1
    private javax.swing.JPanel jPanel1;                                         //11Declaro la variable jPanel1
    
    
    
    
    /* En cada paso que añada etiquetas  tengo que crear el constructor, la variable, y añadir el addCoponent
    y si es de texto el setText.
    */
    
}
