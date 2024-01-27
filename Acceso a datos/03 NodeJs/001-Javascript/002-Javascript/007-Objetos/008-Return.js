


//Creo el constructor con dos propiedades del objeto persona
class Persona{          
    constructor(){
        this.edad = 0
        this.nombre = "";
    }

    //Método Setter para a signar valor a la variable edad
    setEdad(nuevaedad){
        this.edad = nuevaedad
    }
    //Método Getter que me va a devolver el valor de la variable edad
    getEdad(){
        return this.edad
    }



    //Método Setter para a signar valor a la variable nombre
    setNombre(nuevonombre){
        this.nombre = nuevonombre
    }
    //Método Getter que me va a devolver el valor de la variable nombre
    getNombre(){
        return this.nombre
    }

    

    saluda(){
        return "Hola, me llamo "+this.nombre+" y tengo "+this.edad 
    } 
}



var persona1 = new Persona();   //Creo la instancia persona1 del objeto persona
persona1.setEdad( 47 );        //Llamo la método setEdad y asigno valor a la propiedad edad del objeto persona1
persona1.setNombre("Carlos");  //Llamo la método setNombre y le asigno valor a la propiedad nombre del objeto persona1
console.log(persona1);  //Me escribe por consola las propiedades del objeto persona 1
console.log(persona1.saluda()); //Lamo al método saluda 
console.log(persona1.getNombre()); //Me escribe el valor de la propiedad nombre del objeto persona1



//He cambiado en los métodos el console.log por la instrucción return