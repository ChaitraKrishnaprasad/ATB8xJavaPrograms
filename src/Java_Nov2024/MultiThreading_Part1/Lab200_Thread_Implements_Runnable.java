package Java_Nov2024.MultiThreading_Part1;

public class Lab200_Thread_Implements_Runnable {
    //Example for Implementing Runnable Interface

        public static void main(String[] args) {
            Thread t1 = new Thread(new MyRunnable());
            t1.start();  // Start the thread
        }
    }


class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}
