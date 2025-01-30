package Java_Oct2024.DailyOctTasks;

public class ex_16102024_String_T2 {
    public static void main(String[] args) {
        //Reverse the String without using the any functions. (for loop)
        String name = "Chaitra";

        for(int i = name.length()-1; i>=0; i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
