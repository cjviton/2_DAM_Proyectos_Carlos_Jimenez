#include <stdio.h>
#include <string.h>
#include <unistd.h>   //Biblioteca para poder usar la función access


/*
El siguiente paso es crear una colección. Una colección se refiere a un conjunto de documentos dentro de una base de datos. Con esto voy a crear una base de datos documental, como podría ser MongoDB

*/


int main(int argc,char *argv[]){  
    
    FILE *archivo;
    char *operacion = argv[1];            //variable sobre la que acturara el coomando if-else (selct, insert, create_coleccion)
    char *basededatos = argv[2];          //variables de la ruta de mi repositorio para la base de datos documental
    char *coleccion = argv[3];            //con el índice del cada argumento 
    
    
    if(strcmp(operacion,"select") == 0){  //la función strcmp compara cadenas de caracteres que junto con el if nos lleva a la operacion seleccionada 
        char *documento = argv[4];        //Añadimos la variable docuemto pra terminar de completar la ruta con el 4 elemento de la linea de ocomandos
        char ruta[100];                   //Creo la variable ruta sobre la que voy a concatenar la demás variables (bbdd, colección, documento) para obtener la ruta 
        strcpy(ruta,"DataBase/");            
        strcat(ruta,basededatos);         //La función strcpy  copia una cadena de caracteres 
        strcat(ruta,"/");                 //la función strycat concatena varibles
        strcat(ruta,coleccion);
        strcat(ruta,"/");
        strcat(ruta,documento);
        strcat(ruta,".json");
        archivo = fopen(ruta,"r");         //Abrimos el archivo que marca la ruta con permisos de solo lectura
        printf(ruta);                      //Dejo este printf y ok para verificar que la ruta que he marcado es la correcta
        printf(" te doy datos:\n");
        char linea[1024];
        while(fgets(linea,sizeof(linea),archivo) != NULL){
            printf("Linea: %s",linea);
        }
        
        /* La nstrucción para leer datos sería esta: 
           C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\03_cjdb>cjdb.exe insert (base de datos) miEmpresa (colección) clientes (documeto) cliente1 "(el texto){'nombre':'Pepe'}"
        */
        
        }else if(strcmp(operacion,"insert") == 0){
            char *documento = argv[4];
            char ruta[100];
            strcpy(ruta,"DataBase/");
            strcat(ruta,basededatos);
            strcat(ruta,"/");
            strcat(ruta,coleccion);
            strcat(ruta,"/");
            strcat(ruta,documento);
            strcat(ruta,".json");
            archivo = fopen(ruta,"w");
            char *texto = argv[5];          //En esta función añadimo un arguento más, con índice 5, que será el texto que vamos a añadir en el documento
            fputs(strcat(texto,"\n"),archivo);
            fclose(archivo);
            printf(ruta);                   //Dejo este printf y ok para verificar que la ruta que he marcado es la correcta
            printf("ok");


            /* La instrucción para inasertar datos sería esta
               C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\03_cjdb>cjdb.exe insert (base de datos) miEmpresa (colección) clientes (documeto) cliente1 (el texto) "{'nombre':'Pepe'}"
             */
        
        
         }else if(strcmp(operacion,"create_collection") == 0){
            char rutacoleccion[100];
            strcpy(rutacoleccion,"DataBase/");
            strcat(rutacoleccion,basededatos);
            strcat(rutacoleccion,"/");
            strcat(rutacoleccion,coleccion);
            printf(rutacoleccion);
            if(mkdir(rutacoleccion) == 0){  //777 para darle permiso de lecutra, escritura y borrado
                printf("ok");
            }else{
                printf(" No ha funcionado");
            }
        
         /* La instrucción para crear uan colección nueva sería esta: 
           C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\03_cjdb>cjdb.exe create_collection miEmpresa facturas
         */
        
        
         }else if (strcmp(operacion, "delete") == 0) {
            char *documento = argv[4];          //Documento toma el valor del 4 elemnto en la linea de comandos, que es documento que queremos borrar
            char ruta[100];                     //Variable para capturar la ruta 
            strcpy(ruta, "DataBase/");
            strcat(ruta, basededatos);
            strcat(ruta, "/");
            strcat(ruta, coleccion);
            strcat(ruta, "/");
            strcat(ruta, documento);
            strcat(ruta, ".json");
            
            if (access(ruta, F_OK) != -1) {    //Uso la función access junto con la constante F_OK son para verificar si el archivo existe
                                               //Si existe devuelve 0, si no existe devuelve -1
                if (unlink(ruta) == 0) {       //Si devuelvo 0 la función unlink borra el archivo de la ruta especifica, si devuelve 0 ha sido borrado
                printf("Documento eliminado: %s\n", documento);
                } else {
                printf("Error al eliminar el documento: %s\n", documento);  //sino dara error
                }
                
            } else {
                printf("El documento no existe: %s\n", documento); //Si la función access no lo encuentra devolverá este mensje
            }
            
         
         
          }else{                              //si no intriducimos nigún valor reconocido por el select nos devolverá esta linea de texto
             printf("operacion no valida");
          }

    
    
    return 0;        
}    




/*
La función strcpy  copiar una cadena de caracteres
la función strycat concatena varibles
la función strcmp compara cadenas de caracteres, si es igual devuelve 0, diferente 1 (0=true  1=false)
la función fputs escribe cadena de char en un archivo


La nstrucción para inasertar datos sería esta: 
C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\03_cjdb>cjdb.exe insert (base de datos) miEmpresa (colección) clientes (documeto) cliente1 "(el texto){'nombre':'Pepe'}"

La instrucción para hacer un select de datos sería esta: 
C:\Users\usuario\Documents\2ºDAM Proyectos Carlos Jimenez\Acceso a datos\02_cjdb>cjdb.exe "select" "Carlos" "clientes"

*/