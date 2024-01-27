

var agenda = [];   //Voy a usar table para verlo más claro enla consula
agenda[0] = "Carlos"

console.table(agenda);
agenda[1] = "Juan";

console.table(agenda);
agenda[2] = "Jorge";  //voy asigando manualmente los indices a los nuevos nombres de la agenda

console.table(agenda);

agenda.push("Julia");  //Con push no hace falta decirle el indice, si no me acuerdo por cual voy
                       //automáticamente lo meterá en el último lugar.

console.table(agenda);