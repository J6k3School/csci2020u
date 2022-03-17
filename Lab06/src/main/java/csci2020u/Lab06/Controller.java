package csci2020u.Lab06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.chart.*;
import javafx.scene.paint.Color;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    private CategoryAxis x;
    @FXML
    private NumberAxis y;
    @FXML
    private BarChart<String, Number> barChart;
    @FXML
    private PieChart pieChart;



    //Bar Graph

    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1,
            308431.4,322635.9,340253.0,363153.7
    };

    //---------------------------------------------------------

    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8,
            1335932.6,1472362.0,1583521.9,1613246.3
    };

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //Pie Chart

    private static Color[] pieColours = {
            Color.AQUA, Color.GOLD, Color.DARKORANGE,
            Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM
    };

    //---------------------------------------------------------

    private static String[] ageGroups = {
            "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
    };

    //---------------------------------------------------------

    private static int[] purchasesByAgeGroup = {
            648, 1021, 2453, 3173, 1868, 2247
    };

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Override
    public void initialize(URL url, ResourceBundle rb){
        // Bargraph data imlimentation
        XYChart.Series<String, Number> set1 = new XYChart.Series<>();
        for(int i = 0; i < avgHousingPricesByYear.length; i++) {
            set1.getData().add(new XYChart.Data<>("Year " + (i + 1), avgHousingPricesByYear[i]));
        }

        //--------------------------------------

        XYChart.Series<String, Number> set2 = new XYChart.Series<>();
        for(int i = 0; i < avgCommercialPricesByYear.length; i++) {
            set2.getData().add(new XYChart.Data<>("Year " + (i + 1), avgCommercialPricesByYear[i]));
        }

        //--------------------------------------

        barChart.getData().addAll(set1, set2);

        //--------------------------------------

        // piegraph data imlimentation
        PieChart.Data part0 = new PieChart.Data(ageGroups[0],purchasesByAgeGroup[0]);
        PieChart.Data part1 = new PieChart.Data(ageGroups[1],purchasesByAgeGroup[1]);
        PieChart.Data part2 = new PieChart.Data(ageGroups[2],purchasesByAgeGroup[2]);
        PieChart.Data part3 = new PieChart.Data(ageGroups[3],purchasesByAgeGroup[3]);
        PieChart.Data part4 = new PieChart.Data(ageGroups[4],purchasesByAgeGroup[4]);
        PieChart.Data part5 = new PieChart.Data(ageGroups[5],purchasesByAgeGroup[5]);

        pieChart.getData().addAll(part0, part1, part2, part3, part4, part5);
    };

}
