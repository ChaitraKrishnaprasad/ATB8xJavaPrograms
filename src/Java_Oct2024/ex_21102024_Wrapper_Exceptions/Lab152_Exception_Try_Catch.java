package Java_Oct2024.ex_21102024_Wrapper_Exceptions;

public class Lab152_Exception_Try_Catch {
    public static void main(String[] args) throws Exception {
        int c = 0;
        try {
            c = 10/0;
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
