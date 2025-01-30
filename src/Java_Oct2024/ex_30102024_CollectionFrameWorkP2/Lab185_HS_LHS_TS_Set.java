package Java_Oct2024.ex_30102024_CollectionFrameWorkP2;

import java.util.*;

public class Lab185_HS_LHS_TS_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();//Hashing mechanism is used to store the elements - no order
        hs.add("apple");
        hs.add("mango");
        hs.add("orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add("null");
        System.out.println(hs);

        Set lhs = new LinkedHashSet();//maintains the order
        lhs.add("apple");
        lhs.add("mango");
        lhs.add("orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add("null");
        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.contains("apple"));

        Set ts = new TreeSet();//natural sorting will done, null cant be added
        ts.add("apple");
        ts.add("mango");
        ts.add("orange");
        ts.add("watermelon");
        ts.add("watermelon");
        System.out.println(ts);
        System.out.println("--------using for loop");
        for (Object o: ts){
            System.out.println(o);
        }

        System.out.println("--------using Iterator");
        Iterator I = ts.iterator();
        while(I.hasNext()){
            System.out.println(I.next());
        }

    }
}
