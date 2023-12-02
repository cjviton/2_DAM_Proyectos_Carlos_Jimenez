import tkinter as tk

raiz = tk.Tk()

#Abró el archivo de texto que tengo en la otra carpeta del proyecto en modo lectura
archivo = open("estructura.txt","r")

#Creo una variable lineas que va a leer lo que hayen el archivo de texto
lineas = archivo.readlines()

#Con un bucle for each recorro las lineas de texto y las escribo

for linea in lineas:
    elemento = linea.strip()#Con el método strip quito el espacio entre las lineas escritas 
                           #Capturo cada linea de texto del documento estructura

    if elemento == "entrada":
        tk.Entry(raiz).pack()
    elif elemento == "etiqueta":
        tk.Label(raiz,text="Esto es uan etiqueta").pack()
    elif elemento == "boton":
        tk.Button(raiz,text="Esto es un botón").pack()
    

raiz.mainloop()
