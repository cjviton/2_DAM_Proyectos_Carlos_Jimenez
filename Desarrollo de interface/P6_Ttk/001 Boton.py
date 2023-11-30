import tkinter as tk #import tkinter as tk: Importo el módulo tkinter
                     #y lo renombro como tk para facilitar su uso.

from tkinter import ttk #Importo widget avanzados ttk
                     
raiz = tk.Tk()

ttk.Button(raiz,text="Pulsame").pack(padx=50,pady=50)


raiz.mainloop()



                   
