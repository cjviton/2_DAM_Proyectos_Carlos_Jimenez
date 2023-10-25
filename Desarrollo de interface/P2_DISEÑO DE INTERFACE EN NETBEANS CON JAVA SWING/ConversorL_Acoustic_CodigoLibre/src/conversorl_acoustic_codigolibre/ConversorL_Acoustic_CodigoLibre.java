package conversorl_acoustic_codigolibre;


public class ConversorL_Acoustic_CodigoLibre extends javax.swing.JFrame {       //1 extent a la libreria de java swing 
    
    
    public ConversorL_Acoustic_CodigoLibre(){                                   //2 método construcctor
       initComponents();
    }
 
    private void initComponents() {                                             //3 Creamos método initcomponents
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//7 termina el proceso de run del programa cuando cierro la ventana

        
        //INICIALIZO COMPONENTES
        
        
        
        
        
        //TEXTO EN LOS COMPONENTES
        
        
        
        
        //ESCUCHADORES
        
        
        
        
        
        //MAQUETACIÓN GRÁFICA
        
        
        
        
        
        
        pack();                                                                 //8 Empqueta elementos de interface de usuario
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
    
    
    
    
    
    
    /*18 En cada paso que añada etiquetas  tengo que crear el constructor, la variable, y añadir el addCoponent
    y si es de texto el setText.
    */
    
}
