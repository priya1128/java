package java_streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

        int answer = num.stream()
                .reduce(0,(a, b) -> a + b);
        System.out.println(answer);
    }
}
