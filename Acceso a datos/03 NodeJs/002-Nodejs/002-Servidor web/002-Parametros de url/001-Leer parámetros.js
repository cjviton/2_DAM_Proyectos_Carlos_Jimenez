var servidor = require('http');
var ruta = require('url'); //Llamo a la librería url de nodejs

servidor.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'});
    var parametros = ruta.parse(req.url,true).query; //Le digo que la variable parametros se la voy a dar en ruta que es la variable que asiganmos a la libreia url 
    res.write("Tu nombre es: "+parametros.nombre)
    res.end("")
}).listen(8080)