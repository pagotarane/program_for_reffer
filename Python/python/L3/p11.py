#wapf to check if the given number is palindrome

def myreverse(num):
	r=0
	while num>0:
		digit=num%10
		r=r*10+digit
		num=num//10
	return r

num=int(input("enter a number "))
rev=myreverse(num)
print(rev)
if num==rev:
	print("yes")
else:
	print("no")