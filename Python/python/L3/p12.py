#wapf to which we can pass 1 arg and 2 arg

def area(a=None,b=None):
	if a is not None and b is None:
		ans=3.14159 * a **2
		return ans
	elif a is not None and b is not None:
		ans = a*b
		return ans
a1=area(3.7)
print("%.2f" %a1)

a2=area(10,2.7)
print(a2)