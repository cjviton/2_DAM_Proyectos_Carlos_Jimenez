
//Creo una variable a la que llamo servidor y  mediante la palabra 
//reservada require llamo al módulo http 
var servidor = require('http');

//llamo a la función createServer con los parametros reques y resonse 
//lo que me pide y lo que respondo. 
servidor.createServer(function(req,res){

    res.writeHead(200,{'Content-Type':'text/html'})  //voy devolver un código 200 y sera texto
    res.end("Hola mundo desde Node.js")              //el texto que devuelvo
                                                     //De esta manera acabo de crear un servidor web
    
}).listen(80)  //Creo  puerto de escucha, el 80. 