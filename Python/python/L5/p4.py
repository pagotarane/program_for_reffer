#wapp to read tuple of int and print in decending order

data_list=[]
data_tuple=()
ans=input("do u want to enter names y/n ")
while ans =='y':
	ele=int(input("enter names "))
	data_list.append(ele)
	ans=input("do u want to enter names y/n ")

data_tuple=tuple(data_list)
print(data_tuple)

data_list.sort(reverse=True)

data_tuple=tuple(data_list)
print(data_tuple)