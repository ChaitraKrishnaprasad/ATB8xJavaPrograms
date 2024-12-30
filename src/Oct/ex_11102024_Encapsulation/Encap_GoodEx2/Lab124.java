package Oct.ex_11102024_Encapsulation.Encap_GoodEx2;

public class Lab124 {
    public static void main(String[] args) {

        //after using getter setter the following fuctions can be accessable
        GoodEx2 goodex = new GoodEx2( "goodadmin", "pass@123");
        System.out.println(goodex.getPassword());

        //Checking
        boolean isAdmin = false;
        goodex.setPassword("pass@111", isAdmin);// setting the new password
        System.out.printf(goodex.getPassword());

    }
}
// Encapsulation is added when we make function as private and setting getter and setter