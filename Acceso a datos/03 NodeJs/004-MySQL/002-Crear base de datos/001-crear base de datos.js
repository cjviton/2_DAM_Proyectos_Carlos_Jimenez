

var mysql = require('mysql')

//Creo un objeto  conexión de la clase mysql con la función createConection  con los parámetros de mi conexión
var conexion = mysql.createConnection({
    host:"localhost",
    user:"nodejs",
    password:"nodejs"
});

//Llamo al método conect del objeto conexión para iniciar la conexión con la base de datos. 
conexion.connect(function(err){
    if(err) throw err;
    console.log("conectado")

    //Con lenguaje sql voy a crear una bbdd. Tambien con captura de errores.
    conexion.query('CREATE DATABASE nodejs',function(err,result){
        if(err) throw err;
        console.log("Se ha creado la base de datos")
    })
})
