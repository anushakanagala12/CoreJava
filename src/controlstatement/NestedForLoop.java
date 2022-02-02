package controlstatement;

public class NestedForLoop {
    public static void main(String[] args) {
        //Left triangle star pattern in PDF - 1st pic
        int num = 4;
        int col,row;
        for(row=1; row<=num; row++){
            for(col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
