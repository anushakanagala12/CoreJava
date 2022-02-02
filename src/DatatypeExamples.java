import java.util.Arrays;

public class DatatypeExamples {

    public static void main(String[] args) {

        // Datatype -> which type of variable to use

        //Primitive data types -> not a object, it is a fix in size, it cant change a value

        // byte type -> 1 byte of data = 8 bit
        byte studentAge = 13;
        byte studentMarks = 78;
        System.out.println(studentAge + " "  + studentMarks);

        // Short data type -> 2 byte of data = 16 bit
        short height = 5;
        System.out.println(height);

        //int data type -> 4 byte of data = 32 bits
        int weight = 45;
        System.out.println(weight);

        //long data type -> 8 bytes of data = 64 bits
        long phoneNo = 123456789L;
        System.out.println(phoneNo);

        //float data type -> 4 bytes of data = 32 bits
        float marks = 77.7f;
        System.out.println(marks);

        //Double data type -> 8 byte of data = 64 bits
        double stocks = 78.555555d;
        System.out.println(stocks);

        //Character data type -> 2 byte of data = 16 bits
        char grade = 'B';
        System.out.println(grade);

        //boolean data type -> 1 bit
        boolean attendance = true;
        System.out.println(attendance);

        //
        int x = 25;
        int y = x;
        System.out.println(x);
        System.out.println(y);
        y = 70;
        System.out.println(x);
        System.out.println(y);

        // NON-PRIMITIVE DATA TYPES -> object like Strings and Array
        int[] n = {10,20,30,40};
        int[] n1 = n;
        System.out.println("initial = " + Arrays.toString(n));
        System.out.println("initial = " + Arrays.toString(n1));
        n1[1] = 60;
        System.out.println("initial = " + Arrays.toString(n));
        System.out.println("initial = " + Arrays.toString(n1));



    }
}
