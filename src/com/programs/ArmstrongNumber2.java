package com.programs;

import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String[] args) {

        //Ask user for input number, how many digits in the number given,Armstrong or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number - ");
        int x = sc.nextInt();

        String num = Integer.toString(x);
        int len = num.length();
        double sum = 0;
        int arm = x;

        while (x != 0) {
            int rem = x % 10;
            sum = sum + (Math.pow(rem,3));
            x = x / 10;
        }
        if (arm == sum) {
            System.out.println(arm + " is a Armstrong number.");
        }


    }
}
