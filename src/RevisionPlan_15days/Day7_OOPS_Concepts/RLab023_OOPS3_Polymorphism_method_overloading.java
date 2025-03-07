package RevisionPlan_15days.Day7_OOPS_Concepts;

import java.util.Map;
//Polymorphism means "many forms". It allows the same method to have different implementations.
//Type 1. Compile-time Polymorphism (Method Overloading)

public class RLab023_OOPS3_Polymorphism_method_overloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("1st parameter calling" + "  " +math.add(10, 20));// Calls first add() method
        System.out.println("2nd  parameter calling" + "  " +math.add(10, 10, 30));// Calls second add() method
    }

}
//add() method is overloaded with different parameters.
class MathOperations {
    int add(int a, int b) { //1st parameter
        return a + b;
    }

    int add(int a, int b, int c) { //2nd parameter
        return a + b + c;
    }
}