
//Creo el objeto fecha de la clase Date

var fecha = new Date() 
console.log("El año es: "+fecha.getFullYear()) //El método fullyear me devuelve el año 
console.log("El mes es: "+(fecha.getMonth()+1)) //Devuelve el mes, al empezar en 0 hay que sumar 1
console.log("El día es: "+fecha.getDate()) //Devuelve el día
console.log("La hora es: "+fecha.getHours()) //Devuelve la hora
console.log("El minuto es: "+fecha.getMinutes()) //Devuelve la minuto
console.log("El segundo es: "+fecha.getSeconds())//Devuelve los segundos