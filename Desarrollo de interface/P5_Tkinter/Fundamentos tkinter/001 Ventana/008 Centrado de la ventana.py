import tkinter as tk 
                     

raiz = tk.Tk()
raiz.title("Aprendiendo Tkinter") #De este modo voy añadiendo atributos a la ventana

anchuraventana = 400
alturaventana = 400

#Para centrar la ventana en la pantalla cuando aparece

anchurapantalla = raiz.winfo_screenwidth()
alturapantalla = raiz.winfo_screenheight()

esquinax = int(anchurapantalla/2 - anchuraventana/2)
esquinay = int(alturapantalla/2 - alturaventana/2)

#raiz.geometry("400x400+20+20")
raiz.geometry(str(anchuraventana)+"x"+str(anchuraventana)+"+"+str(esquinax)+"+"+str(esquinay))

raiz.mainloop()                         


                   
