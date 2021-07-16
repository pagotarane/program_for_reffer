#wapp to read the list of int from the user and display on screen

data=[]
ans=input("do u want to enter data y/n ")
while ans =='y':
	ele=int(input("enter element "))
	data.append(ele)
	ans=input("do u want to enter data y/n ")
print (data)
	
for d in data:
	print(d, end=' ')
print()
for i in range(len(data)):
	print(data[i],end=' ')
print()