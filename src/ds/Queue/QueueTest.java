package ds.Queue;

import ds.Queue.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue queue =new Queue();
        queue.enqueue(1);
        queue.print();
        System.out.println();
        queue.enqueue(1);
        queue.print();
        System.out.println();
        queue.dequeue(1);
        queue.print();
        System.out.println();

    }

}
