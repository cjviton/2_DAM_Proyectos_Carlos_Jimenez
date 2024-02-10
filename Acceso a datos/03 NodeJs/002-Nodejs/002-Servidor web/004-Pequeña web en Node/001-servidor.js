//Llamo a las libreias de nodejs http y fileserver

var servidor = require('http');
var archivos = require('fs');

servidor.createServer(function(req,res){  //Creo el servidor
   res.writeHead(200,{'Content-Type':'text/html'})
   
   switch(req.url){  //Un errutador entre las diferentes páginas 
        case "/":
            archivos.readFile('inicio.html',function(err,data){
                res.write(data)
                res.end("")
            });
            break;
        case "/sobremi":
            archivos.readFile('sobremi.html',function(err,data){
                res.write(data)
                res.end("")
            });
            break;
        case "/contacto":
            archivos.readFile('contacto.html',function(err,data){
                res.write(data)
                res.end("")
            });
            break;
        default:
            res.end("Página no encontrada");
    } 
    
    
}).listen(8080)