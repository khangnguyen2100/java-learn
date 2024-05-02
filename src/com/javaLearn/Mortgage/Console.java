package com.javaLearn.Mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readNumber(String fieldName) {
        System.out.print("Enter " + fieldName + ": ");
        return scanner.nextDouble();
    }
    public static double readNumber(String fieldName, double min, double max) {
        double result;

        System.out.print("Enter " + fieldName + ": ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number");
            return readNumber(fieldName, min, max);
        }

        result = scanner.nextDouble();
        if (result < min || result > max) {
            System.out.println("The " + fieldName + " should between " + min + " and " + max);
            return readNumber(fieldName, min, max);
        }
        return result;
    }

}
