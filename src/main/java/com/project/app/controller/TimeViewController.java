package com.project.app.controller;

import javafx.animation.KeyFrame;
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
    private long text;
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
        long hoursIn = 0;
        long minutesIn = 0;
        long secondsIn = 0;
        if (hours.getLength() > 0)
            hoursIn = Long.parseLong(hours.getText());
        if (minutes.getLength() > 0)
            minutesIn = Long.parseLong(minutes.getText());
        if (seconds.getLength() > 0)
            secondsIn = Long.parseLong(seconds.getText());
        long inputMillis = convertInput(hoursIn, minutesIn, secondsIn);
        timer = new Timer(inputMillis, () -> {
            //KeyFrame keyFrame2 = new KeyFrame(Duration.seconds(30),e -> timerLabel.setText("Timer Done!"));
            //timeline.getKeyFrames().add(keyFrame2);
        });

        timer.start();
        timerLabel.setText(timer.getFormattedTime(timer.getRemainingMillis()));
        timeline.play();

    }
    @FXML
    protected void handlePause(){
        text = timer.getRemainingMillis();
        timer.cancel();
        timeline.pause();
    }
    @FXML
    protected void handleReset(){
        timer.cancel();
        timeline.pause();
        text = 1;
        timerLabel.setText("00:00:00");
    }
    @FXML
    protected void handleResume(){
        timer = new Timer(text);
        timer.start();
        timerLabel.setText(timer.getFormattedTime(timer.getRemainingMillis()));
        timeline.play();
    }
    private long convertInput(long hours, long minutes, long seconds) {
        long output = 0;
        if (hours > 0) {
            output += ((hours*60*60)*1000);
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
