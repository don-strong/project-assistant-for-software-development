package com.project.app.controller;

import com.project.app.model.KnowBaseMain;
import com.project.app.model.KnowDB;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LogController {
    @FXML
    private TextField idField;
    @FXML
    private TextField problemField;
    @FXML
    private TextField solutionField;
    @FXML
    private TextField keywordField;
    @FXML
    private TextField languageField;
    @FXML
    private TextField ideField;

    

    @FXML
    protected void handleSave(){
        KnowBaseMain knowBaseMain = new KnowBaseMain();
        KnowDB knowDBEntry = new KnowDB(
                idField.getText(),
                keywordField.getText(),
                languageField.getText(),
                ideField.getText(),
                problemField.getText(),
                solutionField.getText()
        );
        knowBaseMain.insertKnowDB(knowDBEntry);
    }

}
