package collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args){
        /*
        HashMap
        --------
        1. k,v
        2. key follows the set algorithm - duplicate key
        3. Unordered
         */
        HashMap<String, Integer> m = new HashMap<>();
        m.put("Hari",67);
        m.put("Anish",97);
        m.put("A",76);
        m.put("Anish",76);
        System.out.println(m);




    }
}
