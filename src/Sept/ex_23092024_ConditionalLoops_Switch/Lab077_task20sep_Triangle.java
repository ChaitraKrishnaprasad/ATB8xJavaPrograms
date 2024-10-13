
        // Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->
package Sept.ex_23092024_ConditionalLoops_Switch;

import java.util.Scanner;

public class Lab077_task20sep_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input. Side lengths must be positive.");
        } else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("These side lengths cannot form a triangle.");
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("This is an equilateral triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }

        scanner.close();
    }
}

