#include <stdio.h>

int main(){
    FILE *archivo;                    //creo un archivo de tipo file y lo llamo archivo
    archivo = fopen("basededatos.txt","w"); //archivo es igual a fopen en modo writhe(escritura)
    char *texto ="JVDB";
    fputs(texto,archivo);
    fclose(archivo);                     //cierro el archivo que he abierto con fopen
        
return 0;    
}       