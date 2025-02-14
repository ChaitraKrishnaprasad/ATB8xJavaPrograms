package Java_Nov2024.MultiThreading_Part2.Synchronization_Ex1;

public class Sync {
    synchronized void m1() { // Synchronizing method
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " - m1 - " + i);
            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
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
            }
        }
    }
}
