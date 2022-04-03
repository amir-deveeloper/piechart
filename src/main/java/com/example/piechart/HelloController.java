package com.example.piechart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private PieChart pieChart;

    @Override
    public void initialize(URL url, ResourceBundle rb){

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(

                new PieChart.Data("Phone", 25),
                new PieChart.Data("Tablet", 17),
                new PieChart.Data("Desktop", 67));

        pieChart.setData(pieChartData);

    }


}

