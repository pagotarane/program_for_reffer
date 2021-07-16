
from tkinter import *
import cx_Oracle

addStud=Tk()
addStud.title("Add Data")
addStud.geometry("500x200+500+300")
addStud.resizable(True,True)


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

addStud.mainloop()