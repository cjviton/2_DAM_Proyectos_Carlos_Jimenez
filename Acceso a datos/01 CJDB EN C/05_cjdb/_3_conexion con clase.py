#Vamos a conectarnos desde python a un archivo externo
#Impotamos la librería subprocess

import subprocess

#Creo una clase con un método constructor 
class Cjdb:
    def __init__(self,basededatos):
        self.basededatos = basededatos

#Creo un método donde voy a meter el código para insertar

    def insert(self,coleccion,documento,contenido):                #Convierto en propiedades del método las variables
        self.operacion = "insert"
        self.coleccion = coleccion
        self.documento = documento
        self.contenido = contenido
        comando =  '"C:\\Users\\usuario\\Documents\\2ºDAM Proyectos Carlos Jimenez\\Acceso a datos\\05_cjdb\\cjdb.exe" '+self.operacion+' '+self.basededatos+' '+self.coleccion+' '+self.documento+' "'+self.contenido+'"'
        resultado = subprocess.run(comando,shell=True,stdout=subprocess.PIPE,stderr=subprocess.PIPE,text=True)

        if resultado.returncode == 0:
            return("ok")
        else:
            return("ko")



#Creo un objeto de la clase Cjdb
        
Conexion1 = Cjdb("miEmpresa")

#Llamo al metodo insert del objeto conexion1 de la clase Cjdb con sus parametros (coleccion,documento,contenido)
Conexion1.insert("clientes","cliente6","Este es el contenido del cliente 6")
