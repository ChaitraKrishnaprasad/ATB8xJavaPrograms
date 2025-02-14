package Java_Nov2024.MultiThreading_Part2.Synchronization_Ex1;

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