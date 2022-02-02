package com.methods;

import java.security.PublicKey;

public class Calculator {
    public static void main(String[] args) {
        //Need of method - 1. To increase the visibility of a code
        //2. code length is reduced
        //3. Easy to modify existing code
        //4. It will increase readability of a program

        //Bank -> User details, operation -> deposit,withdraw,opening account and close

        //Method -> block of code, collections of a statement and
        // set of code grouped together to perform an operation or task

        //four categories of Method - 1. no arg and no return, 2. with arg and no return
        //3. no arg and with return and 4. with arg and with return

        //Two ways to create a method -> using static or instance method.

        //Method Signature ex

        //Method creation
        add(); //no arg and no return
        sub(20,10);// with arg and no return
        mul();//no arg and with return
        int res = mul();
        System.out.println("Mul- " + res);
        div(40,2);//with arg and with return
        System.out.println("Div - " + div(40,2));
    }

    private static int div(int i, int i1) {
        int x = i/i1;
        return x;
    }

    private static int mul() {
        int a = 10;
        int b = 30;
        int c = a*b;
        return c;
    }

    private static void sub(int i, int i1) {
        int c = i-i1;
        System.out.println("Sub - " + c);
    }

    //void mean no return value
    private static void add() { //static method - don't need object to access method
        int a = 10;
        int b = 30;
        int c = a+b;
        System.out.println("Addition of a and b is - " + c);
    }
}
