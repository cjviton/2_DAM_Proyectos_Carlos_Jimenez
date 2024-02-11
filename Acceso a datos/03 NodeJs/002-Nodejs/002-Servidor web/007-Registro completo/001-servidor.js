
//Partimos de la estrcutura que teníamos anterior y vamos mejorar la información que 
//guardamos con la url completa junto son la fecha y la hora.

var servidor = require('http');
var archivos = require('fs');
var ruta = require('url'); //importo el módulo de url para trabajar con direcciones.


servidor.createServer(function(req,res){
   res.writeHead(200,{'Content-Type':'text/html'})
   var rutacompleta = ruta.parse(req.url,true)
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
       var fecha = new Date();        //Creo un objeto fecha  de tipo date que llamando a
                                     // funciones de obtengo día y hora.
                                      
    archivos.appendFile("registro.txt",fecha.getFullYear()+","+fecha.getMonth()+","+fecha.getDate()+","+fecha.getHours()+","+fecha.getMinutes()+","+fecha.getSeconds()+","+rutacompleta.host+","+rutacompleta.pathname+","+rutacompleta.search+","+req.url+"\n",function(err){
            if(err) throw err;
        })
    }
    
}).listen(8080)