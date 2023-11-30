import tkinter as tk #import tkinter as tk: Importa el módulo tkinter
                     # y lo renombra como tk para facilitar su uso.

from tkinter import ttk #Importo widget avanzados ttk
                     
raiz = tk.Tk()

#Boton
ttk.Button(raiz,text="Pulsame").pack(padx=50,pady=50)
tk.Button(raiz,text="Pulsame").pack(padx=50,pady=50)

#Campo de texto
ttk.Entry (raiz).pack(padx=50,pady=50)
tk.Entry (raiz).pack(padx=50,pady=50)


raiz.mainloop()



                   
