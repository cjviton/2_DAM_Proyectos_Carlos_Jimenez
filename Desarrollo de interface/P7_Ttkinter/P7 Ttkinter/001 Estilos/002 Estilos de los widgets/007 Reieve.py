import tkinter as tk
from tkinter import ttk

raiz = tk.Tk()

#Creo un boton 1
boton1 = ttk.Button(raiz,text="Este es el boton 1")
boton1.pack(padx=25,pady=25)

#Creo un aetiqueta
ttk.Label(raiz,text ="Esto es una etiqueta ").pack(padx=25,pady=25)

#Creo un boton 2
boton2 = ttk.Button(raiz,text="Este es el boton 2")
boton2.pack(padx=25,pady=25)

#Capturo en la variable stilo el estilo de ttk
#Desde culaquier aplcación puedo coger el código exadecimal de color lo pego aquí y funciona
#Foreground cambia el color de las letras
#Background cambia el color del fondo
#Arial forma de la fuente y tamaño
#Padding distancia a los bordes y le da también tamaño
#Border le da grosor al borde
#Relief da relieve
estilo = ttk.Style()
estilo.configure('Boton1.TButton',foreground='#3446eb',background='green',font=('Arial',24)) 
boton1.configure(style='Boton1.TButton')


#Estilo de la etiqueta
estilo.configure('TLabel',foreground='#22e01b',background='yellow', padding=90,borderwidth=3,relief='raised')


estilo.configure('Boton2.TButton',background='yellow') 
boton2.configure(style='Boton2.TButton')





raiz.mainloop()
