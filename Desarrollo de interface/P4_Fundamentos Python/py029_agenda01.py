
agenda = [["nombre","telefono","email"]] #Declaro un a lista con corchete con los campos


def miAgenda():  #defino un método agenda para pedir por consola los valores
    print("Introduce el nuevo nombre en la agenda")
    nombre = input()#Con input la variable nombre,tomará el valor que introduzcamos por teclado
    print("Introduce el numero de telefono")
    telefono = input()
    print("Introduce el correo")
    correo = input()
    
    agenda.append([nombre,telefono,correo])#appen para agregar elementos a la lista
    print(agenda)
   
    miAgenda() # ejecucion recursiva

miAgenda()
