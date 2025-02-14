package RevisionPlan_15days.Day2_DataType;
//The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
//Hint: Java's Scanner.hasNext() method is helpful for this problem.
//Input Format
//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
//Output Format
//For each line, print the line number, followed by a single space, and then the line content received as input.
//       Sample Input
//
//Hello world
//I am a file
//Read me until end-of-file.
//        Sample Output
//1 Hello world
//2 I am a file
//3 Read me until end-of-file.

import java.util.Scanner;

public class RLab003_StringDT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linenumber = 1;

        while(sc.hasNext()){
            System.out.println(linenumber + "  " + sc.nextLine());
            linenumber++;
        }
        sc.close();
    }
}
