package Java_Nov2024.Task_Nov;

import java.util.HashSet;

public class T6_Duplicate_Elements_Array {
    public static void main(String[] args) {

        //Duplicate Elements of an Array

        int [] num = {1, 2, 3, 4, 5, 6, 2, 3, 7, 8, 8};
        //hashset to store unique elements
        HashSet<Integer> S = new HashSet<>();
        HashSet<Integer> D = new HashSet<>();

        // For loop to array
        for (int i = 0; i < num.length; i++){
            if (!S.add(num[i])){
                D.add(num[i]); // If already in set, it's a duplicate
            }
        }

        //Print the duplicate element
        System.out.println("Duplicate element are :"+D);

    }
}
