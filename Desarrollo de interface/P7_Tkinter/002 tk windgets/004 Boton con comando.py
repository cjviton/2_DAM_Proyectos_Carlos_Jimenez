import tkinter as tk 
                     
raiz = tk.Tk()

#Desde tk llamo al widgets Label y ocn .pack lo meto dentro de la ventana
#con padx y pady le doy margenes a la etiqueta
tk.Label(raiz,text="Hola mundo desde Tkinter").pack(padx=50,pady=50)

#boton
tk.Button(raiz,text="Soy un botón").pack(padx=2,pady=2)


def saluda():
    print("Esto es lo que ejecuto con el boton con comando")

#boton con comando que tengo que definir con un método
tk.Button(raiz,text="Este botón tiene comando",command=saluda).pack(padx=2,pady=2)



raiz.mainloop()



                   
