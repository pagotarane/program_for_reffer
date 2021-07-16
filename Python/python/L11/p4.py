import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

data=pd.read_csv("MEDAL.csv")

country=data['COUNTRY'].tolist()
medal=data['GOLD_MEDAL'].tolist()

plt.axis("equal")
plt.pie(medal,labels=country,radius=1.0,explode=[0.2,0,0,0],shadow=True,colors=['r','#0000ff','g','teal','k'],autopct='%.2f%%')

plt.show()