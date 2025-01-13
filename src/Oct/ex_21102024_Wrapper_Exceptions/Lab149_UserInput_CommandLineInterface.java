package Oct.ex_21102024_Wrapper_Exceptions;

public class Lab149_UserInput_CommandLineInterface {
    public static void main(String[] args) {

        System.out.println("Start the Program");
        String ip = args[0];
        String ip1 = args[1];
        String ip2 = args[2];
        String ip3 = args[2];//ArrayIndexOtofBoundsException
        System.out.println(ip);
        System.out.println(ip1);
        System.out.println(ip3);
    }
}
