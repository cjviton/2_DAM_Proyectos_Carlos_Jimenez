const http = require('http');
const fs = require('fs');
const path = require('path');

const server = http.createServer((req, res) => {
    let filePath = '.' + req.url;
    // Furzo el root a cabecera.htm, y el resto las cargo directas
    if (filePath === './') {
        filePath = './public/cabecera.html';
    } 
    else if(filePath === './12345'){
        //DDentro de este bloque de aqui tu puedes poner lo que hagga falta con mongoose o con lo que quieras ///////////////////////////////
        filePath = './public/admin.html';
        

        //DDentro de este bloque de aqui tu puedes poner lo que hagga falta con mongoose o con lo que quieras ///////////////////////////////
    }else {
        filePath = './public' + req.url;
    }
    // Paso los nombres de archivo todos a minusculas
    const extname = String(path.extname(filePath)).toLowerCase();
    // Tipos de archivo soportados
    const contentType = {
        '.html': 'text/html',
        '.jpg': 'image/jpeg',
        '.png': 'image/png'
        // Add more MIME types as needed
    }[extname] || 'application/octet-stream';
    // Carga en el servidor el ardhivo que yo haya solicitado en la url como si esto fuera apache
    fs.readFile(filePath, (err, content) => {
        if (err) {
            // En el caso de que lo que pida no exista, sacame un 404
            if (err.code === 'ENOENT') {
                res.writeHead(404);
                res.end('La pagina que has pedido no existe');
            } else {
                // En caso de error de servidor, dame el error
                res.writeHead(500);
                res.end('Internal Server Error: ' + err.code);
            }
        } else {
            // En el caso de que exista, dame su contenido
            res.writeHead(200, { 'Content-Type': contentType });
            res.end(content, 'utf-8');
        }
    });
});

const port = process.env.PORT || 3000;
server.listen(port, () => {
    console.log(`Server is listening on port ${port}`);
});