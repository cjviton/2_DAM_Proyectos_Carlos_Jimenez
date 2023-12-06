import tkinter as tk
from tkinter import ttk

def cambiaestilo():
    estilo.theme_use(desplegable.get())
    




raiz = tk.Tk()


estilo = ttk.Style()
print(estilo.theme_names()) #Me escribe en consola los temas disponibles
estilo.theme_use("clam")

#Desplegable combobox con los diferentes estilos
desplegable = ttk.Combobox(raiz,values=estilo.theme_names())
desplegable.pack(padx=25,pady=25)

#Botón cambiar cambiará el estilo de la vnetana
botoncambiar = ttk.Button(raiz,text = "Aplica el estilo",command=cambiaestilo)
botoncambiar.pack(padx=25,pady=25)




#Boton tk y botón Ttk
tk.Button(raiz,text="Esto es un boton tk").pack(padx=25,pady=25)
ttk.Button(raiz,text="Esto es un boton ttk").pack(padx=25,pady=25)

raiz.mainloop()
