#Desde aqui importo del archivo 04cjdb_conector la clase Cjdb
from cjdb_conector_con_select import Cjdb

#Creo un objeto: Conexion1, de la clase Cjdb de la basededatos: miEmpresa     
Conexion1 = Cjdb("miEmpresa")

#Llamo al metodo insert del objeto conexion1 de la clase Cjdb con sus parametros (coleccion,documento,contenido)
Conexion1.insert("clientes","cliente10","Este es el contenido del cliente 7")




#llamo al método select
Conexion1.select("clientes","cliente2")

