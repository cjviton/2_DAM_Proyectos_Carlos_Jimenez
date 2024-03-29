//Cargo los módulos necesarios. Para que funcione mi web con la base de datos
//tengo que cargar a parte de los que tenía.

var servidor = require('http');
var archivos = require('fs');
var ruta = require('url');
var procesador = require('querystring');
var mongoose = require('mongoose');

//Hago la conexión con la base de datos.
const conexion = 'mongodb://127.0.0.1/restaurante'

//le pido confirmación de conexión por si hubiera algún error.
mongoose.connect(conexion,{useNewUrlParser:true,useUnifiedTopology:true}).then(function(){
    console.log("conectado a mongoDB")
})

//CReo un objeto de la clase mongoose con la estructura que tengo en mi base de datos.
const reservaSchema = new mongoose.Schema({
    nombre:String,
    dia:String,
    mes:String,
    hora:String,
    gastronomico:String,
	cochinillo:String,
	infantil:String,
})

//Creo la variable Reserva donde voy a capturar el json de mi base de datos
const Reserva = mongoose.model("Reserva",reservaSchema)

//Creo un objeto NuevaReserva de la clase Reserva donde creo la sentencia de inserción para hacer una prueba de inserción en la base de datos.
/*
const NuevaReserva = new Reserva({
    nombre:"Diana Rodriguez",
    dia:"1",
    mes:"enero",
    hora:"14:00",
	gastronimico:"2",
	cochinillo:"2",
	infantil:"4",
});

mongoose.connect(conexion,{useNewUrlParser:true,useUnifiedTopology:true}).then(function(){
    console.log("conectado a mongo")
    NuevaReserva.save()
        .then(function(){
            console.log("Insertado")
        })
})

*/

//Creo el servidor que escuchará por el puerto 8090
servidor.createServer(function(req, res) {
    res.writeHead(200, { 'Content-Type': 'text/html' })

    //variable para guardar en el archivo registro las fecha y hora de las 
    //visitas a las diferentes páginas.
    var rutacompleta = ruta.parse(req.url, true)

    //estructura de switch para cambiar entre las diferentes páginas.
    switch (req.url) {
        case "/":
            // Cuando la URL solicitada es "/", responder con el contenido de cabecera.html
            archivos.readFile('cabecera.html', function(err, data) {
                if (err) {
                    console.error('Error al leer cabecera.html:', err);
                    res.writeHead(500, { 'Content-Type': 'text/plain' });
                    res.end('Error interno del servidor');
                    return;
                }
                res.write(data);
                res.end();
            });
            break;
        case "/menu":
            // Cuando la URL solicitada es "/menu", responder con el contenido de menu.html
            archivos.readFile('menu.html', function(err, data) {
                if (err) {
                    console.error('Error al leer menu.html:', err);
                    res.writeHead(500, { 'Content-Type': 'text/plain' });
                    res.end('Error interno del servidor');
                    return;
                }
                res.write(data);
                res.end();
            });
            break;
        
            case "/reserva":
                // Cuando la URL solicitada es "/reserva", responder con el contenido de reserva.html
                archivos.readFile('reserva.html', function(err, data) {
                    if (err) {
                        console.error('Error al leer reserva.html:', err);
                        res.writeHead(500, { 'Content-Type': 'text/plain' });
                        res.end('Error interno del servidor');7
                        return;
                    }
                    res.write(data);
                    res.end();
                });
                break;
            //Cuando puulse el botón enviar la url será /procesa y se ejecutará este código. 
            case "/procesa":
                let datos = '';//decalro la variable para declara la cadena vacía datos.
               req.on('data',parte=>{ //evento require para escucahr los datos que llegan en la solicitud
                   datos += parte.toString();
               })
               req.on('end',()=>{
                var cadena = datos
                var procesado = procesador.parse(cadena)//Se parsean los datos, convierte la cadena recibida en 
                                                        //en un objeto javascript
                console.log(procesado)
                var nnombre = procesado.nombre  //los datos procesaados se asignan se asignan a variables 
                var ndia = procesado.dia
                var nmes = procesado.mes
                var nhora = procesado.hora
                var ngastronomico = procesado.gastronomico
                var ncochinillo = procesado.cochinillo
                var ninfantil = procesado.infantil
                
                var NuevaReserva = new Reserva({  //Creo una instancia nuevaReserva del objeto Reserva
                     nombre:nnombre,
                     dia:ndia,
                     mes:nmes,
                     hora:nhora,
                     gastronomico:ngastronomico,
                     cochinillo:ncochinillo,
                     infantil:ninfantil
                 })
                
                NuevaReserva.save()   //Llamo el método save de la instancia reserva para guardar el documento
                 .then(function(){    //en la base de datos.
                     console.log("Insertado")
                     archivos.readFile('reserva.html', function(err, data) {//Caundo salve en la bbdd recarga la página /Reserva
                        if (err) {
                            console.error('Error al leer reserva.html:', err);
                            res.writeHead(500, { 'Content-Type': 'text/plain' });
                            res.end('Error interno del servidor');
                            return;
                        }
                        res.write(data);
                        res.end();
                    });
                 })
                
            })
            break;

            
            case "/95147":   /// PARA HACER LAS CONSULTAS DESDE LA URL         95147?dia=1&mes=Enero
                // Cuando la URL solicitada es "/95147", responder con el contenido de reservasConfirmadas.html
                archivos.readFile('reservasConfirmadas.html', function(err, data) {
                    if (err) {
                        console.error('Error al leer menu.html:', err);
                        res.writeHead(500, { 'Content-Type': 'text/plain' });
                        res.end('Error interno del servidor');
                        return;
                    }

                    //var dia = rutacompleta.query.dia;
                    //var mes = rutacompleta.query.mes;
                    
                   // Reserva.find({dia: dia, mes: mes}).exec()
                   Reserva.find({}).exec()
                        .then(function(reservas) {
                            console.log(reservas); // Imprimir en consola los resultados
                            //console.log(dia);
                            //console.log(mes);

                            // Escribir los resultados en la respuesta HTML
                           //res.write('<h1>RESERVAS CONFIRMADAS PARA ' + dia + '/' + mes + '</h1>');
                            res.write('<h1>RESERVAS CONFIRMADAS PARA HOY</h1>');
                            reservas.forEach(function(reserva) {
                                res.write('<h2>Nombre:  ' + reserva.nombre + '</h2>');
                                res.write('<p>Dia:  ' + reserva.dia + '</p>');
                                res.write('<p>Mes:  ' + reserva.mes + '</p>');
                                res.write('<p>Hora:  ' + reserva.hora + '</p>');
                                res.write('<p>Menu gastonomico:  ' + reserva.gastronomico + '</p>');
                                res.write('<p>Cochinillo:  ' + reserva.cochinillo + '</p>');
                                res.write('<p>Menu infantil:  ' + reserva.infantil + '</p>');
                            });
                            res.write('</reservas_para_hoy>');

                            res.end(); // Finalizar la respuesta después de escribir los datos
                        })
                        .catch(function(err) {
                            console.error('Error al leer reservas de la base de datos:', err);
                            res.writeHead(500, { 'Content-Type': 'text/plain' });
                            res.end('Error al leer reservas de la base de datos');
                        });
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