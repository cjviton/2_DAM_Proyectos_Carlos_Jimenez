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
#Hace la ventana translucida
raiz.attributes("-alpha",0.5)

raiz.mainloop()                         


                   
