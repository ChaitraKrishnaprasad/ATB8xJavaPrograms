package Java_Oct2024.ex_21102024_Wrapper_Exceptions;

public class Lab153_Exception_Try_Catch {
    public static void main(String[] args) throws Exception {
        int c = 0;
        try {
            c = 10/c;
            String s1 = null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("End");
    }
}
