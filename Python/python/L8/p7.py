from tkinter import *
from tkinter import messagebox

root=Tk()
root.title("E O Finder")
root.geometry("500x200+300+300")

def f1():
	try:
		s1=entNumber.get()
		n1=int(s1)
		msg=""
		if n1%2==0:
			msg='even'
		else:
			msg='odd'
		messagebox.showinfo("Result",msg)
	except ValueError:
		messagebox.showerror('galat kiya',"integers only")
	entNumber.delete(0,END)
	entNumber.focus()

lblNumber =Label(root,text="enter number")
entNumber =Entry(root,bd=5)
btnFind =Button(root,tex="Find",command=f1)

lblNumber.pack(pady=10)
entNumber.pack(pady=10)
btnNumber.pack(pady=10)

root.mainloop()