package Java_Nov2024.Task_Nov;

import java.util.HashMap;

public class T4_FreequencyArrayeElements {
    public static void main(String[] args) {
        //Sample Array
        int [] array = {3,3, 3,4,5,6,7,7,8};

        //creating a hashmap to store a frequency of the array
        HashMap<Integer, Integer> frequencyArray = new HashMap<>();

        //Loop it through the array to iterate over a loop

        for(int i = 0; i<array.length; i++){
            int num = array[i];

            //if num already in the map increment its count
            if (frequencyArray.containsKey(num)) {
                frequencyArray.put(num, frequencyArray.get(num) + 1);
            }else{
                // If it's not in the map, add it with a count of 1
                frequencyArray.put(num,1);
            }
        }
        // Print the frequency of each element using a for loop
        for (Integer key: frequencyArray.keySet()){
            System.out.println("Element : " + key + "|" + " Frequency : "+ frequencyArray.get(key));
        }

    }
}
