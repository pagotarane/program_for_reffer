num_rows = int(input("Enter the number of rows"));
for i in range(1,num_rows+1):
	print()
	for j in range(i,num_rows-i+2):
		print("","*",end="")
	print()