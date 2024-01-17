#Con este programa lo que voy a hacer es,voy a recortar cada una de las imágenes
#para que sean cuadradas, voy a reescalar la imagen para que sean más pequeñas
#y guardarlas en la carpeta que yo quiera.


from PIL import Image   #Cargo la librería de imagenes 
import os  #para poder leer dentro de la carpeta
import json

carpeta = "001-crudo"
carpetasalida = "002-procesadas"
imagenes = []

archivos = os.listdir(carpeta)

for archivo in archivos:   #para cada una de las imagenes:
    imagen = os.path.join(carpeta,archivo) #Junto en la variable la carpeta y la imagen
    miimagen = Image.open(imagen)  
    anchura = miimagen.width   #Guardo en variables la altura y la anchura
    altura = miimagen.height
    if anchura > altura:      #las corto para que sea cuadrada
        caja = (
             anchura/2-altura/2,
             0,
             anchura/2+altura/2,
             altura
             )
    else:
        caja = (
             0,
             altura/2-anchura/2,
             anchura,
             altura/2+anchura/2
             )
    cortada = miimagen.crop(caja)
    escalada = cortada.resize((512,512)) #a escala de 512+512
    escalada.save(carpetasalida+"/"+archivo) 
    imagenes.append(archivo)  #Las guardo en la carpeta de salida

archivojson = open("json/imagenes.json","w")  #Voy guardar la lista de imagenes en un archivo json 
json.dump(imagenes,archivojson)               #en la  carpeta json creada en la raiz
archivojson.close()

