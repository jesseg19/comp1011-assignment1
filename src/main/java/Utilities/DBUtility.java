package Utilities;

import javafx.scene.chart.XYChart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectUrl = "jdbc:mysql://localhost:3306/javaAssign1";

    public static XYChart.Series<String, Integer> getAthleteData() {
        XYChart.Series<String, Integer> athleteData = new XYChart.Series<>();

        //write a sql statement to get the data you want, test in workbench then copy and past it here!!!!!
        String sql = "SELECT...";

        //F21COMP1011GCW5 supplemental 3 read from db - 14:20
        try (
                Connection conn = DriverManager.getConnection(connectUrl, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                )
        {
            //mmust change this to the column names I want to get!!!!
            while(resultSet.next()) {
                athleteData.getData().add(new XYChart.Data<>(resultSet.getInt("age"), resultSet.getString("name")))
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        return athleteData;
    }
}


