//Parto del servidor web que hice en el ejercicio anterior.
//Require es una funcion que nos permite cargar librerias 

var servidor = require('http');


servidor.createServer(function(req,res){
    fecha = new Date()     //esta es otra forma de crear un objeto de una libreria 
    res.writeHead(200,{'Content-Type':'text/html'});
    res.write("Hola mundo desde Node.js");
    res.end(""+fecha.getFullYear()+"")       //De digo que me devuelva la fecha con el método getFullYear.
    console.log("Alguien ha cargado la web")
}).listen(8080)




