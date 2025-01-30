package Java_Sept2024.ex_13092024_DataType;
//Literals - the constant value
public class Lab017_Literals {
    public static void main(String[] args) {
        //Literals
        Boolean is_married= true;
        Boolean is_amit_married = false;
//cross verify  using rapid convertion table
        int age = 78; //Integer type - Literal - Decimal System
        int binary_num = 0b01010; //->binary literal// 10 is decimal
        int octal = 0101; //0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65
        int hex = 0Xface; // base 16 colour combination are in hex// in salenium we will use ths for colour code for button

        //Character literals
        //1. Single Character literals
        char c1 = 'A'; // can store character capital letter
        char c2 = 'a'; // can store character small letter
        char c3 = '@';// can store special character

        //2. Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Chaitra" + new_line + "Krishnaprasad");
        System.out.println("Chaitra" + tab_line + "Krishnaprasad");
        System.out.println("Chaitra" + back_space + "Krishnaprasad");
        System.out.println("Chaitra" + car_r + "Krishnaprasad");

    }
}
