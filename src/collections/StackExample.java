package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        /*
        Stack
            - mutable
            - Last In First Out data structure
            - Synchronized
        */
        Stack<Integer> li = new Stack<Integer>();
        li.push(45);
        li.push(25);
        li.push(75);
        li.push(0);
        li.push(9);

        System.out.println(li);

        li.pop();
        System.out.println(li);


    }
}
