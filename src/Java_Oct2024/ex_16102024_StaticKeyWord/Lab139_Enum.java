package Java_Oct2024.ex_16102024_StaticKeyWord;

public class Lab139_Enum {
    public static void main(String[] args) {
        System.out.println(colour.Red.getHexcode());
        System.out.println(colour.Green.getHexcode());
    }
}

enum colour{
    Red("#FF0000"),
    Green("#61FF33"),
    Blue("#3377FF");

    private final String hexcode;

    private colour (String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexcode(){
        return this.hexcode;
    }
}
