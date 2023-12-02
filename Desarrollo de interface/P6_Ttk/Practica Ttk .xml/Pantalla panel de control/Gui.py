#Para leer archivos XML necesito importar la librería bs4
#Beautiful Soup es una librería Python que permite extraer
#información de contenido en formato HTML o XML.

from bs4 import BeautifulSoup
import tkinter as tk

raiz = tk.Tk()

#Creo una ventana partida y lal meto en raiz con orientación
ventanapartida = tk.PanedWindow(raiz,orient=tk.HORIZONTAL)

#Creo 2 Frame y los llamo marco1 y marco2
marco1 = tk.Frame (ventanapartida,background="grei")
marco2 = tk.Frame (ventanapartida,background="blue")

#Los añado a ventana partida
ventanapartida.add(marco1)
ventanapartida.add(marco2)

#Enpaqueto 
ventanapartida.pack(fill=tk.BOTH,expand=True)


archivo= open("controlador.xml","r") #Abro el archivo interfaz en modo lectura
contenido = archivo.read()
xml=BeautifulSoup(contenido,"xml")

for marco in xml.find_all("marco"):  #Con el bucle for le digo que busque en el xml con el 
                                     #contenido marco
   
    num = marco.get("numero")        #Capturo el campo número y con estructura if
                                     #lo mando a marco 1 o marco 2
    print(num)      #Verifico que la captura es correcta
    
    if num == "uno":
        
        for campo in marco.find_all("campo"): #Aquí el bucle for ya sólo tiene que iterar sobre el marco 
                
            tipo = campo.get ("tipo")        #Capturo el tipo de campo del xml de marco 1
            texto = campo.get("texto")       #Capturo el campo texto del xml

            if tipo == "entrada":
                tk.Entry(marco1).pack(padx=10,pady=10)
            elif tipo == "etiqueta":
                tk.Label(marco1,text=texto).pack(padx=10,pady=10)
            elif tipo == "boton":
                tk.Button(marco1,text=texto).pack(padx=10,pady=10)

    elif num == "dos":

        for campo in marco.find_all("campo"):

            tipo = campo.get ("tipo")        #Capturo el tipo de campo del xml de marco 2
            texto = campo.get("texto")       #Capturo el campo texto del xml

            if tipo == "entrada":
                tk.Entry(marco2).pack(padx=10,pady=10)
            elif tipo == "etiqueta":
                tk.Label(marco2,text=texto).pack(padx=10,pady=10)
            elif tipo == "boton":
                tk.Button(marco2,text=texto).pack(padx=10,pady=10)


tk.mainloop()
