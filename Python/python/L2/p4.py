#wapp to read lower range==>r1 and upper range==>r2
#if no. is multiple of 3 o/p:Modi
#		       5 o/p:Amit

r1=int(input("Enter lower range "))
r2=int(input("Enter upper range"))

if r1>r2:
	r1,r2=r2,r1

for i in range(r1,r2+1):
	if((i%3==0) and (i%5==0)):
		print(i,"-","Kamal")
	elif(i%3==0):
		print(i,"-","Modi")
	elif(i%5==0):
		print(i,"-","Amit")
		