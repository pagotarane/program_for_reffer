import socket
import requests
import matplotlib.pyplot as plt
try:	

	socket.create_connection(("www.google.com",80))
	city=['MUMBAI','MANALI','SINGAPORE','BOSTEN']
	temperature=[]
	for c in city:
		a1="http://api.openweathermap.org/data/2.5/weather?units=metric"
		a2="&q=" + c
		a3="&appid=c6e315d09197cec231495138183954bd"
		api_address=a1+a2+a3
		res1=requests.get(api_address)
		j1=res1.json()
		d1=j1['main']
		temp=d1['temp']
		temperature.append(temp)

	plt.bar(city,temperature)
	plt.grid()
	import datetime
	file_name=datetime.datetime.now().date()
	plt.savefig(str(file_name)+".pdf")
	plt.show()
except OSError as e:
	
	print("check n/w",e)