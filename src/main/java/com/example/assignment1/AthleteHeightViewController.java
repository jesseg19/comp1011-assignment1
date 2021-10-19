package com.example.assignment1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

import java.net.URL;
import java.util.ResourceBundle;

public class AthleteHeightViewController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis ageGroupAxis;

    @FXML
    private NumberAxis heightAxis;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
