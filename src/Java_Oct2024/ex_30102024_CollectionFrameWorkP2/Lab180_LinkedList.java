package Java_Oct2024.ex_30102024_CollectionFrameWorkP2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab180_LinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList(); // in link list all the data will be stored in different locations,
        //however all the elements will be linked each other.
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");
        System.out.println(l);

        ArrayList l2 = new ArrayList();//In array list all the elements stored with same location, one to another.x
        l2.add("Node 1");
        l2.add("Node 2");
        l2.add("Node 3");
        System.out.println(l2);
    }
}
