from tkinter import *

dltStud=Tk()
dltStud.geometry("500x400+400+200")
dltStud.title('Delete Data')


lblNumber=Label(dltStud,text='Enter Roll Number')
lblNumber.place(x=200,y=10)

entNumber=Entry(dltStud,bd=5)
entNumber.place(x=200,y=50)

btnSave=Button(dltStud,text='SAVE')
btnSave.place(x=250,y=100)

btnBack=Button(dltStud,text='BACK')
btnBack.place(x=250,y=150)

mainloop()