import tkinter as tk
from tkinter import ttk

raiz = tk.Tk()


estilo = ttk.Style()
print(estilo.theme_names()) #Me escribe en consola los temas disponibles
estilo.theme_use("xpnative")


tk.Button(raiz,text="Esto es un boton tk").pack(padx=25,pady=25)
ttk.Button(raiz,text="Esto es un boton ttk").pack(padx=25,pady=25)

raiz.mainloop()
