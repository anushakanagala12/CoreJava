import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //Scanner is just used to get an input from the system
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student data");
        int studentRollNo = sc.nextInt();
        String studentName = sc.next();
        float studentMarks = sc.nextFloat();

        System.out.println(studentRollNo);
        System.out.println(studentName);
        System.out.println(studentMarks);

        // Task -> Add two number
        System.out.println("enter value for A - ");
        int A = sc.nextInt();
        System.out.println("enter value for B - ");
        int B = sc.nextInt();
        int add = A + B;
        System.out.println("Value of A is " + A);
        System.out.println("Value of B is " + B);
        System.out.println("Addition = " + add);

    }
}
