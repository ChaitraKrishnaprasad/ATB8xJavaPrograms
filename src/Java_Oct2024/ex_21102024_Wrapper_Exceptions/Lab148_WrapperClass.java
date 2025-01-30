package Java_Oct2024.ex_21102024_Wrapper_Exceptions;

public class Lab148_WrapperClass {
    public static void main(String[] args) {
        //Non primitive data type to integer conversion is not possible.
        //By that time we can convert to wropper class and postwhich we can use the string as int.

        String num = "50";
        Integer a = Integer.valueOf(num);//autoboxing
        System.out.println(a);
        int a2 = a;// unboxing
        System.out.println(a2);
// Converting String to Primitive
        int a3 = Integer.parseInt(num);
        System.out.println(a3);
    }
}
