package Java_Nov2024.MultiThreading_Part1;

public class Lab194_Generic {
    //Created <T> as generic data type

    public static <T> void temp(T a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        temp(13);
        temp(1.3);
        temp(1.33F);
        temp("Generic");
    }


}
