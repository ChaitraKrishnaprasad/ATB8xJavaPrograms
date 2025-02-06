package Java_Nov2024.Task_Nov;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class T1_Iterate_over_a_Map {
    public static void main(String[] args) {
        //How do you iterate over a Map in Java?
        //Create a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        //Iterating using entrySet() for each loop
        System.out.println("Using entrySet, for each loop");
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("Key " + entry.getKey() + " " + "Value " + entry.getValue());
        }

        //Iterating using keyset() for each loop
        System.out.println("Using keySet, for each loop");
        for (String key : map.keySet()){
            System.out.println("Key " + key);
        }
        //Iterating using valueSet() for each loop
        System.out.println("Using valueSet, for each loop");
        for (Integer value : map.values()){
            System.out.println("Value " + value);
        }

        //Iterating using while loop
        System.out.println("Using while loop");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key "+ entry.getKey() + " " + "Value "+ entry.getValue());
        }



    }
}
