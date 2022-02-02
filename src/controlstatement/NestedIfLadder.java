package controlstatement;

import java.util.Scanner;

public class NestedIfLadder {
    public static void main(String[] args) {
        //Nested if ladder -> if we have multiple nested if conditions
        //Wending machine -> insert note - 10,20,50 rupees
        //(10,20,50)-> (10 -> chips), (20-> biscuits), (50 -> snickers)
        String payment = "Done";
        int amount = 10;
        if(payment == "Done"){
            if (amount == 10){
                System.out.println("Chips");
            }else if(amount == 20){
                System.out.println("Biscuits");
            }else {
                System.out.println("Snickers");
            }
        }
        //Student ID-> 101 - 130
        //Attend Exam to enter teams
        //ID -> (101-110) -> music team -> marks (50 - 70)
        //ID -> (111-120) -> sports team -> marks (71 - 85)
        //ID -> (121-130) -> Dance team -> marks (86-100)
        //else drama team
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID - ");
        int studentId = sc.nextInt();
        System.out.println("Enter marks - ");
        int marks = sc.nextInt();
        if((studentId >= 101) && (studentId <= 110) && (marks>=50) && (marks<=70)){
                System.out.println("Student with ID " + studentId + " selected to music team");
        }else if((studentId >= 111) && (studentId <= 120) && (marks>=71) && (marks<=85)) {
                System.out.println("Student with ID " + studentId + " selected to sports team");
        }else if((studentId >= 121) && (studentId <= 130) && (marks>=86) && (marks<=100)) {
                System.out.println("Student with ID " + studentId + " selected to Dance team");
        }else
            System.out.println("Student with ID " + studentId + " is selected to drama team");
    }
}
