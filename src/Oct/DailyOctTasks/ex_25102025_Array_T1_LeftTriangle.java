package Oct.DailyOctTasks;

import java.util.Scanner;

public class ex_25102025_Array_T1_LeftTriangle {
    public static void main(String[] args) {
        //*****
        //****
        //***
        //**
        //*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int n = sc.nextInt();

        for (int i = n; i>0; i--){
            for(int j = 0;j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }


    }
}
