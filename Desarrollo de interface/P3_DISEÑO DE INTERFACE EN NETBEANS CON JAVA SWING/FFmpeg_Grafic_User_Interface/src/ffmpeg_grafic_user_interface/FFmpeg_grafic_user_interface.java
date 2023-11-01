
package ffmpeg_grafic_user_interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FFmpeg_grafic_user_interface extends javax.swing.JFrame { 
    
    //zono declarativa de variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;


    
    public FFmpeg_grafic_user_interface() { //Método constructor
        initComponents();
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Indica la ruta del ejecutable");

        jLabel2.setText("Indica el archivo de entrada");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Indica el archivo de salida");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Formato video", "avi", "mp4", "mkv" }));
        
        jButton2.setText("Extraer audio mp3");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        
        jButton3.setText("Info del archivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jTextField4.setText(" ");
        
        
        //Diseño y colocadion de los elementos en el panel
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4))
                    .addComponent(jButton1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jButton2))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

                                        

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FFmpeg_grafic_user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FFmpeg_grafic_user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FFmpeg_grafic_user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FFmpeg_grafic_user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FFmpeg_grafic_user_interface().setVisible(true);
            }
        });
    }  
    
    //Método de acción del JBotoon convierte el formato de audio y video 
    //Coloco aquí el codigo que tenia para inicializar ffmpeg
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Esta es la linea de comando que pondría en el cmd  para hacer la converión del arcchivo
        //PASO 1 String comando = "C://ffmpeg//bin//ffmpeg.exe -i C://codificar//corto.avi C://codificar//cortopixar.mp4"; 
        
        /*
        PASO 2
        Cuando ya tengo hecho el interface voy a introducir a través de pantalla estas direccione,
        haré un get.text de los JTexFiel
        String programa ="C://ffmpeg//bin//ffmpeg.exe"; //La separo en variables para hacer el programa 
        String entrada="C://codificar//corto.avi";
        String salida="C://codificar//cortopixar.mp4";
        */
        
        String programa = jTextField1.getText(); //La separo en variables para hacer el programa reutilizable
        String entrada=jTextField2.getText();    //hago un get.text para capturar el texto que introduzca en la casilla
        String salida=jTextField3.getText();
        String formato=jComboBox1.getSelectedItem().toString();//Capturo la selección que haga en en el comboBox1
        String comando = programa + " -i " + entrada + " " + salida + "." +formato ;
        System.out.println(comando);
        try{
            ProcessBuilder proceso = new ProcessBuilder( "cmd.exe", "/c",comando); //processBuilder-->Esta clase se utiliza para crear procesos del sistema operativo
            Process miproceso = proceso.start();
            System.out.println("ok");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    } 
    
    //Método de acción de butoon2. Extrae la pista de audio del video en mp3
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        /*Linea de código en consola para extraer pita de audio
        "C://ffmpeg//bin//ffmpeg.exe -i C://codificar//corto.avi C://codificar//cortopixar.mp4"
        */       
        String programa = jTextField1.getText(); //La separo en variables para hacer el programa reutilizable
        String entrada=jTextField2.getText();    //hago un get.text para capturar el texto que introduzca en la casilla
        String salida=jTextField3.getText();
        String comando = programa + " -i " + entrada + " -vn -acodec copy " + salida + ".mp3";
        System.out.println(comando);
        try{
            ProcessBuilder proceso = new ProcessBuilder( "cmd.exe", "/c",comando); //processBuilder-->Esta clase se utiliza para crear procesos del sistema operativo
            Process miproceso = proceso.start();
            System.out.println("ok");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    } 
    
    //Método de acción de butoon3. Escribe en textFiel4 la informacion del archivo de entrada
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String entrada = jTextField2.getText();
                        
        String comando = "ffprobe -v error -show_entries format=duration:format_tags=format_name:stream=codec_name -of default=noprint_wrappers=1:nokey=1 \"" +entrada + "";
        
        //Capturo el resultado que me devuelve el comando y lo escribo en JteXtFiel4
        try{
            Process process = Runtime.getRuntime().exec(comando);
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            StringBuilder output = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            jTextField4.setText(output.toString()); // Mostrar la salida en el JTextField4
    
        }
        catch(Exception e){
            e.printStackTrace();
        }
    


    }  
    
}

