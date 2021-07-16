#wapp to find the sum of the digits
# i/p: 321=6

num=int(input("enter number "))
if num < 0 :
	print("be +ve ")
else :
	sum=0
	while num>0:
		digit=num%10
		sum=sum+digit
		num=num//10
	print("sum =",sum)