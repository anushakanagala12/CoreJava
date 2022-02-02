package com.programs;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        //abba - palindrome - aba
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check - ");
        String a = sc.next();
        int res = palindrome2(a);
        if (res == 0) {
            System.out.println(a + " is palindrome.");
        } else {
            System.out.println(a + " is not palindrome");
        }
    }

//    private static int palindrome(String a) {
//        int l = a.length() - 1;
//        for (int i = 0; i <= l; i++) {
//            if (a.charAt(i) != a.charAt(l)) {
//                return -1;
//            }
//            l--;
//        }
//        return 0;
//    }

//    private static int palindrome1(String a) {
//        int l1 = a.length() - 1;
//        String b ="";
//        for (int i = l1; i >= 0; i--) {
//            b=b+a.charAt(i);
//        }
//        if(a.toLowerCase().equals(b.toLowerCase())){
//            return 0;
//        }else
//            return -1;
//    }
    private static int palindrome2(String a){
        StringBuffer sb = new StringBuffer(a);
        sb.reverse();
        if(a.equalsIgnoreCase(sb.toString())){
            return 0;
        }else
            return -1;
    }
}
