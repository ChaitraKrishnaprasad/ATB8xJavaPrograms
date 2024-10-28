package Sept.DailyTasks;

import java.util.Scanner;

public class ex_25092024_Task1_table_of_10 {
    public static void main(String[] args) {
        // Table of number n = 10, print table with For .
//        int n = 10;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n + " x " + i + " = " + (n * i));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number \n");
        int n = sc.nextInt();
        System.out.println("Multiplication of Number:");
        for (int i=1; i<=10; i++){
            System.out.println(n + "X" + i+ "=" + (n*i) );
        }
    }
}
