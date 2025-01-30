package Java_Oct2024.ex_28102024_CollectionFrameWorkP1;

import java.util.ArrayList;
import java.util.List;

public class Lab176_ArrayList_InterviewQ {
    public static void main(String[] args) {
        List <Integer> I = new ArrayList();// we can fix the value with integer datatype with <>
       // List <int> I = new ArrayList();// int data type wont support in collections as it is primitive datatype
        I.add(123);
       // I.add("Chaitra");not able to add string as we fixed integer
        List <String> names = new ArrayList();
        names.add("Chaitra"); // Fixed String as names, coz no body name will be as other datatype
        //names.add(123);wecant do this

    }

}
