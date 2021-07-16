#wapp to write into file...filename wud be provided by user and data to write also wud be provided by the user

import os.path
filename=input("enter filename to write data into ")
if os.path.exists(filename):
	f=open(filename,"a")
	data=input("enter data to write ")
	f.write(data +'\n')
	f.close()
	print("data written ")
else:
	print("check filename")