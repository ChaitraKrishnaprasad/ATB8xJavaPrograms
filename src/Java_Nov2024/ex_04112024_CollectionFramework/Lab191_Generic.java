package Java_Nov2024.ex_04112024_CollectionFramework;

public class Lab191_Generic {
    public static void main(String[] args) {
       temp(10);
       temp1("chaitra");
       temp2( "sunil"); // genric supporting string
       temp2( true); // genric supporting boolean
       temp2( 20); // genric supporting integer

    }

    public static void temp (Integer a){
        System.out.println(a); // only support a Integer
    }

    public static void temp1 (String a){
        System.out.println(a); // only support a String
    }
// Generic creation in the function <T> is the reference
    public static  <T> void temp2 (T a){
        System.out.println(a); //  supports any data type
          }
}
