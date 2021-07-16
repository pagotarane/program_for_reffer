#wapp to find maximum of three int number

n1 = int(input("enter the first number "))
n2 = int(input("enter the second number "))
n3 = int(input("enter the third number "))

if n1>n2 :
	max = n1
else :
	max = n2
if n3>max:
	max = n3
print("max = ",max) 

