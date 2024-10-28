package Sept.DailyTasks;
//Create a Java program that prints the first 5 even numbers using a do-while loop.
public class ex_27092024_Task2_first5even_dowhile {
    public static void main(String[] args) {
        int i = 0;
        int n = 2;
        do{
            System.out.println(n);
            n+= 2;
            i++;
        } while(i<5);
    }
}
