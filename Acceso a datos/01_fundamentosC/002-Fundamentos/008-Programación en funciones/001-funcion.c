#include <stdio.h>


int sumar(){                            //creo la función sumar que llamare en le main de más abajo
    int operador1 = 4;
    int operador2 = 3;
    int suma = operador1 + operador2;
    return suma;
}



int main(int argc,char *argv[]){
    
    printf("La suma es:%i \n", sumar());

    return 0;
}

