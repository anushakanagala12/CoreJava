package com.methods;

public class MethodInstance {
    public static void main(String[] args) {
        //Method instance - we need to object of a class to access a method

        MethodInstance mi = new MethodInstance();// object of a class
        mi.add(); // no arg and no return
        mi.sub(20,5);//with arg and no return
        System.out.println("Mul - " + mi.mul()); //no arg and with return
        System.out.println("Div - " + mi.div(10,5)); //with arg and with return
    }

    private int div(int i, int i1) {
        int x = i/i1;
        return x;
    }
    private int mul() {
        int a = 10;
        int b = 30;
        int c = a*b;
        return c;
    }
    private void sub(int i, int i1) {
        int c = i-i1;
        System.out.println("Sub - " + c);
    }
    //void mean no return value
    private void add() {
        int a = 10;
        int b = 30;
        int c = a+b;
        System.out.println("Addition of a and b is - " + c);
    }
}
