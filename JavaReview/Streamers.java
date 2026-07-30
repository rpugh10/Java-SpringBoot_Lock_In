package JavaReview;

import java.util.Arrays;
import java.util.List;

public class Streamers {
    public static void main(String[] args) {
        // Example of using streams in Java
        // List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using stream to filter and print names starting with 'A'
        // names.stream()
        //      .filter(name -> name.startsWith("A"))
        //      .forEach(System.out::println);

        //Printing out names
        // List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream()
        //     .forEach(name -> System.out.println(name));

        //Printing out names that start with A
        // List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream()
        //     .filter(name -> name.startsWith("A")) .filter() removes elements
        //     .forEach(name -> System.out.println(name)); 

        //Converting to uppercase
        // List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream() 
        //      .map(name -> name.toUpperCase()) .map() TRANSFORMS AN ELEMENT INTO SOMETHING ELSE
        //      .forEach(name -> System.out.println(name));
    
        //Printing out the length of each name
        //List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
        // names.stream()
        //     .map(name -> name.length()) //Turning Strings into Integers
        //     .forEach(name -> System.out.println(name));

        List<String> names = Arrays.asList("Ryan", "Justin", "Tom", "Alice", "Al");
    }
}
