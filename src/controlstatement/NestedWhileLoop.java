package controlstatement;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int num = 6;
        int col =1;
        int row = 1;
        while (row <= num) {
            while (col <= row) {
                System.out.print("*"+" ");
                col++;
            }
            row++;
            System.out.println();
            col = 1;
        }
    }
}
