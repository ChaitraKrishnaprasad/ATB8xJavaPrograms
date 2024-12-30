package Oct.ex_11102024_Encapsulation.SuperKeyWord.RealtimeEx;

public class BaseClass {

    private String browser;

    BaseClass() {
        System.out.println("DC -- BaseClass");
    }

    BaseClass(String b){
        System.out.println("CC -- BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browsername, boolean isAuth) {
        if (isAuth){
            this.browser= browsername;
        }else{
            System.out.println("Not allowed");
        }
        this.browser = browsername;
    }

    void openBrowser(){
        System.out.println("Open Browser!!!");
    }
    void closeBrowser(){
        System.out.println("Close Browser!!!" );
    }
}
