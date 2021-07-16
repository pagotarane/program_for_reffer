class employee:
	def __init__(self,id,name,sal):
		self.id=id
		self.name=name
		self.sal=sal
	def show(self):
		print("id=",self.id,"name=",self.name,"sal=",self.sal)
	def bonus(self):
		print("amt",self.sal * 0.10)

class teammember(employee):
	pass
class teamleader(employee):
	def bonus(self):
		print("amt",self.sal * 0.20)

t1=teammember(10,'kamal',3000)
t1.show()
t1.bonus()

t2=teammember(20,'ketan',5000)
t2.show()
t2.bonus()

