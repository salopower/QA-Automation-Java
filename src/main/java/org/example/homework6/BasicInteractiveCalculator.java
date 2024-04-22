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

            String operation = ""; // Initialize operation variable
            boolean validOperation = false;
            while (!validOperation) {
                System.out.print("Enter an operation (+, -, *, /): ");
                operation = scanner.nextLine();
                if (isValidOperation(operation)) {
                    validOperation = true;
                } else {
                    System.out.println("Invalid operation. Please enter '+', '-', '*', or '/'.");
                }
            }

            System.out.print("Enter another number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            double result = performOperation(num1, operation, num2);
            if (Double.isNaN(result)) {
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

    private static double performOperation(double num1, String operation, double num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return Double.NaN;
                }
            default:
                return Double.NaN;
        }
    }

    private static boolean isValidOperation(String operation) {
        return operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/");
    }
}
