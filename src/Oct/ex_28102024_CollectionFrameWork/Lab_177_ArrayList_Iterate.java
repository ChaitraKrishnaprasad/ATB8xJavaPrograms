package Oct.ex_28102024_CollectionFrameWork;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_177_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Chaitra");
        mylist.add("Krishna");
        mylist.add("Prasad");

        System.out.println("To Print in Arraylist -1");

        for (String str : mylist){
            System.out.println(str);
        }

        System.out.println("To Print in Arraylist -2");

        for (int i = 0; i<mylist.size(); i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("To Print in Arraylist -3");
        //Iterator
        Iterator <String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
