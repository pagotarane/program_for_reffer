# wapp for creating two threads using oop
# thread t1 to show square of numbers from 1 to 5
# thread t2 to show cube of numbers from 1 to 8

import threading
class square(threading.Thread):
	def run(self):
		print("square thread started ")
		for i in range(1,6):
			print("square of ",i,"=",i*i)
		print("square thread ended")

class cube(threading.Thread):
	def run(self):
		print("cube thread started ")
		for i in range(1,9):
			print("cube of ",i,"=",i*i*i)
		print("square thread ended")
print("main thread started")
t1=square()
t1.start()
t2=cube()
t2.start()
t1.join()
t2.join()
print("main thread ended")