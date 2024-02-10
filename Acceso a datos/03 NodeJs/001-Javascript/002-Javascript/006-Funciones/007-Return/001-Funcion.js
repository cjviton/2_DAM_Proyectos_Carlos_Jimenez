
//Respetando el código de buenas prácticas, una función no deberia poder ejecutar 
//log directamente en la consola, dar salida al código. Para esto, dentro de las funciones existe el valor
//return 


function saluda(nombre,edad,email){
    cadena = "";  //Declaro la variable funcion dentrode la cadena.Será un string
    cadena += "Me llamo "+nombre+".\n"; //Le doy el valor a cadena con la concatenacion de string
    cadena += "Tengo "+edad+" años\n"   //y el valor de las varibles
    cadena += "Mi correo es "+email+"\n" //\n contrabarra n para los saltos de linea
    return cadena;  //Al invocar la función saluda me va a devolver la variable cadena
}

//¿Por qué uso +=?. Si solo usas =, cada vez que asignas un nuevo valor a cadena, estarías sobrescribiendo el valor anterior y perdiendo la información anterior. En cambio, al usar +=, estás concatenando el nuevo valor al valor existente de cadena.



//Le digo que escriba en consola la función saluda
console.log(saluda("Carlos",47,"info@carlos.com"));
console.log(saluda("Juan",46,"juan@carlos.com"));
console.log(saluda("Jorge",47,"jorge@carlos.com"));