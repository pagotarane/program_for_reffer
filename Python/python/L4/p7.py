import threading
import time
balance=500
def deposit():
	print("depositing started ")
	global balance
	amt1=balance
	amt1=amt1+100
	time.sleep(1)
	balance=amt1
	print("depositing ended")
def withdraw():
	print("withdrawing started ")
	global balance
	amt1=balance
	amt1=amt1-100
	time.sleep(2)
	balance=amt1
	print("withdrawing ended")
print("initial balance",balance)
t1=threading.Thread(target=deposit)
t2=threading.Thread(target=withdraw)
t1.start()
t2.start()
t1.join()
t2.join()
print("final balance ",balance)