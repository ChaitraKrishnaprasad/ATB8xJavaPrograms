package RevisionPlan_15days.Day3_Operator;

import java.util.Scanner;

public class RLab007_Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ✅ Create Scanner object

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Using Ternary Operator
        int min = (a < b) ? a : b;
        System.out.println("The minimum value is: " + min);

        //Using If Statement
        int min1;
        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }
        System.out.println("IF Else Min"+min1);

        sc.close(); // ✅ Close Scanner to prevent resource leak
    }
}
