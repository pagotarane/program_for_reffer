import math
class circle:
	def __init__(self,ra):
		self.radius=ra
	def display(self):
		print("radius =",self.radius)
	def area(self):
		ans=math.pi * math.pow(self.radius,2)
		print("area=",ans)
	def circum(self):
		ans=2*math.pi*self.radius
		print("circum=",ans)

rad=float(input("enter radius "))
c1=circle(rad)
c1.display()
c1.area()
c1.circum()