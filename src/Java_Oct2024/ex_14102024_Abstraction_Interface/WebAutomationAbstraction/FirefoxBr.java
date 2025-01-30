package Java_Oct2024.ex_14102024_Abstraction_Interface.WebAutomationAbstraction;

public class FirefoxBr extends BaseClass {

    @Override
    void openbrowser(String browser) {
        System.out.println("open the Firefox");
    }

    @Override
    void closebrowser(String browser) {
        System.out.println("close the Firefox");
    }
}
