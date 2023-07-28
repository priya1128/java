package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args){
        ArrayList<String> names =  new ArrayList<String>();
        names.add("Satya");
        names.add("Mike");
        names.add("Naveen");
        names.add("Satya");
        names.add("Naveen");
        Map<String,Integer> temp = new HashMap<String,Integer>();

        for(String name:names){
            if(!temp.containsKey(name)){
                temp.put(name,1);
            }
            else{
                temp.put(name,temp.get(name)+1);
            }
        }

        System.out.println(temp);
    }
}
