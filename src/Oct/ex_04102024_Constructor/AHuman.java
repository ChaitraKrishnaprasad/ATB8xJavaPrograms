package Oct.ex_04102024_Constructor;

public class AHuman {
    String eye_colour;
    String names;
    long aadhar_card_number;

    // Default Constructor
    AHuman() {
        System.out.println("I will be called as the function");
        // Can write code here
    }
// Parameterized constructor
    AHuman(String names) {
        System.out.println("Hi I am Param constructor");

    }

    // Methods representing behaviors
    void walk() {
        System.out.println("No Return Type | No argument");
    }

    int talk() {
        System.out.println("Return Type with No Argument");
        return 10;
    }

    String sleep(String names) {
        System.out.println("Sleeping");
        System.out.println("Return Type with Argument");
        return "I am sleeping";
    }

    void eat(String names) {
        System.out.println("Eat");
        System.out.println("No Return Type with Argument");
    }

    public static void main(String[] args) {
        // Creating an object of the AHuman class
        AHuman person = new AHuman();

        // Setting values for fields
//        person.eye_colour = "Brown";
//        person.names = "Chaitra";
//        person.aadhar_card_number = 1234567890L;

        // Calling methods
        person.walk();
        person.talk();
        person.sleep(person.names);
        person.eat(person.names);
    }
}
