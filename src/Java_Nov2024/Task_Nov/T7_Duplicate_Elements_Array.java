package Java_Nov2024.Task_Nov;

import java.util.HashSet;

public class T7_Duplicate_Elements_Array {
    public static void main(String[] args) {

        //Duplicate Elements of an Array
        //int[] numbers = {1, 2, 3, 4, 5, 1, 2};  o/p →  1,2

        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        //hashset to store unique elements
        HashSet<Integer> Seen = new HashSet<>();
        HashSet<Integer> Dupl = new HashSet<>();

        // For loop to array
        for (int i = 0; i < numbers.length; i++){
            if (!Seen.add(numbers[i])){
                Dupl.add(numbers[i]); // If already in set, it's a duplicate
            }
        }

        //Print the duplicate element
        System.out.println("Duplicate element are :"+Dupl);

    }
}
