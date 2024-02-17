var mongoose = require('mongoose');
// npm install mongoose

const conexion = 'mongodb://127.0.0.1/contacto'


//Una vez conectados la base de datos vamos a hacer una consulta

//CReo un objeto de la clase mongoose con la estructura que tengo en mi base de datos. 
const formularioSchema = new mongoose.Schema({
    nombre:String,
    asunto:String,
    mensaje:String,
    fecha:String
})

//Creo la variable formulario donde voy a capturar el json de mi base de datos
const Formulario = mongoose.model("Formulario",formularioSchema)


//Creo un objeto NuevoFormulario de la clase Formulario donde creo la sentencia de inserción
const NuevoFormulario = new Formulario({
    nombre:"Carlos Jiménez",
    asunto:"Este es un mensaje desde node",
    mensaje:"Este es el cuerpo del mensaje",
    fecha:"2023-08-15"
})
mongoose.connect(conexion,{useNewUrlParser:true,useUnifiedTopology:true}).then(function(){
    console.log("conectado a mongo")
    NuevoFormulario.save()
        .then(function(){
            console.log("Insertado")
        })
})
