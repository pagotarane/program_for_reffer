from tkinter import *
from tkinter import messagebox

root=Tk()
root.title("welcome")
root.geometry("500x200+300+300")
root.resizable(False,False)
root.configure(background='sky blue')
def f(num):
	if num==1:
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

	else:
		import webbrowser
		webbrowser.open("www.google.com")


btnClickMe=Button(root,text="Click Me",command=lambda:f(1),width=10)
btnClickMe.pack(pady=20)

btnVisitUs=Button(root,text="Visit Us",command=lambda:f(2),width=10)
btnVisitUs.pack(pady=20)
root.mainloop()	