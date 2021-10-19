package Utilities;

import javafx.scene.chart.XYChart;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectURL = "jdbc:mysql://localhost:3306/javaAssign1";

    public static XYChart.Series<String, Integer> getAthleteData() {
        XYChart.Series<String, Integer> athleteData = new XYChart.Series<>();

        //write a sql statement to get the data you want, test in workbench then copy and past it here
        String sql = "SELECT...";

        //F21COMP1011GCW5 supplemental 3 read from db - 14:20

        return athleteData;
    }
}


