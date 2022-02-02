package com.methods;

public class Recursion {
    public static void main(String[] args) {
        //Recursion - method itself called as recursion
        //Advantages - 1. reduce length of code, 2. code is easy to write
        //Disadvantage - 1. chance of memory outage, 2. slower than normal method when executing

        //Factorial number - nx(n-1)!
        int res = fact(5);
        System.out.println(res);
    }

    private static int fact(int i) {
        if(i == 1){
            return 1;
        }else{
            return i*fact(i-1);
        }
    }
}
//fact(5) = 5xfact(4)
//fact(4) = 5x4xfact(3)
//fact(3) = 5x4x3xfact(2)
//fact(2) = 5x4x3x2xfact(1)
//fact(1) = 5x4x3x2x1 = 120