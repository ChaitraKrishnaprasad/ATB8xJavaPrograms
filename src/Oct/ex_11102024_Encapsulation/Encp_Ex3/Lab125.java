package Oct.ex_11102024_Encapsulation.Encp_Ex3;

public class Lab125 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100L);
        //amit.setBal(100000L);
        //System.out.println("Amit bal is "+ amit );
        boolean are_you_Admin = true;
        ICICIBank admin = new ICICIBank("admin", 1000L);
        admin.setBal(50000L, true);
        System.out.println(admin.getName());
    }
}
