package Oct.ex_23102024;

public class Lab158_interviewQ {
    public static void main(String[] args) {

        try {
            String s1 = "pramod";
            String a1 = args[0];
            int a = 10/0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of Program");

    }

}
