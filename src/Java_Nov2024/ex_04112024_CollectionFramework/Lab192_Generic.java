package Java_Nov2024.ex_04112024_CollectionFramework;

public class Lab192_Generic {
    public static void main(String[] args) {
        prints(1, true, "Chaitra");

    }

    public static <t1, t2, t3> void prints (t1 a, t2 b, t3 c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
