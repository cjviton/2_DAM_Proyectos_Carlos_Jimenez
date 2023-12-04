import tkinter as tk

raiz = tk.Tk()


#Creo una clase persona con un método constructor y dos parametros
class Persona:
    def __init__(self):
        self.posx = random.randint(0,512)
        self.posy = random.randint(0,512)
        self.radio = 30
        
#Método para crear óvalos rojos en el centro del lienzo      
    def dibuja(self):
        lienzo.create_oval(
            self.posx-self.radio/2
            self.posy-self.radio/2
            self.posx+self.radio/2
            self.posy+self.radio/2
            fill="red")        



#Creo un lienzo que es donde se va a desarrollar el programa
lienzo = tk.Canvas(width=1024,height=1024)
lienzo.pack()


#Creo un objeto de la clase persona
persona = Persona()

#Y uso el método dibuja
persona.dibuja()




raiz.mainloop()
