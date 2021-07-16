import bs4
import requests

res=requests.get("http://brainyquote.com/quotes_of_the_day.html")
print(res)

soup=bs4.BeautifulSoup(res.text,'lxml')
#print(soup)

quote=soup.find('img',{"class":"p-qotd"})
print(quote)

text=quote['alt']
print(text)

file_name="http://brainyquote.com" + quote["data-img-url"]
print(file_name)

import datetime
f=open(str(datetime.datetime.now().date()) + ".jpg","wb")
res=requests.get(file_name)
f.write(res.content)
f.close()

