package Sept.ex_23092024_ConditionalLoops_Switch;
// if we not used break statement, how does O/p will come
//It will display all the statement
public class Lab067_Switch_Condition1 {
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
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Please enter valid number");
        }
    }
}
