package Java_Nov2024.Task_Nov;

import java.util.ArrayList;
import java.util.Collections;

public class T3_ReverseArrayList {
    public static void main(String[] args) {
        //How do you reverse an ArrayList in Java?
        //Creating Array List
        ArrayList<String> list = new ArrayList<>();
        list.add("Sunil");
        list.add("Advith");
        list.add("Venki");
        list.add("Pruthvi");
        list.add("Chaitra");

        //Printing array list
        System.out.println("Array List :" + list);

        //Reversing the Array list
        Collections.reverse(list);

        //Printing reversable array list
        System.out.println("Reverable Array List :"+ list);


    }
}
