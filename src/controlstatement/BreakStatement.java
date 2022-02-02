package controlstatement;

public class BreakStatement {
    public static void main(String[] args) {
        //Break - is used to terminate from the loop immediately

        //Student ID - from 1-10, if the student ID reaches to 5 loop should be stopped
        //OUTPUT - Student 5 is found: 1 2 3 4 5
        String id = "";
        for (int i=1 ; i <= 10; i++){
            id = id + i + " ";
            if(i==5){
                break;
            }
        }
        System.out.println("Student 5 is found: " + id);

        // while loop
        int j=1;
        String id1 = "";
        while(j<=10){
            id1 = id1 + j + " ";
            if(j == 5)
                break;
            j++;
        }
        System.out.println("Student 5 is found: " + id);
    }
}
