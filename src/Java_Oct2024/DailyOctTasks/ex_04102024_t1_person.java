package Java_Oct2024.DailyOctTasks;

public class ex_04102024_t1_person {
    //Create a Person Class with 10 A, 5 Behavr( All types of Methods)
    // and use the DC and PC to set the values, Create 5 Objects.

    String name;
    int age;
    int dob;
    String designation;
    String education;
    int marks;
    float percentage;
    boolean is_score = true;
    long salary;
    String place;

    public ex_04102024_t1_person(){
        System.out.println("this is DC");
    }

    public ex_04102024_t1_person(String name, int age, int dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public ex_04102024_t1_person(String designation, String education, int marks){
        this.designation = designation;
        this.education = education;
        this.dob = marks;
    }

    public ex_04102024_t1_person(float percentage,boolean is_score, long salary, String place)
    {
        this.percentage = percentage;
        this.is_score = is_score;
        this.salary = salary;
        this.place = place;
    }


}
