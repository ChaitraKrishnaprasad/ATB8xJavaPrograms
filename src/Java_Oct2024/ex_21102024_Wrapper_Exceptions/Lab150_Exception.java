package Java_Oct2024.ex_21102024_Wrapper_Exceptions;

public class Lab150_Exception {
    public static void main(String[] args) {
        System.out.println("Start the program");
        String ip = args[0];//25 - ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip);//NumberFormatException
        int b = 1000/a;//ArthmeticException
        System.out.println(b);
        System.out.println("End the program");
    }
}
