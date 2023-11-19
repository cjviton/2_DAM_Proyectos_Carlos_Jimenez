archivo = open("agenda.txt",'r') #Forma de leer el archivo agenda


linea = archivo.read()
print(linea)

partido = linea.split(",")#split lee de un archivo strig y lo convierte en una
                          #lista []
print(partido)
