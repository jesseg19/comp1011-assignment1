package com.example.assignment1;

import Utilities.DBUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private TableView<Athlete> tableView;

    @FXML
    private TableColumn<Athlete, Integer> idColumn;

    @FXML
    private TableColumn<Athlete, String> nameColumn;

    @FXML
    private TableColumn<Athlete, String> ageColumn;

    @FXML
    private TableColumn<Athlete, String> heightColumn;

    @FXML
    private TableColumn<Athlete, String> gamesColumn;

    @FXML
    private TableColumn<Athlete, String> sportColumn;

    @FXML
    private TableColumn<Athlete, String> medalColumn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("athleteId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        heightColumn.setCellValueFactory(new PropertyValueFactory<>("height"));
        gamesColumn.setCellValueFactory(new PropertyValueFactory<>("games"));
        sportColumn.setCellValueFactory(new PropertyValueFactory<>("sport"));
        medalColumn.setCellValueFactory(new PropertyValueFactory<>("medal"));

        tableView.getItems().addAll(DBUtility.getAthleteData());
    }

    //change the scene to the graph view
    public void changeScreenButtonPushed(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("athlete-height-view.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //get stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}

