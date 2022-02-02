package controlstatement;

public class NestedDoWhileLoop {
    public static void main(String[] args) {
        int col = 1;
        int row = 1;
        int num;
        do{
            num = 6;
            do{
                System.out.print("");
                num--;
            }while(num>=row);
            col=1;
            do{
                System.out.print("*"+" ");
                col++;
            }while(col<=row);
            System.out.println(" ");
            row++;
        }while (row<=5);
    }

}
