package Synchronization_Ex;

class B extends Thread {
    Sync s;

    public B(Sync s, String tname) {
        super(tname); // Set thread name
        this.s = s;
    }

    public void run() {
        s.m2();
    }
}

