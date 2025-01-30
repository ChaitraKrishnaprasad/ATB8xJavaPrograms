package Java_Oct2024.ex_21102024_Wrapper_Exceptions;

public class Lab147_WrapperClass {
    public static void main(String[] args) {
        //primitive to Wrapper class
        int a = 10;
        Integer b = a;
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        //Converting Integer class to int
        Integer a2 = 20;
        int value = a2;// unboxing or removing the wrapper class
        System.out.println(value);

    }
}