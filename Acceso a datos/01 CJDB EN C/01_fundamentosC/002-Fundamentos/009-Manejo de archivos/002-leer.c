#include <stdio.h>

int main(int argc,char *argv[]){
     
    char cadena[100];                                        //varible array de char con 100 caracteres    
    FILE *archivo;                                              //creo un archivo de tipo file y lo llamo archivo
    archivo = fopen("agenda.txt","r");                          //AL SER DE LECTURA CAMBIO A r (read)
    
    while(fgets(cadena,100,archivo)!=NULL){
        
        puts(cadena);
    }                
    
    fclose(archivo);     //cierro el archivo que he abierto con fopen
    return 0;                                             
    
}
