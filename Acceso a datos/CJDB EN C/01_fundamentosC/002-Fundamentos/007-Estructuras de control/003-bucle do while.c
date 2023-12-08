#include <stdio.h>

int main(int argc,char *argv[]){
    
    int edad = 47;
    
    //el contenido del bucle se va a ejecutar al menos 1 vez
    
    do{                                  //El contenido del bucle se va a ejecutar 
        printf("Tu edad es %i ", edad);
        edad++;
        
    }while(edad < 50);                  //mientras que..
    
    return 0;
}

