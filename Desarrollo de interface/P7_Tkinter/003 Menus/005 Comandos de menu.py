import tkinter as tk 
                     
raiz = tk.Tk()
barramenu=tk.Menu(raiz)
raiz.config(menu=barramenu)
archivo = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Archivo",menu=archivo)

archivo.add_command(label="Nuevo")
archivo.add_command(label="Abrir")
archivo.add_command(label="Guardar")
archivo.add_command(label="Salir")

raiz.mainloop()


                   

