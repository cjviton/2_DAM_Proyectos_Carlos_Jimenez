#Vamos a conectarnos desde python a un archivo externo
#Impotamos la librería subprocess

import subprocess
comando =  '"C:\\Users\\usuario\\Documents\\2ºDAM Proyectos Carlos Jimenez\\Acceso a datos\\05_cjdb\\cjdb.exe" insert miEmpresa clientes cliente3 "Este es el clciente 3"'
resultado = subprocess.run(comando,shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE,text=True)

if resultado.returncode == 0:
    print("ok")
else:
    print("ko")
