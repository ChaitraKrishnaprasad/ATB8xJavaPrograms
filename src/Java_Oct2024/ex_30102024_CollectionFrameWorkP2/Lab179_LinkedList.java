package Java_Oct2024.ex_30102024_CollectionFrameWorkP2;

import java.util.LinkedList;

public class Lab179_LinkedList {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
       // List mylist = new LinkedList(); we can do Dynamic Dispatch also for using List coz Linkedlist is a complete class
        // we can do dynamic dispatch
        //duplicate is allowed


        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);

        System.out.println(mylist);
    }
}
