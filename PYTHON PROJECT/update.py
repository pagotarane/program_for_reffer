from tkinter import *

root = Tk()
root.title('Update Data')
root.geometry('400x200+500+200')



lblNumber=Label(root,text='Enter Roll Number')
lblNumber.place(x=10,y=10)
entNumber=Entry(root,bd=5)
entNumber.place(x=150,y=10)

lblName=Label(root,text='Enter Name')
lblName.place(x=10,y=100)
entName=Entry(root,bd=5)
entName.place(x=150,y=100)

lblMarks=Label(root,text='Enter Marks')
lblMarks.place(x=10,y=200)
entMarks=Entry(root,bd=5)
entMarks.place(x=150,y=200)

btnSave=Button(root,text='SAVE')
btnSave.place(x=200,y=250)

btnBack=Buton(root,text='BACK')
btnBack.place(x=200,y=300)




mainloop()