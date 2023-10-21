#include <stdio.h>
#include <string.h>

/*Ahora quiero seleccionar bases de datos entonces:
basededatos=argv[1]
nombredelarchivo=argv[2]
texto=argv[3]
*/

int main(int argc,char *argv[]){  
    
    FILE *archivo;
    char *basededatos = argv[1];  
    char *nombrearchivo = argv[2];
    
    char ruta[100];
    strcpy(ruta,basededatos);
    strcat(ruta,"-");
    strcat(ruta,nombrearchivo);
    strcat(ruta,".txt");
    
    archivo = fopen(ruta,"a");    
    char *texto = argv[3];
    fputs(strcat(texto,"\n"),archivo);
    fclose(archivo);
    return 0;
        
}       

/*la orden en la consola de comandos seria la siguente:
C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "Carlos J" "clientes" "José Peréz"

De esta manera me está creando una carpeta en el directorio, con el nombre de la base de datos junto con el nombre de la tabla  y dentro el texto, José Pérez"
*/