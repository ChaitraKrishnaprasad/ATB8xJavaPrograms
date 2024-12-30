package Oct.ex_11102024_Encapsulation.Encp_BadEx1;

public class Lab123 {
    public static void main(String[] args) {
        VMLogin VMOLogin= new VMLogin("admin", "password123");
        System.out.println(VMOLogin.password);
        VMOLogin.password= "hacker";
        System.out.println(VMOLogin.password);

    }
}
