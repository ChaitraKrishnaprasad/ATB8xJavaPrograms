package RevisionPlan_15days.Day5_Functions;

public class RLab019_Functions1 {
    public static void main(String[] args) {

        wrt(); // Calls method without parameters and without return type

        String name = withrt(); // Calls method without parameters and with return type
        System.out.println(name);

        withpawr("chaitra k"); // Calls method with parameters and without return type

        String result = withparret("pruthvi", 8); // Calls method with parameters and with return type
        System.out.println(result);
    }

    // Without parameters and without Return Type
    public static void wrt() {
        System.out.println("Without parameters and without return type");
    }

    // Without parameters and with Return Type
    public static String withrt() { // Changed return type to String
        System.out.println("Without parameters and with return type");
        return "Chaitra"; // Returning a string
    }

    // With parameters and without Return Type
    public static void withpawr(String s1) {
        System.out.println("With parameters and without return type: " + s1);
    }

    // With parameters and with Return Type
    public static String withparret(String name, int age) { // Changed return type to String
        System.out.println("With parameters and with return type");
        return name + " " + age; // Returning a concatenated string
    }
}
