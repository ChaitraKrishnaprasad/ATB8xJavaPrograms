package RevisionPlan_15days.Day7_OOPS_Concepts;
//Explanation:
//
//Dog class extends the Animal class.
//Dog inherits the eat() method from Animal.
//Dog also has its own method bark().

//Inheritance allows a class (child/subclass) ex Dog class below to inherit properties and methods
// from another class (parent/superclass) Animal class. It helps in code reusability.

public class RLab022_OOPS2_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();// Inherited method from Animal parent class
        dog.bark();// calling Method from Dog child class
    }
}

class Animal{
    void eat(){
        System.out.println("Animal is parent class");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Am dog so i will bark , this is child class");
    }
}