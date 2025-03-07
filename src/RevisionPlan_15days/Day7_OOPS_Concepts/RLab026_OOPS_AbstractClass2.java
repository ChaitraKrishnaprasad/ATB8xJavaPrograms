package RevisionPlan_15days.Day7_OOPS_Concepts;
//In this example:
//
//We will create an abstract class Vehicle that contains an abstract method start(), which will be implemented by its subclasses Car and Bike.
//We'll also define a regular method stop(), which will be common for all vehicles.
public class RLab026_OOPS_AbstractClass2 {
    public static void main(String[] args) {
        // Create objects of Car and Bike

        vehicles mycarz = new carz();
        vehicles mybike = new bike();
//Call the start() method for both objects
        mycarz.starts();// My Car is starting from Key
        mybike.starts();// My bike is stating from kick
        // Call the stop() method for both objects (common method)

        mycarz.stop();// Vehicle is stopping.
        mybike.stop();// Vehicle is stopping.
    }
}
// Abstract class Vehicle
abstract class vehicles{
    // Abstract method (does not have a body)
    abstract void starts();
    // Regular method
    void stop(){
        System.out.println("Vehicle is stopping");
    }
}

//Subclass
class carz extends vehicles{
    // Providing implementation for the abstract method

    @Override
    void starts() {
        System.out.println("My Car is starting from Key");
    }
}
// Subclass Bike

class bike extends vehicles{
    // Providing implementation for the abstract method

    @Override
    void starts() {
        System.out.println("My bike is stating from kick");
    }
}