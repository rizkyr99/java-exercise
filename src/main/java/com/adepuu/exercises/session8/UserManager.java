package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> userList;

    public UserManager() {
        this.userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
