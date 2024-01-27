


//Explico esto pero no es la forma corecta de hacerlo. los métodos no deben hacer
//los consose.log ni dar salida al códig, esto lo haremos con return


class Persona{
    constructor(){
        this.edad = 0
        this.nombre = "";
    }

            //Mediante el mátodo set puedo asignar valores a las propiedades de 
            //los objetos de la clase persona

    setEdad(nuevaedad){
        this.edad = nuevaedad
    }
    setNombre(nuevonombre){
        this.nombre = nuevonombre
    }

    //Puedo crear tantos métodos como me sea necesario
    saluda(){
        console.log("Hola, me llamo "+this.nombre+" y tengo "+this.edad)
    }
}

var persona1 = new Persona();
persona1.setEdad( 45 );   //LLamo al método setEdad y le asigno valor
persona1.setNombre("Carlos");  //LLamo al método setNombre y le asigno valor
console.log(persona1);
persona1.saluda(); //LLamo al método saluda

