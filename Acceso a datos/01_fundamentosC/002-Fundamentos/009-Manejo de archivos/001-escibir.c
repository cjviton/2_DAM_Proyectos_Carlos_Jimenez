#include <stdio.h>

int main(int argc,char *argv[]){ 
     
    FILE *archivo;                                        //creo un archivo de tipo file y lo llamo archivo
    archivo = fopen("agenda.txt","w");                    //archivo es igual a fopen en modo writhe(escritura)
    fprintf(archivo,"Esto es un texto de prueba  \n");     //aquí le digo fprintf  pongo la f delante para decirle que no lo quiero escribir en consola
                                                          //sino que lo quiero escribir en el archivo
    
    fclose(archivo);     //cierro el archivo que he abierto con fopen
    return 0;                                             
    
    
    //Al ejecutarlo me genera un archivo txt en la carpeta con el texto escrito
}
