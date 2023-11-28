import tkinter as tk #Impotro librería tkinter


def salir():   #Método de la función salir
    raiz.destroy()
    

ppal = tk.Tk()  #Creo un prefijo para identificar a la ventana, en este caso, ppal(Pricipal)



#Mennú y comando salir en el menú
barramenu=tk.Menu(ppal)
ppal.config(menu=barramenu)
#Menú archivo
archivo = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Archivo",menu=archivo)
archivo.add_command(label="Nuevo")
archivo.add_command(label="Abrir")
archivo.add_command(label="Guardar")
archivo.add_command(label="Salir",command=salir)

#Menú editar
editar = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Editar", menu=editar)
editar.add_command(label="Deshacer")
editar.add_command(label="Copiar")
editar.add_command(label="Cortar")
editar.add_command(label="Pegar")

#Menú ayuda
ayuda = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Ayuda",menu=ayuda)
ayuda.add_command(label="Ayuda")
ayuda.add_command(label="Documentacion en linea")
ayuda.add_command(label="Acerda de")
ayuda.add_command(label="Soporte")


#Atributos de la página
ppal.title ("Restaurante Carlota. Reserva on line") #Titulo de la ventana
ppal.geometry("1000x700+20+20")#Le doy tamaño, padding y margin
ppal.resizable(False,False)#Anulo la posiblidad de hacer redimensionable la ventada
ppal.iconbitmap("logo.ico") #Favicon del restaurante. Formato .ico





ppal.mainloop()#Con mainloop al abrir el archivo Formulario se abrirá la ventana ppal


                   

