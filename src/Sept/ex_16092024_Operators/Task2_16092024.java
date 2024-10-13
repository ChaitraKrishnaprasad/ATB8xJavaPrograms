package Sept.ex_16092024_Operators;

public class Lab037_Assignment_16092024_1 {
    public static void main(String[] args) {
        int a = 10; // assigning the value to variable
        boolean b = (10 == 11); // comparing the value from one to another
        System.out.println(a);
        System.out.println(b);
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