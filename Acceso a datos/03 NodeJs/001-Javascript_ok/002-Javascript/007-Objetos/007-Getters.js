

//Explico esto pero no es la forma corecta de hacerlo. los métodos no deben hacer
//los consose.log ni dar salida al código, esto lo haremos con return


class Persona{
    constructor(){
        this.edad = 0
        this.nombre = "";
    }


    //setter y getter de la propiedad edad del objeto persona 
    setEdad(nuevaedad){
        this.edad = nuevaedad
    }
    getEdad(){  //Con este método me va a escribir en consola el valor de la varible edad del 
        console.log(this.edad) //la instancia de tipo persona.
    }


    //setter y getter de la propiedad nombre del objeto persona 
    setNombre(nuevonombre){
        this.nombre = nuevonombre
    }
    getNombre(){
        console.log(this.nombre)
    }



    saluda(){
        console.log("Hola, me llamo "+this.nombre+" y tengo "+this.edad)
    }
}

var persona1 = new Persona();
persona1.setEdad( 45 );
persona1.setNombre("Jose Vicente");
console.log(persona1);
persona1.saluda();