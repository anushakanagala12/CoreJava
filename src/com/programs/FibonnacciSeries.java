package com.programs;

public class FibonnacciSeries {
    public static void main(String[] args) {
        //Fibonacci - 0 1 1 2 3 5 8 13
//        int i = 0;
//        int j = 1;
//        int sum;
//        System.out.print(i + " " + j);
//        for(int x=2; x<10; x++){
//            sum = i + j;
//            System.out.print(" " + sum);
//            i=j;
//            j=sum;
        // }
        String ans = fib(0,1);
        System.out.println(ans);
    }

    private static String fib(int i, int j) {
        int sum;
        String res="";
        int x=2;
          System.out.print(i + " " + j);
          while(x<10){
              sum = i + j;
              res = res +" "+ sum;
                i=j;
                j=sum;
              x++;
          }
          return res;
    }

}


