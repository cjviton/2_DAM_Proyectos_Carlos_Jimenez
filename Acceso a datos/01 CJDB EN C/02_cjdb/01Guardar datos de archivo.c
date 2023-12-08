#include <stdio.h>

int main(){
    FILE *archivo;                          //creo un archivo de tipo file y lo llamo archivo
    archivo = fopen("basededatos.txt","w"); //Abró el archivo (fopen) en modo writhe(escritura)
    char *texto ="CJDB";                    //Escribo en el archivo
    fputs(texto,archivo);
    fclose(archivo);                          //cierro el archivo que he abierto con fopen

return 0;    
} 