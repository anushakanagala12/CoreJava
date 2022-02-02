package com.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        //String Builder -> used to overcome the problem of String Buffer, which is to Non-synchronized
        //
        StringBuilder stb = new StringBuilder("Anu");
        stb.append("sha");
        System.out.println(stb);
        //==, equals
        StringBuilder a = new StringBuilder("Banana");
        StringBuilder b = new StringBuilder("Banana");
        System.out.println("By == " + (a==b));
        System.out.println("By equals " + (a.equals(b)));
        //Object -> equals method -> String Buffer doesn't override equals method


        //Capacity -> no of character values string buffer can hold -> default is 16

        StringBuilder c = new StringBuilder();
        System.out.println("Default capacity of a String Builder - " + c.capacity());
        c.append("abcdefghijklmnop");
        System.out.println("Default capacity of a String Builder - " + c.capacity());
        c.append("q");
        System.out.println("Default capacity of a String Builder - " + c.capacity());
        //new capacity = (old capacity + 1) * 2
        c.append("r");
        System.out.println("Default capacity of a String Builder - " + c.capacity());

        //Capacity with initial value
        StringBuilder d = new StringBuilder(5);
        System.out.println("Default capacity of a String Builder - " + d.capacity());
        d.append("abcde");
        System.out.println("Default capacity of a String Builder - " + d.capacity());
        d.append("f");
        System.out.println("Default capacity of a String Builder - " + d.capacity());
        d.append("ghijklmnopqr");
        System.out.println("Default capacity of a String Builder - " + d.capacity());

        //Find a capacity with String values
        StringBuilder e = new StringBuilder("Message");
        System.out.println("Default capacity of a String Builder - " + e.capacity());
        //new capacity = String length + 16
    }
}
