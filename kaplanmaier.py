import kaplanmeier as km
import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_csv('C:\\Users\\cicen\\OneDrive\\Desktop\\Stuff\\brcage\\GE2os.csv')
time_event = df['time']
censoring = df['Died']
y = df['group']
print(df)
results = km.fit(time_event, censoring, y)
km.plot(results)
plt.show()
