package Java_Oct2024.ex_09102024_Inheritance.HasA;

public class Car {
    //HasA relationship
    public void start_car(){
        new Engine().Start();
        new Tyre().rolling();
    }


}
