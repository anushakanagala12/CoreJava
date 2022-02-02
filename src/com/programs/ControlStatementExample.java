package com.programs;

import java.util.Scanner;

public class ControlStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Star Menu Driven Code");
        System.out.println("Enter the number of Rows and Columns");

        int num = sc.nextInt();
        while (true) {

            System.out.println("1.Left Star Pattern \n2.Right Star Pattern \n3.Pyramid Star Pattern \n4.Exit \n");

            System.out.println("Enter Your Choice");

            int choice = sc.nextInt();
            int row, column;
            // This for loop is for Row

            for (row = 1; row <= num; row++) {
                for (int space = 1; space <= num - row; space++) {
                    if (choice == 1 || choice == 3)
                        System.out.print(" ");
                }
                for (column = 1; column <= row; column++) {
                    if (choice == 1 || choice == 2)
                        System.out.print("*");
                    else if (choice == 3)
                        System.out.print(" *");

                }
                System.out.println();

            }
            if (choice == 4)
                System.out.println("Exited from program");
                System.exit(0);


        }
    }
}


