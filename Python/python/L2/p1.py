# wapp to find the sum of first n positive numbers
#i/p:3		1+2+3=6

num=int(input("enter positive number "))
if num<0 :
	print("be +ve ")
else :
	sum=0
	i=1
	while i<=num:
		sum=sum+i
		i=i+1
	print("sum =",sum)