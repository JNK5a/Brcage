from tkinter import *


class Table:

	def __init__(self,root):

		# code for creating table
		for j in range(total_rows):
			for c in range(total_columns):

				self.e = Entry(root, width=24, fg='black',
							font=('Arial',21,'bold'))

				self.e.grid(row=j, column=c)
				self.e.insert(END, lst[j][c])

lst = [("Variables","GE1","GE2"), ("GE3","rs = -0.2464, (p = 0.004402)", "rs = -0.2744,  (p=0.001452)"), ("GE5",  "rs = -0.1773, (p = 0.04201)", "n.s"), ("GE1", "rs = 1, (p < 0.0001)",  "rs = 0.869, (p < 0.0001)"), ("GE2",  "rs = 0.869, (p < 0.0001)",  "rs = 1, (p < 0.0001)"), ("OS ", "ns.",  "rs = 0.191, (p=0.02827)"), ("Stato",  "rs = -0.1715, (p = 0.04928 )",  "rs = -0.1931, (p = 0.02655)"), ("DFS",  "rs = 0.1814, (p = 0.03741)", "rs = 0.2528, (p=0.003448)"), ("Relapse", "rs = -0.1724, (p=0.04808)", "rs = -0.2022, (p = 0.02005)")]

total_rows = len(lst)
total_columns = len(lst[0])

root = Tk()
t = Table(root)
root.mainloop()
