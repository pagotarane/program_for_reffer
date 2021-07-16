#wapp to read marks from the user and find Sum,avg,min,max

import array
marks=array.array('i',[])
n=int(input("enter no. of students "))

for i in range(n):
	m=int(input("enter marks "))
	marks.append(m)
sum=0
for m in marks:
	sum=sum+m
avg=sum/len(marks)

marks=sorted(marks)
min=marks[0]
max=marks[-1]

print("sum = ",sum,"avg= ", avg)
print("min= ",min,"max = ", max)