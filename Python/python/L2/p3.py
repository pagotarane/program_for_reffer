 #wapp to find factorial of number

num=int(input("Enter the number "))
if num<0:
	print("be +ve")
elif num==0 or num==1:
	print("ans =",1)
else:
	fact=1
	for i in range(1,num+1):
		fact=fact * i 	
	print("ans =",fact)
	
