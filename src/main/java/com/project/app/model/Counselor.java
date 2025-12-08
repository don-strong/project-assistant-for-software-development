package com.project.app.model;
// Counselor record to represent counselor entries

public record Counselor(String id, String subject_topic,
    String tip_hints, String applicability) {
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Subject Topic: " + subject_topic + "\n" +
               "Tip/Hints: " + tip_hints + "\n" +
               "Applicability: " + applicability + "\n";
    }
}
