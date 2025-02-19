package RevisionPlan_15days.Day4_Conditional_Loop;

import java.util.Scanner;

public class RLab010_If_ElseIf {
//    Program: Check If a Number is Positive, Negative, or Zero
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check the value : ");
    int N = sc.nextInt();

    for (int i = 0; i<=N; i++){
        System.out.println("Enter the number to check :");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("Entered number is positive + ");
        } else if (num<0) {
            System.out.println("Entered number is Negative - ");
        }
        else {
            System.out.println("Entered number is Zero");
        }
    }
    sc.close();
}

}
