import tkinter as tk 
                     
raiz = tk.Tk()

#Desde tk llamo al widgets Label y con .pack lo meto dentro de la ventana
#con padx y pady le doy margenes a la etiqueta
tk.Label(raiz,text="Hola mundo desde Tkinter").pack(padx=10,pady=10)


#boton
tk.Button(raiz,text="Soy un botón").pack(padx=2,pady=2)


#boton con comando que tengo que definir con un método
def saluda():
    print("Esto es lo que ejecuto con el boton con comando")

tk.Button(raiz,text="Este botón tiene comando",command=saluda).pack(padx=2,pady=2)


#Entrada de texto una linea
tk.Entry(raiz,text="").pack(padx=10,pady=10)

#Múltiplex lineas
#tk.Text(raiz).pack(padx=50,pady=50)

#chek button
tk.Checkbutton(raiz,text="Puedes marcar la casilla").pack(padx=10,pady=10)

#Radio button. Varias opciones con una sola respuesta
tk.Radiobutton(raiz,text="Puedes marcar la casilla").pack(padx=10,pady=10)


raiz.mainloop()



                   
