
//Parto del servidor web que hice en el ejercicio anterior.
//Require es una funcion que nos permite cargar librerias 

var servidor = require('http');
var fecha = require('Date');    //Cargo la libreira de DATE

servidor.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'});
    res.end("Hola mundo desde Node.js");
    console.log("Alguien ha cargado la web")
}).listen(8080)