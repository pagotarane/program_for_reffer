# wapp for QUEUE implementation
import array
queue=array.array('i',[])

while True:
	op=int(input("1 insert, 2 remove, 3 peek, 4 display, 5 exit "))
	if op==1:
		data=int(input("enter data to insert "))
		queue.append(data)
		print(data, " is inserted on queue")
	elif op==2:
		if len(queue)==0:
			print("queue is empty")
		else:
			ele=queue.pop(0)
			print("remove  element",ele)
	elif op==3:
		if len(queue)==0:
			print("queue is empty")
		else:
			ele=queue[0]
			print("peeked element ",ele)
	elif op==4:
		if len(queue)==0:
			print("queue is empty")
		else:
			print(queue)
	elif op==5:
		break
	else:
		print("invalid option")		
