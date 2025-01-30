
        // Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->
package Java_Sept2024.ex_23092024_ConditionalLoops_Switch;

import java.util.Scanner;

public class Lab077_task20sep_Triangle_userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lengths side1:");
        double side1 = sc.nextDouble();

        System.out.println("Enter the lengths side2:");
        double side2 = sc.nextDouble();

        System.out.println("Enter the lengths side3:");
        double side3 = sc.nextDouble();

       // if (side1 <= 1 && side2 <= 1 && side3 <= 1) {
            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Equilateral");
            } else if (side1 == side2 || side1 == side3 || side2 == side1) {
                System.out.println("isosceles");
            } else {
                System.out.println("scalene ");
            }

//            {
//                System.out.println("Are you mad! negative values will not be considered");
//            }
        //}

    }
}