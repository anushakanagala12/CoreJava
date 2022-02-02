package com.string;
class BufferandBuilderMethod{
    public static void methodAppend(){
        //it used to concat the Strings
        StringBuffer sb = new StringBuffer("ABC");
        sb.append("XYZ");
        System.out.println(sb);
        StringBuilder stb = new StringBuilder("ABC");
        stb.append("XYZ");
        System.out.println(stb);
    }
    public static void methodInsert(){
        //insert given string at given index position
        StringBuffer sb1 = new StringBuffer("GHI");
        sb1.insert(1, "D");
        System.out.println(sb1);
        StringBuilder stb1 = new StringBuilder("GHI");
        stb1.insert(2,"E");
        System.out.println(stb1);
    }
    public static void methodReplace(){
        //replaces the given String from specified beginning index to end index
        StringBuffer sb2 = new StringBuffer("ANUKAN");
        sb2.replace(3,6,"SHA");// KAN
        System.out.println(sb2);
        StringBuilder stb2 = new StringBuilder("ANUKAN");
        stb2.insert(6, "U");
        stb2.replace(3,7,"SHA");
        System.out.println(stb2);
    }
    public static void methodDelete(){
        //it deletes the String from specified indexes (begin,end)
        StringBuffer sb3 = new StringBuffer("ANUKAN");
        sb3.delete(3,6);
        System.out.println(sb3);
        StringBuilder stb3 = new StringBuilder("ANUKANU");
        stb3.delete(0,3);
        System.out.println(stb3);
    }
    public static void methodReverse(){
        //it reverses the current string
        StringBuffer sb4 = new StringBuffer("ANUKAN");
        sb4.reverse();
        System.out.println(sb4);
        StringBuilder stb4 = new StringBuilder("ANUKANU");
        stb4.reverse();
        System.out.println(stb4);
    }
}

public class StringBufferandStringBuilderMethods {
    public static void main(String[] args) {

//        BufferandBuilderMethod.methodAppend();
//        BufferandBuilderMethod.methodInsert();
//        BufferandBuilderMethod.methodReplace();
        //BufferandBuilderMethod.methodDelete();
        BufferandBuilderMethod.methodReverse();
    }
}
