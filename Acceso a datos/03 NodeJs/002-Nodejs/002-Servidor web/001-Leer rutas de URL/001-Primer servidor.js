var servidor = require('http');

servidor.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'});//En este servidor le estoy diciendo que lo que 
                                                    //voy devolver es texto html.
    res.end("<h1>Hola mundo desde Node.js</h1>"); //puedo decirle que el texto sea un H1 etiqueta de html
                                                    //aunque no es lo reconmendable.
    console.log("Alguien ha cargado la web")
}).listen(8080)