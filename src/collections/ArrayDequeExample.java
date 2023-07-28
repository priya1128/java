package collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args){
        /*
        Queue
            - mutable
            - First In First Out

        ArrayDeque
            - not sorted
            - not allow Null value
        */
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(45);
        q.add(25);
        q.add(75);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
    }
}
