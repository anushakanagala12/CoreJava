package com.string;

public class StringConversionsEx {
    public static void main(String[] args) {
        //String Builder to String Buffer
        StringBuilder stb = new StringBuilder();
        System.out.println("stb - " + stb.getClass());
        stb.append("Hello");
        StringBuffer sb = new StringBuffer(stb);
        sb.append("Everyone");
        System.out.println("stb to sb - " + sb);
        System.out.println("sb - " + sb.getClass());
        System.out.println("---------------------------------------");

        //String Buffer to String Builder
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1 - " + sb1.getClass());
        sb1.append("Hello");
        StringBuilder stb1 = new StringBuilder(sb1);
        stb1.append("Everyone");
        System.out.println("sb1 to stb1 - " + stb1);
        System.out.println("stb1 - " + stb1.getClass());
        System.out.println("---------------------------------------");

        //String to String Buffer
        String s = "Good";
        StringBuffer sb2 = new StringBuffer(s);
        System.out.println("s to sb2" + sb2.getClass());
        System.out.println("sb2 - " + sb2.append("Morning"));
        System.out.println("---------------------------------------");

        //String to String Builder
        String s1 = "Good";
        StringBuilder stb2 = new StringBuilder(s1);
        System.out.println("s1 to stb2" + stb2.getClass());
        System.out.println("stb2 - " + stb2.append("Morning"));
        System.out.println("---------------------------------------");

        //StringBuffer to String
        StringBuffer sb3 = new StringBuffer("Hi,");
        String s2 = new String(sb3);
        s2 = s2.concat("Welcome");
        System.out.println("sb3 to s2 - " + s2);
        System.out.println("---------------------------------------");

        //StringBuilder to String
        StringBuilder stb3 = new StringBuilder("Hi,");
        String s3 = new String(stb3);
        s3 = s3.concat("Welcome");
        System.out.println("stb3 to s3 - " + s3);
        System.out.println("---------------------------------------");

    }
}
