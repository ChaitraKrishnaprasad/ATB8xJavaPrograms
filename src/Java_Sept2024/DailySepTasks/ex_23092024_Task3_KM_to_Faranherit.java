package Java_Sept2024.DailySepTasks;

public class ex_23092024_Task3_KM_to_Faranherit {
    public static void main(String[] args) {
        int choice = 1;  // Set the choice: 1 for km to miles, 2 for Fahrenheit to Celsius

        switch (choice) {
            case 1:
                // Kilometers to Miles conversion
                double kilometers = 5.0;  // Predefined kilometers value
                double miles = kilometers * 0.621371;  // Conversion factor
                System.out.println(kilometers + " km is equal to " + miles + " miles.");

            case 2:
                // Fahrenheit to Celsius conversion
                double fahrenheit = 98.6;  // Predefined Fahrenheit value
                double celsius = (fahrenheit - 32) * 5 / 9;  // Conversion formula
                System.out.println(fahrenheit + " F is equal to " + celsius + " C.");
                break;
            default:
                System.out.println("Invalid choice! Please use 1 or 2.");
        }
    }

}
