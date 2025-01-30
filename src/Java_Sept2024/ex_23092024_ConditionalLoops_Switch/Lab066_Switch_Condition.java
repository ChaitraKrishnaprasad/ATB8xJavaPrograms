package Java_Sept2024.ex_23092024_ConditionalLoops_Switch;

public class Lab066_Switch_Condition {
    public static void main(String[] args) {
        //Switch supports byte, short, int , long (with the wrapper type), enums and String.
        // Syntax of switch
        //switch(expression) {
        //case statement1:
        //code
        //break; //(Optional)
        //case statement2:
        //code
        //break; // (Optional)
        //default statement:  // (Optional)
        //code
        //break; // (Optional)
        //}
        // Days 1 to 7 , Day 1 - mon, day2- tue, day3 -wed, day4 - thurs, day5-fri, day6-sat,day7-sun
        int day = 8;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter valid number");
                break;


        }
    }
}
