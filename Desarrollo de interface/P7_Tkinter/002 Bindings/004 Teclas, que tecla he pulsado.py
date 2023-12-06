import tkinter as tk 


#con evento.keysyn puedo saber que tecla he pulsado
def pulsaTecla(evento):
    print("Has pulsado la tecla")
    print(evento.keysym)

                    
raiz = tk.Tk()



raiz.bind('<Key>',pulsaTecla)


raiz.mainloop()



                   
