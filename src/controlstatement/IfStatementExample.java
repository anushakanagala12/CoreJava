package controlstatement;

import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {
        //IF statement -> used to check a single condition

        int a = 8;
        int b = 10;
        if(a < b){
            System.out.println(b + " is greater than " + a);
        }
        //student in college there is  party, above age 18+ is allowed

        System.out.println("Enter the age of student - ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Enter the name of student - ");
        String name = sc.next();
        if(age > 18){
            System.out.println(name + " is allowed to party");
        }
    }

    public static class IfElseExample {
        public static void main(String[] args) {
            //If -else statement -> one condition to check with two possibilities

            int n = 22;
            int p = 2;

            if ( n % p == 0){
                System.out.println(n +" is divisible by " + p);
            }else
                System.out.println(n + "is not divisible by " + p);

            //Student has exam, got result. take marks >75 - will get shoes
            Scanner sc = new Scanner(System.in);
            System.out.println("enter student name - ");
            String name = sc.next();
            System.out.println("enter student marks - ");
            int marks = sc.nextInt();
            if(marks > 75){
                System.out.println(name + " will get shoes as a prize");
            }else
                System.out.println(name + " scored less than 75. No shoes");
        }
    }
}
