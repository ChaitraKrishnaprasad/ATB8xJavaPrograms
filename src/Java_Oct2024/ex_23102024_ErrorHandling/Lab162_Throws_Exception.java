package Java_Oct2024.ex_23102024_ErrorHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab162_Throws_Exception {
    public static void main(String[] args)  {
        extracted();
    }
//first method to use try catch to handle the exceptio
    private static void extracted()  {
        try {
            FileInputStream fileInputStream = new FileInputStream("c://asdfdf.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
//second method is to give exception in function - throws attach to function
//private static void extracted() throws FileNotFoundException {
//    FileInputStream fileInputStream = new FileInputStream("c://asdfdf.txt");