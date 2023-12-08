#include <stdio.h>
#include <string.h>

/*De la función CRUD de la base de datos ya tendríamos hecho el create, ahora vamos a hacer el read
operación = argv[1]
basedatos = argv[2]
nombrearchivo = argv[3]
texto = argv[4]

*/

int main(int argc,char *argv[]){  
    
    FILE *archivo;
    char *operacion = argv[1];
    
    if(strcmp(operacion,"select") == 0){  //si en el momento de la ejecucion introduzco select ejecutara ese código
        printf("te doy datos");
    }else if(strcmp(operacion,"insert") == 0){
        char *basededatos = argv[2];;      //si en el momento de la ejecucion introduzco insert ejecutara ese código    
        char *nombrearchivo = argv[3];    //Esta sección insert es todo el código del commit ante

        char ruta[100];
        strcpy(ruta,basededatos);
        strcat(ruta,"-");
        strcat(ruta,nombrearchivo);
        strcat(ruta,".txt");

        archivo = fopen(ruta,"a");
        char *texto = argv[4];
        fputs(strcat(texto,"\n"),archivo);
        fclose(archivo);
    }else{
        printf("operación no válida");
    }
    return 0;
        
}       

/*
La nstrucción sería esta:
C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "select"

*/