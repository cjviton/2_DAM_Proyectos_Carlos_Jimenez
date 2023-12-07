import tkinter as tk
from tkinter import ttk

#Creo las variable donde almacenar los datos introducidos en la agenda

identificador = -1    #variable contador para sumar 1 cada vez que haga un registro
elemento = -1         #en identificador y elemeto
nombre = ""
apellidos = ""
email = ""
empresa = ""
telefono = ""


#Variables de captura de treeview para insertar en email y teledfono del marco 3
email_seleccionado = ""
telefono_seleccionado = ""

#Métodos
#Métodos guardado en agenda
def guardarTodo():  #Creo un método que llamo desde el botòn guardar que llama a los demás métodos de guardado
    global identificador
    global elemento
    guardarNombre() 
    guardarApellidos()
    guardarEmail()
    guardarEmpresa()
    guardarTelefono()

    identificador +=1  #Sumo 1 al contador para insertarlo en el siguiente row de al tabla
    elemento +=1
    
    #Inserto datos en la tabla treeview
    agenda.insert('','0',values=(nombre,apellidos,email,empresa,telefono))

    #Borro los campos de entry una vez insertados
    entry10.delete(0, tk.END)   
    entry11.delete(0, tk.END)
    entry12.delete(0, tk.END)
    entry13.delete(0, tk.END)
    entry14.delete(0, tk.END)


def guardarNombre():
    global nombre            #Utilizo la declaración GLOBAL para indicar que queiro trabajar
                             #con ella y no con una variable local en el método. para poder usarla en el método guardaTodo
    nombre=(entry10.get())   #Capturo lo escrito en entry10
   

def guardarApellidos():
    global apellidos
    apellidos=(entry11.get()) #Capturo lo escrito en entry11
   

def guardarEmail():
    global email
    email=(entry12.get()) #Capturo lo escrito en entry12
    

def guardarEmpresa():
    global empresa
    empresa=(entry13.get()) #Capturo lo escrito en entry13
    

def guardarTelefono():
    global telefono
    telefono=(entry14.get()) #Capturo lo escrito en entry14
    



#Método para bind de selección treeview-------------------------------------------------------
def seleccionaElemento(event):
    seleccionado = agenda.focus()
    print(seleccionado)
    valores = agenda.item(seleccionado,'values')
    print(valores)
                                                     #Capturo los campos con el indice 2 y 3
    global email_seleccionado, telefono_seleccionado #e indico que las variables son globales para poder 
    email_seleccionado = valores[2]                  #usarla fuera del método
    telefono_seleccionado = valores[4] 
    print(email_seleccionado,telefono_seleccionado)
    
    insertTelMail()                     



#Inserto email y telefono en entry de marco3
def insertTelMail():
    entry30.delete(0,tk.END)                #Borro lo que había escrito desde 0 hasta END
    entry30.insert(0,telefono_seleccionado) #Insertola variable que he capturado de treeview en el entry llamar
    entry31.delete(0,tk.END)                #Hago lo mismo con el campo email
    entry31.insert(0,email_seleccionado)





#Metodos para llamar y escribir email

def llamar():
    print("Lama al teléfono" +telefono_seleccionado)

def escribir():
    print("Ecribe un email a la direccion" + email_seleccionado)

    

#Ventana raiz ------------------------------------------------------------------------------------                   
raiz = tk.Tk()
estilo = ttk.Style() #Capturo en la variable stylo el método Style() 


#Aplico estilo a la raiz
raiz.configure(bg="#3025c4")


#Doy forma a la ventana
raiz.geometry("1300x800+10+10")  #Cambio la geometría de la ventaja. 
raiz.title ("Agenda Laboral") #Pongo título en la vntana
raiz.iconbitmap("logo.ico")     #Favicon windows

#Label titulo con estilo
ttk.Label(raiz,text="Agenda laboral",font=('Bookman Old Style',24),relief='raised',background="#41c5d9").pack(padx=10,pady=10)


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



#Creo una ventana partida y lal meto en raiz con orientación
ventanapartida = tk.PanedWindow(raiz,orient=tk.VERTICAL)

#Creo 2 Frame y los llamo marco1 y marco2
marco1 = tk.Frame (ventanapartida,background="#0f1ef2")
marco2 = tk.Frame (ventanapartida,background="#41c5d9")
marco3 = tk.Frame (ventanapartida,background="#0f1ef2")

    
#Los añado a ventana partida
ventanapartida.add(marco1)
ventanapartida.add(marco2)
ventanapartida.add(marco3)

#Enpaqueto 
ventanapartida.pack(fill=tk.BOTH,expand=True)





#Marco 1------------------------------------------------------------------------------
#Bucle for para dividir el marco1 en  en 4 columnas y 7 filas
for i in range(8):                   
    marco1.columnconfigure(i, weight=1)
    
# Bucle for para dividir el marco1 en 3 filas
for i in range(7):
    marco1.rowconfigure(i, weight=1)


#Label
label10 = ttk.Label(marco1,text="Nombre")
label10.grid(row=1,column=3,padx=5,pady=5)
estilo.configure('Label10.TLabel',background='#c9e9f2',font=('Britannic Bold',16))
label10.configure(style='Label10.TLabel')

label11 = ttk.Label(marco1,text="Apellido")
label11.grid(row=2,column=3,padx=10,pady=10)
estilo.configure('Label11.TLabel',background='#c9e9f2',font=('Britannic Bold',16))
label11.configure(style='Label11.TLabel')

label12 = ttk.Label(marco1,text="Email")
label12.grid(row=3,column=3,padx=10,pady=10)
estilo.configure('Label12.TLabel',background='#c9e9f2',font=('Britannic Bold',16))
label12.configure(style='Label12.TLabel')

label13 = ttk.Label(marco1,text="Empresa")
label13.grid(row=4,column=3,padx=10,pady=10)
estilo.configure('Label13.TLabel',background='#c9e9f2',font=('Britannic Bold',16))
label13.configure(style='Label13.TLabel')

label14 = ttk.Label(marco1,text="Teléfono")
label14.grid(row=5,column=3,padx=10,pady=10)
estilo.configure('Label14.TLabel',background='#c9e9f2',font=('Britannic Bold',16))
label14.configure(style='Label14.TLabel')


#Entry
entry10 = ttk.Entry(marco1)
entry10.grid(row=1,column=4,padx=5,pady=5)
estilo.configure('entry10.TLabel',relief='raised')
entry10.configure(style='entry10.TLabel')

entry11 = ttk.Entry(marco1)
entry11.grid(row=2,column=4,padx=10,pady=10)
estilo.configure('entry11.TLabel',relief='raised')
entry11.configure(style='entry11.TLabel')

entry12 = ttk.Entry(marco1)
entry12.grid(row=3,column=4,padx=10,pady=10)
estilo.configure('entry12.TLabel',relief='raised')
entry12.configure(style='entry12.TLabel')

entry13 = ttk.Entry(marco1)
entry13.grid(row=4,column=4,padx=10,pady=10)
estilo.configure('entry13.TLabel',relief='raised')
entry13.configure(style='entry13.TLabel')

entry14 = ttk.Entry(marco1)
entry14.grid(row=5,column=4,padx=10,pady=10)
estilo.configure('entry14.TLabel',relief='raised')
entry14.configure(style='entry14.TLabel')
  



#boton captura de la agenda
boton10 = ttk.Button(marco1,text="Guardar",command=guardarTodo)
boton10.grid(row=7,columnspan=8,padx=10,pady=10)




#Marco 2-----------------------------------------------------------------------------

#Creo la tabla con 4 colunmas 
agenda = ttk.Treeview(marco2,columns= ('Nombre','Apellidos','Email','Empresa','Telefono'))
agenda.heading("#0") #Nombro las cabeceras
agenda.heading("Nombre", text="NOMBRE")
agenda.heading("Apellidos", text="APELLIDOS")
agenda.heading("Email", text="CORREO ELECTRÓNICO")
agenda.heading("Empresa", text="EMPRESA")
agenda.heading("Telefono", text="TELÉFONO")


agenda.pack(padx=10,pady=10)


#Hago un bind del treeview con el método selecciona elemento
agenda.bind('<<TreeviewSelect>>',seleccionaElemento)

#Estilo con color a los encabezados

estilo.configure("Treeview.Heading",foreground="#3248a8")


#Marco3-----------------------------------------------------------------------------
#Bucle for para dividir el marco1 en  en 3 columnas y 3 filas
for i in range(10):                   
    marco3.columnconfigure(i, weight=1)
    
# Bucle for para dividir el marco1 en 3 filas
for i in range(6):
    marco3.rowconfigure(i, weight=1)

#Capos Entry Email y teléfono
entry30 = ttk.Entry(marco3)
entry30.grid(row=2,column=6,padx=10,pady=10)
entry31 = ttk.Entry(marco3)
entry31.grid(row=3,column=6,padx=10,pady=10)




#botones captura de la agenda
boton30 = ttk.Button(marco3,text="Llamar",style='TButton',command=llamar)
boton30.grid(row=2,columnspan=7,padx=10,pady=10)


boton31 = ttk.Button(marco3,text="Escribir Email",style='TButton',command=escribir)
boton31.grid(row=3,columnspan=7,padx=10,pady=10)


estilo.configure('TButton', background='#c9e9f2', font=('Britannic Bold', 16), relief='raised')

raiz.mainloop()



                   
