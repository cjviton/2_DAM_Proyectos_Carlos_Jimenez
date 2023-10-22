#include <stdio.h>
#include <string.h>

int main(int argc,char *argv[]){

    char nombre[] = "Carlos";
    char apellidos[] = "Jimenez Viton";
    
    strcat(nombre,apellidos);//con strcat concateno variables

    printf("Mi nombre completo es: %s",nombre); 
    
    return 0;
}

