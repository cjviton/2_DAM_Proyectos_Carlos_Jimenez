from PIL import Image #Cargo la librería de imagenes 
import os  #para poder leer dentro de la carpeta

carpeta = "001-crudo"   

archivos = os.listdir(carpeta)

print(archivos)
