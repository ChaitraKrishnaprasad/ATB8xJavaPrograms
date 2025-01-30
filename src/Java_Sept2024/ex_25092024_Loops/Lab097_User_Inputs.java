package Java_Sept2024.ex_25092024_Loops;

import java.util.Scanner;

public class Lab097_User_Inputs {
    public static void main(String[] args) {
        // how to take a user input
        Scanner sc = new Scanner(System.in); // new is a object, scanner is a class
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println(name);

    }
}
