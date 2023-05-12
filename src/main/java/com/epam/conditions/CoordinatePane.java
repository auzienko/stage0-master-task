package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x == y && x == 0) {
            System.out.println("zero");
            return;
        }

        if (x > 0) {
            System.out.println(y > 0 ? "first" : "fourth");
        } else {
            System.out.println(y > 0 ? "second" : "third");
        }
    }

}

