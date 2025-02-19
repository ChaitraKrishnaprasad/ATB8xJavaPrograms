package Java_Oct2024.ex_23102024_ErrorHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab160_Unchecked_Vs_Checked {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Unchecked");
        }

        try {
            FileReader f = new FileReader("c:\\abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Checked");
        }


    }
}
