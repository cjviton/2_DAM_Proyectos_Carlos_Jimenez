import tkinter as tk 
from tkinter import ttk


#Puedo capturar lo que introduzca en el label
def leerValor():
    print("Has escrito: ")
    print(entrada.get())


#Puedo introducir texto en el label
def ponerValor():
    print("Pongo valor en la entrada")
    entrada.delete(0,tk.END)  #Borro lo que había escrito desde 0 hasta END
    entrada.insert(0,"Nuevo valor")#Inserto el texto desde 0




raiz = tk.Tk()

entrada = ttk.Entry(raiz)
entrada.pack(padx=15,pady=15)

#Creo un botón para capturar desde el Label
boton = ttk.Button(raiz,text="Obtener valor",command=leerValor)
boton.pack(padx=15,pady=15)



#Creo un segundo botón
boton = ttk.Button(raiz,text="Poner valor",command=ponerValor)
boton.pack(padx=15,pady=15)

raiz.mainloop()



                   
