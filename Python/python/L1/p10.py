#wapp to check if the given year is leap or not

year = int(input("Enter year "))

b1 = (year%100==0) and (year%400==0)
b2 = (year%100!=0) and (year%4==0)
if b1 or b2 :
	print("It is leap year")
else :
	print("It is not leap year")
