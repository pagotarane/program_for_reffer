#wapp to read int if marks and find sum avg min max

marks=[]
ans=input("do u want to enter marks y/n ")
while ans =='y':
	ele=int(input("enter marks "))
	marks.append(ele)
	ans=input("do u want to enter marks y/n ")
sum=0
for m in marks:
	sum=sum+m
avg=sum/len(marks)

marks.sort()
min=marks[0]
max=marks[-1]
print("sum= ",sum)
print("avg= ",avg)
print("min= ",min)
print("max= ",max)