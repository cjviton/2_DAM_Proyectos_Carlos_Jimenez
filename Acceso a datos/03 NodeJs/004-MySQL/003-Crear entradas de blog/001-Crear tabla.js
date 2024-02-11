var mysql = require('mysql')


var conexion = mysql.createConnection({
    host:"localhost",
    user:"nodejs",
    password:"nodejs",
    database:"nodejs"  //incluyo con que tabla de las que tengo quiero operar.
});

conexion.connect(function(err){
    if(err) throw err;
    console.log("conectado")

    //Voy a crear una tabla a la que voy a llamar entrada y lo voy a hacer
    //con lenguaje sql. del mismo modo que cree la tabla. 
    conexion.query(`
        CREATE TABLE entradas 
        ( 
            id INT AUTO_INCREMENT PRIMARY KEY,
            titulo VARCHAR(255),
            texto TEXT,
            fecha VARCHAR(255)
        )
    `,function(err,result){
        if(err) throw err;
        console.log("Se ha creado la tabla")
    })
})
