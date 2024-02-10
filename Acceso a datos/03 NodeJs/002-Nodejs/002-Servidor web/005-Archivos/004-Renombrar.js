

var archivos = require('fs');

//DE igual manera para renombrar cambio el método a rename
archivos.rename("nuevo.txt",'cambio.txt',function(err){
    if(err) throw err;
    console.log("Misión cumplida")
})