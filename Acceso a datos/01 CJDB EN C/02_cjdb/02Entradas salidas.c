#include <stdio.h>
#include <string.h>

/*Este programa ecribe un texto en enn archivo base de datos, el texto se lo introduzco yo por parametro en el momento de la ejecucuión del programa en la consola. ""importante entrecomillado"
*/

int main(int argc,char *argv[]){    
    FILE *archivo;                          //creo un archivo de tipo file
    archivo = fopen("basededatos.txt","a"); //archivo es igual a fopen con el nombre basededatos en modo                                                                                                                 //writhe(escritura). Si aquí pongo una a, va sumando lo que vaya                                                                                                             //escribiendo
    char *texto = argv[1];
    fputs(strcat(texto,"\n"),archivo);      //ecriba el texto en el archivo. Para que cada frase o palabra de cada                                                                                                       //ejecución me la escriba en una linea uso strcat, "\n" y tengo que                                                                                                           //añadir arriba la librería de string
          
    fclose(archivo);                        //cierro el archivo que he abierto con fopen
    
    
    return 0;    
}   