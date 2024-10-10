package Sept.ex_23092024_ConditionalLoops_Switch;

public class Lab068_Switch_Condition2_RealUseCase {
    public static void main (String [] args)
    {
        // In Web automation - I will ask your which browser you want me to run the code
        // Chrome - execute Chrome, Firefox - execute with firefox, edge - execute with edge
        String browser = "opera" ;
        //"Chrome", "Edge" ; "Firefox";
        switch (browser){
            case "Chrome":
                System.out.println("Starting with Chrome");
                break;

            case "Edge":
                System.out.println("Starting with Edge");
                break;

            case "Firefox":
                System.out.println("Starting with Firefox");
                break;

            default:
                System.out.println("No idea which browser it is");
                break;
        }



    }

}
