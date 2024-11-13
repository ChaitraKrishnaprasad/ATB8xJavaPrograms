package Oct.ex_09102024_Inheritance.Hierarchical;

public class Lab117 {
    public static void main(String[] args) {
        Father F = new Father();
        F.home();
       // System.out.println("\n");

        son1 s1 = new son1();
        s1.son_1();
        s1.home();
 //       System.out.println("\n");

        son2 s2 = new son2();
        s2.son_2();
        s2.home();
    //    System.out.println("\n");

        Daughter1 d = new Daughter1();
        d.daughter();
        d.home();
    //    System.out.println("\n");


    }
}
