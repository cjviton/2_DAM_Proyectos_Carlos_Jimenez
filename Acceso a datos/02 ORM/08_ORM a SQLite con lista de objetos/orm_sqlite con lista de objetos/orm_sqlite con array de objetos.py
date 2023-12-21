import tkinter as tk
import random          #Para usar los métodos de la calse random
import math            #Importo la librería matemática
import json            #Importo la libreria json para hacer el guardado de datos
import sqlite3

#Declaración de variables globales
#Creo un array de objetos del tipo persona
personas = []
numeropersonas = 50



class Recogible:                                         #Creo dos clases constructoras más que me van a 
    def __init__(self):                                  #generar  objetos de la clase Recogible que luego 
        self.posx = random.randint(0,1024)               #meteré en el atributo lista inventario de la clase 
        self.posy = random.randint(0,1024)               #persona
        self.color = "blue"

    def serializar(self):                               #Con el método serializar convierte un objeto con varias 
        recogible_serializado = {                       #propiedades en formas que facilita su almacenamiento.                     
            "posx":self.posx,
            "posy":self.posy,
            "color":self.color
            }
        return recogible_serializado
              

#Creo una clase persona con un método constructor y hereda de Entidad
class Persona():
    def __init__(self):
        self.posx = random.randint(0,1024)
        self.posy = random.randint(0,1024)
        self.color = "blue"
        self.radio = 30
        self.direccion = random.randint(0,360)
        
        #En la segunda parte del ejer creo estos atributos en la clese persona
        self.energia = 100
        self.descanso = 100
        self.entidadenergia = ""
        self.entidaddescanso = ""

        #En la tercera parte del ejercio voy a crear una lista
        self.inventario = []                                            #Creo una lista con 1o objetos de la clase recogibles y se
        for i in range(0,10):                                           #asigna a la propiedad inventario
            self.inventario.append(Recogible())         


        
        
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
        #Con el movimiento va perdiendo energía y descanso
        if self.energia > 0:
            self.energia -= 0.1
        if self.descanso > 0:
            self.descanso -= 0.1
            
        self.colisiona()#Llamo el método colisiona

        #Creo dirección
        lienzo.move(
            self.entidad,
            math.cos(self.direccion),
            math.sin(self.direccion))
        anchuradescanso = (self.descanso/100)*self.radio

        #Creo movimiento en los rectángulos a la vez que el objeto
        lienzo.coords(
            self.entidaddescanso,
            self.posx - self.radio/2,
            self.posy - self.radio/2 - 16,
            self.posx - self.radio/2 + anchuradescanso,
            self.posy - self.radio/2 - 14
        )
        anchuraenergia = (self.energia/100)*self.radio
        lienzo.coords(
            self.entidadenergia,
            self.posx - self.radio/2,
            self.posy - self.radio/2 - 10,
            self.posx - self.radio/2 + anchuraenergia,
            self.posy - self.radio/2 - 8
        )
        
        
        self.posx += math.cos(self.direccion)  #Actualizo las posiciones para que funcione el método colisiona
        self.posy += math.sin(self.direccion)

    #Método colisiona para que os objetos permanezcan dentro del lienzo
    def colisiona(self):
        if self.posx < 0 or self.posx > 1024 or self.posy < 0 or self.posy > 700:
            self.direccion += math.pi #con .pi rebotará en la misma dirección

    def serializar(self):
        persona_serializada = {
            "posx":self.posx,
            "posy":self.posy,
            "radio":self.radio,
            "direccion":self.direccion,
            "color":self.color,
            "energia":self.energia,
            "descanso":self.descanso,
            "inventario":[item.serializar() for item in self.inventario]
            }
        return persona_serializada



#Metodo del botón guardarPersonas y guardo las variables (propiedades) de personas recorriendo cada objeto
#persona de la lista personas. Las voy guardar en una base de datos sqlite
#Aquí tengo toda la secuencia para hacer una  conexión con la base de datos---------------------------------------
#Guardo los jugadores en SQL con la sentencia insert
def guardarPersonas():
    
    print("guardo a los jugadores")
    
    personas_serializadas = [persona.serializar() for persona in personas]                      #Serializa la información de todas las personas
##    cadena = json.dumps(personas_serializadas)                                                #en la lista persoans
##    
##    archivo = open("jugadores.json",'w')
##    archivo.write(cadena)

    with open("jugadores.json","w") as archivo:               
        
        json.dump(personas_serializadas,archivo,indent=4)                                       #Guarda la información serializada en json
    




    conexion = sqlite3.connect("jugadores_con_arrayObjetos.sqlite3") #conecto con la base de datos mediante la variable conexion
    cursor = conexion.cursor()#El cursor es necesario para hacer peticiones a la base de datos
                                                                                    #Borro todos los datos que pudiera haber en la base de datos antes de guardar los nuevos
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
                "'''+str(persona.entidad)+'''",
                '''+str(persona.energia)+''',
                '''+str(persona.descanso)+''',
                "'''+str(persona.entidadenergia)+'''",
                "'''+str(persona.entidaddescanso)+'''",
                "'''+str(persona.inventario)+'''"       
            )
            ''')                                #Añado el nuevo campo inventario a la sentecia insert
    
        cursor.execute('''          
            DELETE FROM recogibles
            ''')
        conexion.commit()
        
                                                                                             #Creo la sentencia SQL de guadador de los objetos 
        for recogible in persona.inventario:                                                  #de la calse recogibles en la tabla
            peticion = '''  
            INSERT INTO recogibles
            VALUES (
                NULL,
                '''+str(persona.entidad)+''',
                "'''+str(recogible.posx)+'''",
                "'''+str(recogible.posy)+'''",
                "'''+str(recogible.color)+'''"
            )      
            '''

            cursor.execute(peticion)
            
            
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
    conexion = sqlite3.connect("jugadores_con_arrayObjetos.sqlite3") #conecto con la base de datos mediante la variable conexion
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
        
        
        persona = Persona()
        persona.posx = fila[1]
        persona.posy = fila[2]
        persona.radio = fila[3]
        persona.direccion = fila[4]
        persona.color = fila[5]
        persona.entidad = fila[6]
        persona.energia = fila[7]
        persona.descanso = fila[8]
        persona.entidadenergia = fila[9]
        persona.entidaddescanso = fila[10]
        
        cursor2 = conexion.cursor()
        nuevapeticion = '''
            SELECT *
            FROM recogibles
            WHERE persona = '''+persona.entidad+'''
            '''
        
        cursor2.execute(nuevapeticion)                                          #Cargo objetos de la tabla racogible
        while True:
            fila2 = cursor2.fetchone()
            if fila2 is None:
                break
            nuevorecogible = Recogible()
            nuevorecogible.posx = fila2[2]
            nuevorecogible.posy = fila2[3]
            nuevorecogible.color = fila2[4]
            persona.inventario.append(nuevorecogible)
            #pass
        
        personas.append(persona)
        

    conexion.close()  #Cierro la conexión

except sqlite3.Error as error:
    print("error al leer base de datos",error)



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
