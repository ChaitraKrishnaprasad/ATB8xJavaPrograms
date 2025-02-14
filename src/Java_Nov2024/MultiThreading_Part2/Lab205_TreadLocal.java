package Java_Nov2024.MultiThreading_Part2;


public class Lab205_TreadLocal {
    public static void main(String[] args) {
        MyThreadLocalExample example = new MyThreadLocalExample();

        // Create two threads
        Thread t1 = new Thread(example::process, "Thread-1");
        Thread t2 = new Thread(example::process, "Thread-2");

        t1.start();
        t2.start();
    }
}
class MyThreadLocalExample {
    // Create a ThreadLocal variable
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public void process() {
        // Get the current thread's value
        int value = threadLocal.get();
        System.out.println(Thread.currentThread().getName() + " - Initial Value: " + value);

        // Modify the value
        threadLocal.set(value + 10);
        System.out.println(Thread.currentThread().getName() + " - Updated Value: " + threadLocal.get());
    }
}


