package JavaReview;

import java.util.Arrays;
import java.util.List;

public class Streamers {
    public static void main(String[] args) {
        //Printing out names
        // List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream()
        //     .forEach(name -> System.out.println(name));

        List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        names.stream()
            .forEach(name -> System.out.println(name));
    }
}
