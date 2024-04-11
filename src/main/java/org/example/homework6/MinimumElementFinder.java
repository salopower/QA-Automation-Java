package org.example.homework6;

import java.util.Scanner;

public class MinimumElementFinder {
    public static void main(String[] args) {
        int[] numbers = readIntegers();
        int min = findMin(numbers);
        System.out.println("Minimum element: " + min);
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();
        String[] strArray = input.split(",");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i].trim());
        }
        return intArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
