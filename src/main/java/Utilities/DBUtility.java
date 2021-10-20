package Utilities;

import com.example.assignment1.Athlete;
import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String pw = "student";
    private static String connectUrl = "jdbc:mysql://localhost:3306/javaassign1";

    /**
     * Get data for the Graph view
     */
    public static XYChart.Series<String, Integer> getHeightDataByAge() {
        XYChart.Series<String, Integer> athleteData = new XYChart.Series<>();


        //Incorrect SQL Query to get graph data
        String sql = "SELECT Height,\n" +
                "CASE\n" +
                "\t\tWHEN Age < 18 THEN 'UNDER 18'\n" +
                "\t\tWHEN Age BETWEEN 19 AND 29 THEN '19 - 29' \n" +
                "\t\tWHEN Age between 30 AND 39 THEN '30 - 39'\n" +
                "\t\tWHEN Age BETWEEN 40 and 49 THEN '40 - 49'\n" +
                "\t\tWHEN Age > 50 THEN 'Over 50'\n" +
                "\tEND AS 'Age Groups'\n" +
                "FROM olympicdata;";

        try (
                Connection conn = DriverManager.getConnection(connectUrl, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                )
        {
            while(resultSet.next()) {
                athleteData.getData().add(new XYChart.Data<>(resultSet.getString("Age Groups"), resultSet.getInt("Height")));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        return athleteData;
    }


    /**
     * Get data for the table view
     */
    public static ArrayList<Athlete> getAthleteData() {
        ArrayList<Athlete> athletes = new ArrayList<>();

        String sql = "\n" +
                "SELECT ID, Name, Age, Height, Games, Sport, Medal\n" +
                "FROM olympicdata";

        try (
                Connection conn = DriverManager.getConnection(connectUrl, user, pw);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while(resultSet.next()) {
                int athleteId = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String age = resultSet.getString("Age");
                String height = resultSet.getString("Height");
                String games = resultSet.getString("Games");
                String sport = resultSet.getString("Sport");
                String medal = resultSet.getString("Medal");

                Athlete athlete = new Athlete(name, age, height, games, sport, medal);
                athlete.setAthleteId(athleteId);

                athletes.add(athlete);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        return athletes;
    }
}


