

//Nodejs no tiene que usarse solamente para crear servidoree web podemo crear archivos.
//Vamos a ver ahora el manejo de archivos

var archivos = require('fs');//Llamo a la librería filesystem 

//Voy a crear el archivo nuevo txt. Escribo dentro del archivo 'este es mi contenido' 
//y ejecuto una función de captura de erres 'if(err) throw err' si hay un error lanza el error
//y si no, lanza el mensaje por consola 'Misión cumplida'


//Para añadir solamente tengo que ejecutar de nuevo el archivo conel texto nuevo que quiero añadir.
//voy a poner \n para para que haga el salto de carro 
archivos.appendFile("nuevo.txt",'Este es mi nuevo contenido\n',function(err){
    if(err) throw err;
    console.log("Misión cumplida")
})