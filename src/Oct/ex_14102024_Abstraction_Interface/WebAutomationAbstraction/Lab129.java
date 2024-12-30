package Oct.ex_14102024_Abstraction_Interface.WebAutomationAbstraction;

public class Lab129 {
    public static void main(String[] args) {
        ChromeBr C = new ChromeBr();
        C.openbrowser("Chrome");
        C.closebrowser("Chrome");
        C.takingscreenshot();

        FirefoxBr F =new FirefoxBr();
        F.openbrowser("Firefox");
        F.closebrowser("Firefox");
        F.takingscreenshot();
    }
}
