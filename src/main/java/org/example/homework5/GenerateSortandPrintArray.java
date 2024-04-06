package org.example.homework5;

import java.util.Random;

public class GenerateSortandPrintArray {
    public static void main(String[] args) {
        System.out.println("Array before sort:");
        int[] numbers = getIntegers(5);
        printArray(numbers);

        System.out.println("Array after sort:");
        int[] sortedNumbers = sortIntegers(numbers);
        printArray(sortedNumbers);
    }

    public static int[] getIntegers(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
