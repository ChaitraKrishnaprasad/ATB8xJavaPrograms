package Java_Nov2024.MultiThreading_Part2.Syncronization_Ex3;

    class Counter {
        private int count = 0;

        // Synchronized method to make it thread-safe
        synchronized void increment() {
            count++;
        }

        synchronized int getCount() {
            return count;
        }
    }

public class Lab203_Sync_method  {
        public static void main(String[] args) throws InterruptedException {
            Counter counter = new Counter();

            // Create two threads to increment the counter
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });

            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });

            // Start the threads
            t1.start();
            t2.start();

            // Wait for threads to finish
            t1.join();
            t2.join();

            // The result should be 2000 because the method is synchronized
            System.out.println("Final count: " + counter.getCount());
        }
    }


