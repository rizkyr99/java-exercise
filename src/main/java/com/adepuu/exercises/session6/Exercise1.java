package com.adepuu.exercises.session6;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        double sum = 0;
        int i = 0;

        while(isContinue) {
            System.out.print("Enter a number : ");
            String input = scanner.next();

            if(input.equals("q") || input.equals("Q")) {
                isContinue = false;
            } else {
                try {
                    sum += Double.parseDouble(input);
                    i++;
                } catch(Exception e) {
                    System.out.println("Enter a valid number");
                }
            }
        }

        System.out.println(sum / i);

    }
}
