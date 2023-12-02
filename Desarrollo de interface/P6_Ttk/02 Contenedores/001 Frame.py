import tkinter as tk
from tkinter import ttk #Importo widget avanzados ttk
                     
raiz = tk.Tk()

#Frame es un contenedor que nos permite agrupar diferentes elementos

marco = tk.Frame(raiz,padx=10,pady=10)

#Meto etiqueta y botón dentro de marco 
tk.Label(marco,text="Hola mundo desde Frame").pack(padx=10,pady=10)
tk.Button(marco,text="Esto es un botón").pack(padx=10,pady=10)

#Y empaqueto marco, no raiz
marco.pack() 

raiz.mainloop()



                   
