#include <stdio.h>

int main(int argc,char *argv[]){
    
    printf("Elige el numero entre 0 y 9: ");
    
    char numero=getchar();
    
    printf("El caractar que has seleccionado es: %c \n", numero);
    
    printf (numero);
    
    return 0;
}

