package Java_Nov2024.MultiThreading_Part1;

public class Lab199_Thread_ClassThread_Interface {
// Example for Extending Thread Class
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            t1.start();  // Start the thread
        }
    }


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}
