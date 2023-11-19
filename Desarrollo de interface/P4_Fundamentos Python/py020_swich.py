#En python no existe la función swich, if/elif es la forma de hacerlo  


dia = "lunes"

if dia == 'lunes':
    print("hoy es el peor dia de la semana")
elif dia == 'martes':
    print("hoy es el segundo peor dia de la semana")
elif dia == 'miercoles':
    print("ya estamos en el medio")
elif dia == 'jueves':
    print("ya casi es fin de semana")
elif dia == 'viernes':
    print("el mejor dia de la semana")
elif dia == 'sabado':
    print("hoy es fin de semana")
elif dia == 'domingo':
    print("y mñaana es lunes")
else:                               #En cualquier otro caso, else (case defauld)
    print("yo no se lo que has puesto, pero no es un dia de la semana")


#Al contrario que el swich no hay un break despues de cada case, elif en python
#Ejecutaría todo el programa, podría dar varios casos verdaderos


