import tkinter as tk
from tkinter import ttk

raiz = tk.Tk()


#Capturo en la variable stilo el estilo de ttk
estilo = ttk.Style()
estilo.configure('TButton',foreground='green') #Cambio el color de las letras

ttk.Button(raiz,text="Esto es un boton ttk").pack(padx=25,pady=25)


raiz.mainloop()
