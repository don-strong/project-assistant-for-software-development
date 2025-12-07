package com.project.app.controller;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.project.app.model.Timer;
import javafx.util.Duration;

public class TimeViewController {
    @FXML
    private Label timerLabel;
    @FXML
    private TextField sessionNameField;
    @FXML
    private TextField hours;
    @FXML
    private TextField minutes;
    @FXML
    private TextField seconds;

    private Timeline timeline;
    private Timer timer;

    @FXML   //initialize runs when the fxml is loaded
    private void initialize() {
        timeline = new Timeline();
        KeyFrame keyFrame1 = new KeyFrame(Duration.millis(50),
                e -> {timerLabel.setText(timer.getFormattedTime(timer.getRemainingMillis()));});
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(keyFrame1);
    }

    @FXML
    protected void handleStart(){
        long hoursIn = Long.parseLong(hours.getText());
        long minutesIn = Long.parseLong(minutes.getText());
        long secondsIn = Long.parseLong(seconds.getText());
        long inputMillis = convertInput(hoursIn, minutesIn, secondsIn);
        timer = new Timer(inputMillis, () -> {
//            KeyFrame keyFrame2 = new KeyFrame(Duration.seconds(30),e -> timerLabel.setText("Timer Done!"));
//            timeline.getKeyFrames().add(keyFrame2);
        });

        timer.start();
        timerLabel.setText(timer.getFormattedTime(timer.getRemainingMillis()));
        timeline.play();

    }
    @FXML
    protected void handleStop(){
        //throw new UnsupportedOperationException("Not supported yet.");
        timer.cancel();
    }
    @FXML
    protected void handleReset(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @FXML
    protected void handleSave(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected long gatherInput(){

        return 1;
    }
    /**
     * Converts an input of hours, minutes, seconds into total Milliseconds
     * @param hours
     * @param minutes
     * @param seconds
     */
    private long convertInput(long hours, long minutes, long seconds) {
        long output = 0;
        if (hours > 0) {
            output += ((hours*60^2)*1000);
        }
        if (minutes > 0) {
            output += ((minutes*60)*1000);
        }
        if (seconds > 0) {
            output += seconds*1000;
        }
        return output;
    }
}
