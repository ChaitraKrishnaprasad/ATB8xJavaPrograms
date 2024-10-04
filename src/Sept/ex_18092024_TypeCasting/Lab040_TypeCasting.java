package Sept.ex_18092024_TypeCasting;

public class Lab040_TypeCasting {
    public static void main(String[] args) {
        //Type Casting - Source and Destination conversion
        //Type Casting - 2 types - Widening - Implicit and Explicit - lossless
        //Type Casting - 2 types - Narrowing - Implicit and Explicit - with data type, loss

        //Widening Ex
        byte b  =  10;
        int a = b; //valid - Implicit Casting JVM
        int a1 = (int) b; // valid Explicit casting - JVm

        //Narrowing Ex
        int val = 300;// 32 bite stored
       // byte b1 = val; Invalid Implicit casting - JVM cant store int into byte
        byte b2 = (byte) val; // Invalid Explicit casting - JVM - Loss of data -  only will consider only 8 bite so value printed as 44

        System.out.println(b2);


    }
}
