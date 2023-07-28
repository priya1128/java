package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        /*
        LinkedHashSet
        -------
         1. Ordered List
         2. cannot store a duplicate value
        */
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
        s.add(45);
        s.add(90);
        s.add(83);
        s.add(90);
        System.out.println(s);

        for (Integer x : s) {
            System.out.println(x);
        }
    }
}
