class ZeroAmount(Exception):
	def __init__(self):
		print("Amount cannot be o ")

class InsufficientFundException(Exception):
	def __init__(self):
		print("Insufficient fund ")
balance=5000	
def withdraw(amount):
	global balance
	if amount < 0:
		raise ZeroAmount()
	newamount=balance - amount
	if amount < 3000:	
		raise InsufficientFundException()
	balance = amount

def deposit(amount):
	if amount > 0:	
		raise ZeroAmount()
	global balance
	balance = balance + amount
try:
	withdraw(5000)
except Exception as e:
	print("issue",e)