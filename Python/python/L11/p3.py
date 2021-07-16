import pandas as pd
import matplotlib.pyplot as plt 
import numpy as np

data=pd.read_csv("JOBS.csv")

language=data["LANGUAGE"].tolist()
jobs_2017=data["JOBS_2017"].tolist()
jobs_2018=data["JOBS_2018"].tolist()

x=np.arange(len(language))
plt.bar(x,jobs_2017,width=0.3,label="jobs_2017")
plt.bar(x+0.30,jobs_2018,width=0.3,label="jobs_2018")

plt.xticks(x,language)

plt.xlabel("Languages")
plt.ylabel("Jobs")

plt.legend()
plt.grid()
plt.show()