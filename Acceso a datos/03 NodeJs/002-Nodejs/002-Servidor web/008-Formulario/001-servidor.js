


var servidor = require('http');
var ruta = require('url');

servidor.createServer(function(req,res){
   res.writeHead(200,{'Content-Type':'text/html'})

   switch(req.url){
        case "/": 
            //Creo un formulario html y cuando pulso el botón escribirá en la url /procesa   
            res.write(` 
                <form action="/procesa" method="POST">
                    <input type="text" name="nombre">
                    <input type="submit">
                </form>
            `)
            break;
        case "/procesa":
            console.log("voy a procesar el formulario")
            break;
       
    } 
    res.end("")
    
}).listen(8080)