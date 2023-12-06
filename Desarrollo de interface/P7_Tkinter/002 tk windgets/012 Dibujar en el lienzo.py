import tkinter as tk 
                     
raiz = tk.Tk()

lienzo = tk.Canvas(raiz)
lienzo.create_oval(20,20,50,50,outline="red",width=2)
lienzo.pack(padx=50,pady=50)
raiz.mainloop()



                   
