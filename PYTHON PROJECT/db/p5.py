import socket
import requests

try:
	socket.create_connection(("www.google.com",80))
	print("u r connected")
	res=requests.get("https://ipinfo.io")
	print(res)
	j1=res.json()
	print(j1)
	city=j1['city']
	print(city)
	loc=j1['loc']
	loc=loc.split(",")
	lat=loc[0]
	lon=loc[1]
	print("Latitude= ",lat)
	print("Longitude= ",lon)	

except OSError as e:
	print("issue",e)