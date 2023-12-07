import tkinter as tk
from tkinter import ttk

raiz = tk.Tk()


#Capturo en la variable stilo el estilo de ttk
#Desde culaquier aplcación puedo coger el código exadecimal de color lo pego aquí y funciona
#Foreground cambia el color de las letras
#Background cambia el color del fondo
estilo = ttk.Style()
estilo.configure('TButton',foreground='#3446eb',background='green') #Cambio el color de las letras

#Estilo de la etiqueta
estilo.configure('TLabel',foreground='#22e01b',background='yellow')





ttk.Button(raiz,text="Esto es un boton ttk").pack(padx=25,pady=25)
ttk.Label(raiz,text ="Esto es una etiqueta ").pack(padx=25,pady=25)

raiz.mainloop()
