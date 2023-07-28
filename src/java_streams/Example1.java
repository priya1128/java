package java_streams;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int answer = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .reduce(0, (a, b)-> a+b);
        System.out.println(answer);
    }
}
