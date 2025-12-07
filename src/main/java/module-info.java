module org.example.programmingassistant {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.project.app to javafx.fxml;
    exports com.project.app;
    exports com.project.app.controller;
    opens com.project.app.controller to javafx.fxml;
    exports com.project.app.model;
    opens com.project.app.model to javafx.fxml;
}