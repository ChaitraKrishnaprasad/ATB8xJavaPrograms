package Oct.ex_04102024_Constructor;

public class Lab113_person {
    public static void main(String[] args) {
        Person person = new Person();
        // Real thing class --> object
        person.name = "Chaitra";
        person.rollno = 123;
        person.hands = "Right";
        person.gender = "Female";

        Person person2 = new Person();
        // Real thing class --> object
        person2.name = "Sunil";
        person2.rollno = 143;
        person2.hands = "left";
        person2.gender = "Male";

    }

}