package Oct.ex_14102024_Abstraction_Interface.WebAutomationAbstraction;

public class ChromeBr extends BaseClass {
    @Override
    void openbrowser(String browser) {
        System.out.println("open the chrome");
    }

    @Override
    void closebrowser(String browser) {
        System.out.println("close the chrome");
    }
}
