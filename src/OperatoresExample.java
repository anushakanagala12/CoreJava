public class OperatoresExample {

    public static void main(String[] args) {

        // Operator -> to perform operations
        // UNARY OPERATORS -> it need only one operand to perform any operation
        //Post increment ex: a++ -> first it will save the value and does the increment
        int age =20;
        System.out.println("post-increment - " + age++);
        //age = 20

        //Post decrement ex: a-- -> first it will save the value and does the decrement
        System.out.println("post-decrement - " + age--);
        //age =21

        //Pre-increment ex: ++a -> it first does the increment and save the value
        System.out.println("pre-increment - " + ++age);
        //age =21

        //Pre-decrement ex: --a -> it first does the decrement and save the value
        System.out.println("pre-decrement - " + --age);
        //age = 20

        //ARTHMETIC OPERATORS -> add, sub, mul, div

        int a = 20;
        int b = 32;
        System.out.println("Addition = " + (a+b));

        System.out.println("Subtraction = " + (a-b));

        System.out.println("Multiplication = " + (a*b));

        System.out.println("Division = " + (a/b));

        //Shift operators
        // Right operators
        int c = 10;
        int d = 2;
        System.out.println("right shift - " + (c>>d)); // its uses the right shift = 10>>2 = 10/2^2 = 10/4 = 2

        //Left operators
        System.out.println("left shift - " + (c<<d)); // its uses the right shift = 10<<2 = 10*2^2 = 10*4 = 40

        //Relational Operators -> (<,>,<=,>=,==,!=)
        int e = 26;
        int f = 34;
        System.out.println("Less than = " + (e<f));
        System.out.println("Greater than = " + (e>f));
        System.out.println("Less than equal to = " + (e<=f));
        System.out.println("Greater than equal to = " + (e>=f));
        System.out.println("Equals to = " + (e==f));
        System.out.println("Not equals to = " + (e!=f));

        //Assignment operators -> (=, +=, -=, *=, /=)
        int g = 12;
        int h = 15;
        g += h;
        System.out.println("Addition = " + g);
        g -= h;
        System.out.println("sub = " + g);
        g *= h;
        System.out.println("mul = " + g);
        g /= h;
        System.out.println("div = " + g);

        // Bit-wise operators -> (&, |, ^)
        int i = 10;
        int j = 20;
        System.out.println(i&j);
        // if we have true value for both then it will return true, 10 is 1010 and 20 is 10100
        //                                                                         10 is 01010
        //                                                                      result - 00000

        System.out.println(i|j);
        // if we have 0 value for both then it will return 0 otherwise 1, 10 is 1010 and 20 is 10100
        //                                                                               10 is 01010
        //                                                                            result - 11110
        System.out.println(i^j);

        // if we have 0 value for both then it will return 0 otherwise 1, 10 is 1010 and 20 is 10100
        //                                                                               10 is 01010
        //                                                                            result - 11110


        // Logical operator -> (&&, ||)
        //return value boolean variable
        int k = 10;
        int l = 20;

        System.out.println((k<l)&&(l<k));
        //if both conditions are true then it will return true

        System.out.println((k<l)||(l<k));
        //if any condition is true then it will return true

        //Ternary Operator or conditional operators
        int m = 43;
        int n = 32;

        int result = (m>n)?m:n;
        System.out.println(result);

    }
}
