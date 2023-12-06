import tkinter as tk
raiz = tk.Tk()


var = tk.StringVar () #variable para que salga sinmarcar ' '
var.set(' ')

radio = tk.Radiobutton(raiz, text="Primera opción",variable=var)

 
radio.pack (pady=50, padx=50)
raiz.mainloop ()




                   
