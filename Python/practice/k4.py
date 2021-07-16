def mysort(r1):
	r1=sorted(r1)
	r1=''.join(r1)
	return r1
s1=input("enter 1st string ")
print(s1)
s1=mysort(s1)


s2=input("enter 2nd string ")
print(s2)
s2=mysort(s2)


if(s1==s2):
	print("Same")
else:
	print("not same")