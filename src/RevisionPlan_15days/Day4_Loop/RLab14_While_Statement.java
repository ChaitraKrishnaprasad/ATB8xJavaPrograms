package RevisionPlan_15days.Day4_Loop;

import java.util.Scanner;

public class RLab14_While_Statement {
    public static void main(String[] args) {
        //Multiplication table of given no
        // Multiplication table of a number
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int m = sc.nextInt(); // The number for which the multiplication table is generated
        int i = 1;

        // Loop to print the multiplication table
        while (i <= 10) {
            System.out.println(m + " x " + i + " = " + (m * i)); // Print the multiplication result
            i++;
        }
    }
}

