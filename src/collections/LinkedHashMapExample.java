package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args){
        /*
        LinkedHashMap
        --------
        1. k,v
        2. key follows the set algorithm - duplicate key
        3. Ordered
         */
        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        m.put("Hari",67);
        m.put("Anish",97);
        m.put("Somi",06);
        m.put("A",06);
        System.out.println(m);




    }
}
