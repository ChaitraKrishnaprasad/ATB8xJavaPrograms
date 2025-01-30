package Java_Oct2024.ex_23102024_ErrorHandling;

public class Lab157_ExceptionHandling_MultiCatch_OR {
    public static void main(String[] args) {
        int b = 0;//ArithmeticException
        try {
            String ip = args[0];//ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);//NumberFormatExcepion
            b = 1000/a;
        } catch (ArithmeticException|NumberFormatException|ArrayIndexOutOfBoundsException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }


    }
}
