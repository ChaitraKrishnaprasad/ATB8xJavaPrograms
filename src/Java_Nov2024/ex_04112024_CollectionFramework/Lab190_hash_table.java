package Java_Nov2024.ex_04112024_CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab190_hash_table {
    public static void main(String[] args) {
        //map is legecy class, synchronise in nature and slow in process

    Hashtable <Integer,String> hst = new Hashtable<>();
    hst.put(10, "Awesome");
    hst.put(1, "Jaishree Ram");
    hst.put(2, "Jaishree Krishna");
        System.out.println(hst);

        //Null value is not posible

        //For Iteration we required to use Enumeration
        Enumeration <Integer> e = hst.keys();
        while(e.hasMoreElements()){
           // System.out.println(e.nextElement()); // to print key id's
            System.out.println(hst.get(e.nextElement())); // to print key values
        }


    }
}
