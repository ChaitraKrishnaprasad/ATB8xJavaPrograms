package Java_Nov2024.MultiThreading_Part1;

public class Lab195_Generic {
    public static void main(String[] args) {
        Test <Integer> i = new Test <Integer> (5);
        System.out.println(i.getObj());

        Test <Double> i1 = new Test <Double> (5.4);
        System.out.println(i1.getObj());

        Test <Float> i2 = new Test <Float> (5.45F);
        System.out.println(i2.getObj());

        Test <String> i3 = new Test <String> ("Generic Example");
        System.out.println(i3.getObj());

    }

}

class Test <T>{

    T obj;

    Test(T obj) {
        this.obj = obj;
    }


    public T getObj() {
        return obj;
    }
}