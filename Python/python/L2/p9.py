#wapp to read data in array num create two arrays even_num and odd_num containing even nos and odd nos

import array
num=array.array('i',[])
even_num=array.array('i',[])
odd_num=array.array('i',[])

n=int(input("Eneter number of elements "))
for i in range(n):
	ele=int(input("enter elements "))
	num.append(ele)

for n in num:
	if n%2==0:
		even_num.append(n)
	else:
		odd_num.append(n)

print(num)
print(even_num)
print(odd_num)