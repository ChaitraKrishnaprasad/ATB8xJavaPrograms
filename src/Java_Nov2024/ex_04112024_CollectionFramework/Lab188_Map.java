package Java_Nov2024.ex_04112024_CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab188_Map {
    public static void main(String[] args) {
        // Map is a key value - unique
        //cannot have duplicate
        //map have one null value
        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();

        m1.put("name:", "Chaitra");
        m1.put("roll_no:", "1");
        m1.put("Phone:", "987654321");
        System.out.println(m1);

        m2.put("name:", "Chaitra");
        m2.put("roll_no:", "1");
        m2.put("Phone:", "987654321");
        System.out.println(m2);

        m3.put("name:", "Chaitra");
        m3.put("roll_no:", "1");
        m3.put("Phone:", "987654321");
        System.out.println(m3);

        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("1"));
        System.out.println(m1.containsValue("1"));
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        //System.out.println(m());

    }
}

