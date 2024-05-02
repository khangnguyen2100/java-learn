package com.javaLearn.Exercise;


import java.util.Scanner;

public class Exercise {
    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a number");
            return;
        }
        int num = scanner.nextInt();
        boolean isFizz = num % 5 == 0;
        boolean isBuzz = num % 3 == 0;

        if (isFizz && isBuzz) {
            System.out.println("FIZZBUZZ");
        } else if (isFizz) {
            System.out.println("BUZZ");
        } else if (isBuzz) {
            System.out.println("FIZZ");
        } else {
            System.out.println(num);
        }
    }

    public static void loop() {
        // for loop
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("for loop i: " + i);
//        }
        // while loop
//        int i = 0;
//        while (i < 5) {
//            System.out.println("while loop i: " + i);
//            i++;
//        }

        // do while loop
//        do {
//            System.out.println("start do while loop");
//            System.out.println("while loop i: " + i);
//            i++;
//        } while (i < 5);

        // for each loop
        char[] letters = {'A', 'B', 'C', 'D'};
        for (char letter :
                letters) {
            System.out.println(letter);
        }
    }

    public static void t10() {
        System.out.println("hehhehehe");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                int value = (int) (Math.pow(2, j) * b);
                if (j == 0) {
                    value += a;
                    nums[j] = value;
                    continue;
                }
                nums[j] = value + nums[j - 1];
            }
            StringBuilder sb = join(" ", nums);
            System.out.println(sb.toString());
        }
        in.close();
    }

    public static StringBuilder join(CharSequence delimiter, int... arr) {
        if (null == delimiter || null == arr) throw new NullPointerException();

        StringBuilder sb = new StringBuilder(String.valueOf(arr[0]));
        for (int i = 1; i < arr.length; i++) sb.append(delimiter).append(arr[i]);

        return sb;
    }
}
