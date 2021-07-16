# wapp to perform the following operation

try:
	a=float(input("enter a "))
	op=input("enter op ")
	b=float(input("enter b "))
	if op=='plus':
		res=a+b
		print("result = ",res)
	elif op=='min':
		res=a-b
		print("result =",res)
	elif op=='mul':
		res=a*b
		print("result =",res)
	elif op=='div':
		res=a/b
		print("result =",res)
	else: 
		print("invalid operarion")
except ValueError:
	print("numbers only")
except ZeroDivisionError:
	print("2nd number shud not 0")
else:
	print("success")
finally:
	print("good bye")