#wapp to find String is palindrome that use [ : : -1]

s1=input("Enter the String ")
s1=s1.lower()
r1=s1[::-1]

if s1==r1:
	print("yes")
else:
	print("no")