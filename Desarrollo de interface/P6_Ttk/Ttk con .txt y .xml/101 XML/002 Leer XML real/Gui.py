#Para leer archivos XML necesito importar la librería bs4
#Beautiful Soup es una librería Python que permite extraer
#información de contenido en formato HTML o XML.

from bs4 import BeautifulSoup

archivo= open("interfaz.xml","r") #Abro el archivo interfaz en modo lectura
contenido = archivo.read()
xml=BeautifulSoup(contenido,"xml")

for campo in xml.find_all("campo"):  #Con el bucle for le digo que busque con el 
    print(campo)                     #contenido campo e imprima

