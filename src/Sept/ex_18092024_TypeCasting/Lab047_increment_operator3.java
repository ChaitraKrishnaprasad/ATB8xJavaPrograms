package Sept.ex_18092024_TypeCasting;

import javax.management.MBeanAttributeInfo;

public class Lab047_increment_operator3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
    }
}

//11 + 11 + 12 = 34 n12