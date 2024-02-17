
import java.util.Scanner;

public class Llavero {
	
	////////////////////////////
	///Variables
	////////////////////////////
	
	
	//Variable que recoge la opción elegida en el menú
	static char valor = ' ';
	//Variable que recoge la pulsacion del taclado
	static Scanner teclado = new Scanner(System.in);
	
	////////////////////////////
	//Leer llavero
	////////////////////////////
	
	
	////////////////////////////
	//Escribir llavero
	////////////////////////////
	

	
	////////////////////////////
	///Main
	////////////////////////////
	
	public static void main(String[] args) {
		//No salir de estas líneas hasta que el usuario no pulse terminar (opcion 6)
		valor = menu();
		escogerOpcion(valor);
	}//Fin Main
		
		
		
		
	////////////////////////////
	///Métodos
	////////////////////////////
			
		static char menu() {
			
			char opcion;
			System.out.println("Menu de claves");
			System.out.println("--------------------");
			System.out.println("1-Encriptar mensaje");
			System.out.println("2-Desencriptar mensaje");
			System.out.println("3-Firmar mensaje");
			System.out.println("4-Comprobar firma mensaje");
			System.out.println("5-Añadir contacto");
			System.out.println("6-Salir");
			
			System.out.println("\n \n Escoje opción (y return): ");
			
			opcion = teclado.next().charAt(0);
			return(opcion);
			
		}
		
		
		
		////////////////////////////
		//Menú
		//NO salir del menú si la opcion no es correcta
		////////////////////////////
		static char escogerOpcion(char numero_opcion) {
			
			switch(numero_opcion) {
			
				case '1':	//Encriptar mensaje
					System.out.println("La opción elegida es: " +numero_opcion +" .Encriptar mensaje");				
				break;
				
				
				case '2':	//Desencriptar mensaje
					System.out.println("La opción elegida es: " +numero_opcion+" .Desencriptar mensaje");				
				break;
				
				
				case '3':	//Firmar mensaje
					System.out.println("La opción elegida es: " +numero_opcion+" .Firmar mensaje");				
				break;
				
				
				case '4':	//Comprobar firma mensaje
					System.out.println("La opción elegida es: " +numero_opcion+" .Comprobar firma mensaje");				
				break;
				
				
				case '5':	//Añadir contacto
					System.out.println("La opción elegida es: " +numero_opcion+" .Añadir contacto");
				break;
				
				
				case '6':	//Salir
					System.out.println("La opción elegida es: " +numero_opcion+" .Salir");				
				break;	
				
				default:
					System.out.println("Opnción incorrecta");
			
			}//Fin switch
			return numero_opcion;
		
		}//Fin método escoger opción 

} //Fin clase llavero
