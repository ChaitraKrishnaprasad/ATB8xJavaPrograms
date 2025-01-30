package Java_Oct2024.ex_28102024_CollectionFrameWorkP1;

import java.util.ArrayList;
import java.util.List;

public class Lab174_List {
    public static void main(String[] args) {
        // List list = new list(); cant create a object for Interface - As list is an interface
        List list = new ArrayList();// need to create a object for an interface we need to add arraylist
        list.add("bread");//then it will be accessable
        list.add("butter");
        list.add("milk");
        list.add("panner");
        list.add("jam");
        list.add("Cheese");
        //System.out.println(list);//print the list
        System.out.println(list.size());// print the size of list
      //  System.out.println(list.contains(1));//means is 1 is there is list as integer/ not there coz in list there in String format
        System.out.println(list.contains("bread"));//True coz 1 string is there
        System.out.println(list.indexOf(2));//find the first occurance of the elements
        System.out.println(list.lastIndexOf(3));//find the last occurance of the elements
        System.out.println("-----------");
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("-----------for each loop");
//        for (Object o: list) { // For each loop ony come in collection of framework and object
//            System.out.println(o);
        }
    }


