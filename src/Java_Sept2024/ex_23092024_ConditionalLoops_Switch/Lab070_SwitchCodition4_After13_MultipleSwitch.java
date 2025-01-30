package Java_Sept2024.ex_23092024_ConditionalLoops_Switch;

public class Lab070_SwitchCodition4_After13_MultipleSwitch {
    public static void main(String[] args) {
        int itemcode = 010;
        switch (itemcode){
            case 005, 004, 007:
                System.out.println("All are  electronic Gadget");
                break;
            case 006, 003:
                System.out.println("All are  Mechanical Gadget");
                break;
            default:
                System.out.println("All are not electronic or mechanical Gadget");
                break;
        }
    }
}
