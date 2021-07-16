
class rectangle:
	def __init__(self,le,wi):
		self.length=le
		self.width=wi
	def show(self):
		print("length",self.length,"width".self.width)
	def  area(self):
		ans=self.length*self.width
		print("area=",ans)
	def peri(self):
		ans=2*(self.length+self.width)
		print("perimeter=",ans)

length=float(input("enter length "))
width=float(input("enter width "))
r1=reactangle(length, width)
r1.show()
r1.area()
r1.peri()