
//Declaro la variable de colección agenda 
var agenda = []

// Aquí declaramos que la variable de colección agenda tiene a su vez otra colección 
agenda[0] = []

//de este modo voy asignado valor a cada uno de los huecos de la table
agenda[0][0] = "Carlos";
agenda[0][1] = "1234";
agenda[0][2] = "info@carlos.com";

agenda[1] = []
agenda[1][0] = "Jorge";
agenda[1][1] = "12345";
agenda[1][2] = "jorge@carlos.com";

agenda[2] = []
agenda[2][0] = "Juan";
agenda[2][1] = "12345";
agenda[2][2] = "juan@carlos.com";
agenda[2][3] = "juan@carlos.com";

console.table(agenda)

//Si hago console.log(agenda) puedo ver la construcción de los 2 arrays