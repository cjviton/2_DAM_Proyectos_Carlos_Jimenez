

var archivos = require('fs');

//Si lo que quiero es sobreescribir cambio el metodo a writefila
archivos.writeFile("nuevo.txt",'Este es mi contenido 2\n',function(err){
    if(err) throw err;
    console.log("Misión cumplida")
})