package Java_Oct2024.ex_14102024_Abstraction_Interface.InterviewQ;

public class Lab134 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        a.stop();
        a.car();


    }
}

class A implements I3{

    @Override
    public void start() {
        I3.super.start();
    }

    @Override
    public void stop() {
        System.out.println("Stop it");
    }

    @Override
    public void car() {
        System.out.println("Review it");

    }
}

interface I3{
    default void start(){
        System.out.println("Start!! Default Void can have body in interface");
    }

    void stop();
    void car();
    static void ss(){
        System.out.println("Life!!!? Static Void can have body in interface");
    }
}
abstract class AA{
    void f1(){
        System.out.println("concrete methods");
    }

    abstract void f2();

    static void f3(){
        System.out.println("Abstract yes");
    }
}
