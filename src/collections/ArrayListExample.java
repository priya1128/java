package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        /*
            int[] a = new int[3];
            a[0] = 45;
            a[1] = 25;
            a[2] = 75;
            for(int i=0;i<a.length;i++){
            s.o.p(a[i]);
            }
        ArrayList is class, you don't need to specify the boundary
            - mutable
            - dynamic array data structure
            - non-sync
            - preserves the insertion order
            - allows duplicates
        */
        ArrayList<Integer> li = new ArrayList<>();
        li.add(45);
        li.add(25);
        li.add(75);

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }

        for(Integer i:li){
            System.out.println(i);
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
