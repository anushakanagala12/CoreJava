package com.programs;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10;
        for(int i=0;i<=n-1;i++){
            int res = fibo(i);
            System.out.print(res + " ");
        }
    }
    private static int fibo(int i) {
        if(i==0){
            return 0;
        }else if (i==1){
            return 1;
        }else{
            return fibo(i-1)+fibo(i-2);
        }
    }
}
//fibo(0) = 0
//fibo(1) = 1
//fibo(2) = fibo(1)+fibo(0)=1+0=1
//fibo(3) = fibo(2)+fibo(1)=1+1=2
//fibo(4) = fibo(3)+fibo(2)=2+1=3