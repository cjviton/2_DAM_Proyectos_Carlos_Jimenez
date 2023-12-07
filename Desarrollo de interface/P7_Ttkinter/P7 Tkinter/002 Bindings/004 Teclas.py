import tkinter as tk 



def pulsaTecla(evento):
    print("Has pulsado la tecla")

                    
raiz = tk.Tk()



raiz.bind('<Key>',pulsaTecla)


raiz.mainloop()



                   
