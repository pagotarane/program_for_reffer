import socket
import requests
try:
	socket.create_connection(("www.google.com",80))
	print("connected")
	movie_name=input("enter movie name ")
	a1="http://www.omdbapi.com/?"
	a2="&apikey=b88add31"
	a3="&s=" + movie_name
	address=a1+a2+a3
	res=requests.get(address)
	data=res.json()
	search=data['Search']
	for s in search:
		name=s['Title']
		year=s['Year']
		poster=s['Poster']
		print("Name ",name,"Year ",year)
		print("Poster ",poster)
		print("*" * 30)
		if poster !="N/A":
			res=requests.get(poster)
			f=open(name+".jpg","wb")
			f.write(res.content)
			f.close()

except OSError as e:
	print("issue",e)