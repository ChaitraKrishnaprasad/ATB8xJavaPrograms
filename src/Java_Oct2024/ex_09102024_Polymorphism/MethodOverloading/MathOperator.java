package Java_Oct2024.ex_09102024_Polymorphism.MethodOverloading;

public class MathOperator {
    //Method Overloading
    int add (int a, int b){

        return a+b;
    }

    String add (String a, String b){

        return a+b;
    }

    void add (int a, int b, int c){

        System.out.println("Hello its 3 operator");
    }

    double add(double a, double b){

        return a + b;
    }

    double add(double a, double b, float c){

        return a+b+c;
    }

}
