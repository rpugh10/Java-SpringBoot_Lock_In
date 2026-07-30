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

        //Printing only even numbers
        //List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // nums.stream()
        //     .filter(even -> even % 2 == 0)
        //     .forEach(even -> System.out.println(even));

        //Squaring every number
        // List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // nums.stream()
        //     .map(square -> square * square)
        //     .forEach(square -> System.out.println(square));

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // System.out.println(nums.stream().reduce(0, (sum, n) -> sum + n));
        //.reduce(initialValue, (accumulator, current) -> ...) combines all the elements of a stream into a single result

            
            

    }
}
