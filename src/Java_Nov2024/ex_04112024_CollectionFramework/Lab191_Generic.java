package Java_Nov2024.ex_04112024_CollectionFramework;

public class Lab191_Generic {
    public static void main(String[] args) {
       temp(10);
       temp1("chaitra");
       temp2( "sunil"); // genric supporting string
       temp2( true); // genric supporting boolean
       temp2( 20); // genric supporting integer

        //Generic we have used in Mathfunction using different data type
        Math.max(1,2); // int
        Math.max(1.2,2.4); // double
        Math.max(1.23f,2.45f); // float
        Math.max(332435454,234353554);//long




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
