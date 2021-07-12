package collections;

public class PriorityQueue {

    public static void main(String[] args) {
        java.util.PriorityQueue<Double> priorityQueue = new  java.util.PriorityQueue<Double>();
        priorityQueue.offer(1.1);
        priorityQueue.offer(9.1);
        priorityQueue.offer(3.1);

        System.out.println("polling from queue: ");

        while (priorityQueue.size()>0){
            System.out.printf("item %s",priorityQueue.peek());
            priorityQueue.poll();

        }
    }
}
