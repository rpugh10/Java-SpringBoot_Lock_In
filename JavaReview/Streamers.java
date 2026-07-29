package JavaReview;

import java.util.Arrays;
import java.util.List;

public class Streamers {
    public static void main(String[] args) {
        // Example of using streams in Java
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using stream to filter and print names starting with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
