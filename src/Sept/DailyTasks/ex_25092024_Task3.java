package Sept.DailyTasks;

public class ex_25092024_Task3 {
    public static void main(String[] args) {
        //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        //
        //        // n = 1 ->  Fact = 1*1 -> 1
        //
        //        // n = 3 -> Fact = 3*2*1 -> 6

        int fact =1;
        for (int i = 1; i<=5; i++){
            fact*=i;
        }
        System.out.println("Factorial of 5 is " + fact);
    }
}
