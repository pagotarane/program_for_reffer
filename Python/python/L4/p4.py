import pickle
import os.path
class student:
	def __init__(self,rno,name):
		self.rno=rno
		self.name=name

	def viewstudent(self):
		print("rno ",self.rno,"name",self.name)

stu=[]
filename="stud.ser"
if os.path.exists(filename):
	f=open(filename,"rb")
	stu=pickle.load(f)
	f.close()
while True:
	op=int(input("1 create,2 view,3 exit  "))
	if op==1:
		rno=int(input("enter roll no. "))
		name=input("enter name ")
		s=student(rno,name)
		stu.append(s)
		print("record added ")
	elif op==2:
		for s in stu:
			s.viewstudent()
	elif op==3:
		f=open(filename,"wb")
		pickle.dump(stu,f)
		f.close()
		break
	else:
		print("invalid option")