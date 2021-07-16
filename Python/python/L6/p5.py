class pcm:
	def __init__(self,p,c,m):
		self.p=p
		self.c=c
		self.m=m
	def show(self):
		print("p=",self.p)
		print("c=",self.c)
		print("m=",self.m)
class nonpcm:
	def __init__(self,b,e):
		self.b=b
		self.e=e
	def show(self):
		print("b=",self.b)
		print("e=",self.e)

class total(pcm,nonpcm):
	def __init__(self,p,c,m,b,e):
		pcm.__init__(self,p,c,m)
		nonpcm.__init__(self,b,e)
	def show(self):
		pcm.show(self)
		nonpcm.show(self)
			
			
t=total(99,88,77,66,55)
t.show()



	