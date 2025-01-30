package Java_Oct2024.ex_09102024_Inheritance.SingleInheritance_ex1;

public class son extends Father {
// to access father class we need to add extend keyword
    void bhk3(){
        System.out.println("3bhk");

        //Attribute of Father class using Extend keyword

        System.out.println(gold_f);

        //Behaviour of Father class using Extend keyword

        bhk2();
    }

}
