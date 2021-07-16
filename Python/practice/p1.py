num=int(input("Enter number "))

if num<0:
	print("be +ve ")
else :
	sum=0
	i=1
	while i<=num:
		sum=sum+i
		i=i+1
	print("sum = ",sum)