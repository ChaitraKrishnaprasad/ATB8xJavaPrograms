package Oct.ex_18102024_String;

public class Lab144_StringFunctions {
    public static void main(String[] args) {
        String str = "Hello World";
        //Length Function
        System.out.println("Length: "+ str.length());

        //Substring
        System.out.println("Substring: "+ str.substring(0,5));

        //Case Conversion
        System.out.println("Uppercase: "+ str.toUpperCase());
        System.out.println("Lowercase: "+ str.toLowerCase());

        System.out.println(str.charAt(1)); // value that saved in 0,1,2,3,4,'
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l"));
        System.out.println(str.concat("!"));
        System.out.println(str.intern());
        String s = "chaitra";
        System.out.println(String.format(s));
        String name = "    Chaitra";
        String name1 = "ChaitrA";
        System.out.println(name.compareTo(name1));
        System.out.println(name.strip());
        System.out.println();
        name.strip();// remove white space


    }
}
