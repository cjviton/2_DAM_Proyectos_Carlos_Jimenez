var servidor = require('http');
var ruta = require('url');

servidor.createServer(function(req,res){
   res.writeHead(200,{'Content-Type':'text/html'})

   switch(req.url){
        case "/":   //Creo un formulario html y cuando pulso el botón escribirá en la url /procesa  
            res.write(`
                <form action="/procesa" method="POST" enctype="application/x-www-form-urlencoded">
                    <input type="text" name="nombre">
                    <input type="submit">
                </form>
            `)
            break;
        case "/procesa": //desde esta url capturo los datos introducudos 
           let datos = '';
           req.on('data',parte=>{
               datos += parte.toString();
           })
           req.on('end',()=>{   //y los escribe por consola.
               console.log(datos)
           })
            break;
       
    } 
    res.end("")
    
}).listen(8080)