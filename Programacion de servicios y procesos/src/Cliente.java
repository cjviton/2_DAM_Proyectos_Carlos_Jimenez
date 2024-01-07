import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		if (args.length < 2)  //Verifica si se proporcionan al menos dos argumentos al programa. 
			return;			  //El programa espera recibir el nombre del host y el número de puerto 

		String hostname = args[0];              //Obtiene el nombre del host 

		int port = Integer.parseInt(args[1]);   //y el número de puerto de los argumentos de línea de comandos.

		try (Socket socket = new Socket(hostname, port)) {  //Establece una conexión al servidor utilizando la clase Socket

			InputStream input = socket.getInputStream();    //Envia una petición al servidor

			BufferedReader reader = new BufferedReader(new InputStreamReader(input)); //Lo mete en un bufferReader para facilitar la lectura

			String time = reader.readLine();  //Lee una línea del BufferedReader, que contiene la hora proporcionada por el servidor.

			System.out.println(time);  //Imprime la hora recuperada del servidor en la consola.

		} catch (UnknownHostException ex) {  //Captura y maneja dos posibles excepciones:


			System.out.println("Server not found: " + ex.getMessage());

		} catch (IOException ex) {

			System.out.println("I/O error: " + ex.getMessage());

		}

	}
		

}
