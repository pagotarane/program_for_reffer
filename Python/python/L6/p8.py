class employee:
	def __init__(self,eid,ename,epds):
		self.eid=eid
		self.ename=ename
		self.epds=epds

	def __mul__(self,other):
		ans=self.epds + other.nodp
		return ans

class attendance:
	def __init__(self,nodp):
		self.nodp=nodp
e1=employee(10,"ketan",200)
a1=attendance(20)

sal=e1 * a1
print(sal)