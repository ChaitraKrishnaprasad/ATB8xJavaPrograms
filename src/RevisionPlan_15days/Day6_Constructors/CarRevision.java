package RevisionPlan_15days.Day6_Constructors;

//public class RLab20_Constructor {

public class CarRevision { // Class names should start with uppercase
    String brand;
    String colour;
    int value;
    int mileage;
    String performance;

    // Default Constructor
    public CarRevision() {
        System.out.println("This is the default constructor");
    }

    // Parameterized Constructor
    public CarRevision(String b, String c) {
        brand = b;
        colour = c;
    }

    public CarRevision(String b, String c, int v, int m, String p) {
        this.brand = b;
        this.colour = c;
        this.value = v;
        this.mileage = m;
        this.performance = p;
    }

    // Display Method
    public void display() {
        System.out.println("Brand: " + brand + ", Colour: " + colour);
        System.out.println("Brand: " + brand + ", Colour: " + colour+ "Value: "+ value +"Mileage :" + mileage + "Perfomance :" + performance);

    }

    public static void main(String[] args) {
        CarRevision car1 = new CarRevision(); // Calls default constructor
        CarRevision car2 = new CarRevision("Toyota", "Red"); // Calls parameterized constructor
        car2.display(); // Displays values of car2

        CarRevision car3 = new CarRevision("TATA", "Red", 1000000, 25, "good" );
        car3.display();
    }
}

