#wapp to read an array from user and print on the screen

import array
data=array.array('i',[])

n=int(input("enter number of elements "))
for i in range(n):
	ele=int(input("enter element "))
	data.append(ele)
print(data)

for d in data:
	print(d,end=' ')
print()

for i in range(len(data)):
	print(data[i],end=' ')
print()