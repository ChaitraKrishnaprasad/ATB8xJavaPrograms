package Oct.ex_14102024_Abstraction_Interface.Example1Interface;

public class Lab133 {
    public static void main(String[] args) {
        // Without creating implementation we can not create an object
//        ABC A1 = new ABC();
//        A1.F1();
//        A1.F2();
//        A1.F3();
//        A1.F4();
        xyz X = new xyz();
        X.display();

    }
}

class xyz {
    void display(){
        new ABC().F4();
    }
}

class ABC implements I1, I2{

    @Override
    public void F1() {
        System.out.println("F1 Interface");
    }

    @Override
    public void F2() {
        System.out.println("F2 Interface");
    }


    @Override
    public void F3() {
        System.out.println("F3 Interface");

    }

    @Override
    public void F4() {
        System.out.println("F4 Interface");

    }
}

interface  I1 {
    void F1();

    void F2();
}
interface  I2{
    void F3();
    void F4();
}
