import tkinter as tk
from tkinter import ttk

#Con el método evento capturo la seleción del desplegable
def saluda(evento):
    print(evento)
    print("Has cambiado el selector")
    print("Y la opción seleccionasa es:")
    print(desplegable.get())



raiz = tk.Tk()

#Creo un desplegable con 4 valores
desplegable = ttk.Combobox(raiz,values=['uno','dos','tres','cuatro'])
desplegable.pack(padx=25,pady=25)


#Con el bind ejecuto el metodo saluda y puedo capturar la eleción 
desplegable.bind('<<ComboboxSelected>>',saluda)



raiz.mainloop()
