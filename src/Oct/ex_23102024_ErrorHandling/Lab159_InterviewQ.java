package Oct.ex_23102024_ErrorHandling;

public class Lab159_InterviewQ {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10/a;
        } catch (Exception e) {
            System.out.println("Div by Zero");
        } finally {
            System.out.println("I will be executed any how!!");
        }

    }
}
