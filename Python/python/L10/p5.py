from matplotlib import pyplot as plt

months=['june','jully','aug','sep','aug','nov','dec']

mumbai=[82.5,83.06,83.61,85.6,98.95,85.24,84.25]

plt.plot(months,mumbai,
label="Mumbai",marker="o",markersize=10)
plt.xlabel("Months")
plt.ylabel("Mumbai")
plt.title("Petrol Prices")
plt.legend()
plt.grid()
plt.show()
