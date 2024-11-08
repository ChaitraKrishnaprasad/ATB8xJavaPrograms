package Oct.ex_04102024_Constructor;

public class Lab111_Constructor {
    // Constructor is a special method which is invoked automatically at the time of object creation
    //It has the same name as the class name
    //It has no return type
    // main purpose of the constructor is to initialise the instance variable value
    //2 types of constructor are there 1) Default Constructor & 2) Parameterized Constructor
//    Default constructor (gives default values)
//    Parameterized constructor (lets us set values when we create the object)

    String name;
    int age;

    // Default constructor
    Lab111_Constructor() {
        name = "Unknown"; // Default name
        age = 0;          // Default age
    }

    // Parameterized constructor
    Lab111_Constructor(String name, int age) {
        this.name = name; // Set name to given value
        this.age = age;   // Set age to given value
    }

    public class Main {
        public static void main(String[] args) {
            // Using the default constructor
            Lab111_Constructor person1 = new Lab111_Constructor(); // person1 name = "Unknown", age = 0
            System.out.println("Name: " + person1.name + ", Age: " + person1.age);

            // Using the parameterized constructor
            Lab111_Constructor person2 = new Lab111_Constructor("Alice", 25); // person2 name = "Alice", age = 25
            System.out.println("Name: " + person2.name + ", Age: " + person2.age);
        }
    }
}


