package RevisionPlan_15days.Day7_OOPS_Concepts;

//Explanation:
// Type 2: Run-time Polymorphism (Method Overriding)
//The Car class overrides the run() method of the Vehicle class.
//The method that gets executed is determined at runtime.

public class RLab024_OOPS4_Polymorphism_method_overriding {
    public static void main(String[] args) {
        Carr mycar = new Carr();
        mycar.run();
    }
}
class vehicle{
    void run(){
        System.out.println("My vehicle is running");
    }
}

class Carr extends vehicle{
    @Override
    void run() {
        super.run(); // if I give super method here both parent and child data will be displayed, If i remove super
        // only child data will be displayed means overridden data will be displayed
        System.out.println("My car id running");
    }
}
