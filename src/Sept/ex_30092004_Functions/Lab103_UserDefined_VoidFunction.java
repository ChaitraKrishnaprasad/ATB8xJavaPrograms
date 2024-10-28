package Sept.ex_30092004_Functions;
//Parameter == arguments
//1. Without paramenter and without return type - ex: void function

public class Lab103_UserDefined_VoidFunction {
    public static void main(String[] args) {
        greet();
        greet();
        greet();
        greet();
        greet();

    }
    // No return type and no argument
    //Define the user defined function
    // There are 2 types of function - 1. Prebuilt function- Math.max()
    //2. User defined / created function - defining and calling
    public static void greet()
    {
        System.out.println("Hi");
    }
}
