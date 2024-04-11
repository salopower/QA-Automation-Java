package org.example.homework6;

import java.util.Scanner;

public class FinlandSortStringArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        sortArrayByLength(array);

        System.out.println("\nSorted array by length:");
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void sortArrayByLength(String[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}



