#include <stdio.h>
#include <string.h>

/*Dentro de cjdb creo una carpeta, db. y vamos a supuner que de momento trabajo con una sola base de datos.
Le voy a decir que el primer valor que le pasaré será el nombre de la tabla y el segundo nombre que le pasaré es lo que quiero guardar
*/

int main(int argc,char *argv[]){  
    
    FILE *archivo;
    char *nombrearchivo = argv[1];                     //El nombre delarchivo es igual al arrg1 y el texto que me                                                        //guardará en ese archivo al arg2
    archivo = fopen(strcat(nombrearchivo,".txt"),"a");
    char *texto = argv[2];
    fputs(strcat(texto,"\n"),archivo);
    fclose(archivo);
    return 0;
        
}       

/*la orden en la consola de comandos seria la siguente:
C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "clientes" "Carlos J"
De esta manera me está creando una carpeta en el directorio, con el nombre clientes y dentro el texto, CarlosJ
*/