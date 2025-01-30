package Java_Oct2024.DailyOctTasks;

public class ex_16102024_String_T1 {
    public static void main(String[] args) {
//        Calculate the length of the String -
//        without using the length() function. String name =”Pramod”; →  6 , CharArray, for loop
        String name = "Chaithra";

        char[] charArray = name.toCharArray();
        int length=0;
        for (char c: charArray){
            length++;
        }
        System.out.println("The length of the name: "+name + " is "+length);

    }
}
