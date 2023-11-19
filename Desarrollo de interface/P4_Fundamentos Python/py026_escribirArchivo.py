
#Para abrir un archivo para guardar datos

archivo = open("miarchivo.txt",'a') #Estamos asigando a la variable archivo un objeto (open) con el flag de tipo a
archivo.write("Este es un texto que estoy escribiendo")  #escribo en el archivo de texto
archivo.close()   #Cerrar archivo siempre



'''
Formas de abrir un archivo

Mode	Description
'r'	Open a file for reading. (default)
'w'	Open a file for writing. Creates a new file if it does not exist or truncates the file if it exists.
'x'	Open a file for exclusive creation. If the file already exists, the operation fails.
'a'	Open for appending at the end of the file without truncating it. Creates a new file if it does not exist.
't'	Open in text mode. (default)
'b'	Open in binary mode.
'+'	Open a file for updating (reading and writing)
'''
