import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

	public static void main(String[] args) { // Necitamos pasarle el puerto. Lo hago a traves de la configuración de debug
								// en TimeServer en argumento y le indico que haga la escucha en el puerto 5678
		if (args.length < 1)    //Se verifica si se proporcionó al menos un argumento al programa. 
			return;				//Si no se proporciona, el programa simplemente sale sin hacer nada.

		int port = Integer.parseInt(args[0]); // Convierte el primer argumento (que debería ser el número de puerto) a un entero.


		try (ServerSocket serverSocket = new ServerSocket(port)) {   //Crear un ServerSocket que escuche en el puerto especificado.
																	 //en este caso será el 5678
			System.out.println("El servidor está escuchado por el puerto:  " + port);

			while (true) { // Bucle infinito de espera activa de nuevas conexiones

				Socket socket = serverSocket.accept();  //Esperar peticiones y las acepta

				System.out.println("Hay un nuevo cliente conectado."); //Escribe este mensaje cuanda haya un nuevo cliente conectado

				// BufferedReader lee los datos del InputStreamReader del socket y los guarda en la varible reader
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                OutputStream output = socket.getOutputStream(); //guarda en una variable el outpotstrean del socket
                PrintWriter writer = new PrintWriter(output, true);

                // Leer la línea de texto del cliente
                String clientMessage = reader.readLine();
 
                // Imprimir el mensaje del cliente por pantalla
                System.out.println("Mensaje recibido del cliente: " + clientMessage);

                // Con el método countLetters, cuenta el número de letras del mensaje clientMessage
                int lettersCount = countLetters(clientMessage);
                writer.println("Tu mensaje tiene " + lettersCount + " letras"); // Enviar la cantidad de letras al cliente

                // Con equals compara si el mensaje es "quit" para cerrar el servidor. 
                if ("quit".equalsIgnoreCase(clientMessage)) { //y escribe este mansaje
                    System.out.println("Fin del programa!");
                    break;
                }
			}

		} catch (IOException ex) {   //Recojo la excepción en caso de que no me funcione

			System.out.println("Server exception: " + ex.getMessage());

			ex.printStackTrace();

		}

	}	
	
	
	// Método para contar el número de letras en una cadena
	private static int countLetters(String text) {
	    int count = 0;
	    for (char c : text.toCharArray()) {
	        if (Character.isLetter(c)) {
	            count++;
	        }
	    }
	    return count;
	}

	

}


