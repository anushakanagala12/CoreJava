package controlstatement;

import java.util.Scanner;

public class IfElseLadderExample {
    public static void main(String[] args) {
        //If-else ladder statement - if we have multiple conditions to check
        //Student -> given exam, we have three grades A,B and C
        // Grade A - price Bike, Grade B - prize Shoes , Grade C - price book
        char grade = 'A';
        if(grade == 'A'){
            System.out.println("Student will get Bike as prize");
        }else if(grade == 'B'){
            System.out.println("Student will get Shoes as a prize");
        }else
            System.out.println("Student will get Book as a prize");

        //Student ID-> 101 - 130
        //ID -> (101,110) -> music team
        //ID -> (111,120) -> sports team
        //ID -> (121,130) -> Dance team
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID - ");
        int studentId = sc.nextInt();
        if((studentId >= 101) && (studentId <= 110)){
            System.out.println("Student with ID " + studentId + " selected to music team");
        }else if((studentId >= 111) && (studentId <= 120)) {
            System.out.println("Student with ID " + studentId + " selected to sports team");
        }else if((studentId >= 121) && (studentId <= 130)) {
            System.out.println("Student with ID " + studentId + " selected to Dance team");
        }else
            System.out.println("Student with ID " + studentId + " is not selected to any team");
    }

    public static class ForLoopExample {
        public static void main(String[] args) {
            //For loop -> Part of program repeated multiple times
            //When the no of iteration is fixed them we will use for loop
            for(int id = 0; id < 5 ; id++){
                System.out.println("Student " + id + " generated.");
            }
            //output format -> even no - 2 4 6 8 10, odd no - 1 3 5 7 9
            String even = "";
            String odd = "";
            for(int i = 1; i <= 10; i++){
                if(i % 2 == 0){
                    even = even + " " + i;
                }else {
                    odd = odd + " " + i;
                }
            }
            System.out.println("Even no: " + even);
            System.out.println("odd no: " + odd);

        }
    }
}
