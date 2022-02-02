package controlstatement;

import java.util.Scanner;

public class SwitchStatementExample {
    public static void main(String[] args) {
        //Switch - increase readability of a program
        //Switch cases allowed byte, short, char, int and String
        //also allows wrapper classes of above types
        //Student - age -> (18,20,22), game levels - (easy, med,high)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student age - ");
        int age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("Student is in easy level game");
                break;
            case 20:
                System.out.println("Student is in medium level game");
                break;
            case 22:
                System.out.println("Student is in high level game");
                break;
            default:
                System.out.println("Student should be 18 or 20 or 22.");
        }

        // Student - different kind of levels of student with (beginner,intermediate,expert)
        //beginner -easy task, intermediate - medium task, expert - high task
        System.out.println("Enter Student level - ");
        String level = sc.next();
        switch(level){
            case "beginner":
                System.out.println("Student does easy level task");
                break;
            case "intermediate":
                System.out.println("Student does medium level task");
                break;
            case "expert":
                System.out.println("Student does high level task");
                break;
            default:
                System.out.println("no task was assigned");
        }

        //Student - three divisions in a class -(A,B,C)
        //A-74 students, B - 88 students, C-90 students
        System.out.println("Enter the division - ");
        char div = sc.next().charAt(0);
        switch(div){
            case 'A':
                System.out.println("You are from " + div + " division. There 74 students in this division");
                break;
            case 'B':
                System.out.println("You are from " + div + " division. There 88 students in this division");
                break;
            case 'C':
                System.out.println("You are from " + div + " division. There 90 students in this division");
                break;
            default:
                System.out.println("There is no such division.");
        }

    }
}
