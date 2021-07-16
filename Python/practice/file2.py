import os.path
filename=input("Enter filename ")
if os.path.exists(filename):
	f=open(filename,"r")
	data=f.read()
	print(data)
	f.close()
else:
	print(filename,"does mot exists")