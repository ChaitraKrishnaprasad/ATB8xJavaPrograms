package Java_Nov2024.Task_Nov;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class T2_Hashtable_HashMap {
    public static void main(String[] args) {
        //What is a Hashtable in Java, and how does it differ from HashMap?
//        Differences Between Hashtable and HashMap
//        Hashtable 🏛️
//        1) Thread Safety✅ Yes (Synchronized)
//        2) Performance	❌ Slower (Because of synchronization)
//        3) Allows null Key? ❌ No (NullPointerException)
//        4) Allows null Values?❌ No
//        5) Best Used For - Multi-threaded applications
        //6) it wil be in order
//        HashMap 🚀
//        Hashtable 🏛️
//        1) Thread Safety❌ No (Use Collections.synchronizedMap() if needed)
//        2) Performance	✅ Faster
//        3) Allows null Key? ✅ Yes
//        4) Allows null Values?✅ Yes
//        5) Best Used For - General-purpose applications needing fast lookups
        //6) it wont print in order

        //Creating a HashTable
        Hashtable<Integer, String> table = new Hashtable<>();

        //adding key value pairs
        table.put(10, "Biscuit");
        table.put(20, "Coffee");
        table.put(30, "Snacks");
//        table.put(null, "extra"); //java.lang.NullPointerException // null is not allowed in hash table
//        table.put(40, "null"); //java.lang.NullPointerException

        //Iterating the Hash table
        for (Map.Entry<Integer, String> entry : table.entrySet()){
            System.out.println("Key : " + entry.getKey() + " " + "Value : " + entry.getValue());
        }

        //Creating hashmap
        HashMap<Integer, String> map = new HashMap<>();

        // adding key value to hash map
        map.put(1, "Apple");
        map.put(2, "banana");
        map.put(3, "mango");
        map.put(4, "null");
        map.put(null, "pinapple");

        //Printing the hashmap
        System.out.println("hashmap : "+ map);

        // Accessing the value
        System.out.println("Value for 3 : "+ map.get(3));
        System.out.println("Value for 4 : "+ map.get(4));

        //Removing the entry
        map.remove(1);
        System.out.println("removed key 1:" + map);


    }
}
