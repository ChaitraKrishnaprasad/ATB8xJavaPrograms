package Java_Oct2024.DailyOctTasks;

public class ex_02102024_t3_5objects {

    // Fields to store object properties
    long phone_number;
    String email;
    int age;
    int batch_8x;
    String name;

    // Methods to define object behaviors
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void practice() {
        System.out.println(name + " is practicing.");
    }

    public void dedication() {
        System.out.println(name + " is dedicated.");
    }

    public void concentration() {
        System.out.println(name + " is concentrating.");
    }

    public void result() {
        System.out.println(name + " has achieved results.");
    }

    public static void main(String[] args) {
        // Creating an object of the class
        ex_02102024_t3_5objects student1 = new ex_02102024_t3_5objects();

        // Assigning values to fields
        student1.phone_number = 1234567890L;
        student1.email = "student@example.com";
        student1.age = 37;
        student1.batch_8x = 8;
        student1.name = "Chaitra";

        // Calling methods on the object
        student1.study();
        student1.practice();
        student1.dedication();
        student1.concentration();
        student1.result();
    }
}

