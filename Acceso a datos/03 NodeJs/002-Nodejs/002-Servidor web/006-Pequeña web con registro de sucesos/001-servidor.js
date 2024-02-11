
//voy a usar la estructura de web que he ido montando y voy a añadir un archivo donde
//se van a almacenar cada vez que alguien pida algo la url que hayan visitado. 


var servidor = require('http');
var archivos = require('fs');
servidor.createServer(function(req,res){
   res.writeHead(200,{'Content-Type':'text/html'})
   
   switch(req.url){
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
    if(req.url != "/favicon.ico"){
        archivos.appendFile("registro.txt",req.url+"\n",function(err){
            if(err) throw err;
        })
    }
    
}).listen(8080)