package com.methods;

public class Add {
    public static void main(String[] args) {
        //access static method from another class
        //class name.method name
        Services.add1();
        System.out.println("Sub - " + Services.sub1(20,10));

        //access instance method from another class
        Services s = new Services();
        s.mul1(30,5);
        System.out.println("Div - " + s.div1(20,2));
    }
}
