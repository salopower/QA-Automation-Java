package org.example.homework5;

import java.util.ArrayList;
import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        ArrayList<Integer> generatedNumbers = generateNumbers();
        int sum = calculateSum(generatedNumbers);
        printResult(sum, generatedNumbers.size());
    }

    public static ArrayList<Integer> generateNumbers() {
        Random random = new Random();
        int[] counts = new int[101];
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Generated number: " + randomNumber);
            numbers.add(randomNumber);
            counts[randomNumber]++;
            if (counts[randomNumber] == 2) {
                break;
            }
        }
        return numbers;
    }

    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void printResult(int sum, int totalCount) {
        System.out.println("Total sum of generated numbers: " + sum);
        System.out.println("Total amount of numbers generated: " + totalCount);
    }
}