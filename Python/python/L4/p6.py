# wapp for creating two threads using pop
# thread t1 to show square of numbers from 1 to 5
# thread t2 to show cube of numbers from 1 to 8

import threading
def square():
	print("square thread started ")
	for i in range(1,6):
		print("square of ",i,"=",i*i)
	print("square thread ended")

def cube():
	print("cube thread started ")
	for i in range(1,6):
		print("cube of ",i,"=",i*i*i)
	print("cube thread ended")
print("main thread started")
t1=threading.Thread(target=square)
t1.start()
t2=threading.Thread(target=cube)
t2.start()
t1.join()
t2.join()
print("main thread ended")