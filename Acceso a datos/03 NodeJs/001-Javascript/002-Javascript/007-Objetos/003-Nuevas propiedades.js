

//Creamos la clase con objetos del tipo persona 

class Persona{
    constructor(){  //La calse persona tiene su contructor  y va a crear los objetos
        this.edad = 0  //del tipo persona con la propiedad edad.
        this.nombre = ""; //De este modo puedo crear tantas propiedades como necesite
    }
}

var persona1 = new Persona();//Creo una instancia, persona1,  de la clase persona 
console.log(persona1)  //Me escribe en consola el objeto persona1 de la clase persona