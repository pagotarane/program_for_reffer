import os.path
filename=input("Enter the filename ")
if os.path.exists(filename):
	f=open(filename,"a")
	data=input("Enter data in file ")
	f.write(data +'\n')
	f.close()
	print('Data written ')
else:
	print('Fail')