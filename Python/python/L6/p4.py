class person:
	def __init__(self,id,name,addr):
		self.id=id
		self.name=name
		self.addr=addr
	def show(self):
		print("id=",self.id)
		print("name=",self.name)
		print("addr=",self.addr)
class teacher(person):
	def __init__(self,id,name,addr,salary):
		super().__init__(id,name,addr)
		self.salary=salary
	def show(self):
		super().show()
		print("salary=",self.salary)
class hod(teacher):
	def __init__(self,id,name,addr,salary,dep):
		super().__init__(id,name,addr,salary)
		self.dep=dep
	def show(self):
		super().show()
		print("department=",self.dep)

h1=hod(10,"kamal","thane",5000,"IT")
h1.show()