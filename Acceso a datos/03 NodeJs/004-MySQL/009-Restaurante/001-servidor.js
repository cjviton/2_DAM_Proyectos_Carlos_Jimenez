//Cargo los módulos necesarios. Para que funcione mi web con la base de datos
//tengo que cargar a parte de los que tenía, el módulo mysql

var servidor = require('http');
var archivos = require('fs');
var ruta = require('url');
var procesador = require('querystring');
var mysql = require('mysql')

//Hago la conexión con la base de datos.
var conexion = mysql.createConnection({
    host: "localhost",
    user: "nodejs",
    password: "nodejs",
    database: "nodejs"
});

//le pido confirmación de conexión por si hubiera algún error.
conexion.connect(function(err) {
    if (err) throw err;
    console.log("conectado")
})

//Creo el servidor que escuchará por el puerto 8090
servidor.createServer(function(req, res) {
    res.writeHead(200, { 'Content-Type': 'text/html' })

    //variable para guardar en el archivo registro las fecha y hora de las 
    //visitas a las diferentes páginas.
    var rutacompleta = ruta.parse(req.url, true)

    //estructura de switch para cambiar entre las diferentes páginas.
    switch (req.url) {
        case "/":
            // Cuando la URL solicitada es "/", responder con el contenido de inicio.html
            archivos.readFile('cabecera.html', function(err, data) {
                if (err) {
                    console.error('Error al leer inicio.html:', err);
                    res.writeHead(500, { 'Content-Type': 'text/plain' });
                    res.end('Error interno del servidor');
                    return;
                }
                res.write(data);
                res.end();
            });
            break;
        case "/menu":
            // Cuando la URL solicitada es "/sobremi", responder con el contenido de sobremi.html
            archivos.readFile('menu.html', function(err, data) {
                if (err) {
                    console.error('Error al leer sobremi.html:', err);
                    res.writeHead(500, { 'Content-Type': 'text/plain' });
                    res.end('Error interno del servidor');
                    return;
                }
                res.write(data);
                res.end();
            });
            break;
        
            case "/reserva":
                // Cuando la URL solicitada es "/sobremi", responder con el contenido de sobremi.html
                archivos.readFile('reserva.html', function(err, data) {
                    if (err) {
                        console.error('Error al leer sobremi.html:', err);
                        res.writeHead(500, { 'Content-Type': 'text/plain' });
                        res.end('Error interno del servidor');
                        return;
                    }
                    res.write(data);
                    res.end();
                });
                break;
        
    }

    //Estructur para guardar los datos en el registro.
    if (req.url != "/favicon.ico") {
        var fecha = new Date();
        archivos.appendFile("registro.txt", fecha.getFullYear() + "," + fecha.getMonth() + "," + fecha.getDate() + "," + fecha.getHours() + "," + fecha.getMinutes() + "," + fecha.getSeconds() + "," + rutacompleta.host + "," + rutacompleta.pathname + "," + rutacompleta.search + "," + req.url + "\n", function(err) {
            if (err) throw err;
        });
    }

}).listen(8090)
