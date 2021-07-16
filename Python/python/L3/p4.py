#wapp to read Username and Password is "abc" and pass is "123" 

import getpass
username=input("Enter the username ")
password=getpass.getpass("Enter the password ")

if(username=="abc") and (password=="123"):
	print("Success")
else:
	print("Failure")