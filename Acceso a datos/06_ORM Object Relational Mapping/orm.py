import tkinter as tk
import random          #Para usar los métodos de la calse random
import math  #Importo la librería matemática

#Creo un array de objetos del tipo persona
personas = []
numeropersonas = 20


#Creo una clase persona con un método constructor y dos parametros
class Persona:
    def __init__(self):
        self.posx = random.randint(0,1024) #Cada vez que ejecute el programa el objeto 
        self.posy = random.randint(0,1024) #se posicinará en un lugar diferente
        self.radio = 30
        self.direccion = random.randint(0,360)
        self.color = "blue"
        self.entidad = "" #Propiedad para hacer que el objeto se mueva
        
#Método para crear óvalos rojos en el centro del lienzo      
    def dibuja(self):
        self.entidad = lienzo.create_oval(
            self.posx-self.radio/2,
            self.posy-self.radio/2,
            self.posx+self.radio/2,
            self.posy+self.radio/2,
            fill=self.color)

#Método mueve para que se muevan los objetos 
    def mueve(self):
        self.colisiona()#Lamo el método colisiona 
        lienzo.move(
            self.entidad,
            math.cos(self.direccion),
            math.sin(self.direccion))
        self.posx += math.cos(self.direccion)  #Actualizo las posiciones para que funcione el método colisiona
        self.posy += math.sin(self.direccion)

#Método colisiona para que os objetos permanezcan dentro del lienzo
    def colisiona(self):
        if self.posx < 0 or self.posx > 1024 or self.posy < 0 or self.posy > 700:
            self.direccion += 180



#Creo ventana
raiz = tk.Tk()

#Creo un lienzo que es donde se va a desarrollar el programa
lienzo = tk.Canvas(width=1024,height=700)
lienzo.pack()


#Utilizo un bucle for para interar numeropersonas(20 veces) en cada iteracion crea una instancia
#de la clase persona y la agrega a la lista personas mediante el mátodo .append
for i in range (0,numeropersonas):
    personas.append(Persona())


#Ell bulce for itera a través de cada instancia de la clase Persona que hay en la lista personas
#y en cada una de ellas llama al método dibuja() para pintarlas de color 
for persona in personas:
    persona.dibuja()


#Bucle para crear movimiento con un bucle for en cada una de las personas de la colección
def bucle():
    for persona in personas: 
        persona.mueve()  #Llamo al método mueve
    raiz.after(10,bucle)  #En 10 milisegundos vuelvo a ejecutar el bucle y se mueven los objetos

bucle()   #Llamo al método bucle

'''
#Creo un objeto de la clase persona
persona = Persona()

#Y uso el método dibuja
persona.dibuja()
'''



raiz.mainloop()
