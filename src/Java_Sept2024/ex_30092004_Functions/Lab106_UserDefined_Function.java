package Java_Sept2024.ex_30092004_Functions;
//Parameter == Arguement
public class Lab106_UserDefined_Function {
    public static void main(String[] args) {
        // Without parameters and without Return Type
        function_type1();

        // Without parameters and with Return Type
        int age = function_type2();
        System.out.println(age);

        //With parameters and without Return type
        function_type3("Amit");

        //With parameters and with Return type
        int result = function_type4(3,5);
        System.out.println(result);

    }

    // Without parameters and without Return Type
    public static void function_type1(){

        System.out.println("Without parameters and without Return Type");
    }


    // Without parameters and with Return Type
    public static int function_type2(){
        System.out.println("Without parameters and with Return Type");
        return 65;
    }

    //With parameters and without Return type
    public static void function_type3(String name){
        System.out.println("With parameters and without Return type");
        System.out.println("You have shared --> "+ name );
    }

    //With parameters and with Return type
    //static int ()
    static int function_type4 (int a, int b){
        System.out.println("With parameters and with Return type");
        return a+b;
    }
}

