import tkinter as tk
import random

#Creo un array de objetos del tipo persona
personas = []
numeropersonas = 20


#Creo una clase persona con un método constructor y dos parametros
class Persona:
    def __init__(self):
        self.posx = random.randint(0,1024) #Cada vez que ejecute el programa el objeto 
        self.posy = random.randint(0,1024) #se posicinará en un lugar diferente
        self.radio = 30
        
#Método para crear óvalos rojos en el centro del lienzo      
    def dibuja(self):
        lienzo.create_oval(
            self.posx-self.radio/2,
            self.posy-self.radio/2,
            self.posx+self.radio/2,
            self.posy+self.radio/2,
            fill="red")
        

raiz = tk.Tk()

#Creo un lienzo que es donde se va a desarrollar el programa
lienzo = tk.Canvas(width=1024,height=1024)
lienzo.pack()


#Utilizo un bucle for para interar numeropersonas(20 veces) en cada iteracion crea una instancia
#de la clase persona y la agrega a la lista personas mediante el mátodo .append
for i in range (0,numeropersonas):
    personas.append(Persona())


#Ell bulce for itera a través de cada instancia de la clase Persona que hay en la lista personas
#y en cada una de ellas llama al método dibuja()    
for persona in personas:
    persona.dibuja()



'''
#Creo un objeto de la clase persona
persona = Persona()

#Y uso el método dibuja
persona.dibuja()
'''



raiz.mainloop()
