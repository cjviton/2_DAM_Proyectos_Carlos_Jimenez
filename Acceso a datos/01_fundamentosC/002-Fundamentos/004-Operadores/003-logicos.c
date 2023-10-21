#include <stdio.h>

int main(int argc,char *argv[]){

    // && es y
    printf("Dime si es cierto: %i \n", (4>3 && 3>2 && 2>1 ));//si todas las operaciones son ciertas me devolverá 1
    printf("Dime si es cierto: %i \n", (4>3 && 3>2 && 2<1 ));//con que una de las operaciones ya no sea cierta me devualve 0
    
    //|| es o
    
    printf("Dime si es cierto: %i \n", (4>3 || 3>2 || 2>1 ));
    printf("Dime si es cierto: %i \n", (4>4 || 3>2 || 2>1 ));
    
    
    
    return 0;
}

