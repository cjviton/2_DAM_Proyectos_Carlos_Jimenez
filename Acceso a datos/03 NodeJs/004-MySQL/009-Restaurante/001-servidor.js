const http = require('http');
const fs = require('fs');
const path = require('path');
const mongoose = require('mongoose');
const querystring = require('querystring'); 



// Conexión a MongoDB
const connectionString = 'mongodb://localhost:27017/restaurante'; 
mongoose.connect(connectionString, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log('Conectado a MongoDB'))
    .catch(err => console.error('Error de conexión a MongoDB:', err));

// Definición de esquema y modelo de Mongoose
const reservaSchema = new mongoose.Schema({
    nombre: String,
    dia: String,
    mes: String,
    hora: String,
    gastronomico: String,
    cochinillo: String,
    infantil: String
});

const Reserva = mongoose.model('Reserva', reservaSchema, 'reservas');




const server = http.createServer((req, res) => {
    let filePath = '.' + req.url;
    // Furzo el root a cabecera.htm, y el resto las cargo directas
    if (filePath === './') {
        filePath = './public/cabecera.html';

    }else if(filePath === './menu'){
        //DDentro de este bloque de aqui tu puedes poner lo que hagga falta con mongoose o con lo que quieras ///////////////////////////////
        filePath = './public/menu.html';
        
    }else if(filePath === './reserva'){
        //DDentro de este bloque de aqui tu puedes poner lo que hagga falta con mongoose o con lo que quieras ///////////////////////////////
        filePath = './public/reserva.html';
        
    }else if(filePath === './procesa'){
        let datos = '';
        req.on('data', parte => {
            datos += parte.toString();
        });
        req.on('end', () => {
            const procesado = querystring.parse(datos);
            const nuevaReserva = new Reserva({
                nombre: procesado.nombre,
                dia: procesado.dia,
                mes: procesado.mes,
                hora: procesado.hora,
                gastronomico: procesado.gastronomico,
                cochinillo: procesado.cochinillo,
                infantil: procesado.infantil
            });
            nuevaReserva.save()
                
                .then(() => {
                    console.log('Reserva guardada en MongoDB');
                    // Responder al cliente como lo haces en otros casos
                    
                })
                .catch(error => {
                    console.error('Error al guardar reserva en MongoDB:', error);
                    // Responder al cliente con un mensaje de error apropiado
                });
        });
        
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