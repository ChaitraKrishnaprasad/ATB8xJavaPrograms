package Oct.ex_11102024_Encapsulation.Access_Modifier.Police;

public class Cop {
    private int gun;
    private String id_card;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot(){
        System.out.println("Yes, you can!");
    }
}
