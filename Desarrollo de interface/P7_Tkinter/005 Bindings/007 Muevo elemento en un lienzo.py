import tkinter as tk 


#con evento.keysyn puedo saber que tecla he pulsado
def pulsaTecla(evento):
    print("Has pulsado la tecla")
    print(evento.keysym)
    if evento.keysym == 'a':
        print("Izquierda")
        lienzo.move(elemento,-10,0)
    elif evento.keysym == 'd':
        print("Derecha")
        lienzo.move(elemento,10,0)
    elif evento.keysym == 'w':
        print("Arriba")
        lienzo.move(elemento,0,-10)
    elif evento.keysym == 's':
        print("Abajo")
        lienzo.move(elemento,0,10)

                    
raiz = tk.Tk()

#Bind para capturar lo que pulso en key
raiz.bind('<Key>',pulsaTecla)


#Creo un lienzo con un objeto el cual voy a mover
lienzo = tk.Canvas(raiz)
elemento = lienzo.create_oval(20,20,50,50,outline="red",width=2)
lienzo.pack(padx=50,pady=50)

raiz.bind('<Key>',pulsaTecla)


raiz.mainloop()



                   
