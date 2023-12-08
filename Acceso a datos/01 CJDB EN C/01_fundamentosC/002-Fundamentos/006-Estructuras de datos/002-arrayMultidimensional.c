#include <stdio.h>

int main(int argc,char *argv[]){
    
    char* agenda[10][4]; //agenda va a tener 10 entradas y cada entrada 4 datos diferentes

    agenda[0][0] = "Carlos ";
    agenda[0][1] = "Jimenez Viton";
    agenda[0][2] = "123456";
    agenda[0][3] = "cjimenez@gmail.com";

    
    agenda[1][0] = "Pepe ";
    agenda[1][1] = "Pérez López";
    agenda[1][2] = "654789";
    agenda[1][3] = "pperez@gmail.com";
    
    
    printf("El correo de Pepe es %s \n ", agenda[1][3]);

   
    
    return 0;
}

