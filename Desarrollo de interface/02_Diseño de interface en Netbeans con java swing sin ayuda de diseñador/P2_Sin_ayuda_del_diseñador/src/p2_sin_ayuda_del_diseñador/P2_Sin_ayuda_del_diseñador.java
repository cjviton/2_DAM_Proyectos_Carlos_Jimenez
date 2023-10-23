
package p2_sin_ayuda_del_diseñador;

public class P2_Sin_ayuda_del_diseñador extends javax.swing.JFrame {            //1ºextent a la libreria de java    swing
    
    public P2_Sin_ayuda_del_diseñador() {                                       //2º método construcctor
       initComponents();
    }
    
    private void initComponents() {                                             //5º Creamos método initcomponents
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//8 termina el proceso de run del programa cuando cierro la ventana
        jLabel1 = new javax.swing.JLabel();                                     //6ºCreo una nueva instancia de javax.swing.JLabel      
        jLabel1.setText("HOLA MUNDO");                                      //7 introduzco texto en jLabel1
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());//11 Creo un jPanelLayout
        getContentPane().setLayout(layout);                                  //13 pego todo el contenido del layout generado en un proyecto nuevo limpio con nada más que una etiqueta
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE) //aquí puedo el largo de la etiqueta
                .addContainerGap(269, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(278, Short.MAX_VALUE))
        );
              
        pack();                                                                 //9 Empqueta elementos de interface de usuario
    }
    
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {                        //3ºclase para que muestre la ventana
            public void run() {
                new P2_Sin_ayuda_del_diseñador().setVisible(true);
            }
        });
        
    }
    
        //declaración de variables
        private javax.swing.JLabel jLabel1;                                     //4ºfuera de la clase main creo una propiedad JLabel1
                                                                                //que es un contenedor de datos de tipo javax.swing.JLabel
        private javax.swing.JPanel jPanel1;                                     //12 creo la propiedad jPanel1 que es un contenedor de tipo javax.swing.JPanel
        
        
        


    
}
