package Java_Oct2024.ex_30102024_CollectionFrameWorkP2;

import java.util.ArrayList;
import java.util.List;

public class Lab183_List {
    public static void main(String[] args) {
        student s1 = new student("Chaitra", 1);
        student s2 = new student("Anil", 2);
        student s3 = new student("Jeevan", 3);
        student s4 = new student("Sarosh", 4);
        student s5 = new student("Anuj", 5);

        List<student> mystudents = new ArrayList<>();
        mystudents.add(s1);
        mystudents.add(s2);
        mystudents.add(s3);
        mystudents.add(s4);
        mystudents.add(s5);
        System.out.println(mystudents);
        System.out.println("--------------------------");
        //System.out.println(PrintStudents);


    }
}

class student{
    String name;
    Integer roll_no;


    public student(String name, Integer roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(Integer roll_no) {
        this.roll_no = roll_no;
    }

    // this override method will be use to print object with proper format, it will help to print in proper manner
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';

        // if you need you can write a methos also
//        public String PrintStudents() {
//            return "student{" +
//                    "name='" + name + '\'' +
//                    ", roll_no=" + roll_no +
//                    '}';
//    }
}}