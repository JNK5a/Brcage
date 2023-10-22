import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.chart.NumberAxis; 
import javafx.scene.chart.ScatterChart; 
import javafx.scene.chart.XYChart; 
import javafx.scene.paint.Color;
import javafx.scene.Node;
import java.util.Set;
         
public class ScatterPlot extends Application { 
   @Override 
   public void start(Stage stage) {     
      //Defining the axes               
      NumberAxis xAxis = new NumberAxis(0, 28, 7); 
      xAxis.setLabel("GE1");          
        
      NumberAxis yAxis = new NumberAxis(0, 32, 8); 
      yAxis.setLabel("GE2"); 
      
      //Creating the Scatter chart 
      ScatterChart<String, Number> scatterChart = 
      new ScatterChart(xAxis, yAxis);         
         
      //Prepare XYChart.Series objects by setting data 
      XYChart.Series series = new XYChart.Series();  
series.getData().add(new XYChart.Data(    2.46336    ,    2.35584    ));
series.getData().add(new XYChart.Data(    1.9776    ,    1.70112    ));
series.getData().add(new XYChart.Data(    0    ,    0.25152    ));
series.getData().add(new XYChart.Data(    0.2688    ,    0.3072    ));
series.getData().add(new XYChart.Data(    0.55488    ,    0.51072    ));
series.getData().add(new XYChart.Data(    1.36512    ,    0.33024    ));
series.getData().add(new XYChart.Data(    0.5472    ,    0.48768    ));
series.getData().add(new XYChart.Data(    2.66304    ,    1.91616    ));
series.getData().add(new XYChart.Data(    0.14016    ,    0.11136    ));
series.getData().add(new XYChart.Data(    0    ,    0    ));
series.getData().add(new XYChart.Data(    5.2608    ,    5.37408    ));
series.getData().add(new XYChart.Data(    13.98144    ,    9.1584    ));
series.getData().add(new XYChart.Data(    2.85504    ,    4.42176    ));
series.getData().add(new XYChart.Data(    2.08512    ,    4.20096    ));
series.getData().add(new XYChart.Data(    3.11616    ,    4.27968    ));
series.getData().add(new XYChart.Data(    2.4576    ,    1.24032    ));
series.getData().add(new XYChart.Data(    6.99072    ,    3.12384    ));
series.getData().add(new XYChart.Data(    8.50752    ,    4.68288    ));
series.getData().add(new XYChart.Data(    5.82912    ,    3.76896    ));
series.getData().add(new XYChart.Data(    5.26848    ,    0.66624    ));
series.getData().add(new XYChart.Data(    16.53888    ,    14.76864    ));
series.getData().add(new XYChart.Data(    18.30144    ,    24.65664    ));
series.getData().add(new XYChart.Data(    36.57408    ,    37.42464    ));
series.getData().add(new XYChart.Data(    34.33536    ,    32.32896    ));
series.getData().add(new XYChart.Data(    10.63296    ,    0.44736    ));
series.getData().add(new XYChart.Data(    7.95456    ,    8.5344    ));
series.getData().add(new XYChart.Data(    21.51168    ,    23.86368    ));
series.getData().add(new XYChart.Data(    16.68864    ,    20.21376    ));
series.getData().add(new XYChart.Data(    19.59552    ,    24.46848    ));
series.getData().add(new XYChart.Data(    19.12704    ,    23.20512    ));
series.getData().add(new XYChart.Data(    3.3696    ,    0.53184    ));
series.getData().add(new XYChart.Data(    3.73824    ,    0.70848    ));
series.getData().add(new XYChart.Data(    6.79296    ,    0.3936    ));
series.getData().add(new XYChart.Data(    8.21184    ,    1.17504    ));
series.getData().add(new XYChart.Data(    5.34912    ,    0.86016    ));
series.getData().add(new XYChart.Data(    8.64768    ,    1.56096    ));
series.getData().add(new XYChart.Data(    9.40416    ,    1.40352    ));
series.getData().add(new XYChart.Data(    25.55328    ,    29.61408    ));
series.getData().add(new XYChart.Data(    4.59072    ,    5.568    ));
series.getData().add(new XYChart.Data(    2.2752    ,    2.2752    ));
series.getData().add(new XYChart.Data(    20.92032    ,    28.36224    ));
series.getData().add(new XYChart.Data(    2.20224    ,    2.27136    ));
series.getData().add(new XYChart.Data(    4.59456    ,    3.90144    ));
series.getData().add(new XYChart.Data(    2.0736    ,    2.92992    ));
series.getData().add(new XYChart.Data(    3.50784    ,    3.76128    ));
series.getData().add(new XYChart.Data(    18.59136    ,    25.03296    ));
series.getData().add(new XYChart.Data(    3.264    ,    4.14528    ));
series.getData().add(new XYChart.Data(    8.84736    ,    7.31904    ));
series.getData().add(new XYChart.Data(    5.80608    ,    5.54688    ));
series.getData().add(new XYChart.Data(    6.8256    ,    8.48832    ));
series.getData().add(new XYChart.Data(    12.05568    ,    11.62752    ));
series.getData().add(new XYChart.Data(    5.45088    ,    5.86752    ));
series.getData().add(new XYChart.Data(    9.87456    ,    9.11232    ));
series.getData().add(new XYChart.Data(    3.6384    ,    3.36768    ));
series.getData().add(new XYChart.Data(    12.71808    ,    12.84288    ));
series.getData().add(new XYChart.Data(    7.83168    ,    8.46336    ));
series.getData().add(new XYChart.Data(    20.97408    ,    22.01856    ));
series.getData().add(new XYChart.Data(    4.48128    ,    3.94944    ));
series.getData().add(new XYChart.Data(    1.2096    ,    2.39808    ));
series.getData().add(new XYChart.Data(    2.39232    ,    3.09696    ));
series.getData().add(new XYChart.Data(    1.58208    ,    1.344    ));
series.getData().add(new XYChart.Data(    5.08416    ,    5.28576    ));
series.getData().add(new XYChart.Data(    7.66848    ,    7.536    ));
series.getData().add(new XYChart.Data(    9.54624    ,    12.10176    ));
series.getData().add(new XYChart.Data(    9.78048    ,    12.87744    ));
series.getData().add(new XYChart.Data(    12.70656    ,    11.16288    ));
series.getData().add(new XYChart.Data(    4.49088    ,    4.04928    ));
series.getData().add(new XYChart.Data(    6.61632    ,    9.0528    ));
series.getData().add(new XYChart.Data(    8.76672    ,    9.33312    ));
series.getData().add(new XYChart.Data(    7.91808    ,    8.26368    ));
series.getData().add(new XYChart.Data(    5.91744    ,    11.8464    ));
series.getData().add(new XYChart.Data(    3.0048    ,    3.39264    ));
series.getData().add(new XYChart.Data(    9.77856    ,    9.80352    ));
series.getData().add(new XYChart.Data(    10.42368    ,    10.16448    ));
series.getData().add(new XYChart.Data(    1.28256    ,    1.51296    ));
series.getData().add(new XYChart.Data(    7.77216    ,    8.06976    ));
series.getData().add(new XYChart.Data(    10.19136    ,    9.04128    ));
series.getData().add(new XYChart.Data(    7.26528    ,    5.8848    ));
series.getData().add(new XYChart.Data(    4.00128    ,    4.28736    ));
series.getData().add(new XYChart.Data(    9.65952    ,    7.91808    ));
series.getData().add(new XYChart.Data(    3.9168    ,    4.0704    ));
series.getData().add(new XYChart.Data(    10.01472    ,    8.58048    ));
series.getData().add(new XYChart.Data(    1.69344    ,    1.46496    ));
series.getData().add(new XYChart.Data(    4.80768    ,    4.21056    ));
series.getData().add(new XYChart.Data(    11.15904    ,    9.86304    ));
series.getData().add(new XYChart.Data(    3.32736    ,    3.95328    ));
series.getData().add(new XYChart.Data(    10.22784    ,    12.15744    ));
series.getData().add(new XYChart.Data(    5.58144    ,    5.82336    ));
series.getData().add(new XYChart.Data(    13.82016    ,    11.15904    ));
series.getData().add(new XYChart.Data(    10.87872    ,    8.12544    ));
series.getData().add(new XYChart.Data(    8.8416    ,    7.70112    ));
series.getData().add(new XYChart.Data(    3.30624    ,    2.12736    ));
series.getData().add(new XYChart.Data(    19.8144    ,    16.36416    ));
series.getData().add(new XYChart.Data(    4.07232    ,    3.96672    ));
series.getData().add(new XYChart.Data(    11.7504    ,    10.08576    ));
series.getData().add(new XYChart.Data(    10.25472    ,    8.42304    ));
series.getData().add(new XYChart.Data(    11.93856    ,    10.06272    ));
series.getData().add(new XYChart.Data(    0.98496    ,    0.816    ));
series.getData().add(new XYChart.Data(    8.52288    ,    4.2048    ));
series.getData().add(new XYChart.Data(    6.76032    ,    3.32736    ));
series.getData().add(new XYChart.Data(    15.2448    ,    14.02176    ));
series.getData().add(new XYChart.Data(    9.15264    ,    8.25024    ));
series.getData().add(new XYChart.Data(    8.66496    ,    7.50912    ));
series.getData().add(new XYChart.Data(    8.24064    ,    4.39296    ));
series.getData().add(new XYChart.Data(    62.07936    ,    10.08    ));
series.getData().add(new XYChart.Data(    10.74816    ,    10.38336    ));
series.getData().add(new XYChart.Data(    7.21152    ,    6.35712    ));
series.getData().add(new XYChart.Data(    10.03584    ,    9.86496    ));
series.getData().add(new XYChart.Data(    8.63232    ,    7.78368    ));
series.getData().add(new XYChart.Data(    4.88256    ,    4.34688    ));
series.getData().add(new XYChart.Data(    9.02592    ,    7.536    ));
series.getData().add(new XYChart.Data(    6.22272    ,    5.23968    ));
series.getData().add(new XYChart.Data(    6.81792    ,    7.0944    ));
series.getData().add(new XYChart.Data(    9.58272    ,    8.35968    ));
series.getData().add(new XYChart.Data(    10.31232    ,    8.14656    ));
series.getData().add(new XYChart.Data(    11.2992    ,    9.72288    ));
series.getData().add(new XYChart.Data(    14.30016    ,    11.59296    ));
series.getData().add(new XYChart.Data(    10.80192    ,    28.60224    ));
series.getData().add(new XYChart.Data(    2.02944    ,    2.03712    ));
series.getData().add(new XYChart.Data(    8.80512    ,    7.28064    ));
series.getData().add(new XYChart.Data(    7.33632    ,    5.10912    ));
series.getData().add(new XYChart.Data(    9.24288    ,    7.77984    ));
series.getData().add(new XYChart.Data(    5.61216    ,    4.41408    ));
series.getData().add(new XYChart.Data(    8.6304    ,    9.12768    ));
series.getData().add(new XYChart.Data(    8.59008    ,    12.84096    ));
series.getData().add(new XYChart.Data(    7.6032    ,    8.0448    ));
series.getData().add(new XYChart.Data(    11.10336    ,    11.89056    ));
series.getData().add(new XYChart.Data(    10.51392    ,    9.04896    ));
series.getData().add(new XYChart.Data(    10.80192    ,    8.85504    ));
series.getData().add(new XYChart.Data(    7.62624    ,    6.44736    ));
series.getData().add(new XYChart.Data(    9.08544    ,    8.66496    ));
series.getData().add(new XYChart.Data(    24.17088    ,    21.40224    ));
                
      //Setting the data to scatter chart        
      scatterChart.getData().addAll(series); 
      
             
      //Creating a Group object  
      Group root = new Group(scatterChart);       
        
    
      //Creating a scene object 
      Scene scene = new Scene(root, 700, 450);  
      
      //Setting title to the Stage 
      stage.setTitle("GE1/2 Scatter Plot"); 
   
      //Adding scene to the stage 
      stage.setScene(scene); 
      
              
      //Displaying the contents of the stage 
      stage.show(); 
      
        Set<Node> nodes = scatterChart.lookupAll(".series" + 0);
        for (Node n : nodes) {
            n.setStyle("-fx-background-color: #860061, magenta;\n"
                    + "    -fx-background-insets: 0, 2;\n"
                    + "    -fx-background-radius: 6px;\n"
                    + "    -fx-padding: 6px;");
        }
    }
        
   
   public static void main(String args[]){ 
      launch(args); 
   } 
}
