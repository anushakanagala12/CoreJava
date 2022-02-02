package com.programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //123 = 1^3 + 2^3 + 3^3 = 1+8+27 =36 - not armstrong number
        //153 = 1^3 + 5^3 + 3^3 = 1+125+27 = 153
        //abcd... = any digit of a number = a^n+b^n+c^n - n is number of digit

        //Check Armstrong number for 3 digit

        int num = 153;
        int sum = 0;
        int arm = num;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (arm == sum) {
            System.out.println(arm + " is a Armstrong number.");
        }
        //num = 153 -> rem = n%10 = 153%10 =3
        //sum = 0 -> rem =3 -> sum =sum+(rem*rem*rem) -> sum = 27
        //num =15 -> rem =5
        //sum =27 -> rem =5 -> sum = 152
        //num = 1 -> rem 1
        //sum = 152 -> rem =1 -> sum =153
        //num =0

    }
}