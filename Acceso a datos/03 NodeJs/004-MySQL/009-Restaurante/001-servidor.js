
//Cargo los módulos necesarios. Para que funcione mi web con la base de datos
//tengo que cargar a parte de los que tenía, el módulo mysql

var servidor = require('http');
var archivos = require('fs');
var ruta = require('url');
var procesador = require('querystring');
var mysql = require('mysql')


//Hago la conexión con la base de datos.
var conexion = mysql.createConnection({
                host:"localhost",
                user:"nodejs",
                password:"nodejs",
                database:"nodejs"
            });

//le pido confirmación de conexión por si hubiera algún error.
conexion.connect(function(err){
                if(err) throw err;
                console.log("conectado")
 })    


//Creo el servidor que escuchará por el puerto 8090
servidor.createServer(function(req,res){
   res.writeHead(200,{'Content-Type':'text/html'})

   //variable para guardar en el archivo registro las fecha y hora de las 
   //visitas a las diferentes páginas.
   var rutacompleta = ruta.parse(req.url,true)

    //estructura de switch para cambiar entre las diferentes páginas.
    archivos.readFile('plantillas/cabecera.html',function(err,data){
        res.write(data)
       switch(req.url){
        case "/":
            archivos.readFile('inicio.html',function(err,data){
                res.write(data)
            });
            break;
        case "/sobremi":
            archivos.readFile('sobremi.html',function(err,data){
                res.write(data)
            });
            break;
        case "/blog":  //Aquí es donde hago la peticion de select a la bbdd para que me lo 
                      //muestre en mi consola.
            conexion.query(`
                SELECT * FROM entradas
            `,function(err,result,fields){
                if(err) throw err;
                console.log(result)
                for(let i = 0;i<result.length;i++){
                    console.log(result[i])
                    res.write(`
                        <article>
                            <h4>`+result[i].titulo+`</h4>
                            <time>`+result[i].fecha+`</time>
                            <p>`+result[i].texto+`</p>
                        </article>
                    `)
                } 
            })
           
            break;
        case "/contacto":
            archivos.readFile('contacto.html',function(err,data){
                res.write(data)
            });
            break;
        case "/procesa":
            let datos = '';
               req.on('data',parte=>{
                   datos += parte.toString();
               })
               req.on('end',()=>{
                   var cadena = datos
                   var procesado = procesador.parse(cadena)
                   console.log(procesado)
               })
            
            break;
        default:
            res.end("Página no encontrada");
    } 
     archivos.readFile('plantillas/piedepagina.html',function(err,data){
        res.write(data)
         res.end("")
    });
    });
   

    //Estructur para guardar los datos en el registro.
    if(req.url != "/favicon.ico"){
       var fecha = new Date();
    archivos.appendFile("registro.txt",fecha.getFullYear()+","+fecha.getMonth()+","+fecha.getDate()+","+fecha.getHours()+","+fecha.getMinutes()+","+fecha.getSeconds()+","+rutacompleta.host+","+rutacompleta.pathname+","+rutacompleta.search+","+req.url+"\n",function(err){
            if(err) throw err;
        })
    }
    
}).listen(8090)