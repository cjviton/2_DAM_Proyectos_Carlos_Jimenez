

agenda = [["nombre","telefono","email"]]


archivo = open("agenda.txt",'r')                #Primero lee lo que tengo guardado en agenda.txt
for i in range(1,10):
    nuevalinea = archivo.readline().split(",")  #Con split lo convierto en lista
    agenda.append(nuevalinea)


print(agenda)                                   #Me lo muestra                       

def miAgenda():                                 
    #Menu inicial
    print("Escoge tu opcion")
    print("1.-Introduce nuevo registro")
    print("2.-Listar registros")
    print("3.-Buscar registro")
    opcion = input()                            #Capturo en la variable opción la eleccion del usuario
    if opcion == "1":                           #Si es 1 me lleva al código para introducir un nuevo registro 
        print("Introduce el nuevo nombre en la agenda")
        nombre = input()
        print("Introduce el numero de telefono")
        telefono = input()
        print("Introduce el correo")
        correo = input()
        agenda.append([nombre,telefono,correo]) #Agrego las variables a la agenda
        # Guardo en archivo
        archivo = open("agenda.txt",'a')
        longaniza = nombre+","+telefono+","+correo+"\n"
        archivo.write(str(longaniza))
        archivo.close()
    if opcion == "2":
        for i in range(1,len(agenda)): #len temaño de la agenda
            print(agenda[i])
    # ejecucion recursiva
    miAgenda()

miAgenda()
