package Java_Nov2024.ex_04112024_CollectionFramework;

import java.util.PriorityQueue;

public class Lab187_Queue {
    public static void main(String[] args) {
        // Queue will be used 0.1% in automation
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");
        pq.offer("3");
        pq.offer("4");
        pq.offer("2");
        pq.offer("5");
        System.out.println(pq);
        System.out.println(pq.peek());// will see which element
        System.out.println(pq.poll()); // deleting the first element
        System.out.println(pq);

        System.out.println(pq.peek());// will see which element
        System.out.println(pq.poll()); // deleting the first element
        System.out.println(pq);
    }
}
