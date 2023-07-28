package collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        /*
        TreeSet
        -------
         1. Sorted List (Ascending order)
         2. cannot store a duplicate value
        */
        TreeSet<Integer> s = new TreeSet<Integer>();
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
