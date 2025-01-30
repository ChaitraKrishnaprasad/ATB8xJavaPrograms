package Java_Sept2024.ex_23092024_ConditionalLoops_Switch;

public class Lab071_SwitchCondition3_JDK_Greaterthan13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001 -> // using arrow instead of colone we can eliminate using key word break; it is only in JDK>13
                System.out.println("It's a laptop!");
            case 002 ->
                System.out.println("It's a desktop");
            case 003, 004 ->
                System.out.println("It's a mobile phone");
            default-> System.out.println("Hello !!!");
        }
    }
}
