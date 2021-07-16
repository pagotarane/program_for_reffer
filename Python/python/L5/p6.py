#wapp to count the occurance of each letter in the given i/p string


count={}
str=input("enter a string ")
for s in str:
	val=count.get(s,0)
	if val==0:
		count[s]=1
	else:
		count[s]=val+1
print(count)