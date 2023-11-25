import tkinter as tk 
                     
#Ventana
raiz = tk.Tk()

#Titulo
raiz.title("Aprendiendo Tkinter") 

#Geometría
anchuraventana = 400
alturaventana = 400

anchurapantalla = raiz.winfo_screenwidth()
alturapantalla = raiz.winfo_screenheight()

esquinax = int(anchurapantalla/2 - anchuraventana/2)
esquinay = int(alturapantalla/2 - alturaventana/2)

raiz.geometry(str(anchuraventana)+"x"+str(anchuraventana)+"+"+str(esquinax)+"+"+str(esquinay))

#Redimensionado off
raiz.resizable(False,False)

#Atributos Alpha

print(raiz.attributes())

#raiz.attributes("-alpha",0.5)

#raiz.attributes("-fullscreen",True) 

#raiz.attributes("-toolwindow",False)

#La ventana se queda fija en primer plano
#raiz.attributes("-topmost",100)

#Icono. Necesitamos una imagen en .ico Uso para convertir el programa Gimp
#Escalo la imagen a 32x32 y la exporto en formato .ico a la carpeta del programa
raiz.iconbitmap("logo.ico")


raiz.mainloop()



                   
