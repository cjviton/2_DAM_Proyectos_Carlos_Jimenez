package conversorl_acoustic_codigolibre;


public class ConversorL_Acoustic_CodigoLibre extends javax.swing.JFrame {       //1 extent a la libreria de java swing 
    
    
    public ConversorL_Acoustic_CodigoLibre(){                                   //2 método construcctor
       initComponents();
    }
 
    private void initComponents() {                                             //3 Creamos método initcomponents
    
        //INICIALIZO COMPONENTES----------------------------------------------------------------------------------------------------------------------------------
        
        jLabel1 = new javax.swing.JLabel();                                     //8 creo una nueva instancia JLabel1 de la clase javax.swing.JLabel1
        jLabel2 = new javax.swing.JLabel();
        
        
        
        //TEXTO EN LOS COMPONENTES---------------------------------------------------------------------------------------------------------------------------------
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//7 termina el proceso de run del programa cuando cierro la ventana
        setPreferredSize(new java.awt.Dimension(800, 600));

        
        jLabel1.setText("jLabel1");                                         //9 texto de la instancia JLabel1 en este caso la etiqueta va a conetener una imagen. Le marco la ruta                                                                                
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\usuario\\Documents\\2ºDAM Proyectos Carlos Jimenez\\Desarrollo de interface\\P2_DISEÑO DE INTERFACE EN NETBEANS CON JAVA SWING\\ConversorL_Acoustic_CodigoLibre\\graficos\\l-acoustics-logo3.png")); // NOI18N
        
        
        jLabel2.setText("jLabel2");
        
        
        //ESCUCHADORES----------------------------------------------------------------------------------------------------------------------------------------------
        
        
        
        
        
        
        
        
        
        //MAQUETACIÓN GRÁFICA  de JFrame como sólo voy a 1 página lo hago directamente en el JFrame sin crear antes ub JPanel--------------------------------------
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                    
                //JLabel1  marco su posición y dimensiones  dentro de JFrame
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                 
                //JLabel2 marco su posición y dimensiones  dentro de JFrame   
                .addGap(267, 267, 267)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    
                    
                    
                .addContainerGap(327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                 
                //JLabel1  marco su posición y dimensiones  dentro de JFrame 
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                
                //JLabel1  marco su posición y dimensiones  dentro de JFrame
                    .addComponent(jLabel2)) 
                   
                 
                    
                .addContainerGap(259, Short.MAX_VALUE))
        );
        
        
        pack();                                                                 //Empaqueta elementos de interface de usuario
    }
    
    
    //MÉTODOS DE LO ESCUCHADORES-------------------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    
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
    private javax.swing.JLabel jLabel1;                                         //10 Declaro la variable jLabel1
    private javax.swing.JLabel jLabel2;
    
    
    
    /* En cada paso que añada etiquetas  tengo que crear el constructor, la variable, y añadir el addCoponent
    y si es de texto el setText.
    */
    
}
