package collections;

import java.util.*;

public class Example2 {
    public static void main(String[] args){
        List<String> s = new ArrayList<String>();
        s.add("Naveen");
        s.add("Hari");
        s.add("Mukund");

        s.add(1,"Anish");
        System.out.println(s);

    }
}
