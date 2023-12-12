import tkinter as tk
import random          #Para usar los métodos de la calse random
import math            #Importo la librería matemática
import json            #Importo la libreria json para hacer el guardado de datos


#Creo un array de objetos del tipo persona
personas = []
numeropersonas = 1


#Creo una clase persona con un método constructor y dos parametros
class Persona:
    def __init__(self):
        self.posx = random.randint(0,1024) #Cada vez que ejecute el programa el objeto 
        self.posy = random.randint(0,1024) #se posicinará en un lugar diferente
        self.radio = 30
        self.lados = 5                                                                       # Número de lados para el polígono
        self.angulo_inicial = -math.pi / 2                                                   # Ángulo inicial para orientar el polígono
        self.direccion = random.randint(0,360)
        self.color = "green"                                                                  #Cambio de color
        self.entidad = "" #Propiedad para hacer que el objeto se mueva
        
#Método para crear figuras en el lienzo      
    def dibuja(self, tipo="oval"):
        if tipo == "oval":
            self.entidad = lienzo.create_oval(
                self.posx - self.radio / 2,
                self.posy - self.radio / 2,
                self.posx + self.radio / 2,
                self.posy + self.radio / 2,
                fill=self.color
            )
        elif tipo == "line":
            self.entidad = lienzo.create_line(
                self.posx, self.posy,
                self.posx + self.radio * math.cos(self.direccion),
                self.posy + self.radio * math.sin(self.direccion),
                width=2, fill="blue"
            )
        elif tipo == "polygon":
            vertices = []
            for i in range(self.lados):
                x = self.posx + self.radio * math.cos(self.angulo_inicial + 2 * math.pi * i / self.lados)
                y = self.posy + self.radio * math.sin(self.angulo_inicial + 2 * math.pi * i / self.lados)
                vertices.extend([x, y])
            self.entidad = lienzo.create_polygon(vertices, fill=self.color)

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
    def colisiona(self):                                                        #Cambio el método colision para que el objeto haga un rebote más natural
        if self.posx < 0 or self.posx > 1024:
            self.direccion = math.pi - self.direccion    # Invertir dirección en el eje x
        if self.posy < 0 or self.posy > 600:
            self.direccion = -self.direccion # Invertir dirección en el eje y
        
        '''
        if self.posx < 0 or self.posx > 1024 or self.posy < 0 or self.posy > 700:
            self.direccion += math.pi
            if self.direccion > 6 * math.pi:
                self.direccion -= 6 * math.pi
        '''
#Metodo del botón guardarPersonas y guardo las variables (propiedades) de personas recorriendo cada objeto
#persona de la lista personas. Las voy guardar en una archivo .json en mi carpeta raiz

def guardarPersonas():
    print("OK")
    cadena = json.dumps([vars(persona)for persona in personas]) 
    print(cadena)                   
    archivo = open("jugadores.json","w")
    archivo.write(cadena)
    
#Creo ventana
raiz = tk.Tk()

#Creo un lienzo que es donde se va a desarrollar el programa
lienzo = tk.Canvas(raiz,width=1024,height=600)                      #Hago el alto del linezo más pequeño para que entre en la pantalla de mi ordenador
lienzo.pack()


#Botón para guardar la posición de los objetos
boton = tk.Button(raiz,text = "Guardar",command=guardarPersonas)
boton.pack()

#Rescatar posiciones de las personas que tenemos guardadas en el archivo json
try:
    carga = open ("jugadores.json",'r')
    cargado = carga.read()
    cargadolista = json.loads(cargado)
    for elemento in cargadolista:
        persona = Persona()
        persona.__dict__.update(elemento)
        personas.append(persona)
except:
    print("")
    



#Utilizo un bucle for para interar numeropersonas(x veces) en cada iteracion crea una instancia
#de la clase persona y la agrega a la lista personas mediante el método .append
#Esto lo hará en el caso de que no existan

if len(personas) == 0:
    numeropersonas = 3                                                                    #Cambio el número de personas
    for i in range (0,numeropersonas):
        personas.append(Persona())




#Ell bulce for itera a través de cada instancia de la clase Persona que hay en la lista personas
#y en cada una de ellas llama al método dibuja() para pintarlas de color y  darles forma
for persona in personas:
    persona.dibuja(tipo="polygon")                                                             #Aquí puedo variar el tipo de figuras en el lienzo


#Bucle para crear movimiento con un bucle for en cada una de las personas de la colección
def bucle():
    for persona in personas: 
        persona.mueve()  #Llamo al método mueve
    raiz.after(10,bucle)                                                                    #Variar velocidad a la que se mueven

bucle()   #Llamo al método bucle

'''
#Creo un objeto de la clase persona
persona = Persona()

#Y uso el método dibuja
persona.dibuja()
'''



raiz.mainloop()
