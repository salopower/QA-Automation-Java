package org.example.homework4;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is leap year");
        } else {
            System.out.println("The year " + year + " is not leap year");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }
}