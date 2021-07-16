import matplotlib.pyplot as plt 
import numpy as np

product=["Laptop","Printer","Router"]
reena=[10,25,15]
veena=[5,30,25]

x=np.arange(len(product))

plt.bar(x,reena,width=0.3,label="Reena")
plt.bar(x+0.30,veena,width=0.3,label="Veena")
plt.xticks(x,product)

plt.xlabel("Products")
plt.ylabel("Sales")
plt.title("Performance")

plt.grid()
plt.legend()
plt.show()