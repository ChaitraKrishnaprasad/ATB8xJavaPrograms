package Java_Oct2024.ex_18102024_String;

public class Lab145_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String name = "Chaitra";
        name ="Chaithra";
        System.out.println(name);

        //final class builder
        StringBuffer StringBuffer = new StringBuffer("Chaitra");
        StringBuffer.append("Krishnaprasad");
        System.out.println(StringBuffer);

        StringBuilder StringBuilder = new StringBuilder("Chaitra");
        StringBuilder.append("Sunil");
        System.out.println(StringBuilder);
    }
}
