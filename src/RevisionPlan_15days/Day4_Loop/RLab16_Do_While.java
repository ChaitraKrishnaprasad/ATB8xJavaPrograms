package RevisionPlan_15days.Day4_Loop;

public class RLab16_Do_While {
    public static void main(String[] args) {
        // Rev number
        int num = 56789;
        int rev= 0;
        System.out.println(num);
        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        } while(num!= 0);
        System.out.println(rev);

    }
}
