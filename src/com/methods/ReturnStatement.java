package com.methods;

public class ReturnStatement {
    public static void main(String[] args) {
        //return - is a reserve keyword, we can't use as identifier, is always with method
        //we can't write any statement after return keyword

        System.out.println("Max number - " + max(10, 20,30));

    }
    private static int max(int i, int j, int k) {
        if((i>j) && (i>k)){
            return i;
        }else if((j>i) && (j>k)){
            return j;
        }else
            return k;
    }
}
