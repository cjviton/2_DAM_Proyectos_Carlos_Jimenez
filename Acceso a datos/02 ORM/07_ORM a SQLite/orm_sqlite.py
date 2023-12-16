import tkinter as tk
import random          #Para usar los métodos de la calse random
import math            #Importo la librería matemática
import json            #Importo la libreria json para hacer el guardado de datos
import sqlite3

#Declaración de variables globales
#Creo un array de objetos del tipo persona
personas = []
numeropersonas = 50



#Creo una clase persona con un método constructor y dos parametros
class Persona:
    def __init__(self):
        self.posx = random.randint(0,700) #Cada vez que ejecute el programa el objeto 
        self.posy = random.randint(0,700) #se posicinará en un lugar diferente
        self.radio = 30
        self.direccion = random.randint(0,360)
        self.color = "green"                                                                 #Cambio de color
        self.entidad = "" #Propiedad para hacer que el objeto se mueva
        
        #En la segunda parte del ejer creo estos atributos en la clese persona 
        self.energia = 100
        self.descanso = 100
        self.entidadenergia = ""
        self.entidaddescanso = ""

        
    #Método para crear óvalos rojos en el centro del lienzo      
    def dibuja(self):
        self.entidad = lienzo.create_oval(
            self.posx-self.radio/2,
            self.posy-self.radio/2,
            self.posx+self.radio/2,
            self.posy+self.radio/2,
            fill=self.color)

        #Creo dos rectángulos en cada instancia, uno de energía y otro de descanso
        self.entidadenergia = lienzo.create_rectangle(
            self.posx-self.radio/2,
            self.posy-self.radio/2-10,
            self.posx+self.radio/2,
            self.posy-self.radio/2-8,
            fill="green"
            )
        self.entidaddescanso = lienzo.create_rectangle(
            self.posx-self.radio/2,
            self.posy-self.radio/2-16,
            self.posx+self.radio/2,
            self.posy-self.radio/2-14,
            fill="blue"
            )

        



    #Método mueve para que se muevan los objetos 
    def mueve(self):
        self.colisiona()#Llamo el método colisiona 
        lienzo.move(
            self.entidad,
            math.cos(self.direccion),
            math.sin(self.direccion))

        #Creo movimiento en los rectángulos a la vez que el objeto
        lienzo.move(
            self.entidadenergia,
            math.cos(self.direccion),
            math.sin(self.direccion))
        
        lienzo.move(
            self.entidaddescanso,
            math.cos(self.direccion),
            math.sin(self.direccion))
        
        
        self.posx += math.cos(self.direccion)  #Actualizo las posiciones para que funcione el método colisiona
        self.posy += math.sin(self.direccion)

    #Método colisiona para que os objetos permanezcan dentro del lienzo
    def colisiona(self):
        if self.posx < 0 or self.posx > 1024 or self.posy < 0 or self.posy > 700:
            self.direccion += math.pi #con .pi rebotará en la misma dirección





#Metodo del botón guardarPersonas y guardo las variables (propiedades) de personas recorriendo cada objeto
#persona de la lista personas. Las voy guardar en una base de datos sqlite
#Aquí tengo toda la secuencia para hacer una  conexión con la base de datos---------------------------------------
#Guardo los jugadores en SQL con la sentencia insert
def guardarPersonas():
    conexion = sqlite3.connect("jugadores.sqlite3") #conecto con la base de datos mediante la variable conexion
    cursor = conexion.cursor()#El cursor es necesario para hacer peticiones a la base de datos
                       #Borro todos los datos que pudiera haber en la base de datos antes fe guardar los nuevos
    cursor.execute('''          
            DELETE FROM jugadores
            ''')
    conexion.commit()
    
    for persona in personas:
        cursor.execute('''
            INSERT INTO jugadores
            VALUES (
                NULL,
                '''+str(persona.posx)+''',
                '''+str(persona.posy)+''',
                '''+str(persona.radio)+''',
                '''+str(persona.direccion)+''',
                "'''+str(persona.color)+'''",
                "'''+str(persona.entidad)+'''"
            )
            ''')
    print(cursor)
    conexion.commit()#Hago un commit a la base de datos
    conexion.close()  #Cierro la conexión


    
#Creo ventana
raiz = tk.Tk()

#Creo un lienzo que es donde se va a desarrollar el programa
lienzo = tk.Canvas(raiz,width=1024,height=700)
lienzo.pack()


#Botón para guardar la posición de los objetos
boton = tk.Button(raiz,text = "Guardar",command=guardarPersonas)
boton.pack()


#Cargar objetos de personas desde SQL
try:    
    conexion = sqlite3.connect("jugadores.sqlite3") #conecto con la base de datos mediante la variable conexion
    cursor = conexion.cursor()#El cursor es necesario para hacer peticiones a la base de datos

    cursor.execute('''
            SELECT *
            FROM jugadores
            ''')

#Sentencia SQL de consulta
# WHERE posx < 540
#       AND
#       posy < 540
    
    while True:
        fila = cursor.fetchone()
        if fila is None:
            break
        print(fila)
        
        persona = Persona()
        persona.posx = fila[1]
        persona.posy = fila[2]
        persona.radio = fila[3]
        persona.direccion = fila[4]
        persona.color = fila[5]
        persona.entidad = fila[6]
        personas.append(persona)
        

    conexion.close()  #Cierro la conexión

except:
    print("Error al leer base de datos")



#Utilizo un bucle for para interar numeropersonas(x veces) en cada iteracion crea una instancia
#de la clase persona y la agrega a la lista personas mediante el método .append
#Esto lo hará en el caso de que no existan

if len(personas) == 0:
    numeropersonas =50                   #Cambio el nñumero de personas
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





raiz.mainloop()
