package controlstatement;

public class DoWhileLoop {
    public static void main(String[] args) {
        //Do while - if the iterations are fixed and if wee want to execute atleast once
        int studentID = 0;
        do{
            System.out.println(studentID + " is generated.");
            studentID++;
        }while(studentID<5);
    }
}
