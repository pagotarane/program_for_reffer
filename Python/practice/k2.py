import getpass
username=input("Enter UserName ")
passward=getpass.getpass("Enter Pass ")

if((username=="ketan") and (passward=="abc123")):
	print("Success")
else:
	print("Fail")