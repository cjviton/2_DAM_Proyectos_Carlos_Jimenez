import tkinter as tk #Impotro librería tkinter


ppal = tk.Tk()  #Creo un prefijo para identificar a la ventana, en este caso, ppal(Pricipal)


def salir():   #Método de la función salir
    raiz.destroy()

def enviar():   #Método del botón enviar
    print("El formularío se enviará a mi base de datos de reservas")


for i in range(10):                   #Bucle for para dividir la ventana en 10 columnas para poder tener con el metodo .grid
    ppal.columnconfigure(i, weight=1) #los campos de label y entry pegado uno del otro. con 2 columnas quedaban 1 a cada lado
                                      #de la vnetana pricipal


    

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


#Atributos generales de construcción de la página

ppal.title ("Restaurante Carlota. Reserva online") #Titulo de la ventana
ppal.geometry("600x500+20+20")#Le doy tamaño, padding y margin
ppal.resizable(False,False)#Anulo la posiblidad de hacer redimensionable la ventada 
ppal.iconbitmap("logo.ico") #Favicon del restaurante. Formato .ico



#Widgets

#Etiqueta con mensaje de bienvenida. Padx de 10 y pady de 50 para centrarlo en la ventana
texto1 = tk.Label(ppal,text="En nuestro Asador Restaurante estará rodeado de un ambiente y decoración Segoviana excepcional.\nPodrá disfrutar de nuestra especialidad,\nel cochinillo asado con denominación de origen de Segovia")
texto1.grid(row=1, column=1, columnspan=10, padx=5, pady=20)

texto2 = tk.Label(ppal,text="Ven a disfrutar haz tu reserva:")
texto2.grid(row=2, column=1,columnspan=10,padx=5, pady=20)


#Formulario. Etiqueta nombre y día seguido de campo de entrada de texto
label1 = tk.Label(ppal,text="Nombre y apellido")
label1.grid(row=3, column=3, pady=0)
entry1 = tk.Entry(ppal,text="")
entry1.grid(row=3, column=4, pady=0)


label2 = tk.Label(ppal,text="Día y hora")
label2.grid(row=4, column=3, padx=10, pady=10)
entry2 = tk.Entry(ppal,text="")
entry2.grid(row=4, column=4, padx=10, pady=20)


#Radio button de selección única
texto3 = tk.Label(ppal,text="En que zona desea:")
texto3.grid(row=5, column=4,padx=5, pady=10)

var1 = tk.StringVar () #variable para que salga sinmarcar ' '
var1.set(' ')
radio1 = tk.Radiobutton(ppal,text="Salón interior",variable=var1)
radio1.grid(row=6, column=4, padx=1, pady=1)

var2 = tk.StringVar () #variable para que salga sinmarcar ' '
var2.set(' ')
radio2 = tk.Radiobutton(ppal,text="Salón exterior cubierto",variable=var2)
radio2.grid(row=7, column=4, padx=1, pady=1)

var3 = tk.StringVar () #variable para que salga sinmarcar ' '
var3.set(' ')
radio3 = tk.Radiobutton(ppal,text="Terraza",variable=var3)
radio3.grid(row=8, column=4, padx=1, pady=1)


#Botón cuadrado para marcar opción de parking

check = tk.Checkbutton(ppal,text="Parking ")
check.grid(row=11, column=4, padx=10, pady=20)


#Botón de envio del formulario

envio = tk.Button(ppal,text="Enviar",command=enviar)
envio.grid(row=12, column=4, padx=10, pady=20)



ppal.mainloop()#Con mainloop al abrir el archivo Formulario se abrirá la ventana ppal


                   

