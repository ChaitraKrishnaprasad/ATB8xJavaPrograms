package Sept.ex_18092024_TypeCasting;

public class Lab043_Increment_Decrement_Operator {
    public static void main(String[] args) {
        // Pre increment
        int a = 10;
        int b = ++a;
        System.out.println(b);

        int aa = 100;
        System.out.println(++aa);
        System.out.println(aa);

        //Post increment

        int s = 20;
        int a_post = s++;
        System.out.println(a_post);

        int ab_post = 25;
        System.out.println(ab_post++);
        System.out.println(ab_post);
    }
}
