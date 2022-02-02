package com.string;

public class StringBufferExample {
    public static void main(String[] args) {
        //String Buffer -> is used to make the String mutable, is not used with SCP concept but uses heap
        //Every method under string method is synchronized
        //Synchronized -> one object can be modified by multiple threads simultaneously

        StringBuffer sb = new StringBuffer("Anu");
        sb.append("sha");
        System.out.println(sb);
        //==, equals
        StringBuffer a = new StringBuffer("Banana");
        StringBuffer b = new StringBuffer("Banana");
        System.out.println("By == " + (a==b));
        System.out.println("By equals " + (a.equals(b)));
        //Object -> equals method -> String Buffer doesn't override equals method


        //Capacity -> no of character values string buffer can hold -> default is 16

        StringBuffer c = new StringBuffer();
        System.out.println("Default capacity of a String Buffer - " + c.capacity());
        c.append("abcdefghijklmnop");
        System.out.println("Default capacity of a String Buffer - " + c.capacity());
        c.append("q");
        System.out.println("Default capacity of a String Buffer - " + c.capacity());
        //new capacity = (old capacity + 1) * 2
        c.append("r");
        System.out.println("Default capacity of a String Buffer - " + c.capacity());


        //Capacity with initial value
        StringBuffer d = new StringBuffer(5);
        System.out.println("Default capacity of a String Buffer - " + d.capacity());
        d.append("abcde");
        System.out.println("Default capacity of a String Buffer - " + d.capacity());
        d.append("f");
        System.out.println("Default capacity of a String Buffer - " + d.capacity());
        d.append("ghijklmnopqr");
        System.out.println("Default capacity of a String Buffer - " + d.capacity());

        //Find a capacity with String values
        StringBuffer e = new StringBuffer("Message");
        System.out.println("Default capacity of a String Buffer - " + e.capacity());
        //new capacity = String length + 16
    }
}
