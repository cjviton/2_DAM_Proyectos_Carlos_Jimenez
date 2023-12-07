import tkinter as tk
from tkinter import ttk


#Método para bind del treeview
def seleccionaElemento(event):
    seleccionado = agenda.focus()
    print(seleccionado)
    valores = agenda.item(seleccionado,'values')
    print(valores)
                   
raiz = tk.Tk()
style = ttk.Style() #Capturo en la variable stylo el método Style() 

#Aplico estilo a la raiz
raiz.configure(bg="#3248a8")



#Doy forma a la ventana
raiz.geometry("1300x600+10+10")  #Cambio la geometría de la ventaja. 
raiz.title ("Agenda Laboral") #Pongo título en la vntana
raiz.iconbitmap("logo.ico")     #Favicon windows

#Menus de la ventana

barramenu=tk.Menu(raiz)
raiz.config(menu=barramenu)
archivo = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Archivo",menu=archivo)

archivo.add_command(label="Nuevo")
archivo.add_command(label="Abrir")
archivo.add_command(label="Guardar")
archivo.add_command(label="Salir")


editar = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Editar", menu=editar)

editar.add_command(label="Deshacer")
editar.add_command(label="Copiar")
editar.add_command(label="Cortar")
editar.add_command(label="Pegar")


ayuda = tk.Menu(barramenu,tearoff=0) 
barramenu.add_cascade(label="Ayuda",menu=ayuda)

ayuda.add_command(label="Ayuda")
ayuda.add_command(label="Documentacion en linea")
ayuda.add_command(label="Acerda de")
ayuda.add_command(label="Soporte")

label1 = ttk.Label(raiz,text ="Agenda laboral")
label1.pack(padx=25,pady=25)


#botones captura de la agenda
boton1 = ttk.Button(raiz,text="Guardar")
boton1.pack(padx=25,pady=25)




#Creo la tabla con 4 colunmas 
agenda = ttk.Treeview(raiz,columns= ('Nombre','Apellidos','Email','Empresa','Telefono'))
agenda.heading("#0", text="Identificador") #Nombro las cabeceras
agenda.heading("Nombre", text="NOMBRE")
agenda.heading("Apellidos", text="APELLIDOS")
agenda.heading("Email", text="CORREO ELECTRÓNICO")
agenda.heading("Empresa", text="EMPRESA")
agenda.heading("Telefono", text="TELÉFONO")




#Inserto datos en la tabla
agenda.insert('','0','elento 1',text="Cliente 1",values=("Carlos","Jiménez Vitón","cjv@gmail.com","ACC","58965"))
#agenda.insert('','1','elento 2',text="Cliente 2",values=("Diana","Jiménez Rodríguez","dnr@gmail.com"))

agenda.pack(padx=10,pady=10)




#Hago un bind del treeview con el método selecciona elemento
agenda.bind('<<TreeviewSelect>>',seleccionaElemento)

#Estilo con color a los encabezados

style.configure("Treeview.Heading",foreground="#3248a8")


raiz.mainloop()



                   
