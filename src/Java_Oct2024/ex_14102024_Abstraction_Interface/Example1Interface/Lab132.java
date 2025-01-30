package Java_Oct2024.ex_14102024_Abstraction_Interface.Example1Interface;

public class Lab132 {
    public static void main(String[] args) {
        P p =new P();
        p.F1();

    }
}

class P implements I{

    @Override
    public void F1() {
        System.out.println("P is the interface");
    }
}

interface I{
    void F1();

}
