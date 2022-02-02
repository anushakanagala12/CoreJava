package controlstatement;

import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        //Nested IF -> if we have multiple conditions and first condition is true then it enter to second condition
//        int m = 32;
//        if(m < 40){
//            if(m % 2 == 0){
//                System.out.println("Both conditions are true");
//            }
//        }
        // Student --> if he wants to give exam
        //check he is same college, check his hall-ticket number //input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College name - ");
        String collegeName = sc.next();
        System.out.println("Enter Hall Ticket Number of a Student - ");
        long hallTicketNo = sc.nextLong();
        if (collegeName.equals("cmu")) {
            if ((hallTicketNo >= 101201)&&(hallTicketNo <= 101245)){
                    System.out.println("Student is from " + collegeName + " college with " + hallTicketNo + ".");
                    System.out.println("Can attend the exam.");
            }
        }
    }
}
