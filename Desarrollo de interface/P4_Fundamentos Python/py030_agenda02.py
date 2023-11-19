#Voy a hacer la agenda pero con persistencia de datos. Lo guardaré en un archivo

agenda = [["nombre","telefono","email"]]


def miAgenda():
    print("Introduce el nuevo nombre en la agenda")
    nombre = input()
    print("Introduce el numero de telefono")
    telefono = input()
    print("Introduce el correo")
    correo = input()
    
    agenda.append([nombre,telefono,correo])
    print(agenda)
    
    archivo = open("agenda.txt",'a') #Abró el archivo agenda con el flag
                                     #'a' Abierto para agregar al final del archivo sin truncarlo.
                                     #Crea un nuevo archivo si no existe.
    longaniza = nombre+","+telefono+","+correo+"\n" #Esta es la forma CSV en la que se guardará el texto en
                                                   #el archivo. \n final para salto de linea
    archivo.write(str(longaniza))#Escribo en el archivo el valor de longaniza. Antes lo casteo a string porque daba problema
    archivo.close()
   
    miAgenda() # ejecucion recursiva

miAgenda()
