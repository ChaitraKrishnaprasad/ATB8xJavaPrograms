package Java_Sept2024.ex_18092024_TypeCasting;

public class Lab042_TypeCasting2 {
    public static void main(String[] args) {
        int Course = 100;
        float GST = 18.45f;
        //int total_price = Course + GST; Narrowing - Implicit - JVM _ Invalid
        //float total_price = Course + GST; // Narrowing - Implicit - JVM _ Valid
        int total_price = Course + (int)GST; // Narrowing - Explicit - JVM _ Valid - Loss of data
        System.out.println(total_price);

    }
}
