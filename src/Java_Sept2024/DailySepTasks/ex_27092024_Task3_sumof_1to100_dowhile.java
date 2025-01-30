package Java_Sept2024.DailySepTasks;

public class ex_27092024_Task3_sumof_1to100_dowhile {
    public static void main(String[] args) {

        //Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

        int sum = 0;
        int i = 1;
        do{
            //System.out.println(i);
           sum=sum+i;
            i++;
        }while(i<=100);
    System.out.println(sum);
    }
}
