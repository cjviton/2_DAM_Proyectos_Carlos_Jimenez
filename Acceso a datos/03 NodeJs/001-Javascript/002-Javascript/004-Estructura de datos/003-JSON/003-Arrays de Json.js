

var agenda = [ //Declaro que agenda en un array de json metiéndolo en corchetes
               //Es importante respetar las sangrias. 
    {
        "nombre":"Jose Vicente",
        "telefono":12345,
        "email":[  //A su vez puedo declarar arrays dentro del json. 
            "info@josevicentecarratala.com",
            "info@jocarsa.com",
            "jocarsa2@gmail.com"
        ]
    },//todo ello separado siempre por comas.
    {
        "nombre":"Jose Vicente",
        "telefono":12345,
        "email":[
            "info@josevicentecarratala.com",
            "info@jocarsa.com",
            "jocarsa2@gmail.com"
        ]
    }
]
console.log(agenda)