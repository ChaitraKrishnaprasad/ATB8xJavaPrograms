package Oct.DailyOctTasks;

import java.sql.SQLOutput;

public class ex_14102024_Abstract_Interface {
    public static void main(String[] args) {
        // Dynamic dispatch with 2 classess object is used
        book myBook = new printMyBook("Harry Potter", "J.K. Rowling",100);
        System.out.println(myBook.getDetails());
    }
}

//Book class which has an abstract method getDetails(),name, author, price.
//PrintMyBook class that inherits from the Book class.
//abstract
//Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
// Output
//"Harry Potter, J.k. Rowling, 100"

//Abstract class
abstract class book{
    private String name;
    private String author;
    private double prince;

    //Constructor
    public book(String name, String author, double prince) {
        this.name = name;
        this.author = author;
        this.prince = prince;
    }
//Getter
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrince() {
        return prince;
    }
    //Abstract method to get book details
    abstract String getDetails();
}
//extends class
class printMyBook extends book{
//constructor
    public printMyBook(String name, String author, double prince) {
        super(name, author, prince);
    }
//implementing the abstract method
    @Override
    public String getDetails() {
        return getName()+", "+getAuthor()+", "+(int) getPrince();

        //OR
        //void getDetails(){
//        System.out.println(getName());
//        System.out.println(getAuthor());
//        System.out.println(getDetails());
    }
}
