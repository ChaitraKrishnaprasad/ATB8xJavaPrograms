package RevisionPlan_15days.Day7_OOPS_Concepts;

import java.util.Scanner;

public class Reverse_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String data = sc.nextLine();

        // Using a loop to reverse the string
        String rev = " ";
        for (int i = data.length() - 1; i >= 0; i--)
        {
            rev += data.charAt(i);
        }

        System.out.println("Reversed string: " + rev);

        sc.close();
    }
}