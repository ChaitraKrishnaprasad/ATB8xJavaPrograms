package Oct.DailyOctTasks;

import java.util.Scanner;

public class ex_25102025_Array_T2_Pyramidpattern {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****
        // *******
        //*********

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int n = sc.nextInt();
       // System.out.print('\t');

        for (int i = 0; i<n; i++){
            for(int j = 0;j<n-i-1; j++){
                System.out.print(' ');
            }
            for(int k=0; k<2*i+1; k++)
            {
                System.out.print('*');
            }
            System.out.println();
        }


    }
}
