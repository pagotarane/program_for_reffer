from tkinter import *
from tkinter import messagebox
from tkinter import scrolledtext

root=Tk()
root.title("E.M.S")
root.geometry("500x400+200+200")
def f1():
	addEmp.deiconify()
	root.withdraw()
def f3():
	viewEmp.deiconify()
	root.withdraw()
	import cx_Oracle
	con=None
	cursor=None
	try:
		con=cx_Oracle.connect("system/abc123")
		print("connected")
		cursor=con.cursor()
		sql="select * from employee"
		cursor.execute(sql)
		data=cursor.fetchall()
		mdata=""
		for d in data:
			mdata=mdata + str(d[0]) + "" + d[1] + "\n"
		st.insert(INSERT,mdata)
	except cx_oracle.DatabaseError as e:
		print("issue",e)
	finally:
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()
			print("disconnected")	



btnAdd=Button(root,text="Add",width=20,command=f1)
btnView=Button(root,text="View",width=20,command=f3)
btnAdd.pack(pady=10)
btnView.pack(pady=10)

addEmp=Toplevel(root)
addEmp.title("Add E")
addEmp.geometry("500x400+200+200")
addEmp.withdraw()
lblEid=Label(addEmp,text="Eneter id")
entEid=Entry(addEmp,bd=5)
lblEname=Label(addEmp,text="enter ename")
entEname=Entry(addEmp,bd=5)
def f5():
	import cx_Oracle
	con=None
	cursor=None
	try:
		con=cx_Oracle.connect("system/abc123")
		print("connected")
		cursor=con.cursor()
		sql="insert into employee values('%d','%s')"
		eid=int(entEid.get())
		ename=entEname.get()
		args=(eid,ename)
		cursor.execute(sql % args)
		con.commit()
		msg=str(cursor.rowcount)+"records inserted"
		messagebox.showinfo("success",msg)

	except cx_Oracle.DatabaseError as e:
		con.rollback()
		messagebox.showerror("Failure",e)
	finally:
		if cursor is not None:
			cursor.close()
		if con is not None:
			con.close()
		print("disconnected")

btnAddSave=Button(addEmp,text="save",command=f5)

def f2():
	entEid.delete(0,END)
	entEname.delete(0,END)
	root.deiconify()
	addEmp.withdraw()
btnAddBack=Button(addEmp,text="Back",command=f2)
lblEid.pack(pady=10)
entEid.pack(pady=10)
lblEname.pack(pady=10)
entEname.pack(pady=10)
btnAddSave.pack(pady=10)
btnAddBack.pack(pady=10)

viewEmp=Toplevel(root)
viewEmp.title("View E")
viewEmp.geometry("500x400+200+200")
viewEmp.withdraw()

def f4():
	st.delete(1.0,END)
	root.deiconify()
	addEmp.withdraw()

st=scrolledtext.ScrolledText(viewEmp,width=30,height=5)
btnViewBack=Button(viewEmp,text="Back",command=f4)
st.pack(pady=10)
btnViewBack.pack(pady=10)
root.mainloop()