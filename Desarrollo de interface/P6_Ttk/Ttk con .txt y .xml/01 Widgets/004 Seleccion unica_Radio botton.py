import tkinter as tk #import tkinter as tk: Importa el módulo tkinter
                     # y lo renombra como tk para facilitar su uso.

from tkinter import ttk #Importo widget avanzados ttk
                     
raiz = tk.Tk()

#Boton
ttk.Button(raiz,text="Pulsame").pack(padx=10,pady=10)

#Campo de texto
ttk.Entry (raiz).pack(padx=10,pady=10)

#Campos de seleccion multiple_Checkbutton
ttk.Checkbutton(raiz,text="Opcion1").pack(padx=10,pady=10)

#Radio botton
ttk.Radiobutton(raiz,text="Opcion a").pack(padx=10,pady=10)
ttk.Radiobutton(raiz,text="Opcion b").pack(padx=10,pady=10)



raiz.mainloop()



                   
