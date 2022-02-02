public class VariableExample {
    int age = 25;
    static float  marks = 99;
    public static void main(String[] args) {
        // Variable --> name to the memory location, hold a value in the memory

        // Types of Variables
        // Local variable -> used inside the method and accessed within the method
        String name = "Anusha" ;
        System.out.println(name);

        // Instance variable -> it is outside the class and accessed through the object
        VariableExample ve = new VariableExample();
        System.out.println(ve.age);

        //Static variable -> Outside a method, no object is used
        System.out.println(marks);
    }
}
