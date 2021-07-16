#wapp to read into file...filename wud be provided by user and data to write also wud be provided by the user

import os.path
filename=input("enter filename to read ")
if os.path.exists(filename):
	f=open(filename,"r")
	data = f.read()
	print(data)
	f.close()
else:
	print(filename,"does not exists")