from tkinter import *
from tkinter import messagebox

root=Tk()
root.title("welcome")
root.geometry("500x200+300+300")
root.resizable(False,False)
root.configure(background='sky blue')
def f1():
	
	import datetime
	
	dt=datetime.datetime.now()
	h=dt.hour
		
	msg=""
	if h>=5 and h<12:
		msg="Good Morning"	
	elif h>=12 and h<16:
		msg="Good Afternoon"
	else:
		msg="Good Evening"
	print(msg)
	messagebox.showinfo("kamal classes",msg)

btnClickMe=Button(root,text="Click Me",command=f1,width=10)
btnClickMe.pack(pady=20)

def f2():
	import webbrowser
	webbrowser.open("www.google.com")

btnVisitUs=Button(root,text="Visit Us",command=f2,width=10)
btnVisitUs.pack(pady=20)
root.mainloop()	