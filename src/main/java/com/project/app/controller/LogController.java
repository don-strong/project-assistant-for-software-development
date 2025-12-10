package com.project.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.project.app.model.KnowBaseMain;
import com.project.app.model.KnowDB;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LogController {
    @FXML
    private TableView<KnowDB> logsTable;

    @FXML
    private TableColumn<KnowDB, String> languageColumn;
    @FXML
    private TableColumn<KnowDB, String> ideColumn;
    @FXML
    private TableColumn<KnowDB, String> problemColumn;
    @FXML
    private TableColumn<KnowDB, String> solutionColumn;
    @FXML
    private TableColumn<KnowDB, String> idColumn;

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

    @FXML
    protected void refreshLogs(){
        idColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().id()));
        problemColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().observed_errors()));
        solutionColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().known_solutions()));
        languageColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().prog_lang()));
        ideColumn.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().application()));
        KnowBaseMain knowBaseMain = new KnowBaseMain();
        List<KnowDB> entries = new ArrayList<>();
        for (Document doc : knowBaseMain.getAllKnowDBEntries()) {
            KnowDB entry = new KnowDB(
                    doc.getString("id"),
                    doc.getString("keywords"),
                    doc.getString("prog_lang"),
                    doc.getString("application"),
                    doc.getString("observed_errors"),
                    doc.getString("known_solutions")
            );
            entries.add(entry);
        }
        logsTable.getItems().setAll(entries);
    }

}
