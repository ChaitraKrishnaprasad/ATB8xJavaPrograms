package Synchronization_Ex;

class A extends Thread {
    Sync s;

    public A(Sync s, String tname) {
        super(tname); // Set thread name
        this.s = s;
    }

    public void run() {
        s.m1();
    }
}