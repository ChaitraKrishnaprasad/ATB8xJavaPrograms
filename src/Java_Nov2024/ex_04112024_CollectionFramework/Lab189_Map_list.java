package Java_Nov2024.ex_04112024_CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Lab189_Map_list {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap<>();
        student1.put("name :", "Chaitra");
        student1.put("rollno :", "123");
        student1.put("Phoneno :", "45465665");
        System.out.println(student1);

        HashMap<String, String> student2 = new HashMap<>();
        student2.put("name :", "Pruthvik");
        student2.put("rollno :", "3434");
        student2.put("Phoneno :", "546547576");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }
}
