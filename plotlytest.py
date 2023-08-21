import plotly.graph_objects as go

fig = go.Figure(data=[go.Table(header=dict(values=['Variables', 'GE1', 'GE2'],
                line_color='black',
                fill_color='lightblue',
                align='center'),
                 cells=dict(values=[["GE3", "GE5", "GE1", "GE2", "OS ", "Stato", "DFS", "Relapse"], ["rs = -0.2464, (p = 0.004402)", "rs = -0.1773, (p = 0.04201)", "rs = 1, (p < 0.001)", "rs = 0.869, (p < 0.0001)", "ns. ", "rs = -0.1715, (p = 0.04928 )", "rs = 0.1814, (p = 0.03741)",  "rs = -0.1724, (p=0.04808)"], ["rs = -0.2744, (p=0.001452)", "n.s", "rs = 0.869, (p < 0.0001)", "rs = 1, (p < 0.001)", "rs = 0.191, (p=0.02827) ", "rs = -0.1931, (p = 0.02655)", "rs = 0.2528, (p=0.003448)", "rs = -0.2022, (p = 0.02005)"]],
               line_color='black',
               fill_color='lightcyan',
               align='left'))
                     ])
fig.update_layout(width=1000, height=600)

import os

if not os.path.exists("images"):
    os.mkdir("images")

fig.write_image("images/spearman.png")
fig.write_image("images/fig1.pdf")
fig.write_image("images/fig1.jpeg")
