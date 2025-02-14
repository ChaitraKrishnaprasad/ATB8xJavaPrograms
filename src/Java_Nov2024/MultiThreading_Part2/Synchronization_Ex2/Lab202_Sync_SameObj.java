package Java_Nov2024.MultiThreading_Part2.Synchronization_Ex2;

public class Lab202_Sync_SameObj {
        public static void main(String[] args) throws Exception {
            Sync s = new Sync(); // Shared Sync object
            A ta = new A(s, "A");
            ta.start();
            B tb = new B(s, "B");
            tb.start();
        }
    }


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


class Sync {
    synchronized void m1() { // Synchronizing method
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " - m1 - " + i);
            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupt status
            }
        }
    }

    synchronized void m2() { // Synchronizing method
        Thread th1 = Thread.currentThread();
        for (int i = 101; i <= 105; i++) {
            System.out.println(th1.getName() + " - m2 - " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException ex) {
                System.out.println("Thread interrupted: " + ex.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupt status
            }
        }
    }
}