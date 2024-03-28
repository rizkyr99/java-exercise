package com.adepuu.exercises.session8;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private Auth auth;
    private UserManager userManager;

    public Menu(Auth auth, UserManager userManager) {
        this.auth = auth;
        this.userManager = userManager;
    }

    public void displayMenu() {
        List<Task> tasks = auth.getCurrentUser().getTasks();

        if(!tasks.isEmpty()) {
            int i = 1;
            for (Task task:tasks) {
                System.out.println(i++ + ". " + task.getTitle());
            }
        } else {
            System.out.println("You have no tasks.");
        }

        System.out.println();
        System.out.println("1. Add Task");
        System.out.println("2. Logout");
        System.out.println("3. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                auth.logout();
                System.out.println("Logged out successfully!");
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task title : ");
        String title = scanner.nextLine();
        System.out.print("Enter task description : ");
        String description = scanner.nextLine();

        User user = auth.getCurrentUser();
        Task newTask = new Task(user,title,description);
        user.addTask(newTask);

    }
}
