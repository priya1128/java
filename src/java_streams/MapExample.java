package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

        List<String> converted = names.stream()
                .map(name -> name.toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());

        System.out.println(converted);

    }
}
