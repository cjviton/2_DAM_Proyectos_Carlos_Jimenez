//He importado el conector de mysql a la libreria
package conector;

import java.sql.*;  //importo la libreria de sql

public class Conector {
   
    public static void main(String[] args) {
        
        //Escribo la ruta de conexión con el conector. Local hos es la ubicación
        //de la base de datos y 3306 el puerto por defecto que usa mysql y
        //el nombre de la base de datos.
        String url="jdbc:mysql://localhost:3306/pruebaconector"; 
        String usuario="pruebaconector";   //Usuario y contraseña que cree en la bbdd
        String contrasena="pruebaconector";
        
        
        try{ //importo la clase correspondiente a la libreria que hemos importado
            Class.forName("com.mysql.cj.jdbc.Driver");
            //con esto me conecto a la bbdd
            Connection  miconexion = DriverManager.getConnection(url,usuario,contrasena);
            
            Statement peticion = miconexion.createStatement();
            String cadena = "SELECT * FROM personas";
            
           ResultSet resultado = peticion.executeQuery(cadena);
           while(resultado.next()){
               String nombre = resultado.getString("nombre");
               String apellidos = resultado.getString("apellidos");
               String email = resultado.getString("email");
               
               System.out.println(nombre+""+apellidos+""+email);
           }
           
           //cierro los recursos abiertos
           resultado.close();
           peticion.close();
           miconexion.close();
            
        //Excepciones de error de llamada a una clase y a sentencias SQL
        }catch(ClassNotFoundException | SQLException e){  
            e.printStackTrace();
        }
    }
    
}
