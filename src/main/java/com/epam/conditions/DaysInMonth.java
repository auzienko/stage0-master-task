package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(leap ? 29 : 28);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }
    }

}
