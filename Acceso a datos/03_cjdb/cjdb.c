#include <stdio.h>
#include <string.h>


/*
El siguiente paso es crear una colección. Una colección se refiere a un conjunto de documentos dentro de una base de datos. Esto se hace en base de datos documentales, como podría ser MongoDB

Voy a crear también una carpeta llamada miEmpresa y dentro de esta, una subcarpeta llamada clientes.
*/


int main(int argc,char *argv[]){  
    
    FILE *archivo;
    char *operacion = argv[1];
    char *basededatos = argv[2];
    char *coleccion = argv[3];
    char *documento = argv[4];
    
    char ruta[100];
    strcpy(ruta,basededatos);
    strcat(ruta,"/");
    strcat(ruta,coleccion);
    strcat(ruta,"/");
    strcat(ruta,documento);
    strcat(ruta,".json");
    
    printf("ruta es: %s",ruta);
    
    
    
    if(strcmp(operacion,"select") == 0){    
        printf("te doy datos");
        archivo = fopen(ruta,"r");         
        printf("te doy datos:\n");
        char linea[1024];
        while(fgets(linea,sizeof(linea),archivo) != NULL){
            printf("Linea: %s",linea);
        }
        
     }else if(strcmp(operacion,"insert") == 0){
        archivo = fopen(ruta,"w");        
        char *texto = argv[4];
        fputs(strcat(texto,"\n"),archivo); 
        fclose(archivo);
    }else{
        printf("operación no válida");
    }
    
    
    
    return 0;        
}    




/*
La función strcpy  copiar una cadena de caracteres
la función strycat concatena varibles
la función strcmp compara cadenas de caracteres, si es igual devuelve 0, diferente 1 (0=true  1=false)
la función fputs escribe cadena de char en un archivo


La nstrucción para inasertar datos sería esta: 

C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "insert" "Carlos" "clientes" "Jose Lopez"

La instrucción para hacer un select de datos sería esta: 

C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "select" "Carlos" "clientes"

*/