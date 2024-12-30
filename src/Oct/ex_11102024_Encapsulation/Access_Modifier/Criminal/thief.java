package Oct.ex_11102024_Encapsulation.Access_Modifier.Criminal;

import Oct.ex_11102024_Encapsulation.Access_Modifier.Police.Cop;

import java.sql.SQLOutput;

public class thief {
    public static void main(String[] args) {

        Cop c = new Cop(10);
       // System.out.println(c.gun);;
        // when the Cop class is private , we cant access Gun
      //  c.canIshoot();

    }
}
