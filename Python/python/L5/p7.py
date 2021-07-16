#wapp to count the occurance of each word in the given i/p sentence


count={}
str=input("enter a sentence ")
data=str.split(" ")
for s in data:
	
	val=count.get(s,0)
	if val==0:
		count[s]=1
	else:
		count[s]=val+1
print(count)