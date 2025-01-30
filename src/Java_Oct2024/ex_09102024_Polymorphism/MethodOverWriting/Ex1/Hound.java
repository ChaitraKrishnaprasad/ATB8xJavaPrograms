package Java_Oct2024.ex_09102024_Polymorphism.MethodOverWriting.Ex1;

public class Hound extends Dog {

    @Override
    void bark(){
        super.bark();
        System.out.println("I am Hound, I will bark");
    }

}
