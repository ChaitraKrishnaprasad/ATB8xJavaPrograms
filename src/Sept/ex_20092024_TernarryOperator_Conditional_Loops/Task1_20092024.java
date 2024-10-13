package Sept.ex_20092024_TernarryOperator_Conditional_Loops;

public class Lab065_TernaryOperator_Assignment2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;

        // Using ternary operators to find the maximum
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
//10>20 ? 10>45?10:45 : 20>45?20:45
        // Displaying the maximum value
        System.out.println("Max → a, b, c → " + max);
    }

}
