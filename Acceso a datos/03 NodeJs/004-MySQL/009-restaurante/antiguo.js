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

const meses = {
    'Enero': '01',
    'Febrero': '02',
    'Marzo': '03',
    'Abril': '04',
    'Mayo': '05',
    'Junio': '06',
    'Julio': '07',
    'Agosto': '08',
    'Septiembre': '09',
    'Octubre': '10',
    'Noviembre': '11',
    'Diciembre': '12'
};

const server = http.createServer((req, res) => {
    let filePath = '.' + req.url;
    // Furzo el root a cabecera.htm, y el resto las cargo directas
    if (filePath === './') {
        filePath = './public/cabecera.html';

    } else if(filePath === './menu'){
        filePath = './public/menu.html';

    } else if(filePath === './reserva'){
        filePath = './public/reserva.html';

    } else if(filePath === './procesa'){

    } else if(filePath === './12345'){
        // Obtener la fecha actual
        const currentDate = new Date();
        const diaActual = String(currentDate.getDate()).padStart(2, '0');
        const mesActual = Object.keys(meses).find(key => meses[key] === String(currentDate.getMonth() + 1).padStart(2, '0'));

        console.log(diaActual);
        console.log(mesActual);

        // Realizar consulta a la base de datos
        Reserva.find({ dia: diaActual, mes: mesActual }).exec()
            .then(function(reservas) {
                console.log(reservas); // Imprimir en consola los resultados

                // Preparar la respuesta HTML
                let response = '<h1>Reservas para hoy</h1>';
                reservas.forEach(function(reserva) {
                    response += `<p>Nombre: ${reserva.nombre}</p>`;
                    response += `<p>Día: ${reserva.dia}</p>`;
                    response += `<p>Mes: ${reserva.mes}</p>`;
                    response += `<p>Hora: ${reserva.hora}</p>`;
                    response += `<p>Menú Gastronómico: ${reserva.gastronomico}</p>`;
                    response += `<p>Cochinillo: ${reserva.cochinillo}</p>`;
                    response += `<p>Menú Infantil: ${reserva.infantil}</p>`;
                    response += '<hr>'; // Separador entre reservas
                });

                // Enviar la respuesta al cliente con la codificación UTF-8
                res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'});
                res.end(response);
            })
            .catch(function(err) {
                console.error('Error al leer reservas de la base de datos:', err);
                res.writeHead(500, { 'Content-Type': 'text/plain' });
                res.end('Error al leer reservas de la base de datos');
            });
        return; // Salir del manejador de solicitud después de enviar la respuesta
    } else {
        filePath = './public' + req.url;
    }

    if (filePath === './procesa') {
        // Manejo de la solicitud POST en la ruta '/procesa'
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
                    // Redirigir al cliente hacia la página '/reserva.html' después de guardar los datos
                    res.writeHead(302, {'Location': '/reserva.html'});
                    res.end();
                })
                .catch(error => {
                    console.error('Error al guardar reserva en MongoDB:', error);
                    res.writeHead(500);
                    res.end('Internal Server Error');
                });

        });
    } else {
        // Paso los nombres de archivo todos a minúsculas
        const extname = String(path.extname(filePath)).toLowerCase();
        // Tipos de archivo soportados
        const contentType = {
            '.html': 'text/html',
            '.jpg': 'image/jpeg',
            '.png': 'image/png'
        }[extname] || 'application/octet-stream';

        // Carga en el servidor el archivo que se haya solicitado en la URL como si esto fuera Apache
        fs.readFile(filePath, (err, content) => {
            if (err) {
                // En el caso de que lo que se pida no exista, saca un 404
                if (err.code === 'ENOENT') {
                    res.writeHead(404);
                    res.end('La página que has pedido no existe');
                } else {
                    // En caso de error del servidor, muestra el error
                    res.writeHead(500);
                    res.end('Internal Server Error: ' + err.code);
                }
            } else {
                // En el caso de que exista, devuelve su contenido
                res.writeHead(200, { 'Content-Type': contentType });
                res.end(content, 'utf-8');
            }
        });
    }
});

const port = process.env.PORT || 3000;
server.listen(port, () => {
    console.log(`Server is listening on port ${port}`);
});
