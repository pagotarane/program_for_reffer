#wapp to check if given String are anagram
def mysort(r1):
	r1=sorted(r1)
	r1=''.join(r1)
	return r1
s1=input("enter the first string ")
s2=input("enter the second string ")
s1=mysort(s1)
s2=mysort(s2)

print(s1)
print(s2)

if s1==s2:
	print("yes")
else:
	print("no")
