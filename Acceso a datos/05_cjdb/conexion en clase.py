#Vamos a conectarnos desde python a un archivo externo
#Impotamos la librería subprocess

import subprocess



operacion = "insert"
basededatos = "miempresa"
coleccion = "clientes"
documento = "cliente5"
contenido = "Este es el cliente 5"


comando =  '"C:\\Users\\usuario\\Documents\\2ºDAM Proyectos Carlos Jimenez\\Acceso a datos\\05_cjdb\\cjdb.exe" '+operacion+' '+basededatos+' '+coleccion+' '+documento+' "'+contenido+'"'
resultado = subprocess.run(comando,shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE,text=True)

if resultado.returncode == 0:
    print("ok")
else:
    print("ko")
