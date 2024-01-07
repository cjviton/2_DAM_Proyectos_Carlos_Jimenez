import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class Servidor {

	public static void main(String[] args) { // Necitamos pasarle el puerto. Lo hago a traves de la configuración de debug
								// en TimeServer en argumento y le indico que haga la escucha en el puerto 8087
		if (args.length < 1)    //Se verifica si se proporcionó al menos un argumento al programa. 
			return;				//Si no se proporciona, el programa simplemente sale sin hacer nada.

		int port = Integer.parseInt(args[0]); // Convierte el primer argumento (que debería ser el número de puerto) a un entero.


		try (ServerSocket serverSocket = new ServerSocket(port)) {   //Crear un ServerSocket que escuche en el puerto especificado.


			System.out.println("Server is listening on port " + port);

			while (true) { // Esto es un bucle infinito de espera activa de nuevas conexiones

					Socket socket = serverSocket.accept();  //Esperar peticiones y las acepta

					System.out.println("New client connected");

					OutputStream output = socket.getOutputStream(); //Lee la petición que le ha llegado, 

					PrintWriter writer = new PrintWriter(output, true);  //Escribe la petición y 

					writer.println("DEvuelve la conexión, perono el día");
					writer.println(new Date(0).toString());   			//envía la fecha actual al cliente.

			}

		} catch (IOException ex) {   //Recojo la excepción en caso de que no me funcione

			System.out.println("Server exception: " + ex.getMessage());

			ex.printStackTrace();

		}

	}

}


