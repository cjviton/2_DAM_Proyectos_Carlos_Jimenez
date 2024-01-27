

var agenda = [];
agenda[0] = "Jose Vicente"
console.table(agenda);
agenda[1] = "Juan";
console.table(agenda);
agenda[2] = "Jorge";
console.table(agenda);
agenda.push("Julia");
console.table(agenda);
agenda.pop();
console.table(agenda);


agenda.splice(0,1); //Con splice puedo borrar los elementos que yo quiera.
//entre parentesis le indico con el primer dígito desde que indice de elemnto empiezo a borrar 
//y con el segundo dígito le indico cuantos elemntos del array quiero borrar

//Los índices de posición no se eliminan, siempre se mantienen en orden. Al borrar son los 
//elemtos de la lista los que se corren en los índices

console.table(agenda);

