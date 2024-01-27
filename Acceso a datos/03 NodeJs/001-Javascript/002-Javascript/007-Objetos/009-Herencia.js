
//Tengo la clase animal con su constructor, en este caso sin propiedades
//Vamos a usar esta clase como clase padre de la clase persona, la cual va a
//heredar las propiedades y los métodos de la clase animal
class Animal{
    constructor(){

    }
    respira(){
        return "El animal está respirando";
    }
}


//Aquí le decimos que la clase persona extend (hereda) de la clase animal
class Persona extends Animal{
    constructor(){
        super(); //Dentro del constructor hay que decirle que coja las propiedades de la superclase.Esto lo hacemos con la palabra super
        this.edad = 0
        this.nombre = "";
    }
    setEdad(nuevaedad){
        this.edad = nuevaedad
    }
    getEdad(){
        return this.edad
    }
    setNombre(nuevonombre){
        this.nombre = nuevonombre
    }
    getNombre(){
        return this.nombre
    }
    saluda(){
        return "Hola, me llamo "+this.nombre+" y tengo "+this.edad
    }
}

var persona1 = new Persona();
persona1.setEdad( 45 );
persona1.setNombre("Jose Vicente");
console.log(persona1);
console.log(persona1.saluda());
console.log(persona1.respira())  //Al heredar podremos usar los métodos de la clase heredada para los objetos hijos