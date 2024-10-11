package Sept.ex_23092024_ConditionalLoops_Switch;

public class Lab0076_SwitchCondition_Concatination {
    public static void main(String[] args) {
        char ch = 'C';
        switch (ch){
            case 'A' + 1:
                System.out.println("B");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'A' + 2:
                System.out.println("C");
                break;
        }
    }
}
