import tkinter as tk
from tkinter import ttk


#Con el binding(Escuchador) capturo el valor  de la barra deslizable

def dimeValor(Evento):
    print(deslizable.get())

raiz = tk.Tk()

deslizable = ttk.Scale(raiz,from_=0,to=100)
deslizable.pack(padx=50,pady=50)


deslizable.bind('<ButtonRelease>', dimeValor)

raiz.mainloop()
