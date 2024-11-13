package Sept.DailySepTasks;

public class ex_23092024_Task2_Switch_CorrespondingMonth {
    public static void main(String[] args) {

        //Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
        //Input  - 12
        //Out - Dec.

        int month = 10;  // Set the month number directly

        // Use switch statement to match the number to the corresponding month
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid month number! Please use a number between 1 and 12.");


        }

    }
}
