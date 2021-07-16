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
root.geometry("500x200+500+300")
root.resizable(True,True)

def f1():
	addStud.deiconify()
	root.withdraw()
	
def f3():
	viewStud.deiconify()
	root.withdraw()
	con=None
	cursor=None
	try:
		con=cx_Oracle.connect("system/abc123")
		print("connected")
		cursor=con.cursor()
		sql="select * from student"
		cursor.execute(sql)
		data=cursor.fetchall()
		mdata=""
		for d in data:
			mdata=mdata + "RNO" + str(d[0]) + "NAME" + str(d[1]) + "MARKS" + str(d[2]) + "\n"
		st.insert(INSERT,mdata)
	except cx_oracle.DatabaseError as e:
		print("issue",e)
	finally:
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()
			
def f4():
	updStud.deiconify()
	root.withdraw()





addStud= Toplevel(root)
addStud.title("Add Data")
addStud.geometry("500x200+500+300")
addStud.resizable(True,True)

def f2():
	root.diconify()
	addStud.withdraw()

lblNumber=Label(addStud,text="Enter Roll Number")
lblNumber.place(x=10,y=10)
entNumber=Entry(addStud,bd=8)
entNumber.place(x=150,y=10)

lblName=Label(addStud,text="Enter Name")
lblName.place(x=10,y=100)
entName=Entry(addStud,bd=8)
entName.place(x=150,y=100)

lblMarks=Label(addStud,text="Enter Marks")
lblMarks.place(x=10,y=200)
entMarks=Entry(addStud,bd=8)
entMarks.place(x=150,y=200)

btnSave=Button(addStud,text="SAVE")
btnSave.place(x=100,y=300)

btnBack=Button(addStud,text="BACK")
btnBack.place(x=100,y=350)

btnAdd=Button(root,text="ADD",command=f1)
btnView=Button(root,text="VIEW",command=f3)
btnUpdate=Button(root,text="UPDATE",command=f4)
btnDelete=Button(root,text="DELETE")
btnGraph=Button(root,text="GRAPH")

btnAdd.pack(side=LEFT,padx=20)
btnView.pack(side=LEFT,padx=20)
btnUpdate.pack(side=LEFT,padx=20)
btnDelete.pack(side=LEFT,padx=20)
btnGraph.pack(side=LEFT,padx=20)



def f5():

	import cx_Oracle
	con=None
	cursor=None
	try:
		con=cx_Oracle.connect("system/abc123")
		print("connected")
		cursor=con.cursor()

		sql="insert into student values('%d','%s','%d')"
		sroll=int(input("enter roll number "))
		sname=input("enter name ")
		smarks=int(input("enter marks "))
	
		args=(sroll,sname,smarks)
		cursor.execute(sql % args)
		con.commit()
		print(cursor.rowcount,"records inserted")

	except cx_oracle.DatabaseError as e:
		con.rollback()
		print("issue",e)
	finally:
	
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()



root.mainloop()