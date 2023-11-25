import tkinter as tk 
                     

raiz = tk.Tk()
raiz.title("Aprendiendo Tkinter") 

anchuraventana = 400
alturaventana = 400


anchurapantalla = raiz.winfo_screenwidth()
alturapantalla = raiz.winfo_screenheight()

esquinax = int(anchurapantalla/2 - anchuraventana/2)
esquinay = int(alturapantalla/2 - alturaventana/2)

raiz.geometry(str(anchuraventana)+"x"+str(anchuraventana)+"+"+str(esquinax)+"+"+str(esquinay))

#Quito la posibilidad de hacer la pantalla grande
raiz.resizable(False,False)

raiz.mainloop()                         


                   
