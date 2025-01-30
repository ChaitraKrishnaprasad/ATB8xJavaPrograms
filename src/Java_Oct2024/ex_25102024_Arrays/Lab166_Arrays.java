package Java_Oct2024.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab166_Arrays {
    public static void main(String[] args) {
        int [] marks_2 = new int[5];// assigning 5 in length
        marks_2[0] = 10;
        marks_2[1] = 20;
        marks_2[2] = 30;
        marks_2[3] = 40;
        marks_2[4] = 50;
        Arrays.sort(marks_2);

        int item = Arrays.binarySearch(marks_2, 30);
        System.out.println("Binary search item lacated in "+ item);



        System.out.println(marks_2.length);
        for (int i=0; i< marks_2.length; i++){
            System.out.println(marks_2[i]);
        }
}}
