#wapp for * pattern

num=int(input("enter number of lines to generate "))

if num<0:
	print("be +ve")
else:
	
	for i in range(1,num):
		print(i * '*\t')