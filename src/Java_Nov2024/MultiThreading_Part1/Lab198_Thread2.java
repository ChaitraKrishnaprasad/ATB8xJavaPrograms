package Java_Nov2024.MultiThreading_Part1;

public class Lab198_Thread2 {
    public static void main(String[] args) {

        // No order in this case we cant identify which thread is printing w or w1 or main funtion

        Runnable w1 = new workerthread1();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new workerthread1();
        Thread t2 = new Thread(w1);
        t2.start();


//            for (int i = 0; i<5; i++){
//                try{
//                    System.out.println(Thread.currentThread().getName());
////                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }


    }
}

// Thread create by class
class workerthread1 implements Runnable{

    @Override
    public void run() {
            for (int i = 0; i<5; i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
