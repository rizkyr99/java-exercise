package com.adepuu.exercises.session8;

import java.util.List;

public class Auth {
    private User currentUser;
    private UserManager userManager;

    public Auth(UserManager userManager) {
        this.userManager = userManager;
    }

    public void login(String username, String password) {
        User user = userManager.getUserByUsername(username);
        if (user != null) {
            if(user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } else {
            User newUser = new User(username,password);
            userManager.addUser(newUser);
            currentUser = newUser;
            System.out.println("Login successful!");
        }
    }

    public void logout() {
        currentUser = null;
    }

    public boolean isAuthenticated() {
        return currentUser != null;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
