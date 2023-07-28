package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args){
        /*
        Queue
            - mutable
            - First In First Out

        PriorityQueue
            - Sorted
            - not allow Null value
        */

        //Comparator <String> customComparator = Comparator.reverseOrder();
        //PriorityQueue<String> q = new PriorityQueue<>(customComparator);
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("banana");
        q.add("orange");
        q.add("grape");
        q.add("apple");
        //System.out.println(q.poll()+" "+q.peek());
        //System.out.println(q);
        //q.remove();
        //System.out.println(q);
        while (!q.isEmpty()) {
            String element = q.poll();
            System.out.println("Dequeued: " + element);
        }
    }
}
