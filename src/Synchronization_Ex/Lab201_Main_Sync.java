package Synchronization_Ex;

public class Lab201_Main_Sync  {
    public static void main(String[] args) throws Exception {
        Sync s1 = new Sync();
        Sync s2 = new Sync();
        A ta = new A(s1, "A");
        ta.start();
        B tb = new B(s2, "B");
        tb.start();


    }
}

