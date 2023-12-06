import tkinter as tk 


#con evento.keysyn puedo saber que tecla he pulsado
def pulsaTecla(evento):
    print("Has pulsado la tecla")
    print(evento.keysym)
    if evento.keysym == 'a':
        print("Izquierda")
    elif evento.keysym == 'd':
        print("Derecha")
    elif evento.keysym == 'w':
        print("Arriba")
    elif evento.keysym == 's':
        print("Abajo")

                    
raiz = tk.Tk()



raiz.bind('<Key>',pulsaTecla)


raiz.mainloop()



                   
