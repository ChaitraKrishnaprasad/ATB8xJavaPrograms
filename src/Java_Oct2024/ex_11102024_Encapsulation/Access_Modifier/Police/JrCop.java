package Java_Oct2024.ex_11102024_Encapsulation.Access_Modifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop JCop = new Cop(20);
        //System.out.println(JCop.gun); It is not accessable as in Cop class is private.
        // When we change private to protected then we can access the class which is in same folders
        JCop.canIshoot();
    }
}
