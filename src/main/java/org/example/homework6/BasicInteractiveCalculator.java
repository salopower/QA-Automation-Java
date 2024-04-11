package org.example.homework6;

import java.util.Scanner;

public class BasicInteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter a number: ");
            double num1 = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter an operation (+, -, *, /): ");
            String operation = scanner.nextLine();

            System.out.print("Enter another number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            double result;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            System.out.println("Result: " + result);

            String choice;
            boolean validChoice = false;
            while (!validChoice) {
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no")) {
                    validChoice = true;
                    continueCalculation = choice.equalsIgnoreCase("yes");
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
        }
        System.out.println("Exiting the calculator.");
    }
}
