import matplotlib.pyplot as plt 

subject=["mech","bee","maths"]
marks=[78,98,58]

plt.xlabel("subject")
plt.ylabel("marks")
plt.title("Performance")

plt.bar(subject,marks)
plt.show()