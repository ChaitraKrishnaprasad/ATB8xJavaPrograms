package Java_Nov2024.Task_Nov;

import java.util.HashMap;

public class T5_FrequencyArray {
    public static void main(String[] args) {
//        Find the Frequency of Each Element in an Array ( Hashmap)
//
//        Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};   O/p 2→ 3 , 3 → 2 , 4→ 2,  5→ 3

        int [] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i<numbers.length; i++){
            int num = numbers[i];
            if (frequencyMap.containsKey(num)){
                frequencyMap.put(num, frequencyMap.get(num)+1);
            }
            else{
                frequencyMap.put(num, 1);
            }

        }
        for (Integer key: frequencyMap.keySet()){
            System.out.println(key + "->" + frequencyMap.get(key));
        }

    }
}
