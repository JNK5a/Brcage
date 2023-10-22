import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
 
class Table{
   public static void main(String args[]){
      JFrame frame = new JFrame();
 
      String[] columnNames = {"Variables", "GE1", "GE2"};
 
      Object[][] data = {
       {"GE3", "rs = -0.2464, (p = 0.004402)", "rs = -0.2744,  (p=0.001452)"},
       {"GE5", "rs = -0.1773, (p = 0.04201)", "n.s"},
       {"GE1", "rs = 1, (p < 0.0001)",  "rs = 0.869, (p < 0.0001)"},
       {"GE2","rs = 0.869, (p < 0.0001)",  "rs = 1, (p < 0.0001)"},
       {"OS", "ns.",  "rs = 0.191, (p=0.02827)"},
       {"Stato", "rs = -0.1715, (p = 0.04928 )",  "rs = -0.1931, (p = 0.02655)"},
       {"DFS", "rs = 0.1814, (p = 0.03741)", "rs = 0.2528, (p=0.003448)"},
       {"Relapse", "rs = -0.1724, (p=0.04808)", "rs = -0.2022, (p = 0.02005)"}
       
   };
    JTable table = new JTable(data, columnNames);
 
   frame.add(table);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setSize(400,400);
   frame.setLocationRelativeTo(null);  
   frame.setVisible(true);
   }
}
