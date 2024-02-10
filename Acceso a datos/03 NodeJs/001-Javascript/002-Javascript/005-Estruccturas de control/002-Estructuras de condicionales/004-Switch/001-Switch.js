
//La estructura switch va a comparar la varible con cada uno de los case en el caso
//De igualda ejecuta el log y para la ejecución con un break. Si no encuentra igualdad
//con ninguno de los case entonces ejecutará el default.


var diadelasemana = "lunes"
switch(diadelasemana){
case "lunes":
    console.log("Hoy es el peor día de la semana");
    break;
case "martes":
    console.log("Hoy es el segundo peor día de la semana");
    break;
case "miercoles":
    console.log("Ya estamos a mitad de semana");
    break;
case "jueves":
    console.log("Mañana ya es viernes");
    break;
case "viernes":
    console.log("Por fin es viernes");
    break;
case "sabado":
    console.log("El mejor día de la semana");
    break;
case "domingo":
    console.log("Parece mentura que mañana ya sea lunes");
    break;
default:
    console.log("No sé qué has escrito, pero no es un día");
}