package Java_Oct2024.ex_16102024_StaticKeyWord;

public class Lab140_Enum {
    public static void main(String[] args) {
        System.out.println(APIconstraintsEndpoints.BASE_URL.getName());
        System.out.println(APIconstraintsEndpoints.LOGIN_PAGE.getName());
        System.out.println(APIconstraintsEndpoints.DASHBOARD_PAGE.getName());
        System.out.println(APIconstraintsEndpoints.CHATBOAT_PAGE.getName());
    }
}

//Store API Constraints - END Points
enum APIconstraintsEndpoints{
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/Login"),
    DASHBOARD_PAGE("https://app.vwo.com/dashboard"),
    CHATBOAT_PAGE("https://app.vwo.com/chat");

    private String name;

    APIconstraintsEndpoints(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}