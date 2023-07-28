package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        /*
        LinkedList
            - mutable
            - Doubly Linked List
            - non-sync
            - allow duplicated
            - preserves the insertion order

         ArrayList vs LinkedList
          - ArrayList --> Shifting whenever you do insert, delete
          - LinkedList --> No Shifting of elements during insert/delete
        */
        LinkedList<Integer> li = new LinkedList<>();
        li.add(45);
        li.add(25);
        li.add(75);

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }

        System.out.println(li.indexOf(25));

        li.add(1,78);
        System.out.println(li);

        ArrayList<Integer> li1 = new ArrayList<>();
        li1.add(0);
        li1.add(8);
        li1.add(11);

        li.addAll(li1);
        System.out.println(li);

        li.remove(new Integer(75));
        System.out.println(li);

        li.remove(2);
        System.out.println(li);

        //Sorting
        Collections.sort(li);
        System.out.println(li);
        //Reverse Order sort
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);

    }
}
