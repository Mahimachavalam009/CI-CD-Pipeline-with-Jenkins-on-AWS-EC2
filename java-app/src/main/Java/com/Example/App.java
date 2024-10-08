package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to My Java App!");
            System.out.println("Please choose an option:");
            System.out.println("1. Greet User");
            System.out.println("2. Calculate Sum of Two Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    greetUser(scanner);
                    break;
                case 2:
                    calculateSum(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void greetUser(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "! Welcome to the application.");
    }

    private static void calculateSum(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

