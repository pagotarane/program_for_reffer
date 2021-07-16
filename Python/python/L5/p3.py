#wapp to read the list of numbers and reverse duplicates names

names=[]
ans=input("do u want to enter names y/n ")
while ans =='y':
	ele=input("enter names ")
	names.append(ele)
	ans=input("do u want to enter names y/n ")

new_names=[]

for n in names:
	if n not in new_names:
		new_names.append(n)

print(names)
print(new_names)