package Oct.ex_21102024_Wrapper_Exceptions;

import Sept.ex_16092024_Operators.Lab022_Airthmatic_Operator;

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
