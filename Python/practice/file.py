import os.path
filename=input("Enter filename to write the data ")
if os.path.exists(filename):
	f=open(filename,'a')
	data=input("enter data to write ")
	f.write(data +'\n')
	f.close()
	print("data written")
else:
	print("check filename")