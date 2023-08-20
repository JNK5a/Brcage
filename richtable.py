from rich.console import Console
from rich.table import Table
from rich import box
table = Table(title="Spearman rank correlations", box=box.SQUARE_DOUBLE_HEAD, show_lines=True)

table.add_column("Variables", justify="center", style="bold cyan", no_wrap=True)
table.add_column("GE1", justify="center", style="magenta")
table.add_column("GE2", justify="center", style="green")

table.add_row("GE3","rs = -0.2464, (p = 0.004402)", "rs = -0.2744,  (p=0.001452)")
table.add_row("GE5",  "rs = -0.1773, (p = 0.04201)", "n.s")
table.add_row("GE1", "rs = 1, (p < 0.0001)",  "rs = 0.869, (p < 0.0001)")
table.add_row("GE2",  "rs = 0.869, (p < 0.0001)",  "rs = 1, (p < 0.0001)")
table.add_row("OS ", "ns.",  "rs = 0.191, (p=0.02827)")
table.add_row("Stato",  "rs = -0.1715, (p = 0.04928 )",  "rs = -0.1931, (p = 0.02655)")
table.add_row("DFS",  "rs = 0.1814, (p = 0.03741)", "rs = 0.2528, (p=0.003448)")
table.add_row("Relapse", "rs = -0.1724, (p=0.04808)", "rs = -0.2022, (p = 0.02005)")

console = Console()
console.print(table)
