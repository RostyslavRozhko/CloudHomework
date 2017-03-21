package com.google.devrel.training.conference.domain;

/**
 * Created by rostyslav on 21.03.17.
 */
public class Announcement {

    private String message;

    public Announcement() {}

    public Announcement(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}