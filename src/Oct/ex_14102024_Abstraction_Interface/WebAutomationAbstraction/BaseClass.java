package Oct.ex_14102024_Abstraction_Interface.WebAutomationAbstraction;

public class BaseClass extends GrandBaseClass {
    //Web Automation
    void openbrowser(String browser){

    }
    void closebrowser(String browser){

    }

    @Override
    void takingscreenshot() {
        System.out.println("Taking screenshot");
    }
}
