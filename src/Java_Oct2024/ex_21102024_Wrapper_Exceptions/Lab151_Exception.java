package Java_Oct2024.ex_21102024_Wrapper_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab151_Exception {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked Exceptions // Means JVM knows
        FileInputStream file = new FileInputStream("c://a.txt");

        //unchecked Exception // Meams JVM Doesn't knows
        int a = 10;
        int c= a/0;
    }
}
