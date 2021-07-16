#wapp to reverse the given sentence

def mysort(r1):
	r1=sorted(r1)
	r1=''.join(r1)
	return r1

s1=input("enter the string ")
d1=s1.split(" ")

r1=""
for d in d1:
	d=mysort(d)
	r1=d+" "+r1
print(s1)
print(r1)