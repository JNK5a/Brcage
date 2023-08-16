from tabulate import tabulate
data = [["GE1", "rs = -0.2464, (p = 0.004402)", "rs = -0.1773, (p = 0.04201)", "rs = 1, (p < 0.001)", "rs = 0.869, (p < 0.0001)", "ns. ", "rs = -0.1715, (p = 0.04928 )", "rs = 0.1814, (p = 0.03741)",  "rs = -0.1724, (p=0.04808)"],
        ["GE2", "rs = -0.2744, (p=0.001452)", "n.s", "rs = 0.869, (p < 0.0001)", "rs = 1, (p < 0.001)", "rs = 0.191, (p=0.02827) ", "rs = -0.1931, (p = 0.02655)", "rs = 0.2528, (p=0.003448)", "rs = -0.2022, (p = 0.02005)"]]
col_names = ["GE3", "GE5", "GE1", "GE2",  "OS ", "Stato", "DFS",  "Relapse"]
print(tabulate(data, headers=col_names, tablefmt="fancy_grid", showindex="True"))
