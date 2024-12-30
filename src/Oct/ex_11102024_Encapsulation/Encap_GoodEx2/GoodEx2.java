package Oct.ex_11102024_Encapsulation.Encap_GoodEx2;

public class GoodEx2 {
    private String username;
    private String password;

    public GoodEx2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed");
        }
    }
}
