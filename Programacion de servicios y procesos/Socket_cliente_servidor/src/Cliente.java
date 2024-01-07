import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		if (args.length < 2)  //Verifica si se proporcionan al menos dos argumentos al programa. 
			return;			  //El programa espera recibir el nombre del host y el número de puerto 

		String hostname = args[0];              //Obtiene el nombre del host del primer argumento

		int port = Integer.parseInt(args[1]);   //y el número de puerto de los argumentos de línea de comandos.
												//y lo convierte en númeor entero
		try (Socket socket = new Socket(hostname, port)) {  //Establece una conexión al servidor utilizando la clase Socket

	   //Genera un BufferedReader para leeer los datos desde la entrad del teclado
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Escribe tu mensaje, o si quieres terminar escribe: salir : "); //Pide al usuario un texto
            String userMessage = userInputReader.readLine(); //Almacena en userMessage la entrada de texto escrita por el usuario

            // Enviar la línea de texto al servidor
            OutputStream output = socket.getOutputStream(); //guarda en una variable el outpotstrean del socket
            PrintWriter writer = new PrintWriter(output, true); //para escribir en el OutputStream del socket
            writer.println(userMessage); //Envía la linea de texto al servidor

            //Con el BufferedReader lee los datos desde el InputStreamReader del socket para recibir la respuesta del servidor
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String serverResponse = serverReader.readLine(); //Lee la respuesta del servidor
            System.out.println("La respuesta del servidor es: " + serverResponse);//Escribe en pantalla la respuesta del servidor

            // Verificar si la línea de texto es "quit" ignarando mayúsculas y minúculas
            if ("salir".equalsIgnoreCase(userMessage)) {
                System.out.println("El programa ha terminado.");//Si la comparación es positiva escribe el mensaje.
            }

		} catch (UnknownHostException ex) {  //Captura y maneja dos posibles excepciones:


			System.out.println("Server not found: " + ex.getMessage());

		} catch (IOException ex) {

			System.out.println("I/O error: " + ex.getMessage());

		}

	}
		

}
