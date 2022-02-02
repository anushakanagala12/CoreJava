package com.string;
class ExampleMethod{
    void stringMethod(){
        //charAt() -> return the character value at given index
        methodCharAt();
        //String compareTo() -> method compares the given string with the current string in lexicographical way and it return +ve, -ve and equals
    }

    private void methodCharAt() {
        String name = "Anusha";
        for(int i=0; i<name.length();i++){
            System.out.println("Char at index - " + i + " is " + name.charAt(i));
            System.out.println("Char at even indexes");
            if(i%2==0){
                System.out.println("Char at index - " + i + " is " + name.charAt(i));
            }
        }

    }
}
public class StringMethodExample {
    public static void main(String[] args) {
        ExampleMethod em = new ExampleMethod();
        em.stringMethod();
    }
}
