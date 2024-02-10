

var archivos = require('fs');

//Para eliminar método unlink y nombre del archivo que quiero borrar.
archivos.unlink('cambio.txt',function(err){
    if(err) throw err;
    console.log("Misión cumplida")
})