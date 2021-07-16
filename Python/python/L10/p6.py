import pandas as pd
import matplotlib.pyplot as plt

data=pd.read_csv("prices.csv")
#print(data)

month=data['MONTH'].tolist()
print(month)

mumbai=data['MUMBAI'].tolist()
print(mumbai)

delhi=data['DELHI'].tolist()
print(delhi)

chennai=data['CHENNAI'].tolist()
print(chennai)

plt.plot(month,mumbai,label="Mumbai",marker='o')
plt.plot(month,delhi,label="Delhi",marker='o')
plt.plot(month,chennai,label="Chennai",marker='o')
plt.xlabel("Petrol Price")
plt.ylabel("Month")

plt.legend(loc="lower left",shadow="True")
plt.grid()
plt.show()