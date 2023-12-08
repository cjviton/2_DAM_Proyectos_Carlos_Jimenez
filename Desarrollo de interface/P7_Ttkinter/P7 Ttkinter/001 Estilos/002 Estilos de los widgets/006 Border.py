import tkinter as tk
from tkinter import ttk

raiz = tk.Tk()


#Capturo en la variable stilo el estilo de ttk
#Desde culaquier aplcación puedo coger el código exadecimal de color lo pego aquí y funciona
#Foreground cambia el color de las letras
#Background cambia el color del fondo
#Arial forma de la fuente y tamaño
#Padding distancia a los bordes y le da también tamaño
#Border le da grosor al borde

estilo = ttk.Style()
estilo.configure('TButton',foreground='#3446eb',background='green',font=('Arial',24)) 

#Estilo de la etiqueta
estilo.configure('TLabel',foreground='#22e01b',background='yellow', padding=90,borderwidth=3)





ttk.Button(raiz,text="Esto es un boton ttk").pack(padx=25,pady=25)
ttk.Label(raiz,text ="Esto es una etiqueta ").pack(padx=25,pady=25)

raiz.mainloop()
