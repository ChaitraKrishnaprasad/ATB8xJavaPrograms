package Java_Nov2024.ex_04112024_CollectionFramework;

import java.util.HashSet;

public class Lab186_CF_SET_P2 {
    public static void main(String[] args) {
        //there is no indexation in set
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple");//duplicate are not allowed
        set.add(" ");//null can be added in hash set
        System.out.println("set elements are :"+set);
    }
}
