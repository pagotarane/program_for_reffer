#wapp to reverse the given sentence

s1=input("enter the string ")
d1=s1.split(" ")

r1=""
for d in d1:

	r1=d+" "+ r1
print(s1)
print(r1)