package RevisionPlan_15days.Day4_Loop;

public class RLab13_While_Statement {
    public static void main(String[] args) {
        //calculating sum of 1 to 10
        int i = 0;
        int sum = 0;
        while (i <= 10){
            sum += i;
            i++;
            System.out.println(i);
        }
        System.out.println(sum);

    }
}
