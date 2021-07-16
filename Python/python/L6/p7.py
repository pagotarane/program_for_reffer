class book:
	def __init__(self,nop):
		self.nop=nop
	def __add__(self,other):
		ans=self.nop + other.nop
		return ans

b1=book(100)
b2=book(200)

total=b1 + b2
print(total)