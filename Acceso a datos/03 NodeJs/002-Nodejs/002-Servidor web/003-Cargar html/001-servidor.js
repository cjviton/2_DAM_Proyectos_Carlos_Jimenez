

var servidor = require('http');
//Lamo a la libreria fs filesystem y mi programa va a ser capaz de leer archivos
var archivos = require('fs');
servidor.createServer(function(req,res){
    archivos.readFile('inicio.html',function(err,data){ //El archivo que quiero leer es inicio.html
                                                        //cuando cargue ese archivo quiero que haga algo function 
        res.writeHead(200,{'Content-Type':'text/html'});
        res.write(data) //Escribira el parametro data de function 
        res.end("")
    });
    
    
}).listen(8080)


//Si ejecuto este código me dará error porque no tengo creaso el archivo inicio.html

//De este modo utilizo node como servidor y que cargue las páginas html en otros archivos.