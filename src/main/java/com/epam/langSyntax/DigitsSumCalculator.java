package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int first = number % 10;
        int second = number /10 % 10;
        int third = number /100 % 10;
        int fourth = number /1000 % 10;

        System.out.println(first + second + third + fourth);
    }

}
