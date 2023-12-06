import tkinter as tk
from tkinter import ttk


#Método para el bind del treeview
def seleccionaElemento(event):
    seleccionado = arbol.focus()
    print(seleccionado)
    valores = arbol.item(seleccionado,'values')
    print(valores)

                   
raiz = tk.Tk()



#Creo la tabla con 4 colunmas 
arbol = ttk.Treeview(raiz,columns= ('nombre','apellidos','email'))
arbol.heading("#0", text="Identificador") #Nombro las cabeceras
arbol.heading("nombre", text="nombre")
arbol.heading("apellidos", text="apellidos")
arbol.heading("email", text="Correo eléctronico")

#Inserto datos en la tabla
arbol.insert('','0','elento 1',text="Cliente 1",values=("Carlos","Jiménez Vitón","cjv@gmail.com"))
arbol.insert('','1','elento 2',text="Cliente 2",values=("Diana","Jiménez Rodríguez","dnr@gmail.com"))

arbol.pack(padx=10,pady=10)



#Hago un bind del treeview con el método selecciona elemento
arbol.bind('<<TreeviewSelect>>',seleccionaElemento)



raiz.mainloop()



                   
