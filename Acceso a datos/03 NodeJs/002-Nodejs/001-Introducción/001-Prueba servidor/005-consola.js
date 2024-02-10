//Creo una variable a la que llamo servidor y  mediante la palabra 
//reservada require llamo al módulo http 
const { dir } = require('console');
var servidor = require('http');

//llamo a la función createServer con los parametros reques y resonse 
//lo que me pide y lo que respondo. 
servidor.createServer(function(req,res){

    res.writeHead(200,{'Content-Type':'text/html'})  //voy devolver un código 200 y sera texto
    res.end("Hola mundo desde Node.js")              //el texto que devuelvo
                                                     //De esta manera acabo de crear un servidor web
                                                     //me devolverá hola mundo en el navegador

    console.log("Alguien ha cargado la web")   // con console.log me devuelve en la consola cada vez
                                               //cargue la página. 
    
}).listen(8080)  //Cambio el puerto de escucha el 8080.Luego se lo tengo que esècificar en el localhost


//De esta manera acabo de crear un servidor web que voy a reutilizar en los siguientes ejercicios.




