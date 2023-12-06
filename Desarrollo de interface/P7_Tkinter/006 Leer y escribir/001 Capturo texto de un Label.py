import tkinter as tk 
from tkinter import ttk


#Puedo capturar lo que introduzca en el label
def leerValor():
    print("Has escrito: ")
    print(entrada.get())
raiz = tk.Tk()

entrada = ttk.Entry(raiz)
entrada.pack(padx=15,pady=15)


boton = ttk.Button(raiz,text="Obtener valor",command=leerValor)
boton.pack(padx=15,pady=15)


raiz.mainloop()



                   
