import random

while True:
	r1=random.randrange(10)
	r2=random.randrange(10)
	r3=random.randrange(10)
	r4=random.randrange(10)
	r5=random.randrange(10)
	r6=random.randrange(10)
	r7=random.randrange(10)
	r8=random.randrange(10)
	
	b1=(r1+r2+r3+r4)==21
	b2=(r5+r6+r7+r8)==21
	b3=(r2==r6)
	
	if b1 and b2 and b3:
		print("seq 1-->",r1,r2,r3,r4)
		print("seq 2-->",r5,r6,r7,r8)
		print("*" * 30)