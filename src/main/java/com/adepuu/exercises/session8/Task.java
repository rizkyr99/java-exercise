package com.adepuu.exercises.session8;

public class Task {

    private User user;
    private String title;
    private String description;

    public Task(User user, String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
