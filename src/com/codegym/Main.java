package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double res1 = feetToMeter(30);
        System.out.println(res1);

        double res2 = meterToFeet(9.15);
        System.out.println(res2);
    }

    public static double feetToMeter(double feet) {
        return 0.305 * feet;
    }

    public static double meterToFeet(double meter) {
        return 3.279 * meter;
    }
}
