#include <stdio.h>

int main(int argc,char *argv[]){

    int edad = 45;
    printf("Mi edad es %i \n", edad);
    
    edad ++; //suma 1
    printf("Mi edad es %i \n", edad);
    
    edad --; //resta 1
    printf("Mi edad es %i \n", edad);

    edad +=2; //le suma 2
    printf("Mi edad es %i \n", edad);
    
    edad -=2; //resta dos caracteres
    printf("Mi edad es %i \n", edad);
    
    edad *=2; //multiplica por 2
    printf("Mi edad es %i \n", edad);
    
    edad /=2; //divide entre 2
    printf("Mi edad es %i \n", edad);


    return 0;
}

