import abc
class mu(abc.ABC):
	def fiyc(self):
		print("mu will do it ")
	@abc.abstractmethod
	def syc(self):
		pass
	@abc.abstractmethod
	def tyc(self):
		pass
	def foyc(self):
		print("mu will do it ")
class c1(mu):
	def syc(self):
		print("c1 will do")
	def tyc(self):
		print("c1 will do")

col = c1()
col.fiyc()
col.syc()
col.tyc()
col.foyc()