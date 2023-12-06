import tkinter as tk
from tkinter import ttk

raiz = tk.Tk()


#Capturo en la variable stilo el estilo de ttk
#Desde culauier aplcación puedo coger el código exadecimal de color lo pego aquí y funciona
estilo = ttk.Style()
estilo.configure('TButton',foreground='#3446eb') #Cambio el color de las letras

ttk.Button(raiz,text="Esto es un boton ttk").pack(padx=25,pady=25)


raiz.mainloop()
