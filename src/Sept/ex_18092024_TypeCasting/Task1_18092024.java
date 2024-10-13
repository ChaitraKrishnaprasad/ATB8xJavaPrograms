package Sept.ex_18092024_TypeCasting;

public class Lab049_Assignment1 {
    public static void main(String[] args) {

        //Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
        //Widening
        int s =  10;
        float a = 20.567f;
        float a1 = s + a; // valid Explicit casting - JVm
        System.out.println(a1);

        //Narrowing Ex
        int x = 50;// 32 bite stored
        float y = 54.234f;
        // byte s1 = x + y; Invalid Implicit casting - JVM cant store int into byte
        int b2 =  x + (int) y; // Invalid Explicit casting - JVM - Loss of data -
        System.out.println(b2);


    }
}
