class person:
	def __init__(self,id,name,addr):
		self.id=id
		self.name=name
		self.addr=addr
	def show(self):
		print("id=",self.id)
		print("name=",self.name)
		print("addr=",self.addr)
class student(person):
	def __init__(self,id,name,addr,marks):
		super().__init__(id,name,addr)
		self.marks=marks
	def show(self):
		super().show()
		print("marks=",self.marks)
s1=student(10,"abc","xyz",50 ,end=' ')
s1.show()