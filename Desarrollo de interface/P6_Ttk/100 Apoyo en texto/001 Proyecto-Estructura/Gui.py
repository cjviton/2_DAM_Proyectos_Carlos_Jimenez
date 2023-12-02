import tkinter as tk

raiz = tk.Tk()

#Abró el archivo de texto que tengo en la otra carpeta del proyecto en modo lectura
archivo = open("estructura.txt","r")
print(archivo)


raiz.mainloop()
