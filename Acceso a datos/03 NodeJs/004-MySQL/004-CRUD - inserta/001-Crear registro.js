

var mysql = require('mysql')

var conexion = mysql.createConnection({
    host:"localhost",
    user:"nodejs",
    password:"nodejs",
    database:"nodejs"
});

conexion.connect(function(err){
    if(err) throw err;
    console.log("conectado")

    //Con el mismo método hago petición a la bbdd para que haga un insert. 
    conexion.query(`
        INSERT INTO entradas VALUES(
            NULL,
            'Titulo de la entrada',
            'Texto de la entrada',
            '2023-08-14'
        )

        
    `,function(err,result){
        if(err) throw err;
        console.log("Se ha insertado el registro")
    })
})
