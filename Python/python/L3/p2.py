#wapp to read a String and count of the no. of vowels and consonants

s1=input("Enter the String ")
vc,cc=0,0

for s in s1:
	if  s.isalpha():
		if s in['a','e','i','o','u','A','E','I','O','U']:
			vc +=1
		else:
			cc +=1
print("vowles ",vc,"Consonants  ",cc)