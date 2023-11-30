import tkinter as tk #import tkinter as tk: Importa el módulo tkinter
                     # y lo renombra como tk para facilitar su uso.

from tkinter import ttk #Importo widget avanzados ttk
                     
raiz = tk.Tk()

#Boton
ttk.Button(raiz,text="Pulsame").pack(padx=10,pady=10)

#Campo de texto
ttk.Entry (raiz).pack(padx=10,pady=10)

#Campos de seleccion multiple_Checkbutton
ttk.Label(raiz,text="Checkbutton").pack(padx=10,pady=10)
ttk.Checkbutton(raiz,text="Opcion1").pack(padx=10,pady=10)

#Radio botton
ttk.Label(raiz,text="Radio botton").pack(padx=10,pady=10)
ttk.Radiobutton(raiz,text="Opcion a").pack(padx=10,pady=10)
ttk.Radiobutton(raiz,text="Opcion b").pack(padx=10,pady=10)

#Label
ttk.Label(raiz,text="Label").pack(padx=10,pady=10)

#Desplegable
ttk.Label(raiz,text="Desplegable").pack(padx=10,pady=10)
ttk.Combobox(raiz,values=['Manzana','Pera','Melón']).pack(padx=10,pady=10)

#Barra de progreso
ttk.Label(raiz,text="Barra de progreso").pack(padx=10,pady=10)
ttk.Progressbar(raiz,length=200,mode='indeterminate').pack(padx=10,pady=10)

#Deslizable
ttk.Label(raiz,text="Deslizable").pack(padx=10,pady=10)
ttk.Scale(raiz,from_=0, to=100).pack(padx=10,pady=10)

# Campo numerico
ttk.Label(raiz,text="Campo numerico").pack(padx=10,pady=10)
ttk.Spinbox(raiz,from_=0, to=100).pack(padx=10,pady=10)



#Tabla
ttk.Label(raiz,text="Tabla").pack(padx=10,pady=10)

#Creo la tabla con 4 colunmas 
arbol = ttk.Treeview(raiz,columns= ('nombre','apellidos','email'))
arbol.heading("#0", text="Identificador") #Nombro las cabeceras
arbol.heading("nombre", text="nombre")
arbol.heading("apellidos", text="apellidos")
arbol.heading("email", text="Correo eléctronico")

#Inserto datos en la tabla
arbol.insert('','0','elento 1',text="Cliente 1",values=("Carlos","Jiménez Vitón","cjv@gmail.com"))
arbol.insert('','1','elento 4',text="Cliente 2",values=("Diana","Jiménez Rodríguez","dnr@gmail.com"))

arbol.pack(padx=10,pady=10)




























raiz.mainloop()



                   
