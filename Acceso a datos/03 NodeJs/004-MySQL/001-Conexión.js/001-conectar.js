
//Lo primero que tengo que hacer es instaslar el módulo de SQL. 

var mysql = require('mysql')

//Creo un objeto  conexión de la clase mysql con la función createConection  con los parámetros de mi conexión.
var conexion = mysql.createConnection({
    host:"localhost",
    user:"nodejs",
    password:"nodejs"
});


//Llamo al método conect del objeto conexión para iniciar la conexión con la base de datos. 

//Si hay algún error durante la conexión laza la exception throw err y si no, muestra el mensaje 'conectado'. Este bloque es similar al try catch en java para la captura de errores.
conexion.connect(function(err){ 
    if(err) throw err;
    console.log("conectado")
})
