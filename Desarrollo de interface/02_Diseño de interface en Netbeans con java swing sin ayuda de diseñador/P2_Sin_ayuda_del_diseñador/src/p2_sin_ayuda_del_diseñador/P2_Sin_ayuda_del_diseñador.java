
package p2_sin_ayuda_del_diseñador;

public class P2_Sin_ayuda_del_diseñador extends javax.swing.JFrame {            //1ºextent a la libreria de java swing
    
    public P2_Sin_ayuda_del_diseñador() {                                       //2º método construcctor
       initComponents();
    }
    
    private void initComponents() {                                             //5º Creamos método initcomponents
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//8 termina el proceso de run del programa cuando cierro la ventana
        
        //inicializo componentes
        jLabel1 = new javax.swing.JLabel();                                     //6ºCreo una nueva instancia de javax.swing.JLabel 
        jLabel2 = new javax.swing.JLabel();                                     //15 creo una nuevo objeto de la clase java.swing.JLabel jLabel2
        jTexField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider1 = new javax.swing.JSlider();
        
        
        //TExtos por defecto en los componentes
        jLabel1.setText("HOLA MUNDO");                                      //7 introduzco texto en jLabel1
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12));     //23 de esta manera puedo cambiar el estilo de la fuente
        jLabel2.setText("HOLA MUNDO DOS");                                  //16 introduzco texto en jLabel2
        jButton1.setText("PULSAME");
        jRadioButton1.setText("SELCCIÓN ÚNICA");
        jCheckBox1.setText("SELCCIÓN MÚLTIPLE");
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deportes:", "Escalada", "Alpinismo", "Buceo" }));
        
        //Evento de acción de un JButton(Escuchadores)
        jButton1.addActionListener(new java.awt.event.ActionListener() {        //22 este el el método con el cual decimos como ejecuta la función el button
            public void actionPerformed(java.awt.event.ActionEvent evt) {       //puede ser puelsando, pasando por encima el ratón, pulsar tecla...etc
                jButton1ActionPerformed(evt);
            }
        });

        
        //Maquetación gráfica
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());//11 Creo un jPanelLayout
        getContentPane().setLayout(layout);                                  //13 pego todo el contenido del layout generado en un proyecto nuevo limpio, con nada más que una etiqueta
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)   
                    .addComponent(jLabel2)                              //17 Añado en el horizontalGroup y verticalGroup addComponet Jlabel2
                    .addComponent(jTexField1)
                    .addComponent(jButton1)
                    .addComponent(jRadioButton1)
                    .addComponent(jCheckBox1)
                    .addComponent(jComboBox1)
                    .addComponent(jSlider1)
                )
               .addContainerGap(357, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addComponent(jLabel2) 
                .addComponent(jTexField1)
                .addComponent(jButton1)
                .addComponent(jRadioButton1)
                .addComponent(jCheckBox1)
                .addComponent(jComboBox1)
                .addComponent(jSlider1)
                .addContainerGap(278, Short.MAX_VALUE))
        );
              
        pack();                                                                 //9 Empqueta elementos de interface de usuario
    }
    
    
    //Métodos de los escuchadores
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {      //21 Creo un método para ejecutar un evento en el jButton
                                                                                //con esto solamente n funciona. Hay que hacer también el paso 22
        System.out.printf("Has pulsado el botón");
        jTexField1.setText("puedo introducir texto aquí");                    //De esta manera puedo introducir texto en JTextFiel al pulsar el boton
        
    }  
    
    
    
    public static void main(String[] args) {
        
        try {                                                                   //19 Dentro de Main pego try catch para tner una programación defensiba
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {                   //20 Nimbus se refiere al estilo de la ventana. Lo podmeos cambiar por otro
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(P2_Sin_ayuda_del_diseñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P2_Sin_ayuda_del_diseñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P2_Sin_ayuda_del_diseñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P2_Sin_ayuda_del_diseñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {                        //3ºclase para que muestre la ventana
            public void run() {
                new P2_Sin_ayuda_del_diseñador().setVisible(true);
            }
        });
        
    }
    
        //declaración de variables
        private javax.swing.JLabel jLabel1;                                     //4ºfuera de la clase main creo una propiedad JLabel1
                                                                                //que es un contenedor de datos de tipo javax.swing.JLabe
        private javax.swing.JLabel jLabel2;                                     //15 creo otra jLabel2

        private javax.swing.JPanel jPanel1;                                     //12 creo la propiedad jPanel1 que es un contenedor de tipo javax.swing.JPanel
        
        private javax.swing.JTextField jTexField1;
        private javax.swing.JButton jButton1;
        private javax.swing.JRadioButton jRadioButton1;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JSlider jSlider1;
           
}

/*18 En cada paso que añada etiquetas  tengo que crear el constructor, la variable, y añadir el addCoponent
y si es de texto el setText





*/