#include <stdio.h>

int main(int argc,char *argv[]){
    
  int dia = 1;
    
                                        //Puede que no se ejecute ni una sola vez. hay una condicion al principio del bucle

  while(dia<31){                                         //miestras que dia sea menor que 31,vas a escribir esto
        
        printf("Hoy es el día: %i del mes \n ",dia);
        dia++;                                            //cada vuelta de bucle suma 1
    }     
    
    return 0;
}

