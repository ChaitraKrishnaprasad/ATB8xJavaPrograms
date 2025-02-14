package Java_Nov2024.MultiThreading_Part2;

class Lab204_ThreadLocal {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start(); // Start Thread-1
        try {
            t1.join(); // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        t2.start(); // Start Thread-2 after t1 completes

        try {
            t2.join(); // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread execution completed.");
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Simulate some work by making the thread sleep
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}



