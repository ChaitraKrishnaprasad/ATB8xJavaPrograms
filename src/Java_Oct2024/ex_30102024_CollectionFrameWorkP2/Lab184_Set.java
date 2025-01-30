package Java_Oct2024.ex_30102024_CollectionFrameWorkP2;

import java.util.*;

public class Lab184_Set {
    public static void main(String[] args) {
        //set does not allow duplicate
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Chaitra");
        hs.add("Chaitra");//duplicate is not allowed
        hs.add("chaitra");//lower case change and check
        hs.add("dhaitra");
        System.out.println(hs);
    }
}
