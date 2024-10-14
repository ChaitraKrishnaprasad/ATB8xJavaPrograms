package Sept.DailyTasks;

public class ex_23092024_Taks1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int operation = 1;
        int result;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition = " + result);

            case 2:
                result = num1 - num2;
                System.out.println("Subtraction = " + result);

            case 3:
                result = num1 * num2;
                System.out.println("Multiplication = " + result);

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }

            case 5:
                result = num1 % num2;
                System.out.println("Modulus = " + result);
                break; // Added break statement
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
}