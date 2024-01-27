class Persona{
    constructor(){
        this.edad = 0
        this.nombre = "";
    }
    saluda(){
        console.log("Hola, me llamo "+this.nombre+" y tengo "+this.edad)
    }
}

var persona1 = new Persona();
persona1.edad = 45;
persona1.nombre = "Jose Vicente";
console.log(persona1);
persona1.saluda();


//De este modo puedo asignar valores a las propiedades de la clase persona. 
//pero no es el modo correcto. La forma correcta de hacerlo es mediante getters and setters