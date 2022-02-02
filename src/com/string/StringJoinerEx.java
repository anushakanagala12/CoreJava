package com.string;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {
        //it is used to construct a sequence of characters seperated by delimiter
        StringJoiner sj = new StringJoiner(",");
        sj.add("It");
        sj.add("is");
        sj.add("Example");
        sj.add("StringJoiner");
        System.out.println(sj);
        StringJoiner sj1 = new StringJoiner(",","[","]");
        sj1.add("It");
        sj1.add("is");
        sj1.add("Example");
        sj1.add("StringJoiner");
        System.out.println(sj1);
        StringJoiner sj2 = new StringJoiner(":","{","}");
        sj2.add("It");
        sj2.add("is");
        sj2.add("Example");
        sj2.add("StringJoiner");
        System.out.println(sj2);
        //Merging two string joiner object
        StringJoiner merge = sj1.merge(sj2);
        System.out.println(merge);
    }
}
