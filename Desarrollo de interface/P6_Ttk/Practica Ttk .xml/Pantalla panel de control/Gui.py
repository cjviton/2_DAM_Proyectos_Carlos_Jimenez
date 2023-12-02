#Para leer archivos XML necesito importar la librería bs4
#Beautiful Soup es una librería Python que permite extraer
#información de contenido en formato HTML o XML.

from bs4 import BeautifulSoup
import tkinter as tk

raiz = tk.Tk()
raiz.geometry("800x600+10+10")  #Cambio la geometría de la ventaja. 
raiz.title ("Penel de control") #Pongo título en la vntana
raiz.iconbitmap("logo.ico")     #Favicon windows


#Menus de la ventana

barramenu=tk.Menu(raiz)
raiz.config(menu=barramenu)
archivo = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Archivo",menu=archivo)

archivo.add_command(label="Nuevo")
archivo.add_command(label="Abrir")
archivo.add_command(label="Guardar")
archivo.add_command(label="Salir")


editar = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Editar", menu=editar)

editar.add_command(label="Deshacer")
editar.add_command(label="Copiar")
editar.add_command(label="Cortar")
editar.add_command(label="Pegar")


ayuda = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Ayuda",menu=ayuda)

ayuda.add_command(label="Ayuda")
ayuda.add_command(label="Documentacion en linea")
ayuda.add_command(label="Acerda de")
ayuda.add_command(label="Soporte")


#Creo una ventana partida y lal meto en raiz con orientación
ventanapartida = tk.PanedWindow(raiz,orient=tk.HORIZONTAL)

#Creo 2 Frame y los llamo marco1 y marco2
marco1 = tk.Frame (ventanapartida,background="grey")
marco2 = tk.Frame (ventanapartida,background="dark grey")



#Bucle for para dividir el marco2 en  en 3 columnas y 3 filas
for i in range(3):                   
    marco2.columnconfigure(i, weight=1)
    
# Bucle for para dividir el marco2 en 3 filas
for i in range(3):
    marco2.rowconfigure(i, weight=1)

    

#Los añado a ventana partida
ventanapartida.add(marco1)
ventanapartida.add(marco2)

#Enpaqueto 
ventanapartida.pack(fill=tk.BOTH,expand=True)



#Abro el archivo controlador en modo lectura
archivo= open("controlador.xml","r") 
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
            row = campo.get("row")           #Capturo el campo row
            column = campo.get("column")     #Capturo el campo column

            
            if tipo == "entrada":
                entrada1 = tk.Entry(marco2)
                entrada1.grid(row=row,column=column,padx=10,pady=10)
            elif tipo == "etiqueta":
                entrada2 = tk.Label(marco2,text=texto)
                entrada2.grid(row=row,column=column,padx=10,pady=10)
            elif tipo == "boton":
                entrada3 = tk.Button(marco2,text=texto)
                entrada3.grid(row=row,column=column,padx=10,pady=10)
                


tk.mainloop()
