package com.project.app;

import java.io.IOException;

import org.bson.Document;

import com.project.app.model.Counselor;
import com.project.app.model.CounselorMain;
import com.project.app.model.KnowBaseMain;
import com.project.app.model.KnowDB;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        try {
            System.out.println(Application.class.getResource("/com/project/app/homeview.fxml"));
            FXMLLoader loader = new FXMLLoader(Application.class.getResource("/com/project/app/homeview.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.setTitle("CS-301 Programming Assistant");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();

        System.out.println("Welcome to the Programming Project Assistant!");
        // Creates a document for database
        KnowDB knowDBEntry = new KnowDB(
                "1",
                "Java, Luci",
                "Java",
                "Database Integration",
                "Connection issues",
                "Check connection string and network settings"
        );
        KnowBaseMain knowBaseMain = new KnowBaseMain();
        knowBaseMain.insertKnowDB(knowDBEntry);
        //Creates a counselor entry for database
        Counselor counselorEntry = new Counselor(
                "1",
                "Time Management",
                "Remember to take regular breaks to maintain productivity.",
                "All programming projects"
        );
        CounselorMain counselorMain = new CounselorMain();
       counselorMain.insertKnowDB(counselorEntry);

//Tester code below... recommend converting into tester methods...
        // Retrieve and display all KnowDB entries
        System.out.println("\nAll KnowDB Entries:");
        for (Document doc : knowBaseMain.getAllKnowDBEntries()) {
            System.out.println(doc.toJson());
        }

        // Retrieve and display all Counselor entries
        System.out.println("\nAll Counselor Entries:");
        for (Document doc : counselorMain.getAllCounselorEntries()) {
            System.out.println(doc.toJson());
        }

                /*  Search for a KnowDB entry by ID
        KnowBaseSearch search = new KnowBaseSearch();
        KnowDB foundKnowDB = search.getKnowDBById("1");
        if (foundKnowDB != null) {
            System.out.println("\nFound KnowDB Entry by ID:");
            System.out.println(foundKnowDB);
        } else {
            System.out.println("\nNo KnowDB Entry found with the given ID.");
        }
        // Search for a Counselor entry by ID
        Counselor foundCounselor = search.getCounselorById("1");
        if (foundCounselor != null) {
            System.out.println("\nFound Counselor Entry by ID:");
            System.out.println(foundCounselor);
        } else {
            System.out.println("\nNo Counselor Entry found with the given ID.");
        } */


    }
}