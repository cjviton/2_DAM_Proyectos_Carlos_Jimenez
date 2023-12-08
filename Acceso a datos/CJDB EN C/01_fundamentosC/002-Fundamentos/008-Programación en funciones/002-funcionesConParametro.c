#include <stdio.h>


int sumar(int op1, int op2){                            //creo la función sumar que llamare en le main de más abajo
    int operador1 = op1;
    int operador2 = op2;                                //le digo, entre parentesis que le voy a dar dos variables de tipo int
    int suma = operador1 + operador2;
    return suma;
}



int main(int argc,char *argv[]){
    
    printf("La suma es:%i \n", sumar(1,4));           //aquí es donde introduzco las variables de tipo int tantas veces como quiera
    printf("La suma es:%i \n", sumar(7,4)); 
    printf("La suma es:%i \n", sumar(6,5)); 
    return 0;
}

