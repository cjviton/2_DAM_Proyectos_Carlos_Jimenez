#include <stdio.h>

int main(int argc,char *argv[]){
    
    //se cuantas veces se va a ejecutar
    
    for(int dia=1;dia<31;dia++){  //bucle for que nos repite desde el dia 1, 
                                  //mientras que sea menor de 31, incrementa 1 cada vuelta
        
        printf("Hoy es el día: %i del mes \n ",dia);
    }
    
    return 0;
}

