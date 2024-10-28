package Sept.ex_30092004_Functions;
//Parameter == Arguement
public class Lab104_UserDefined_Function {
    public static void main(String[] args) {
        // Without parameters and without Return Type
        function_type1();

        // Without parameters and with Return Type
        String name = fuction_type2();
        System.out.println(name);

        //With parameters and without Return type
        function_type3a("Pramod");

        //multiple arguments example
        int age = 38;
        function_type3a("ChaitraK", "Chaitra", age);

    }

    // Without parameters and without Return Type
    public static void function_type1(){
        System.out.println("Without parameters and without Return Type");
    }


    // Without parameters and with Return Type
    public static String fuction_type2(){
        System.out.println("Without parameters and with Return Type");
        return "pramod";
    }

    //With parameters and without Return type
    public static void function_type3a(String name1){
        System.out.println("With parameters and without Return type");
        System.out.println("You have shared "+ name1 );
    }

    //With parameters and without Return type we can pass multiple arguments
    public static void function_type3a(String name2, String firstame, int age) {
        System.out.println("With parameters and without Return type");
        int name1 = 10;
        System.out.println("You have shared " + name1);
    }
}

