var mongoose = require('mongoose');

const conexion = 'mongodb://127.0.0.1/contacto'


//Me conecto a la conexion (variable con la ip localhost
mongoose.connect(conexion,{useNewUrlParser:true,useUnifiedTopology:true}).then(function(){
    console.log("conectado a mongo")
})