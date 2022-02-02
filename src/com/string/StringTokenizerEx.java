package com.string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        //String Tokenizer class allow you to break String into Tokens
        StringTokenizer st = new StringTokenizer("String Tokenizer Example");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer("String,Tokenizer,Example",",");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        String s = "String,Tokenizer,Example";
        String[] a = s.split(",");
        System.out.println(a[0]);

        //Str = "10,20,30,40,50" sum of all these num

        StringTokenizer add = new StringTokenizer("10,20,30,40,50",",");
        int sum =0;
        while(add.hasMoreTokens()){
            int num = Integer.parseInt(add.nextToken());
            sum = sum + num;
            }
            System.out.println(sum);

        //Print no.of tokens present in a string
        StringTokenizer tokens = new StringTokenizer("String,Tokenizer,Example", ",");
        System.out.println("Total no.of tokens - " + tokens.countTokens());
        }
    }

