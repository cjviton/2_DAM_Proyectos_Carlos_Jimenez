#include <stdio.h>
#include <string.h>

/*De la función CRUD de la base de datos ya tendríamos hecho el create, ahora vamos a hacer el read o select
operación = argv[1]
basedatos = argv[2]
nombrearchivo = argv[3]
texto = argv[4]

Implementamos en el codigo poder sacar datos por pantalla

*/

int main(int argc,char *argv[]){  
    
    FILE *archivo;
    char *operacion = argv[1];                //El número del cochete, indica el indice del argumento en la linea de comandos 
    char *basededatos = argv[2];
    char *nombrearchivo = argv[3];
    
    char ruta[100];  //Array de chat
    strcpy(ruta,basededatos);                //La función strcpy  copiar una cadena de caracteres
    strcat(ruta,nombrearchivo);              //la función strycat concatena varibles
    strcat(ruta,".txt");
        
    if(strcmp(operacion,"select") == 0){    //strcmp compara cadenas de caracteres, si es igual devuelve 0, diferente 1 (0=true  1=false)
        printf("te doy datos");
        archivo = fopen(ruta,"r");         //como lo que quiero es leer, abro el archivo en modo read
        printf("te doy datos:\n");
        char linea[1024];
        while(fgets(linea,sizeof(linea),archivo) != NULL){ 
            if (strstr(linea, "Carlos") != NULL)     //con este condicional sólo imprimira las lineas que contengan la palabra Carlos 
            printf("Linea: %s",linea);               //strstr se utiliza para buscar la primera aparición de una subcadena (substring) dentro de una cadena más grande
        }
        
     }else if(strcmp(operacion,"insert") == 0){
        archivo = fopen(ruta,"a");        //como lo que quiero es añadir, abro el archivo en modo a
        char *texto = argv[4];
        fputs(strcat(texto,"\n"),archivo); //fputs escribe cadena de char en un archivo
        fclose(archivo);
    }else{
        printf("operación no válida");
    }
    
    return 0;        
}       

/*
La nstrucción para inasertar datos sería esta: 

C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "insert" "Carlos" "clientes" "Jose Lopez"

La nstrucción para hacer un select de datos sería esta: 

C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "select" "Carlos" "clientes"

*/