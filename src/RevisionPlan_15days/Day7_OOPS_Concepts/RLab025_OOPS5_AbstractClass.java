package RevisionPlan_15days.Day7_OOPS_Concepts;
//Abstraction means hiding the implementation details and showing only the necessary functionality.
//
//Ways to Achieve Abstraction in Java
//Using Abstract Classes
//Using Interfaces
//Benefits of OOP in Java
//✔ Code Reusability – Inheritance allows reuse of existing code.
//        ✔ Data Hiding – Encapsulation keeps data secure.
//        ✔ Improved Readability & Maintainability – Code is structured and easier to understand.
//✔ Scalability & Flexibility – Polymorphism allows extending functionality without changing the existing

// Abstract class
//
//Key Points:
//The abstract method in the Animal class forces its subclasses to implement it.
//The regular method sleep() can be inherited by all subclasses without needing to implement it.
//You cannot create an object of the abstract class Animal directly because it contains abstract methods that are not implemented.
//

abstract class Animal1 {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass Dog
class Dog1 extends Animal1 {
    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Subclass Cat
class Cat1 extends Animal1 {
    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class RLab025_OOPS5_AbstractClass {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal1 myDog = new Dog1();
        Animal1 myCat = new Cat1();

        // Calling the sound method, which is different for each animal
        myDog.sound();  // Dog barks
        myCat.sound();  // Cat meows

        // Calling the sleep method, which is common for all animals
        myDog.sleep();  // This animal is sleeping.
        myCat.sleep();  // This animal is sleeping.
    }
}

