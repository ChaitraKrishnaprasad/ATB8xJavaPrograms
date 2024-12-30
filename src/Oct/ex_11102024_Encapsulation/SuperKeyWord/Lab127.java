package Oct.ex_11102024_Encapsulation.SuperKeyWord;

public class Lab127 {
    // Java reference variable that allows
    //1 Sub class(Child class has reference to parent class)

    // 1. We can access - Super with Variables
    // 1. We can access - Super with Methods
    // 1. We can access - Super with Constructor
    public static void main(String[] args) {
        Car c = new Car();

    }
}

//void display1(){

//}

class Car extends vehicle{
    private int maxSpeed = 281;

    void display(){
        System.out.println("Child");
    }

    Car(){
        super(10);
        System.out.println("DC CAR");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxspeed);
        this.display();// it will call own display. Child
        super.Display();// it will call parent display
    }



}
// Method Overloading
class vehicle{
    public int maxspeed = 180;

    void Display(){
        System.out.println("parent");
    }

    vehicle() {
        System.out.println("DC Vehicle");
    }

    vehicle(int a) {
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("hello Vehicle");
    }

    void message(int a) {
        System.out.println("hello Vehicle!!!");
    }
}
