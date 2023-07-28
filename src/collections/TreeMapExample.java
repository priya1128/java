package collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args){
        /*
        TreeMap
        --------
        1. k,v
        2. key follows the set algorithm - duplicate key
        3. Sorted (Ascending order)
         */
        TreeMap<String, Integer> m = new TreeMap<>();
        m.put("Hari",67);
        m.put("Anish",97);
        m.put("Somi",06);
        m.put("A",06);
        System.out.println(m);




    }
}
