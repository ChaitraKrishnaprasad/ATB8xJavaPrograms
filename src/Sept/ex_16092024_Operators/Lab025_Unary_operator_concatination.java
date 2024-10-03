package Sept.ex_16092024_Operators;

public class Lab025_Unary_operator_concatination {
    public static void main(String[] args) {
        String first_name = "Chaitra";
        String last_name = "Krishnaprasad";
        //Concatenation Operator +
        //+ int + int = it will do the Math
        // + String --> Combine them  --> Concat

        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b);
        System.out.println(first_name + last_name + (a + b));//if we keep them in the bracket then it will consider the a+b as integral type
        System.out.println(a + b + first_name + last_name );


    }
}
