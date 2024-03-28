package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String id;
    private String username;
    private String password;
    private List<Task> tasks;

    public User(String username, String password) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Task> getTasks(){
        return tasks;
    }


}
