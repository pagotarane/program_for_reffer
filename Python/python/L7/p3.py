#wapp to read two integers from CLA and perform ans = a/b

try:
	import sys
	a=int(sys.argv[1])
	b=int(sys.argv[2])
	ans=a/b
	print("ans=",ans)
except ValueError:
	print("integers only")
except IndexError:
	print("we need 2 integers")
except ZeroDivisionError:
	print("2nd number sud not 0")
except Exception:
	print("some other issue")