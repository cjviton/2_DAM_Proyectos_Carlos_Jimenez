from tkinter import *    #Importo a la libreria de tkinter

f = Frame(width=300,height=300)
f.pack(padx=30,pady=30)         #Medidas de la ventana que creo

titulo = Label(f,text = "Hola Carlos")  #Creo la variable titulo con parametros
                                        #f (llamo al frame),y text texto del interior
titulo.pack(side=TOP)                  #Alinea el texto en la parte de arriba
