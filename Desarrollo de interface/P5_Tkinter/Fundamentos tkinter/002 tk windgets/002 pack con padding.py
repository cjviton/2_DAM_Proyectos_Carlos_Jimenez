import tkinter as tk 
                     
raiz = tk.Tk()

#Desde tk llamo al widgets Label y ocn .pack lo meto dentro de la ventana
#con padx y pady le doy margenes a la etiqueta

tk.Label(raiz,text="Hola mundo desde Tkinter").pack(padx=10,pady=10)


raiz.mainloop()



                   
