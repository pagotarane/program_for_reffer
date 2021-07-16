def fact(n):
	f=1
	for i in range(1,n+1):
		f=f*i
	return
n=int(input("enter n "))
r=int(input("enter r "))
if n<1 or r<1:
	print("check numbers ")
else:
	ans=fact(n)/fact(n-r)
	print(ans)