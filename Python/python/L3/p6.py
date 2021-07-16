#wapf to sort the given string


def mysort(r1):
	r1=sorted(r1)
	r1=''.join(r1)
	return r1
s1=input("enter the string ")
print(s1)
s1=mysort(s1)		
print(s1)