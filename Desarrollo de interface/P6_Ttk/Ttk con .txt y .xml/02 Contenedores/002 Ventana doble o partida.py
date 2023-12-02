import tkinter as tk
from tkinter import ttk 
                     
raiz = tk.Tk()

#Típica ventana para hacer un panel de control

#Creo la ventana partida y lal meto en raiz con orientación
ventanapartida = tk.PanedWindow(raiz,orient=tk.HORIZONTAL)

#Creo 2 Frame y los llamo marco1 y marco2
marco1 = tk.Frame (ventanapartida,background="red")
marco2 = tk.Frame (ventanapartida,background="blue")

#Los añado a ventana partida
ventanapartida.add(marco1)
ventanapartida.add(marco2)

#Enpaqueto 
ventanapartida.pack(fill=tk.BOTH,expand=True)


raiz.mainloop()



                   
