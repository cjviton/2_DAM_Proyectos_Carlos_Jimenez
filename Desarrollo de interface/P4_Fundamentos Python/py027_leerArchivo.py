archivo = open("miarchivo.txt",'r') #El flag en este caso al ser lectura es la "r"

#print(archivo.readline())  # read line lee una linea y deja el cursor al final de esa linea,
#print(archivo.readline())  # al llamarlo otra vez, leera la siguiente linea

##print(archivo.read())     #Con la función read te leerá todo el docuemento


contador = 0                #Con un bucle for podemos leer el número de lineas que 
for i in range(0,10):       #nosotros queramos
   
    print(archivo.readline())
    if archivo.readline() == ""   #para terminar de leer cuando se terminé el documento o haya una linea en blanco
        break                     #si readLine es == a "" nada, break                       
                                
