package com.project.app.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;


public class HomeController {

//    @FXML
//    private Menu logs;
    @FXML
    private MenuItem timer;
    @FXML
    private AnchorPane contentArea;

//    @FXML
//    public void initialize() throws IOException {
//        Parent welcomeView = FXMLLoader.load(getClass().getResource("/com/project/app/welcome.fxml"));
//        contentArea.getChildren().add(welcomeView);
//    }

    @FXML
    public void openHome(ActionEvent event) throws IOException {
        Parent homeContent = FXMLLoader.load(getClass().getResource("/com/project/app/welcome.fxml"));
        contentArea.getChildren().setAll(homeContent);
    }
    @FXML
    protected void openNewLog(ActionEvent event) throws IOException {
        Parent logView = FXMLLoader.load(getClass().getResource("/com/project/app/newlog.fxml"));
        contentArea.getChildren().setAll(logView);    
    }
    @FXML
    protected void openViewLog(ActionEvent event) throws IOException {
        Parent viewLog = FXMLLoader.load(getClass().getResource("/com/project/app/viewlogs.fxml"));
        contentArea.getChildren().setAll(viewLog);
    }
    @FXML

    public void openTimer(ActionEvent event) throws IOException {
        Parent timerView = FXMLLoader.load(getClass().getResource("/com/project/app/timeview.fxml"));
        contentArea.getChildren().setAll(timerView);
    }

    @FXML
    protected void openSettings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @FXML
    protected void openQuestionaire() throws IOException {
        Parent timerView = FXMLLoader.load(getClass().getResource("/com/project/app/questionaire.fxml"));
        contentArea.getChildren().setAll(timerView);
    }
}
