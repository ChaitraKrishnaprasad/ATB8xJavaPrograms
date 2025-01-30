package Java_Oct2024.DailyOctTasks;

public class ex_04102024_t1_person1 {
    public static void main(String[] args) {
        //Create a Person Class with 10 A, 5 Behavr( All types of Methods)
        // and use the DC and PC to set the values, Create 5 Objects.

        ex_04102024_t1_person person = new ex_04102024_t1_person();
        {

        }

        ex_04102024_t1_person person1 = new ex_04102024_t1_person("Chaitra", 34, 280384);
        {
            System.out.println("name : " + person1.name + " " + "age : " + person1.age + " " + "dob :" + person1.dob);

        }

        ex_04102024_t1_person person2 = new ex_04102024_t1_person("QA Engineer", "BE", 88);
        {
            System.out.println("designation : " + person2.designation + " " + "education : " + person2.education + " " + "marks :" + person2.marks);

        }

        ex_04102024_t1_person person3 = new ex_04102024_t1_person(75.3f, true, 15000, "Mysore");
        {
            System.out.println("percentage : " + person3.percentage + " " + "is_score : " + person3.is_score + " " + "salary :" + person3.salary + "place :" + person3.place);

        }
    }
}
