#Para leer archivos XML necesito importar la librería bs4
#Beautiful Soup es una librería Python que permite extraer
#información de contenido en formato HTML o XML.

from bs4 import BeautifulSoup
import tkinter as tk

raiz = tk.Tk()


archivo= open("interfaz.xml","r") #Abro el archivo interfaz en modo lectura
contenido = archivo.read()
xml=BeautifulSoup(contenido,"xml")

for campo in xml.find_all("campo"):  #Con el bucle for le digo que busque con el 
                                     #contenido campo e imprima
    
    tipo = campo.get ("tipo")        #Capturo el tipo de campo 

    if tipo == "entrada":
        tk.Entry(raiz).pack(padx=10,pady=10)
    elif tipo == "etiqueta":
        tk.Label(raiz,text="Hola").pack(padx=10,pady=10)
    elif tipo == "boton":
        tk.Button(raiz,text="Hola 2").pack(padx=10,pady=10)



tk.mainloop()
