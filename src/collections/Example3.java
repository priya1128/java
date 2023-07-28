package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        Map<String,Integer> m= new HashMap<String,Integer >();

        for(String fruit: fruits){
            int weight  = 0;
            for(int i=1;i<fruit.length()-1;i++){
                if("aeiou".indexOf(fruit.charAt(i))!=-1 && "aeiou".indexOf(fruit.charAt(i-1))==-1 && "aeiou".indexOf(fruit.charAt(i+1))==-1){
                    weight++;
                }
            }
            m.put(fruit,weight);
        }
        System.out.println(m);
    }

}
