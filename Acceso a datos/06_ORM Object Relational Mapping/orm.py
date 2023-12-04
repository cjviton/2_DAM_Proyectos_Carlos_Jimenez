import tkinter as tk

raiz = tk.Tk()


#Creo una clase persona con un método constructor y dos parametros
class Persona:
    def __init__(self):
        self.posx = 512
        self.posy = 512
        
    def dibuja(self):
        lienzo.create_oval(30,30,60,60,fill="red")        



#Creo un lienzo que es donde se va a desarrollar el programa
lienzo = tk.Canvas(width=1024,height=1024)
lienzo.pack()


#Creo un objeto de la clase persona
persona = Persona()

#Y uso el método dibuja
persona.dibuja()




raiz.mainloop()
