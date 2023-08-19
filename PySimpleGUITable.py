import PySimpleGUI as sg
spearman_array = [["GE3","rs = -0.2464, (p = 0.004402)", "rs = -0.2744,  (p=0.001452)"], ["GE5",  "rs = -0.1773, (p = 0.04201)", "n.s"], ["GE1", "rs = 1, (p < 0.0001)",  "rs = 0.869, (p < 0.0001)"], ["GE2",  "rs = 0.869, (p < 0.0001)",  "rs = 1, (p < 0.0001)"], ["OS ", "ns.",  "rs = 0.191, (p=0.02827)"], ["Stato",  "rs = -0.1715, (p = 0.04928 )",  "rs = -0.1931, (p = 0.02655)"], ["DFS",  "rs = 0.1814, (p = 0.03741)", "rs = 0.2528, (p=0.003448)"], ["Relapse", "rs = -0.1724, (p=0.04808)", "rs = -0.2022, (p = 0.02005)"]]

headings = ["Variables", "GE1", "GE2"]

layout = [
        [sg.Table(values=spearman_array,
        headings=headings,
        max_col_width=39,
                    auto_size_columns=True,
                    display_row_numbers=False,
                    justification='center',
                    num_rows=9,
                    key='-TABLE-',
                    row_height=39,
                    background_color="grey",
                    text_color="black")]
    ]

window = sg.Window("Spearman correlations", layout)

while True:
    event, values = window.read()
    if event == "Exit" or event == sg.WIN_CLOSED:
        break

window.close()
