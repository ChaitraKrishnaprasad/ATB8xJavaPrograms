package Java_Sept2024.ex_18092024_TypeCasting;

public class lab050_Assignment2_3_4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a-- + a--);  //9+9+8 = 26
        System.out.println(a); //a=7

        int a1 = 10;
        System.out.println(--a1 + a1++ + a1--); //9+9+10 = 28
        System.out.println(a1); // a1=9

        int a2 = 10;
        System.out.println(a2-- + a2--  + a2--); //10+9+8 = 27x
        System.out.println(a2);//a2=7
    }
}
