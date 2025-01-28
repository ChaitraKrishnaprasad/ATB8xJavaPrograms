package Oct.ex_30102024_CollectionFrameWorkP2;

import java.util.Stack;

public class Lab182_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Chaitra");
        s.add("Sunil");
        System.out.println(s);

        Stack Book = new Stack();
        Book.push("Python");
        Book.push("Java");
        Book.push("C#");
        System.out.println(Book);
        System.out.println(Book.pop());// by automatically LIFO C# will go
        System.out.println(Book);
        System.out.println(Book.peek());// to see which is the last element
        Book.add(2,"Selenium");// inserting the element with the index number
        System.out.println(Book);
        Book.remove(1);
        System.out.println(Book);

        // If you want to store a data 1 by 1 as link one above another then use data structure Stack - LIFO pricipal
        // If you want to do more insertion and deletion then use data structure LinkedList
        // If you want to access easily  then use data structure ArrayList
    }
}
