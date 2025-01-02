package Oct.ex_16102024_StaticKeyWord;

public class Lab137 {
    public static void main(String[] args) {
        ATB s1 = new ATB("Suraj");
        ATB s2 = new ATB("Amit");
        ATB s3 = new ATB("Tushar");
        ATB s4 = new ATB("Balam");
        ATB s5;
        new ATB("Pramod");

        s1.readDocument();
        s2.readDocument();
        ATB.doAssignment();

    }
}

class ATB{
    {
        System.out.println("IIB");
        //Purpose of code
        //here you can write code related to
        //start website
        //Web orr Api automation
        System.out.println("reading from CSV file");
    }
    static {
        System.out.println("Load the class, i will execute");
    }
private String name;
private String phone;
static String courseName = "ATB8x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ATB.courseName = courseName;
    }

    public ATB(String name) {
        this.name = name;
    }
    void readDocument(){
        System.out.println("Non static Method");
    }

    static void doAssignment(){
        System.out.println("Do assignment");
    }
}
