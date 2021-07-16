from tkinter import *
from tkinter import messagebox
from tkinter import scrolledtext
import cx_Oracle
from matplotlib import pyplot as plt
from PIL import ImageTk, Image
import bs4
import os
import socket
import requests

root=Tk()
root.title("Student Management System")
root.geometry("500x400+400+200")
root.resizable(True,True)

def f1():
	addStud.deiconify()
	root.withdraw()
def f2():
	viewStud.deiconify()
	root.withdraw()
def f3():
	updStud.deiconify()
	root.withdraw()
def f4():
	dltStud.deiconify()
	root.withdraw()
def f5():
	grphStud.deiconify()
	root.withdraw()


btnAdd=Button(root,text="ADD",command=f1)
btnView=Button(root,text="VIEW",command=f2)
btnUpdate=Button(root,text="UPDATE",command=f3)
btnDelete=Button(root,text="DELETE",command=f4)
btnGraph=Button(root,text="GRAPH",command=f5)

btnAdd.pack(side=LEFT,padx=20)
btnView.pack(side=LEFT,padx=20)
btnUpdate.pack(side=LEFT,padx=20)
btnDelete.pack(side=LEFT,padx=20)
btnGraph.pack(side=LEFT,padx=20)
#-------------------ADD-------------------------------------------------------------------

addStud=Tk()
addStud.title("Add Data")
addStud.geometry("500x400+400+200")
addStud.resizable(True,True)

def f6():
	root.deiconify()
	addStud.withdraw()
def f7():
	import cx_Oracle
	con=None
	cursor=None
	try:
		con=cx_Oracle.connect("system/abc123")
		cursor=con.cursor()
		sql="insert into student values('%d','%s','%d')"
		sroll=int(entNumber.get())
		sname=entName.get()
		smarks=int(entMarks.get())

		args=(sroll,sname,smarks)
		cursor.execute(sql % args)
		con.commit()
		print(cursor.rowcount,"records inserted")

	except cx_Oracle.DatabaseError as e:
		con.rollback()
		print("issue",e)
	finally:
	
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()



lblRoll=Label(addStud,text="Enter Roll Number")
lblRoll.place(x=10,y=10)
entRoll=Entry(addStud,bd=8)
entRoll.place(x=150,y=10)

lblName=Label(addStud,text="Enter Name")
lblName.place(x=10,y=100)
entName=Entry(addStud,bd=8)
entName.place(x=150,y=100)

lblMarks=Label(addStud,text="Enter Marks")
lblMarks.place(x=10,y=200)
entMarks=Entry(addStud,bd=8)
entMarks.place(x=150,y=200)

btnSave=Button(addStud,text="SAVE",command=f7)
btnSave.place(x=100,y=300)

btnBack=Button(addStud,text="BACK",command=f6)
btnBack.place(x=100,y=350)


#-------------------------VIEW------------------------------------------------------------------------------------------------------


viewStud=Toplevel(root)
viewStud.title("View Data")
viewStud.geometry("500x400+400+200")
viewStud.withdraw()

def f8():
	st.delete(1.0,END)
	root.deiconify()
	addStud.withdraw()

st=scrolledtext.ScrolledText(viewStud,width=30,height=5)
btnViewBack=Button(viewStud,text="Back",command=f8)
st.pack(pady=10)
btnViewBack.pack(pady=10)

#-----------------------UPDATE-------------------------------------------------------------------------------------------------

updStud= Toplevel(root)
updStud.title('Update Data')
updStud.geometry("500x400+400+200")
def f9():
	root.deiconify()
	addStud.withdraw()


lblNumber=Label(updStud,text='Enter Roll Number')
lblNumber.place(x=10,y=10)
entNumber=Entry(updStud,bd=5)
entNumber.place(x=150,y=10)

lblName=Label(updStud,text='Enter Name')
lblName.place(x=10,y=100)
entName=Entry(updStud,bd=5)
entName.place(x=150,y=100)

lblMarks=Label(updStud,text='Enter Marks')
lblMarks.place(x=10,y=200)
entMarks=Entry(updStud,bd=5)
entMarks.place(x=150,y=200)

btnSave=Button(updStud,text='SAVE')
btnSave.place(x=200,y=250)

btnBack=Button(updStud,text='BACK',command=f9)
btnBack.place(x=200,y=300)

#-------------------------------DELETE--------------------------------------------------------------------------------------------

dltStud=Tk()
dltStud.geometry("500x400+400+200")
dltStud.title('Delete Data')

def f10():
	dltStud.deiconify()
	addStud.withdraw()



lblNumber=Label(dltStud,text='Enter Roll Number')
lblNumber.place(x=200,y=10)

entNumber=Entry(dltStud,bd=5)
entNumber.place(x=200,y=50)

btnSave=Button(dltStud,text='SAVE')
btnSave.place(x=250,y=100)

btnBack=Button(dltStud,text='BACK',command=f10)
btnBack.place(x=250,y=150)


root.mainloop()