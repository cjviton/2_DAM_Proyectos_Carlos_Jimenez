import tkinter as tk

raiz = tk.Tk()

#Abró el archivo de texto que tengo en la otra carpeta del proyecto en modo lectura
archivo = open("estructura.txt","r")

#Creo una variable lineas que va a leer lo que hayen el archivo de texto
lineas = archivo.readlines()

#Con un bucle for each recorro las lineas de texto y las escribo

for linea in lineas:
    contenido = linea.strip().split(",")#Con el método strip quito el espacio entre las lineas escritas 
                                        #Capturo cada linea de texto del documento estructura
    elemento = contenido[0]             #Con split, separo el contenido con cada coma
    if elemento == "entrada":
        tk.Entry(raiz).pack()
    elif elemento == "etiqueta":
        tk.Label(raiz,text=contenido[1]).pack()
    elif elemento == "boton":
        tk.Button(raiz,text=contenido[1]).pack()
    

raiz.mainloop()
