
import datetime

dt=datetime.datetime.now()
h=dt.hour

msg=""
if h>=5 and h<12:
	msg="Good Morning"	
elif h>=12 and h<16:
	msg="Good Afternoon"
else:
	msg="Good Evening"
print(msg)
	