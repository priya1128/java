package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        /*
        HashSet
        -------

        * Hashing Algorithm

         1. Unordered List
         2. cannot store a duplicate value
        */
        HashSet<Integer> s = new HashSet<>();
        s.add(45);
        s.add(90);
        s.add(83);
        s.add(90);
        System.out.println(s);

        for(Integer x : s){
            System.out.println(x);
        }
    }
}
