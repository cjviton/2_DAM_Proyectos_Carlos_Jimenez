var servidor = require('http');

servidor.createServer(function(req,res){
    res.writeHead(200,{'Content-Type':'text/html'});
    res.write("<h1>Hola mundo desde Node.js</h1>");
    res.end(req.url);                  //De esta manera puedo hacer reques de la url 
    console.log("Alguien ha cargado la web")
}).listen(8080)