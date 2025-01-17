package Oct.ex_23102024_ErrorHandling;

public class Lab155_ExceptionHandling {
    public static void main(String[] args) {
        //Exception : it interrupts in between of program
        //two types of exception :checked/unchecked
        int a = 0;
        try {
            int c = 10/a; //ArithmeticException
            System.out.println(c);
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always execute");
        }
        }

    }
