#wapppattern

num=int(input("enter number of lines to generate "))

if num<0:
	print("be +ve")
else:
	ch=65
	for i in range(1,num+1):
		print(i * (chr(ch) + '\t'))
		ch=ch+1