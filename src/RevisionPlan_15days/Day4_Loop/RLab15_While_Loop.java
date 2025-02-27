package RevisionPlan_15days.Day4_Loop;

public class RLab15_While_Loop {
    public static void main(String[] args) {
        int number = 12345;
        int rev= 0;
        System.out.println(number);
        while (number!=0){
            int digit = number % 10;
            rev = rev * 10+ digit;
            number = number/10;
        }
        System.out.println(rev);

    }
}
