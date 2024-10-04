package Sept.ex_18092024_TypeCasting;

public class Lab041_TypeCasting1 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //shor s1 = phone_no;//Narrowing - Implicit - JVM //Invalid
        short s1 = (short)phone_no;// Narrowing - Explicit - Loss //Invalid
        System.out.println(s1); //5866 is the O/P some of the data is loss
    }
}
