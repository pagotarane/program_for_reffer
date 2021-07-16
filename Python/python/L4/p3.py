#wapp to make a copy of the file

import os.path
src_filename=input("enter the source file name ")
if os.path.exists(src_filename):
	dest_filename=input("enter destination file name ")
	if os.path.exists(dest_filename):
		print("cannot copy ",dest_filename,"already exists")
	else:
		f1=open(src_filename,"rb")
		f2=open(dest_filename,"wb")
		data=f1.read()
		f2.write(data)
		f2.close()
		f1.close()
		print("copy completed")
else:
	print("check",src_filename)