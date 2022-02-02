package controlstatement;

public class ContinueStatement {
    public static void main(String[] args) {
        //Continue - is used to skip the current iteration of the loop

        //for loop
        String id = "";
        for (int i=1 ; i <= 10; i++){
            if(i==5){
                continue;
            }
            id = id + i + " ";
        }
        System.out.println("Student 5 is found: " + id);

        // while loop
        int j=1;
        String id1 = "";
        while(j<=10){
            if(j == 5){
                j++;
                continue;
            }
            id1 = id1 + j + " ";
            j++;
        }
        System.out.println("Student 5 is found: " + id);
    }
}
