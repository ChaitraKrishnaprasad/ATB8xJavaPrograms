package Oct.ex_28102024_CollectionFrameWork;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab178_Vector {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5);//Thread safe
        mylist1.add("Chaitra");
        mylist1.add("Krishna");
        mylist1.add("Prasad");
        mylist1.add("Pruthvik");
        mylist1.add("Pruthvik");
        mylist1.add("Pruthvik");
        mylist1.add("Pruthvik");
        mylist1.add("Pruthvik");
        System.out.println(mylist1);


        Vector v = new Vector();
        v.add("Chait");
        v.add("Sunil");
        v.add("Pruthvi");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Chait"));
        System.out.println(v.lastIndexOf("Chait"));

        //Only Problem with Vector is Thread Safe, Synchronised.
        //Time will be consuming
        //one by one using and slower in process

    }
}
