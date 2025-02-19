package RevisionPlan_15days.Day4_Conditional_Loop;

import java.util.Scanner;

public class RLap009_IfElse_Conditional_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age -->");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote10]");
        }
    }
}
