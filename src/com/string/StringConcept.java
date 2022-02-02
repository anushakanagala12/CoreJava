package com.string;

public class StringConcept {
    public static void main(String[] args) {
        //Need of a string - for secure app we need string
        //String -> object that represents sequence of characters
        //example: abcd = "abcd"
        //String is immutable -> value cannot be changed becz String constant pool
        //we will store string values in heap as well as string constant pool(SCP)
        // heap -> basically a memory inside JVM which holds object values
        //SCP -> memory which is inside heap where the values of all Strings stored
        //types of creating Strings - 1. by literals 2.by new keyword

        //Advantages of SCP - to improve the performance and memory management


        //String literals -> we dont have heap here, only use SCP. If the literal inside memory is already in JVM will not create again
        String name = "Anusha";
        name.concat("Kanagala");
        System.out.println(name);

        //String by new keyword
        String name1 = new String("Anusha");
        name1.concat("Kanagala");
        System.out.println(name1);

        //Example1:
        String x = new String("Hello");
        String y = new String("Hello");
        String z = "Hello";
        String w = "Hello";
        //Heap -> x is pointing to Hello, y is also pointing to Hello
        //SCP -> z and w is pointing only one object Hello

        //Example2:
        String a = new String("Anusha");
        //a.concat("Kanagala"); // a is not pointing to surname
        a = a.concat(" Kanagala"); //a is pointing to both Anusha Kanagala
        System.out.println(a);
        // Heap -> a is pointing to Anusha
        //SCP -> two objects are created (anusha kanagala)

        //Example3:
        String b = new String("Banana");
        b = b.concat("Orange");
        String r = b.concat("Grapes");
        r.concat("Plum");
        System.out.println(b);
        System.out.println(r);
        //heap->b is pointing to Banana,r is pointing to Banana and Grapes
        //Scp-> storing all values

        //Example4
        String i = "Anu";
        String j = new String(i);
        j.concat("Kanag");
        String k = j.concat(i);
        k.concat(j);
        //Heap-> i, j is pointing to Anu, K is pointing to AnuAnu
        //SCP-> storing Anu and Kanag
        // j = Anu, k=AnuKanag
        System.out.println(j);
        System.out.println(k);

        //Example5 - equals to two strings

        String c = new String("Hi");
        String d = new String("Hi");
        System.out.println("By == " + (c==d));//== -> it is pointing to same references are not
        System.out.println("By equals " + (c.equals(d)));// equals -> is pointing to object value
    }
}
// Object class -> equals method -> is used to point references of an object
//String overrides the equals method from object class, to equals to value of an object