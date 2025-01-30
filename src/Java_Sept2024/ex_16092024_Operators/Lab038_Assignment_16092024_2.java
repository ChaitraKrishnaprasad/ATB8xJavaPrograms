package Java_Sept2024.ex_16092024_Operators;

public class Lab038_Assignment_16092024_2 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        int c = b + a; // b+c will store in integer as it is big and airthamatic operator are there so
        System.out.println(c);

        char a1 = 'A'; // convert into ASCII value that is 65
        System.out.println(a1);// always will take a character
        char b1 = 'B';//convert into ASCII value that is 66
        int c1 = b1 + a1;// when we concatination of 2char it will leads to int part
        System.out.println(c1);
    }
}

/* 1. Difference between = and  ==?

= (Assignment Operator): This is used to assign a value to a variable.
EX: x = 5, the value 5 is assigned to the variable x.

== (Equality Operator): This is used to compare two values to check if they are equal.
EX: x == 5, it evaluates to true if x is equal to 5, and false otherwise.

2. byte b = 10; long l = 10l; → How much Byte will be used.

byte b = 10;: A byte in Java occupies 1 byte (8 bits) of memory.
long l = 10l;: A long in Java occupies 8 bytes (64 bits) of memory.

3. Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c, What is the data type it will give in result.

The expression b + c results in an int.

4. short s = 10;

        char c = 'A'; //65

        int ss = s+c;

        System.out.println(ss);

Output: 75*/