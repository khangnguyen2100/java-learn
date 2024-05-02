package com.javaLearn.Exercise;


import java.util.Scanner;

public class Solution {
    private static boolean flag = true;
    private static int B;
    private static int H;




    static {
        try {
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            if (value < 0) throw new Exception("java.lang.Exception: Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

