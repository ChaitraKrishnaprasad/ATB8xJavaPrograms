package Sept.ex_18092024_TypeCasting;

public class Lab039_TypeCasting_interview_Q {
    public static void main(String[] args) {
        System.out.println('A' == 65); // ASCII value is 65 so it will be true
        short s = 10;
        char c = 'A';
        int result = s + c;
        System.out.println(result);//O/p should be 75 as s=10 and A of ASCII value is 65 when we cancatinate it will conver it as intgeral

    }
}

