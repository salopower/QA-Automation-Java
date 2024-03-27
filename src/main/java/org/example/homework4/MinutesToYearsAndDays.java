package org.example.homework4;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        long minutes = 561600;
        printYearsAndDays(minutes);
    }

    public static void printYearsAndDays(long minutes) {
        final int hour = 60;
        final int day = 24;
        final int year = 365;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (hour * day * year);
            long days = (minutes % (hour * day * year)) / (hour * day);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
